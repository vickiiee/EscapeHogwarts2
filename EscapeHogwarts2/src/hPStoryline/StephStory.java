package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
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
	private Button load;
	private Button newGame;
	private Button quit;
	private int click = 0;
	
	public StephStory(int width, int height) {
		super(width, height);
		title.setSize(80);
		title.setForeground(Color.WHITE);
		description.setSize(50);
		description.setForeground(Color.WHITE);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backImg = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg3.jpg");
		viewObjects.add(backImg);
		
		title = new TextArea(50, 50, 700, 400, "Harry Potter Spin-off");
		viewObjects.add(title);
		
		description = new TextArea(100, 200, 500, 500, "You are Harry Potter. Continue the storyline to see what your future holds...");
		viewObjects.add(description);
		
		load = new Button(50,700,300,50,"Load Game",Color.GRAY,new Action() {
			
			@Override
			public void act() {
				//GuiLoadingVickie.loading.setScreen(new StephStory2(getWidth(), getHeight()));
			}
		});
		viewObjects.add(load);
		
		newGame = new Button(430,700,300,50,"New Game",Color.GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new StephStory2(getWidth(), getHeight()));
			}
		});
		viewObjects.add(newGame);
		
		quit = new Button(800,700,300,50,"Quit",Color.GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new Scene1(getWidth(), getHeight()));
			}
		});
		viewObjects.add(quit);
		
	
	}

}
