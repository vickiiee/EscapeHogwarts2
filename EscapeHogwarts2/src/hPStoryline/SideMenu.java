package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class SideMenu extends FullFunctionScreen{

	private Graphic background;
	private Button lightsOut;
	private Button dKiss;

	public SideMenu(int width, int height) {
		super(width, height);
		setVisible(true);
		lightsOut.setForeground(Color.WHITE);
		dKiss.setForeground(Color.WHITE);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);
		
		lightsOut = new Button(100, 350, 300, 75, "Side Story", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new StephStory(getWidth(), getHeight()));
			}
		});
		viewObjects.add(lightsOut);
		
		dKiss = new Button(500, 640, 500, 100, "The Dementor's Kiss", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTitle(getWidth(), getHeight()));
			}
		});
		viewObjects.add(dKiss);
	}		
	
}