package counter;

import java.util.Scanner;

/**
 * Test Observer
 * @author Varit Assavavisidchai
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		final Scanner console = new Scanner(System.in);
		// 1. Create the subject (Observable)
		Counter counter = new Counter();
		// 2. Create the observer with reference to subject
		ConsoleView view = new ConsoleView(counter);
		// 3. add observer to subject
		counter.addObserver(view);
		// Create another observer
		CounterView view2 = new CounterView(counter);
		counter.addObserver(view2);
		view2.run();
		
		// 4. run the app
		while(true) {
			System.out.print("Count how many? ");
			int howmany = console.nextInt();
			if (howmany==0) System.exit(0);
			counter.add(howmany);
		}
	}
}
