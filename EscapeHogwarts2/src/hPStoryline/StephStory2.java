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
	private ClickableGraphic prevB; 
	private int clicks;
	private String[] quotes = {"Where are you going Harry? Class is the other way.","Lets just leave him, professor will kill us if we're late.", "..."};
	private String[] matchName = {"Hermione","Dean", "Harry"};
	
	public StephStory2(int width, int height) {
		super(width, height);
		clicks = 0;
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
				clicks++;
				storyline();
				
			}
		});
		viewObjects.add(nextB);
		
		prevB = new ClickableGraphic(65, 700, 50, 50, "simg/symbol.png");
		prevB.setAction(new Action() {
			
			@Override
			public void act() {
				clicks--;
				storyline();
				
			}
		});
		viewObjects.add(prevB);
		
		hermione = new Graphic(100,100,100,100,"simg/emma.jpg");
		viewObjects.add(hermione);
		
		name = new TextArea(220,530,200,200,"Hermione");
		viewObjects.add(name);
		
		dialogue = new TextArea(180,590,1000,500,"Where are you going Harry? Class is the other way.");
		viewObjects.add(dialogue);
		
	}
	
	public void storyline() {
		String r = quotes[clicks];
		dialogue.setText(r);
		dialogue.update();
		String f = matchName[clicks];
		name.setText(f);
		name.update();
	}
}
