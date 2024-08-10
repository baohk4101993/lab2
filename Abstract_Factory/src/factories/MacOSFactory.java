package factories;

import butons.Button;
import butons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}

}
