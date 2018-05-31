package hPCatchingGameJi;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Component;
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
	private final int yPos = 0;
	private int mouseX;
	private int mouseY;

	ArrayList<Potion> potionsList = new ArrayList<Potion>();
	//ArrayList<Potion> potionsCreated = new ArrayList<Potion>();
	//ArrayList<Potion> potionsCaught = new ArrayList<Potion>();
	private Button testBtn;

	private boolean gameRunning = true;
	private boolean gameStarted;
	private Point b;
	private PointerInfo a;
	
	

	public CatchingGameJi(int width, int height) {
		super(width, height);
		livesTxt.setForeground(Color.white);
		livesTxt.setText("Lives Left: " + lives);
		gameStatus.setForeground(Color.white);
		startGame();
		getMousePosition();
		//testGenPotion();
	}

	public Point getMousePosition() {
		Timer timer = new Timer();
		TimerTask task;
		task = new TimerTask() {
			@Override
			public void run() { 
				if (gameRunning) {
					a = MouseInfo.getPointerInfo();
					b = a.getLocation();
					mouseX = (int) b.getX();
					mouseY = (int) b.getY();
					//System.out.println(mouseX + ", " + mouseY);
					for(int i = 0; i < potionsList.size(); i++) {
						if (checkDistanceRange(potionsList.get(i))) {
							potionsList.get(i).setVisible(false);
							potionsList.remove(i);
							viewObjects.remove(potionsList.get(i));
							System.out.println("potion removed");
						}
					}
				} else {
					cancel();
				}
			}
		};
		timer.schedule(task, 0, 100);
		return b;
	}

	public boolean checkDistanceRange(Potion p) {
		if(Math.abs(mouseY-((p).getY() - 50)) < 10){
			if(Math.abs(mouseX-((p).getX() - 50)) < 10){
				return true;
			}
		}
		return false;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public void startGame() {
		for(int i = 0; i < 10; i++) {
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

		checkLivesLeft();
	}

	public void generatePotion() {
		chooseStart();
		chooseTime();
		potion = new Potion(xPos, xPos, choosePotion(), potionsList.size(), new Action() {
			/**
			 * option 1: click to remove potion
			 */
			@Override
			public void act() {
				/*
				potion.setVisible(false);
				potionsList.remove(potion);
				viewObjects.remove(potion);
				System.out.println("potion removed");
				*/
				
				potionsList.get(potion.getIndex()).setVisible(false);
				//
			}
		});
		viewObjects.add(potion);
		potionsList.add(potion);
		//System.out.println(potionsList);
		potion.move(xPos, 780, time);
		/**
		 * option 2: hover to remove potion
		 */
		/*
		if(potion.isHovered(potion.getWidth(), potion.getHeight())) {
			potion.setVisible(false);
			potionsList.remove(potion);
			viewObjects.remove(potion);
			System.out.println("potion removed");
		}
		 */
		/**
		 * option 1.2 click to remove potion
		 * mouseEntered
		 * mouseClicked
		 */
		/*
		potion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				potion.setVisible(false);
				potionsList.remove(potion);
				viewObjects.remove(potion);
				System.out.println("potion removed");
			}
		});
		 */
		//checkPotionCaught();

	}
	/*
	public void testGenPotion() {
		potion = new Potion(100, 100, choosePotion(), new Action() {

			@Override
			public void act() {
				potion.setVisible(false);
				potionsCaught.add(potion);
				viewObjects.remove(potion);
				System.out.println("potion removed");
			}
		});
		viewObjects.add(potion);
		if(potion.isHovered(potion.getWidth(), potion.getHeight())) {
			potion.setVisible(false);
			potionsCaught.add(potion);
			viewObjects.remove(potion);
			System.out.println("potion removed");
		}
	}
	*/
	public void checkPotionCaught() {
		if(potion.getY() >= 780) {
			if(potion != null) {
				potion.setVisible(false);
				setLives(lives--);
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

	public void checkLivesLeft() {
		if(getLives() <= 0) {
			gameStatus.setText("You caught" + potionsList.size() + "potions in total!");
			gameRunning = false;
		}
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0,getWidth(), getHeight(), "images/background4.jpg");
		viewObjects.add(background);
		
		gameStarted = true;
		if(gameStarted) {
			
		}

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
