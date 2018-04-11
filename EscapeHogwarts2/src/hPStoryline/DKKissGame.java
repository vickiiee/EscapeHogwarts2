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
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/train		qq.png");
		viewObjects.add(backgroundImg);
	}
}
