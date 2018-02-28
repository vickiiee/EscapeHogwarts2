package hPStoryline;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Menu extends FullFunctionScreen{

	private Graphic logo;
	private Button play;
	
	public Menu(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		logo = new Graphic(0,0,500,500, "images/download.png");
		viewObjects.add(logo);
		
		play = new Button(300,400, 400,400,"Play!", new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(play);
	}

}
