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
	private String[] dialogList = {"What in the world was that?", "We've seen ghosts before; that definitely isn't one.", "What is one doing so close to Hogwarts?"};
	private String[] ansList = {"This ghost is different", "I was merely testing you", ""};
	
	public DKWinGame(int width, int height) {
		super(width, height);
		
		name.setSize(40);
		dialog.setSize(50);
		dialog.setForeground(Color.WHITE);
		buttonOne.setSize(40);
		buttonTwo.setSize(40);
	}
	
	public void initAllObjects(List<Visible> viewObjects) {
		
		backImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/carriage.jpg");
		viewObjects.add(backImg);
		
		harry = new Graphic(700,260,400,400, "images/charHarry1.png");
		viewObjects.add(harry);
		harry.setVisible(false);
		
		ron = new Graphic(700,260,400,400, "images/charRon1.png");
		viewObjects.add(ron);
		ron.setVisible(true);
		
		hermione = new Graphic(700,260,400,400, "images/charHerm1.png");
		viewObjects.add(hermione);
		hermione.setVisible(false);
		
		textBox = new Graphic(80,80,1200,700, "simg/textbox.png");
		viewObjects.add(textBox);
		
		name = new TextArea(220,530,200,200,"Ron");
		viewObjects.add(name);
		
		dialog = new TextArea(180,590,1000,500,"What in the world was that?");
		viewObjects.add(dialog);
		
		buttonOne = new Button(125, 225, 350, 105, "It was merely a ghost", Color.LIGHT_GRAY, null);
		
		buttonOne.setAction(new Action() {
			
			@Override
			public void act() {
				if(dialog.getText().equals(dialogList[0])) {
					dialog.setText(dialogList[1]);
					name.setText(nameList[2]);
					buttonOne.setText(ansList[0]);
					buttonTwo.setText(ansList[1]);
				}
				
				if(name.getText().equals(nameList[0])) {
					harry.setVisible(true);
					ron.setVisible(false);
					hermione.setVisible(false);
				}else if(name.getText().equals(nameList[1])){
					harry.setVisible(false);
					ron.setVisible(true);
					hermione.setVisible(false);
				}else {
					harry.setVisible(false);
					ron.setVisible(false);
					hermione.setVisible(true);
				}
			}
		});
		
		viewObjects.add(buttonOne);
		
		buttonTwo = new Button(125,345,350,105, "That was a Dementor", Color.LIGHT_GRAY, null);
		
		buttonTwo.setAction(new Action() {
			
			@Override
			public void act() {
				
				
			}
		});
		
		viewObjects.add(buttonTwo);
	}

}
