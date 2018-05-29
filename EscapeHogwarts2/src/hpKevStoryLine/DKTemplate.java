package hpKevStoryLine;


import java.awt.Color;
import java.util.List;

import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKTemplate extends FullFunctionScreen {

	private Graphic backImg;
	private Graphic textBox;
	private TextArea name;
	private TextArea dialog;
	private ClickableGraphic nextButton;
	private ClickableGraphic preButton;
	private String[] nameList;
	private String[] dialogList;
	
	public DKTemplate(int width, int height) {
		super(width, height);
		
	}
	
	public void initAllObjects(List<Visible> viewObjects) {
		backImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/carriage.jpeg");
		viewObjects.add(backImg);
	}

}
