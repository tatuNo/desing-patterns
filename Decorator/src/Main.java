import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Main class of the program.
 *
 * @author tatu_
 *
 */

public class Main {
  /**
  * Starts program text UI.
  *
  * @param args arguments
  * @throws NumberFormatException exception
  * @throws IOException exception
  */
  public static void main(String[] args) throws NumberFormatException, IOException {
    int valinta;
    Pizza pizza = new Pizzapohja();
    do {
      System.out.println("========= Pizzeria ============");  
      System.out.println("       1. Lisää feta.");
      System.out.println("       2. Lisää jauheliha.");
      System.out.println("       3. Lisää kinkku.");
      System.out.println("       4. Lisää paprika.");
      System.out.println("       5. Lisää tomaatti.");
      System.out.println("       6. Maksa pizza.");  
      System.out.print("Valintasi: ");  
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
      valinta = Integer.parseInt(br.readLine());
      switch (valinta) {
        case 1:
          pizza = new Feta(pizza);
          break;
        case 2:
          pizza = new Jauheliha(pizza);
          break;
        case 3:
          pizza = new Kinkku(pizza);
          break;
        case 4:
          pizza = new Paprika(pizza);
          break;
        case 5:
          pizza = new Tomaatti(pizza);
          break;
        case 6:
          System.out.println(pizza.lisaa() + ", hinta: " + pizza.getHinta() + "€");
          break;
        default:
          break;
      }
    } while (valinta != 6);
  }
}
