package behavioral.command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String args[]) {
		// Light light = new Light();
		// Switch lightSwitch = new Switch();
		//
		// Command toggleCommand = new ToggleCommand(light);
		// lightSwitch.storeAndExecute(toggleCommand);
		// lightSwitch.storeAndExecute(toggleCommand);
		// lightSwitch.storeAndExecute(toggleCommand);
		

		
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch(); 
		
		Command toggleCommand = new ToggleCommand(bedroomLight);
		Command onCommand = new OnCommand(bedroomLight);

		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(toggleCommand);
		//Light switched on.
		//Light switched on.
		//Light switched off.

		
		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);

		lightSwitch.storeAndExecute(onCommand);
		//Light switched on.
		lights.add(bedroomLight);

		Command allLightsCommand = new AllLightsCommand(lights);

		//Will switch off all on lights
		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
