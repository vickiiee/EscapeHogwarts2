package hPStoryline;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Scene1 extends FullFunctionScreen{

	private Graphic background;

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);
	}

}
