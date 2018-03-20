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
	private Graphic switchImg;
	private TextArea narrator;
	private TextArea name;
	private TextArea dialogue;
	private ClickableGraphic nextB;
	private ClickableGraphic prevB; 
	private int clicks;
	private String[] quotes = {"Where are you going Harry? Class is the other way.","Lets just leave him, Mcgonagall will kill us if we're late.", "...","Potter! Weasley! Granger! Why are you late to my class again?!"};
	private String[] matchName = {"Hermione","Ron", "Harry","Mcgonagall"};
	private String[] imagesList = {"simg/emma.png", "simg/ron.jpg", "simg/harry.jpg"};
	private String[] bgList = {"simg/classroom.jpg", "simg/teaching.jpg"};
	
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
				updateImgScreen();
				updateBackground();
				
			}
		});
		viewObjects.add(nextB);
		
		prevB = new ClickableGraphic(65, 700, 50, 50, "simg/symbol.png");
		prevB.setAction(new Action() {
			
			@Override
			public void act() {
				clicks--;
				storyline();
				updateImgScreen();
				updateBackground();
				
			}
		});
		viewObjects.add(prevB);
		
		switchImg = new Graphic(700,260,400,400,"simg/emma.png");
		viewObjects.add(switchImg);
		
		name = new TextArea(220,530,200,200,"Hermione");
		viewObjects.add(name);
		
		dialogue = new TextArea(180,590,1000,500,"Where are you going Harry? Class is the other way.");
		viewObjects.add(dialogue);
		
	}
	
	public void storyline() {
		for(int i = 0; i < quotes.length - 1; i ++) {
			String r = quotes[clicks];
			dialogue.setText(r);
			dialogue.update();
			String f = matchName[clicks];
			name.setText(f);
			name.update();
		}
		dialogue.setText("");
		dialogue.update();
		name.setText("");
		name.update();
	}
	
	public void updateImgScreen() {
		for(int i = 0; i < imagesList.length - 1; i++) {
			String s = imagesList[i];
			switchImg.loadImages(s, 400, 400);
		}
		switchImg.setVisible(false);
	}
	
	public void updateBackground() {
		if(clicks >= 3) {
			String f = bgList[clicks];
			background.loadImages(f, 1200, 800);
		}
	}
}
