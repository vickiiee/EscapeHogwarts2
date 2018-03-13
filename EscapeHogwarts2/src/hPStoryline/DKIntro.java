package hPStoryline;

import java.util.List;

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
		textBox.setSize(50);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/trainStation.png");
		viewObjects.add(backgroundImg);
		
		textBox = new TextArea(250, 450, 650, 500, "As Harry boarded the Hogwart's Express for his third year in Hogwarts, he never expected to meet every magical prisoner's worst nightmare");
		viewObjects.add(textBox);
		
	}

}
