package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Scene1 extends FullFunctionScreen{

	private Graphic background;
	private Button lightsOut;

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(true);
		lightsOut.setForeground(Color.LIGHT_GRAY);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);
		
		lightsOut = new Button(100, 450, 300, 75, "Side Story", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new StephStory(getWidth(), getHeight()));
			}
		});
		viewObjects.add(lightsOut);
	}		
	
	//dsd
}
