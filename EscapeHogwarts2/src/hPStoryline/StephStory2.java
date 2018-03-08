package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephStory2 extends FullFunctionScreen {

	private TextArea title;
	private Graphic background;
	private Graphic chatbox;
	
	public StephStory2(int width, int height) {
		super(width, height);
		title.setSize(80);
		title.setForeground(Color.LIGHT_GRAY);
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "simg/background.jpg");
		viewObjects.add(background);
		
		title = new TextArea(150, 50, 700, 400, "Welcome");
		viewObjects.add(title);
		
		chatbox = new Graphic(0,0,1200, 600, "simg/textbox.png");
		viewObjects.add(chatbox);
	}

}
