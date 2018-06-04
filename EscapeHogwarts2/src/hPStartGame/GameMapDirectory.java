package hPStartGame;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class GameMapDirectory extends FullFunctionScreen{

	private Graphic background;
	private Graphic pointer1;
	private Graphic pointer2;
	private Graphic pointer3;
	private TextArea sampletxt;
	private Button button1;
	private Button button2;
	private Button button3;
	private boolean menuRunning = true;
	
	public GameMapDirectory(int width, int height) {
		super(width, height);
	}
	
	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	}
	
	public void menuRun() {
		while(menuRunning) {
			if(isHovered(900, 300)) {
				button1.setText("FOREST");
				System.out.println("working");
			}else {
				button1.setText("empty");
				System.out.println("N/A");
				
			}
			
			if(isHovered(750,670)) {
				button2.setText("working");
			}else {
				button2.setText("empty");
			}
			
			if(isHovered(1000,100)) {
				button3.setText("working");
			}else {
				button3.setText("empty");
			}
		}
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/hogwartsMap.jpg");
		viewObjects.add(background);
		
		pointer1 = new Graphic(900, 300, 30, 40, "images/pointer.png");
		viewObjects.add(pointer1);
		button1 = new Button(1000, 100, 30, 40, "a", new Action() {
			//forest
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button1);
		
		pointer2 = new Graphic(750, 670, 30, 40, "images/pointer.png");
		viewObjects.add(pointer2);
		button2 = new Button(900, 290, 30, 40, "a", new Action() {
			//hogwarts
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button2);
		
		pointer3 = new Graphic(1000, 100, 30, 40, "images/pointer.png");
		viewObjects.add(pointer3);
		button3 = new Button(750, 670, 30, 40, "a", new Action() {
			//train
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button3);
		
		if(isHovered(900, 300)) {
			button1.setText("HARRY");
		}else {
			button1.setText("");
		}
	}

}
