package init;

import GUI.Application;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreedingHorses sys=new BreedingHorses();
		Application app=new Application(sys);
		app.Start(sys);		}

}
