package hPAreeshStory;

import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextBox;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class PartyStory extends FullFunctionScreen{
	
	private Graphic background;
	private Graphic nick;
	private Graphic textbox;
//	private TextArea dialogue;
	

	public PartyStory(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0, getWidth(), getHeight(), "images/stair.jpg");
		viewObjects.add(background);
		
		nick = new Graphic(40,750, 100, 100, "images/sirnick.jpg");
		viewObjects.add(nick);
		
		textbox = new Graphic(0,0, getWidth(), getHeight(), "images/textbox.png");
		viewObjects.add(textbox);
		
//		dialogue = new TextArea(0,0, getWidth(), getHeight(), "images/stair.jpg");
//			viewObjects.add(dialogue);
		/* String[] d1 = {"Good Evening Harry, Hermione, Ron","Good Evening Sir Nick, how are you?"}
		 * String[] d2 = {}
		 * String[] d3 = {}
		 */
		

		
	}
	
}
