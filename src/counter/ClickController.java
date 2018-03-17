package counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * @author Varit Assavavisidchai
 *
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter;

	/**
	 * After clicked plus button, Value of count is increase 1.
	 * @param event from click + button
	 */
	public void plusButtonHandler(ActionEvent event) {
		counter.add(1);
	}
	
	/**
	 * After clicked minus button, Value of count is decrease 1.
	 * @param event from click - button
	 */
	public void minusButtonHandler(ActionEvent event) {
		counter.add(-1);
	}
	
	/**
	 * Make program use the same counter.
	 * @param counter
	 */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
}
