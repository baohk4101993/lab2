package factories;

import butons.Button;
import butons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}
