package hPCatchingGameJi;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatchingGameJi extends FullFunctionScreen{

	private Graphic background;
	private TextArea livesTxt;
	private TextArea gameStatus;
	
	private int lives = 5;
	private int xPos;
	private int yPos = 0;
	private Potion potion;
	
	ArrayList<Object> potionsList = new ArrayList<Object>();

	public CatchingGameJi(int width, int height) {
		super(width, height);
		livesTxt.setForeground(Color.white);
		livesTxt.setText("Lives Left: " + lives);
		gameStatus.setForeground(Color.white);
		generatePotions(1000);
	}
	
	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void startGame(int time) {
		
	}
	
	public void generatePotions(int time) {
		chooseStart();
		potion = new Potion(xPos, 0, "images/bluepotion.png");
		viewObjects.add(potion);
		potionsList.add(potion);
		potion.move(xPos, 770, time);
		checkPotionCaught();
	}
	
	//action on potion
	//if clicked
	//set potion null: remove from arraylist & remove it from screen
	
	public void checkPotionCaught() {
		if(this.potion.getHeight() == 770) {
			if(this.potion != null) {
				lives--;
				livesTxt.setText("Lives Left: " + lives);
				checkLivesLeft();
			}
		}
	}
	
	public void chooseStart() {
		xPos = (int)(Math.random() * getWidth() - 100);
	}
	
	/*
	public void checkAllPotionCaught() {
		if(potionsList.get(0) != null) {
			gameStatus.setText("You lose");
		}else {
			gameStatus.setText("You win");
		}
	}
	*/
	
	public void checkLivesLeft() {
		if(getLives() <= 0) {
			gameStatus.setText("You lose");
		}
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0,getWidth(), getHeight(), "images/background4.jpg");
		viewObjects.add(background);
		
		livesTxt = new TextArea(100, 100, 500, 100, "Lives Left:");
		viewObjects.add(livesTxt);
	
		gameStatus = new TextArea(300, 300, 500, 100, "");
		viewObjects.add(gameStatus);
	}

	//
}
