package hpKevStoryLine;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephGame extends FullFunctionScreen {

	private Graphic gameBg;
	
	public StephGame(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		gameBg = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg7.jpeg");
		viewObjects.add(gameBg); 

	}

}