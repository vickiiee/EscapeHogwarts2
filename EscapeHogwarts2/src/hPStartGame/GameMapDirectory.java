package hPStartGame;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class GameMapDirectory extends FullFunctionScreen{

	private Graphic background;
	private Graphic pointer;
	
	public GameMapDirectory(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/hogwartsMap.jpg");
		viewObjects.add(background);
		
		pointer = new Graphic(900, 300, 30, 40, "images/pointer.png");
		viewObjects.add(pointer);
		
		pointer = new Graphic(750, 670, 30, 40, "images/pointer.png");
		viewObjects.add(pointer);
		
		pointer = new Graphic(1000, 100, 30, 40, "images/pointer.png");
		viewObjects.add(pointer);
		
	}

}
