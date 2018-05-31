package hPStartGame;

import java.util.List;

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
	
	public GameMapDirectory(int width, int height) {
		super(width, height);
	}
	
	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/hogwartsMap.jpg");
		viewObjects.add(background);
		
		pointer1 = new Graphic(900, 300, 30, 40, "images/pointer.png");
		viewObjects.add(pointer1);
		
		pointer2 = new Graphic(750, 670, 30, 40, "images/pointer.png");
		viewObjects.add(pointer2);
		
		pointer3 = new ClickableGraphic(1000, 100, 30, 40, "images/pointer.png");
		viewObjects.add(pointer3);
		/*
		sampletxt = new TextArea(1000, 90, 100, 100, "");
		viewObjects.add(sampletxt);
		
		if(isHovered(30,40)) {
			sampletxt.setText("Catching Game");
		}
		*/
	}

}
