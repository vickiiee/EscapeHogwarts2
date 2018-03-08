package hPStoryline;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKTrain extends FullFunctionScreen {

	private Graphic backgroundImg;
	
	public DKTrain(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/dementorHand.jpg");
		viewObjects.add(backgroundImg);
		
	}

}
