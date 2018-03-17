package counter;

import java.util.Observable;

/**
 * Print the counter value on the console whenever it changes.
 * @author Varit Assavavisidchai
 */
public class ConsoleView implements java.util.Observer {
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}

	/**
	 * Notify the program when value of count is changed.
	 */
	@Override
	public void update(Observable subject, Object info) {
		System.out.printf("Count: %d\n", counter.getCount());
	}
}
