package hPCatchingGameJi;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatchingGameJi extends FullFunctionScreen{

	private Graphic background;
	private TextArea livesTxt;
	private TextArea gameStatus;
	private Potion potion;

	private int lives = 5;
	private int time;
	private int potionPause;
	private int xPos;
	private int yPos = 0;

	ArrayList<Object> potionsList = new ArrayList<Object>();
	private Button testBtn;

	public CatchingGameJi(int width, int height) {
		super(width, height);
		livesTxt.setForeground(Color.white);
		livesTxt.setText("Lives Left: " + lives);
		gameStatus.setForeground(Color.white);
		startGame();
		testGenPotion();
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public void startGame() {

		Timer timer = new Timer();
		TimerTask task;
		task = new TimerTask() {
			@Override
			public void run() { 
				potionPause = (int)(Math.random() * 3);
				if (potionPause > 0) {
					potionPause--;
				} else {
					generatePotion();
					cancel();
				}
			}
		};
		timer.schedule(task, 0, 1000);

	}

	public void generatePotion() {
		chooseStart();
		chooseTime();
		potion = new Potion(xPos, 0, choosePotion(), new Action() {
			
			/**
			 * remove potion
			 */
			@Override
			public void act() {
				potion.setVisible(false);
				potionsList.remove(potion);
				viewObjects.remove(potion);
				System.out.println("??");
			}
		});
		viewObjects.add(potion);
		potionsList.add(potion);
		potion.move(xPos, 780, time);
		
		checkPotionCaught();
	}
		
	public void testGenPotion() {
		potion = new Potion(100, 100, choosePotion(), new Action() {
			
			@Override
			public void act() {
				potion.setVisible(false);
				potionsList.remove(potion);
				viewObjects.remove(potion);
				System.out.println("??");
			}
		});
		viewObjects.add(potion);
	}
	
	public void checkPotionCaught() {
		if(potion.getHeight() == 780) {
			if(potion != null) {
				lives--;
				livesTxt.setText("Lives Left: " + lives);
				checkLivesLeft();
			}
		}
	}

	public void chooseStart() {
		xPos = (int)(Math.random() * getWidth() - 100);
	}

	public void chooseTime() {
		time = (int)(Math.random() * 3000 + 300);
	}

	public String choosePotion() {
		int temp = (int)(Math.random() * 3);
		String potionName = "";
		if(temp == 0) {
			potionName = "images/bluepotion.png";
		}else {
			if(temp == 1) {
				potionName = "images/redpotion.png";
			}else {
				potionName = "images/purplepotion.png";
			}
		}
		return potionName;
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
			gameStatus.setText("You caught" + potionsList.size() + "potions in total!");
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
		
		testBtn = new Button(500, 100, 200, 100, "remove", new Action() {
			
			@Override
			public void act() {
				viewObjects.remove(potion);
				
			}
		});
		viewObjects.add(testBtn);
	}
}
