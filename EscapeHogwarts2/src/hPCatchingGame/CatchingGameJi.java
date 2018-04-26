package hPCatchingGame;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatchingGameJi extends FullFunctionScreen{

	private Graphic background;
	
	private int lives = 1;

	public CatchingGameJi(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void generatePotions() {
		
	}
	
	public void checkLivesLeft() {
		
	}
	
	

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0,getWidth(), getHeight(), "images/background4.jpg");
		viewObjects.add(background);
	}

	
}
