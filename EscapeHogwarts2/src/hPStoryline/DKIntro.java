package hPStoryline;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKIntro extends FullFunctionScreen {

	private Graphic backgroundImg;
	private Button title;
	private TextArea textBox;
	
	public DKIntro(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/trainStation.png");
		viewObjects.add(backgroundImg);
		
		textBox = new TextArea(300, 550, 600, 200, "As Harry boarded the Hogwart's Express,");
		viewObjects.add(textBox);
		
	}

}
