package hpKevStoryLine;


import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPStartGame.GuiLoadingVickie;

public class DKWinGame extends FullFunctionScreen {

	private Graphic backImg;
	private Graphic textBox;
	
	private TextArea name;
	private TextArea dialog;
	
	private Button buttonOne;
	private Button buttonTwo;
	
	private Graphic harry;
	private Graphic ron;
	private Graphic hermione;
	
	private String[] nameList = {"Harry", "Ron", "Hermione"};
	private String[] dialogList = {"What is one doing so close to Hogwarts?", };
	
	public DKWinGame(int width, int height) {
		super(width, height);
		
		name.setSize(40);
		dialog.setSize(50);
		dialog.setForeground(Color.WHITE);
		buttonOne.setSize(40);
		buttonTwo.setSize(40);
	}
	
	public void initAllObjects(List<Visible> viewObjects) {
		
		harry = new Graphic(700,260,400,400, "charHarry1.png");
		viewObjects.add(harry);
		harry.setVisible(false);
		
		ron = new Graphic(700,260,400,400, "images/charRon1.png");
		viewObjects.add(ron);
		ron.setVisible(true);
		
		hermione = new Graphic(700,260,400,400, "images/charHerm1.png");
		viewObjects.add(hermione);
		hermione.setVisible(false);
		
		backImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/carriage.jpg");
		viewObjects.add(backImg);
		
		
		
		textBox = new Graphic(80,80,1200,700, "simg/textbox.png");
		viewObjects.add(textBox);
		
		name = new TextArea(220,530,200,200,"Ron");
		viewObjects.add(name);
		
		dialog = new TextArea(180,590,1000,500,"What in the world was that?");
		viewObjects.add(dialog);
		
		buttonOne = new Button(850, 365, 325, 105, "It was merely a ghost", Color.black, null);
		
		buttonOne.setAction(new Action() {
			
			@Override
			public void act() {
				
				
			}
		});
		
		viewObjects.add(buttonOne);
		
		buttonTwo = new Button(850,475,325,105, "That was a Dementor", Color.black, null);
		
		buttonTwo.setAction(new Action() {
			
			@Override
			public void act() {
				
				
			}
		});
		
		viewObjects.add(buttonTwo);
	}

}
