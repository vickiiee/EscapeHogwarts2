package hPStartGame;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPCatchingGameJi.CatchingGameJi;
import hPConnect4Areej.ConnectFourAreej;
import hPMagicSquaresVickieJi.VickieHPFrontEnd;
import hpKevStoryLine.DKTitle;

public class GameMapDirectory extends FullFunctionScreen{

	private Graphic background;
	private TextArea sampletxt;
	private boolean menuRunning = true;
	
	private Graphic pointer1;
	private Graphic pointer2;
	private Graphic pointer3;
	private Graphic pointer4;
	private Graphic pointer5;
	private Graphic pointer6;
	private Graphic pointer7;
	
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Visible button6;
	private Button button7;
	
	public GameMapDirectory(int width, int height) {
		super(width, height);
		button1.setSize(40);
		button2.setSize(40);
		button3.setSize(40);
		button4.setSize(40);
	}
	
	//public boolean isHovered(int x, int y) {
	//	return x > getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	//}
	/*
	public void menuRun() {
		while(menuRunning) {
			if(button1.isHovered(900, 300)) {
				button1.setText("on");
				System.out.println("working");
			}else {
				button1.setText("off");
				System.out.println("N/A");
				
			}
			
			if(button2.isHovered(750,670)) {
				button2.setText("on");
			}else {
				button2.setText("off");
			}
			
			if(button3.isHovered(1000,100)) {
				button3.setText("on");
			}else {
				button3.setText("off");
			}
			
			
		}
		
	}
	*/
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/hogwartsMap.jpg");
		viewObjects.add(background);
		
		//connect four
		pointer1 = new Graphic(900, 300, 30, 40, "images/pointer.png");
		viewObjects.add(pointer1);
		button1 = new Button(870, 260, 100, 40, "Connect Four", new Action() {
		
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new ConnectFourAreej(getWidth(), getHeight()));
			}
		});
		viewObjects.add(button1);
		
		//dkiss
		pointer2 = new Graphic(660, 670, 30, 40, "images/pointer.png");
		viewObjects.add(pointer2);
		button2 = new Button(630, 630, 100, 40, "The Dementor's Kiss", new Action() {
		
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTitle(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(button2);
		
		//forest spider
		pointer3 = new Graphic(1050, 100, 30, 40, "images/pointer.png");
		viewObjects.add(pointer3);
		button3 = new Button(1020, 60, 100, 40, "Spider", new Action() {
		
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new CatchingGameJi(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(button3);
		
		//magic squares
		pointer4 = new Graphic(800, 340, 30, 40, "images/pointer.png");
		viewObjects.add(pointer4);
		button4 = new Button(770, 310, 100, 40, "Magic Squares", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(button4);
		
		//siren's curse
		pointer5 = new Graphic(570, 460, 30, 40, "images/pointer.png");
		viewObjects.add(pointer5);
		button5 = new Button(570, 460, 30, 40, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button5);
		
		//side story hogwarts
		pointer6 = new Graphic(930, 400, 30, 40, "images/pointer.png");
		viewObjects.add(pointer6);
		button6 = new Button(930, 400, 30, 40, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button6);
		
		pointer7 = new Graphic(100, 200, 30, 40, "images/pointer.png");
		viewObjects.add(pointer7);
		button7 = new Button(100, 200, 30, 40, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button7);
	}

}
