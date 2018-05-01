package hpKevStoryLine;


import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPStoryline.GuiLoadingVickie;
import hPStoryline.Scene1;

public class StephStory extends FullFunctionScreen {

	private Graphic backImg;
	private TextArea title;
	private Button load;
	private Button newGame;
	private Button quit;
	
	public StephStory(int width, int height) {
		super(width, height);
		title.setSize(50);
		title.setForeground(Color.WHITE);
		load.setSize(30);
		newGame.setSize(30);
		quit.setSize(30);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backImg = new Graphic(0, 0, getWidth(), getHeight(), "simg/background3.jpg");
		viewObjects.add(backImg);
		
		title = new TextArea(710, 680, 700, 400, "Spin-off");
		viewObjects.add(title);
		
		load = new Button(1000,100,100,50,"Load Game", Color.LIGHT_GRAY,new Action() {
			
			@Override
			public void act() {
				//GuiLoadingVickie.loading.setScreen(new StephStory2(getWidth(), getHeight()));
			}
		});
		viewObjects.add(load);
		
		newGame = new Button(1000,175,100,50,"New Game",Color.LIGHT_GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new StephStory2(getWidth(), getHeight()));
			}
		});
		viewObjects.add(newGame);
		
		quit = new Button(1000,250,100,50,"Quit",Color.LIGHT_GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new Scene1(getWidth(), getHeight()));
			}
		});
		viewObjects.add(quit);
		
	
	}

}
