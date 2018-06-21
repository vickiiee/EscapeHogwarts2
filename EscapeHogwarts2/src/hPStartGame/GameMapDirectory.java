package hPStartGame;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextColoredLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPCatchingGameJi.CatchingGameJi;
import hPCatchingGameJi.CatchingStoryJi;
import hPConnect4Areej.ConnectFourAreej;
import hPConnect4Areej.GamePage;
import hPMagicSquaresVickieJi.SirCadoganTheMadKnight;
import hPMagicSquaresVickieJi.TextAreaHoverButton;
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
	private Graphic pointer8;
	private TextAreaHoverButton button8;
	private Graphic pointer9;
	private Font b;
	private TextAreaHoverButton button9;
	private Graphic pointer10;
	private TextAreaHoverButton button10;
	private Graphic pointer11;
	private TextAreaHoverButton button11;
	
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
		try {
			File fontFile = new File("images/HARRYP.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			Font baseFont = font.deriveFont(150f);
			 b = font.deriveFont(50f);

		} catch (Exception e) {

			e.printStackTrace();

		}
	
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/hogwartsMap.jpg");
		viewObjects.add(background);
		
		//connect four
		pointer1 = new Graphic(900, 300, 30, 40, "images/bPointer.png");
		viewObjects.add(pointer1);
		pointer2 = new Graphic(660, 670, 30, 40, "images/bPointer.png");
		viewObjects.add(pointer2);
		pointer3 = new Graphic(1050, 100, 30, 40, "images/bPointer.png");
		viewObjects.add(pointer3);
		pointer4 = new Graphic(800, 340, 30, 40, "images/bPointer.png");
		viewObjects.add(pointer4);
		
		pointer8 = new Graphic(500, 415, 30, 40, "images/pPointer.png");
		viewObjects.add(pointer8);
		pointer9 = new Graphic(310, 75, 30, 40, "images/pPointer.png");
		viewObjects.add(pointer9);
		pointer10 = new Graphic(855, 60, 30, 40, "images/pPointer.png");
		viewObjects.add(pointer10);
		pointer11 = new Graphic(213, 200, 30, 40, "images/pPointer.png");
		viewObjects.add(pointer11);
		
		Graphic t1 = new Graphic(500,0,300,300,"images/transBlack.png");
		viewObjects.add(t1);
		t1.preserveRatio = false;
		t1.resize(400, 450);
		t1.setVisible(false);
		
		
		//areej
		TextColoredLabel ar = new TextColoredLabel(170, 100, 400, 100, "Party Puzzle", null, Color.blue);
		viewObjects.add(ar);
		
		TextColoredLabel ar1 = new TextColoredLabel(170, 200, 400, 100, "Scrambled Picture", null, Color.blue);
		ar1.setFont(b);
		viewObjects.add(ar1);
		
		button1 = new TextAreaHoverButton(900, 300, 30, 40, "", null, ar, ar1,t1, new Action() {
		
			private String[] args;

			@Override
			public void act() {
				GamePage.main(args);
			}
		}, true);
		viewObjects.add(button1);
		
		//dkiss
		/*Graphic t2 = new Graphic(500,0,300,300,"images/transBlack.png");
		viewObjects.add(t2);
		t2.preserveRatio = false;
		t2.resize(400, 450);
		t2.setVisible(false);
		*/
		TextColoredLabel ke = new TextColoredLabel(170, 100, 500, 100, "The Dementor's Kiss", null, Color.blue);
		viewObjects.add(ke);
		TextColoredLabel ke1 = new TextColoredLabel(170, 200, 500, 100, "Save Harry!", null, Color.blue);
		ke1.setFont(b);
		viewObjects.add(ke1);
		
		
		button2 = new TextAreaHoverButton(660, 670, 30, 40, "", null, ke,ke1, t1, new Action() {
		
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTitle(getWidth(), getHeight()));
				
			}
		}, true);
		viewObjects.add(button2);
		
		//forest spider
		/*Graphic t3 = new Graphic(500,0,300,300,"images/transBlack.png");
		viewObjects.add(t3);
		t3.preserveRatio = false;
		t3.resize(400, 450);
		t3.setVisible(false);*/
		
		TextColoredLabel ji = new TextColoredLabel(170, 100, 400, 100, "Spiders!!", null, Color.blue);
		viewObjects.add(ji);
		
		TextColoredLabel ji1 = new TextColoredLabel(170, 200, 400, 100, "Catch some spiders!", null, Color.blue);
		ji1.setFont(b);
		viewObjects.add(ji1);
		
		button3 =new TextAreaHoverButton(1050, 100, 30, 40, "", null, ji,ji1, t1, new Action() {
		
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new CatchingStoryJi(getWidth(), getHeight()));
				
			}
		}, true);
		viewObjects.add(button3);
		
		//magic squares
		
		/*Graphic t4 = new Graphic(500,0,300,300,"images/transBlack.png");
		viewObjects.add(t4);
		t4.preserveRatio = false;
		t4.resize(400, 450);
		t4.setVisible(false);*/
		
		TextColoredLabel vi = new TextColoredLabel(170, 100, 450, 100, "Gryffindor Guardian", null, Color.blue);
		viewObjects.add(vi);
		
		TextColoredLabel vi1 = new TextColoredLabel(170, 200, 450, 100, "Magic Square game", null, Color.blue);
		vi1.setFont(b);
		viewObjects.add(vi1);
		
		button4 = new TextAreaHoverButton(800, 340, 30, 40, "", null, vi,vi1, t1, new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new SirCadoganTheMadKnight(getWidth(), getHeight(), true, false));
				
			}
		}, true);
		viewObjects.add(button4);
		
		/*
		//siren
		pointer5 = new Graphic(570, 460, 30, 40, "images/pointer.png");
		viewObjects.add(pointer5);
		button5 = new Button(570, 460, 30, 40, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button5);
		*/
		
		//side story hogwarts
		/*
		pointer6 = new Graphic(930, 400, 30, 40, "images/pointer.png");
		viewObjects.add(pointer6);
		button6 = new Button(930, 400, 30, 40, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button6);
		*/
		
		/*
		//hogsmeade
		pointer7 = new Graphic(100, 200, 30, 40, "images/pointer.png");
		viewObjects.add(pointer7);
		button7 = new Button(100, 200, 30, 40, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button7);
		*/
		
		//500,415
		
		
		Graphic t5 = new Graphic(500,0,300,300,"images/mer.jpg");
		viewObjects.add(t5);
		//t5.preserveRatio = false;
		//t5.resize(400, 450);
		t5.setVisible(false);
		
		
		
		TextColoredLabel bL = new TextColoredLabel(170, 100, 600, 100, "Black Lake", null, Color.magenta);
		viewObjects.add(bL);
		
		TextColoredLabel bL1 = new TextColoredLabel(170, 200, 600, 100, "A large body of water that is home to many creatures", null, Color.magenta);
		bL1.setFont(b);
		viewObjects.add(bL1);
		
		
		button8 = new TextAreaHoverButton(500, 415, 30, 40, "", null, bL, bL1, t1, null, true);
		button8.additionalImage(t5);
		viewObjects.add(button8);
		
		//310 75
		
		
		Graphic beer = new Graphic(500,45,300,648,"images/beer.jpg");
		viewObjects.add(beer);
		//beer.preserveRatio = false;
		//beer.resize(400, 450);
		beer.setVisible(false);
		
		TextColoredLabel hV = new TextColoredLabel(445, 225, 600, 100, "Hogsmeade Village", null, Color.magenta);
		viewObjects.add(hV);
		
		TextColoredLabel hV1 = new TextColoredLabel(445, 325, 600, 200, "The only all-wizarding village in Britain where great snacks can be bought", null, Color.magenta);
		hV1.setFont(b);
		viewObjects.add(hV1);
		
		
		button9 = new TextAreaHoverButton(310, 75, 30, 40, "", null, hV, hV1, t1, null, true);
		button9.additionalImage(beer);
		viewObjects.add(button9);
		
		
		
		Graphic t7 = new Graphic(500,0,300,417,"images/ForbiddenForest.png");
		viewObjects.add(t7);
		//t7.preserveRatio = false;
		//t7.resize(400, 450);
		t7.setVisible(false);
		
		TextColoredLabel fF = new TextColoredLabel(445, 225, 700, 100, "The Forbidden Forest", null, Color.magenta);
		viewObjects.add(fF);
		
		TextColoredLabel fF1 = new TextColoredLabel(445, 325, 700, 200, "A very old place that holds many secrets and houses many creatures, some dark and Dangerous, others friendly", null, Color.magenta);
		fF1.setFont(b);
		viewObjects.add(fF1);
		
		
		button10 = new TextAreaHoverButton(855	, 60, 30, 40, "", null, fF, fF1, t1, null, true);
		button10.additionalImage(t7);
		viewObjects.add(button10);
		
		//
		
		
		Graphic t6 = new Graphic(500,0,300,300,"images/Shriek.png");
		viewObjects.add(t6);
		//t6.preserveRatio = false;
		//t6.resize(400, 450);
		t6.setVisible(false);
		
		TextColoredLabel sS = new TextColoredLabel(445, 225, 700, 100, "The Shrieking Shack", null, Color.magenta);
		viewObjects.add(sS);
		
		TextColoredLabel sS1 = new TextColoredLabel(445, 325, 700, 100, "An abandoned house rumored to be haunted", null, Color.magenta);
		sS1.setFont(b);
		viewObjects.add(sS1);
		
		
		button11 = new TextAreaHoverButton(213	, 200, 30, 40, "", null, sS, sS1, t1, null, true);
		button11.additionalImage(t6);
		viewObjects.add(button11);
	}

}
