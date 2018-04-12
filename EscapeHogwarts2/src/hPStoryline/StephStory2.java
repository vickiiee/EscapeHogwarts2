package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephStory2 extends FullFunctionScreen {

	private Graphic background;
	private Graphic chatbox;
	private Graphic switchImg;
	private Graphic bg1;
	private Graphic bg2;
	private Graphic bg3;
	private Graphic bg4;
	private TextArea narrator;
	private TextArea name;
	private TextArea dialogue;
	private ClickableGraphic nextB;
	private ClickableGraphic prevB; 
	private Button choice1; 
	private Button choice2; 
	private int clicks;
	private String[] quotes = {"Where are you going Harry? Class is the other way.","Lets just leave him, "
			+ "Mcgonagall will kill us if we're late.","...","Potter! Weasley! Granger! Why are you late to my class again?!",
			"We got lost.", "Moving on, today's lesson will be about potions, gather your things and follow me.", "Choose a partner and we'll begin."};
	private String[] matchName = {"Hermione","Ron", "Harry","Mcgonagall", "Hermione", "Mcgonagall", "Mcgonagall"};
	private String[] imagesList = {"simg/emma.png", "simg/ron.jpg", "simg/harry.jpg"};
	private Graphic[] bg = {bg1, bg2, bg3, bg4};
	
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
		
		bg1 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg1.jpg");
		viewObjects.add(bg1);
		bg1.setVisible(false);
		
		bg2 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg2.jpg");
		viewObjects.add(bg2);
		bg2.setVisible(false);
		
		bg3 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg3.jpg");
		viewObjects.add(bg3);
		bg3.setVisible(false);
		
		bg4 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg4.jpg");
		viewObjects.add(bg4);
		bg4.setVisible(false);
		
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
		
		switchImg = new Graphic(700,260,400,400,"simg/emma.png");
		viewObjects.add(switchImg);
		
		name = new TextArea(220,530,200,200,"Hermione");
		viewObjects.add(name);
		
		dialogue = new TextArea(180,590,1000,500,"Where are you going Harry? Class is the other way.");
		viewObjects.add(dialogue);
		
		choice1 = new Button(200, 600, 100, 50, "Hermione", Color.darkGray, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		choice2 = new Button(800, 600, 100, 50, "Ron", Color.darkGray, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void switchBkgrnd(Graphic bgs) {
		for(int i = 0; i < bg.length; i++) {
			if(bg[i] == bgs) {
				for(int j = 0; j < bg.length; j++) {
					if(bg[j] != bgs) {
						bg[j].setVisible(false);
					}
				}
				bgs.setVisible(true);
			}
		}
	}
	
	public void storyline() {
		String r = quotes[clicks];
		dialogue.setText(r);
		dialogue.update();
		String f = matchName[clicks];
		name.setText(f);
		name.update();	
		if(clicks == 3) {
			switchBkgrnd(bg1);
		}
		if(clicks == 4) {
			switchBkgrnd(bg2);
		}
		if(clicks == 5) {
			switchBkgrnd(bg3);
		}
		if(clicks > 5) {
			switchBkgrnd(bg4);
		}
	}
}
