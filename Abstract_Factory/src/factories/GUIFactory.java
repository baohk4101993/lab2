package factories;

import butons.Button;
import checkboxes.Checkbox;

public interface GUIFactory {
	Button createButton();
    Checkbox createCheckbox();
}
