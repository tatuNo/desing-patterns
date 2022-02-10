import java.util.Scanner;

abstract class SortingStrategy {
	protected long timer;
	private Scanner scanner = new Scanner(System.in);

	abstract int [] sort(int array[]);
	
	public final void sortAndCountTime(int array[]) {
		confirm();
		startTimer();
		int [] result = sort(array);
		stopTimer();
		printArray(result);
		printResult();
	}
	
	private void printResult () {
		System.out.println(this + " kulutti lajitteluun aikaa " + timer + " millisekuntia \n");
		System.out.println("Jatka painamalla enter");
		scanner.nextLine();
	}
	
	private void printArray(int [] input) {

		for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
            if (i>0 && i%40==0) {
				System.out.println();
			}
        }
        System.out.println("\n");
	}
	
	private void startTimer() {
		this.timer = System.currentTimeMillis();
	}
	
	private void stopTimer () {
		this.timer = System.currentTimeMillis() - this.timer;
	}
	
	private void confirm () {
		System.out.println("Suoritetaan " + this + " paina enter");
		scanner.nextLine();
	}
}


