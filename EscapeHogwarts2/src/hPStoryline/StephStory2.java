package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephStory2 extends FullFunctionScreen {

	private Graphic background;
	private Graphic chatbox;
	private Graphic hermione;
	private TextArea narrator;
	private TextArea name;
	private TextArea dialogue;
	private ClickableGraphic nextB;
	private String[] quotes;
	
	public StephStory2(int width, int height) {
		super(width, height);
		String[] quotes = {"Let's just leave him, Kevin will us if we're late.", "..."};
		name.setSize(40);
		dialogue.setSize(35);
		dialogue.setForeground(Color.WHITE);
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "simg/background.jpg");
		viewObjects.add(background);
		
		chatbox = new Graphic(80,80,1200,700, "simg/textbox.png");
		viewObjects.add(chatbox);
		
		nextB = new ClickableGraphic(1100, 700, 50, 50, "simg/symbol.png");
		nextB.setAction(new Action() {
			
			@Override
			public void act() {
				storyline();
				
			}
		});
		viewObjects.add(nextB);
		
		hermione = new Graphic(100,100,100,100,"simg/emma.jpg");
		viewObjects.add(hermione);
		
		name = new TextArea(220,530,200,200,"Hermione");
		viewObjects.add(name);
		
		dialogue = new TextArea(180,590,1000,500,"Where are you going Harry? Class is the other way.");
		viewObjects.add(dialogue);
		
	}
	
	public void storyline() {
		for(int i = 0; i < quotes.length; i++);
		
	}

}
