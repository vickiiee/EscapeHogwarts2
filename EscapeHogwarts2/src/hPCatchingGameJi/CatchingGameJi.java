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
import hPStartGame.GameMapDirectory;
import hPStartGame.GuiLoadingVickie;

public class CatchingGameJi extends FullFunctionScreen{

	private Graphic background;
	private TextArea livesTxt;
	private TextArea gameStatus;
	private Spider spider;

	private int lives = 5;
	private int time;
	private int genPause;
	private int xPos;
	private final int yPos = 0;
	private int mouseX;
	private int mouseY;
	private int timeLeft;

	ArrayList<Spider> spidersList = new ArrayList<Spider>();
	private Button testBtn;

	private boolean gameRunning = true;
	private boolean gameStarted;
	private Point b;
	private PointerInfo a;
	private TextArea timeLeftTxt;

	//count||hover

	public CatchingGameJi(int width, int height) {
		super(width, height);
		livesTxt.setForeground(Color.white);
		livesTxt.setText("Lives Left: " + lives);
		gameStatus.setForeground(Color.white);
		timeLeftTxt.setForeground(Color.white);
		startGame();
		timeLeft = 12;
		Timer();
		//getMousePosition();
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
					for(int i = 0; i < spidersList.size(); i++) {
						if (checkDistanceRange(spidersList.get(i))) {
							spidersList.get(i).setVisible(false);
							spidersList.remove(i);
							viewObjects.remove(spidersList.get(i));
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

	public boolean checkDistanceRange(Spider p) {
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
		//while(gameRunning) {
		for(int i = 0; i < 30; i++) {
			Timer timer = new Timer();
			TimerTask task;
			task = new TimerTask() {
				@Override
				public void run() { 
					genPause = (int)(Math.random() * 9);
					//if(gameRunning) {
					if (genPause > 0) {
						genPause--;
					} else {
						generateSpider();
						//checkLivesLeft();
						cancel();
					}
					//}else {
					//checkLivesLeft();
					//cancel();
					//}
				}
			};
			timer.schedule(task, 0, 1000);
		}

		//checkLivesLeft();
		//}
	}

	public void generateSpider() {
		chooseStart();
		chooseTime();
		spider = new Spider(xPos, yPos, "images/spider.png", spidersList.size(), new Action() {
			/**
			 * option 1: click to remove potion
			 */
			@Override
			public void act() {
				/*
				potionsList.remove(potion);
				viewObjects.remove(potion);
				System.out.println("potion removed");
				 */
				//spidersList.get(spider.getIndex()).setVisible(false);

				spider.setVisible(false);
				spidersList.set(spider.getIndex(), null);

			}
		});
		viewObjects.add(spider);
		spidersList.add(spider);
		spider.move(xPos, 800, time);
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
	public void checkSpiderCaught() {
		if(spider.getY() == 800) {
			if(spider != null) {
				spider.setVisible(false);
				setLives(lives--);
				livesTxt.setText("Lives Left: " + lives);
				checkLivesLeft();
			}
		}
	}

	public void chooseStart() {
		xPos = (int)(Math.random() * getWidth() - 680) + 630;
	}

	public void chooseTime() {
		time = (int)(Math.random() * 3000 + 1000);
	}
	/*
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
	 */
	public void checkLivesLeft() {
		if(getLives() <= 0) {
			gameRunning = false;
			gameStatus.setText("You caught" + spidersList.size() + "spiders in total!");
			System.out.println(gameStatus);
			gameOver();
		}
	}

	public void Timer() {
		Timer timer = new Timer();
		TimerTask task;
		task = new TimerTask() {
			@Override
			public void run() { 
				if (timeLeft > 0) {
					timeLeftTxt.setText("Time Left: " + timeLeft);
					timeLeft--;
				} else {
					cancel();
					gameOver();
					
					//GuiLoadingVickie.loading.setScreen(new GameMapDirectory(getWidth(), getHeight()));
				}
			}
		};
		timer.schedule(task, 0, 1000);
	}

	public void gameOver() {
		if(timeLeft <= 0) {
			GuiLoadingVickie.loading.setScreen(new GameMapDirectory(getWidth(), getHeight()));
			System.out.println("over");
		}
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0,getWidth(), getHeight(), "images/background4.jpg");
		viewObjects.add(background);

		gameStarted = true;
		if(gameStarted) {
			//Timer();
		}

		livesTxt = new TextArea(100, 100, 500, 100, "Lives Left:");
		viewObjects.add(livesTxt);

		gameStatus = new TextArea(300, 300, 500, 100, "");
		viewObjects.add(gameStatus);

		timeLeftTxt = new TextArea(500, 100, 500, 500, "Time Left:" + timeLeft);
		viewObjects.add(timeLeftTxt);
	}
}
