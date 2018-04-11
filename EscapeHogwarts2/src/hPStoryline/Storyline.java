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
import hPConnect4Areej.ConnectFourAreej;

public class Storyline extends FullFunctionScreen {

	private Graphic background;
	private Graphic nick;
	private Button load;
	private Button quit;
	
	public Storyline(int width, int height) {
		super(width, height);
		load.setSize(30);
		quit.setSize(30);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, 1200, 800, "images/stairs.jpg");
		viewObjects.add(background);
		
		
		load = new Button(1000,100,100,50,"Play", Color.LIGHT_GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new ConnectFourAreej(getWidth(), getHeight()));
			}
		});
		viewObjects.add(load);
				
		quit = new Button(1000,200,100,50,"Go Back",Color.LIGHT_GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new Scene1(getWidth(), getHeight()));
			}
		}); 
		viewObjects.add(quit);
		
		nick = new Graphic(0, 0, 1200, 800, "images/sirnick.jpg");
		viewObjects.add(nick);
		
	
	}

}