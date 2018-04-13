package hPStoryline;

import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKKissGame extends FullFunctionScreen{

	private Graphic backgroundImg;
	private ClickableGraphic cardOne;
	private ClickableGraphic cardTwo;
	private ClickableGraphic cardThree;
	private ClickableGraphic cardFour;
	private ClickableGraphic cardFive;
	private ClickableGraphic cardSix;
	private ClickableGraphic cardSeven;
	private ClickableGraphic cardEight;
	private ClickableGraphic cardNine;
	private ClickableGraphic cardTen;
	private ClickableGraphic cardEleven;
	private ClickableGraphic cardTwelve;
	
	public DKKissGame(int width, int height) {
		super(width, height);
		
	}

	
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/memoryReel.png");
		viewObjects.add(backgroundImg);
		
		cardOne = new ClickableGraphic(50, 75, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardOne);
		
		cardTwo = new ClickableGraphic(230, 75, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardTwo);
		
		cardThree = new ClickableGraphic(410, 75, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardThree);
		
		cardFour = new ClickableGraphic(590, 75, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardFour);
		
		cardFive = new ClickableGraphic(770, 75, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardFive);
		
		cardSix = new ClickableGraphic(950, 75, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardSix);
		
		cardSeven = new ClickableGraphic(50, 425, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardSeven);
		
		cardEight = new ClickableGraphic(230, 425, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardEight);
		
		cardNine = new ClickableGraphic(410, 425, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardNine);
		
		cardTen = new ClickableGraphic(590, 425, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardTen);
		
		cardEleven = new ClickableGraphic(770, 425, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardEleven);
		
		cardTwelve = new ClickableGraphic(950, 425, 150, 300, "kimg/cardBack.png");
		viewObjects.add(cardTwelve);
	
	}
	
	
}
