package hpKevStoryLine;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephGame extends FullFunctionScreen {

	private Graphic gameBg;
	private TextArea ingredients;
	
	private String[] pickList = {"Dried Nettles", "Bundimun Ooze", "Ashwinder Egg", 
			"Spring Water", "Lacewing flies", "Minced Daisy Roots", "FairyWings", "Morning Dew",
			"Snake Fangs", "Streeler Shells", "Dragon Liver"};
	
	private String[] doxycide = {"Bundimun Ooze", "Streeler Shells", "Dragon Liver", 
			"Hemlock Essence", "Tormentil Tincture", "CowBane Essence"};

	private String[] felixFelicis = {"Ashwinder Eggs", "Squill Bulb", "Murtlab tentacle",
			"Tincture of Thyme", "Occamy Eggshell", "Powdered Common Rue"};
	
	private String[] cureBoils = {"Dried Nettles", "Snake Fangs", "Horned Slugs",
			"Porcupine Quills", "Plungous Onions", "Flobberworm Mucus", "Ginger Root", 
			"Snake Spines"};
	
	private String[] laughtingPot = {"Spring Water", "Alihotsy Leaves", "Billywig Wings"
			,"Knarl Quills", "Puffskein Hair", "Horseradish Powder", "Laughter"};
	
	private String[] polyjuicePot = {"Lacewing Flies", "Leeches", "powdered Bicorn Horn"
			,"Knotgrass", "Fluxweed", "Shredded Boomslang Skin", "Hair"};
	
	private String[] shrinkingSol = {"Minced Daisy Roots", "Peeled Shrivelfig",
			"Sliced Caterpillars", "Rat Spleen", "Leech Juice", "CowBane", "Wormwood"};
	
	private String[] beautyPot = {"Fairy Wings", "Morning Dew", "Rose Petals", "Ladys Mantle", 
			"Unicorn Hair", "Ginger Roots"};
	
	public StephGame(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		gameBg = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg7.jpeg");
		viewObjects.add(gameBg); 

		ingredients = new TextArea(100,100,100,100, "");
		ingredients.setText("Bundimun Ooze, Streeler Shells, Dragon Liver, "
				+ "Hemlock Essence, Tormentil tincture, Cowbane essence");
		viewObjects.add(ingredients);
		
	}

}
