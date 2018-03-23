package hPStoryline;

import java.util.List;

import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKInstructions extends FullFunctionScreen {

	private Graphic backgroundImg;
	private TextArea textBox;
	private ClickableGraphic arrow;
	private ClickableGraphic back;
	
	public DKInstructions(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
	
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/train.png");
		viewObjects.add(backgroundImg);

	}

}
