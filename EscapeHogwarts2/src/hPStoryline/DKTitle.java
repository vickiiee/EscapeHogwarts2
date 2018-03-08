package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKTitle extends FullFunctionScreen {
	
	private Graphic backgroundImg;
	private Button title;
	
	public DKTitle(int width, int height) {
		super(width, height);
		title.setForeground(Color.LIGHT_GRAY);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/dementorBackground.jpg");
		viewObjects.add(backgroundImg);
		
		title = new Button(70, 550, 500, 100, "The Dementor's Kiss", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKIntro(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(title);

	}

	
}
