package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextLabel;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class JiMenu extends FullFunctionScreen{

	private Graphic logo;
	private Button play;
	private Graphic harrylogo;
	private Visible hogwarts;
	private Graphic background;
	private TextLabel description;
	private Graphic birdies;
	
	public JiMenu(int width, int height) {
		super(width, height);
		description.setSize(50);
		play.setSize(80);
		description.setForeground(Color.LIGHT_GRAY);
		play.setForeground(Color.LIGHT_GRAY);

		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/night.png");
		viewObjects.add(background);
		
		birdies = new Graphic(700, 350, 500, 500, "images/birdies.jpg");
		viewObjects.add(birdies);
		
		harrylogo = new Graphic(380, 170, 500, 500, "images/harrypotter2.png");
		viewObjects.add(harrylogo);
		
		hogwarts = new Graphic(100, 520, 500, 500, "images/hogwarts.png");
		viewObjects.add(hogwarts);
		
		description = new TextArea(650, 330, 700, 400, "and The Escape Of Hogwarts");
		viewObjects.add(description);

		play = new Button(410, 320, 400, 400, "Play", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(play);

	}

}
