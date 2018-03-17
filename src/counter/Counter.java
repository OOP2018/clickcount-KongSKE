package counter;

import java.util.Observable;

/**
 * A simple counter.
 * @author Varit Assavavisidchai
 */

public class Counter extends Observable {
	private int count;
	
	/**
	 * Constructor of counter
	 * Make count be zero first.
	 */
	public Counter() {
		this.count = 0;
	}
	
	/**
	 * 
	 * @param howmuch is value of count.
	 */
	public void add(int howmuch) {
		count += howmuch;
		// Its like if the Bank sends you an SMS whenever money
		// is deposited in your account. If the SMS just says 
		// "you received a deposit" then you need to login to check it.
		// If the SMS says "you received 5,000 Bt from xxx" then you
		// have everything you need.
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Get value of count
	 * @return value of count
	 */
	public int getCount() {
		return count;
	}
}
