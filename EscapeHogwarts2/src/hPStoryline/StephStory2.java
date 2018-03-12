package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephStory2 extends FullFunctionScreen {

	private TextArea title;
	private Graphic background;
	private Graphic chatbox;
	private ClickableGraphic nextB;
	
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
		
		chatbox = new Graphic(80,80,1200,700, "simg/textbox.png");
		viewObjects.add(chatbox);
		
		nextB = new ClickableGraphic(1100, 700, 50, 50, "simg/symbol.png");
		viewObjects.add(nextB);
	}

}
