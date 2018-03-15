package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKTrain extends FullFunctionScreen {

	private Graphic backgroundImg;
	private TextArea textBox;
	
	public DKTrain(int width, int height) {
		super(width, height);
		
		textBox.setSize(100);
		textBox.setForeground(Color.gray);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/dementorHand.jpg");
		viewObjects.add(backgroundImg);
		
		
		textBox = new TextArea(175, 150, 400, 300, "A Dementor");
		viewObjects.add(textBox);
	}

}
