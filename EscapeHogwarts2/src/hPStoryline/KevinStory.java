package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class KevinStory extends FullFunctionScreen {
	
	private Graphic backImg;
	private TextArea description;
	
	public KevinStory(int width, int height) {
		super(width, height);
		description.setForeground(Color.LIGHT_GRAY);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backImg = new Graphic(0, 0, 1600, 1600, "simg/background.jpg");
		viewObjects.add(backImg);
		
		description = new TextArea(650, 330, 700, 400, "Harry Potter");
		viewObjects.add(description);

	}

	
}
