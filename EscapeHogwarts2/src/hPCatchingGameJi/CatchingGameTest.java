package hPCatchingGameJi;

import java.awt.MouseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatchingGameTest extends FullFunctionScreen{

	private Graphic background;
	private TextArea timeText;
	
	private int xPos;
	private int yPos;
	private int time;
	private int timePause;
	private int potionsCollected;
	private boolean gameRunning = false;
	
	ArrayList<PotionTest> potionsList = new ArrayList<PotionTest>();
	private PotionTest potion;
	
	public CatchingGameTest(int width, int height) {
		super(width, height);
		yPos = 100;
	}
	
	public void startGame() {
		potionsCollected = 0;
		Timer timer = new Timer();
		TimerTask task;
		task = new TimerTask() {
			@Override
			public void run() { 
				if (gameRunning && time < 30) {
					generatePotion();
				} else {
					cancel();
				}
			}
		};
		timer.schedule(task, 0, generateNumber(1, 5));
	}
	
	public boolean checkPotionCollected() {
		//if() { //x & y coords of potion close to pointer
			//collect potion++
			//true
		//}else{
			//false
	    //}
		return false;
		
	}
	
	public void generatePotion() {
		xPos = generateNumber(200, getWidth()-200);
		PotionTest potion = new PotionTest(xPos, yPos, choosePotion(), new Action() {
			
			@Override
			public void act() {
				viewObjects.remove(this);
				potionsList.remove(this);
			}
		});
		viewObjects.add(potion);
		potionsList.add(potion);
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
	
	public void generateTimePause() {
		Timer timer = new Timer();
		TimerTask task;
		timePause = generateNumber(1, 5);
		task = new TimerTask() {
			@Override
			public void run() { 
				if (timePause > 0) {
					timePause--;
				} else {
					cancel();
				}
			}
		};
		timer.schedule(task, 0, 1000);
	}
	
	public int generateNumber(int low, int high) {
		int num;
		num = (int)(Math.random() * (high - low) + low);
		return num;
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/background4.jpg");
		timeText = new TextArea(100, 50, 100, 100, "Time Left: ");
	}

}
