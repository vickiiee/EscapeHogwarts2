package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephStory extends FullFunctionScreen {

	private Graphic backImg;
	private ClickableGraphic broom;
	private TextArea description;
	private TextArea title;
	private int click = 0;
	
	public StephStory(int width, int height) {
		super(width, height);
		title.setForeground(Color.LIGHT_GRAY);
		title.setSize(80);
		description.setForeground(Color.LIGHT_GRAY);
		description.setSize(50);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backImg = new Graphic(0, 0, 1600, 1600, "simg/background.jpg");
		viewObjects.add(backImg);
		
		title = new TextArea(50, 50, 700, 400, "Harry Potter Spin-off");
		viewObjects.add(title);
		
		description = new TextArea(100, 200, 500, 500, "");
		
		broom = new ClickableGraphic(1000, 700, 150, 150, "simg/broom.jpg");
		viewObjects.add(broom);
		broom.setAction(new Action() {
			
			public void act() {
				click++;	
				broomClick();
			}
		});
	}
	
	public void broomClick() {
		if(click == 1) {
			description.setText("You are Harry Potter. Continue the storyline to see what your future holds...");
			viewObjects.add(description);
		}else {
			GuiLoadingVickie.loading.setScreen(new StephStory2(getWidth(), getHeight()));
		}
		
	}

}
