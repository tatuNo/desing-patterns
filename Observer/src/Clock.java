import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock implements PropertyChangeListener {

	private LocalDateTime time;
	private DateTimeFormatter myFormatObj;
	
	public Clock (DateTimeFormatter format) {
		this.myFormatObj = format;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		this.setTime((LocalDateTime) evt.getNewValue());
	}
	
	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
		print();
	}
	
	private void print() {
		System.out.println(time.format(myFormatObj));
	}
}
