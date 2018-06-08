package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPStartGame.StoryLineGuideJi;

public class SirCadoganTheMadKnight extends FullFunctionScreen implements StoryLineGuideJi {
	// flip to game
	
	
	private TextArea dialogueTxt;
	private Graphic dialogue;
	private Graphic knight;
	private Graphic background;
	
	private Color brown = new Color(48,41,35);
	private Button oneR;
	//private boolean true;
	
	
	
	//https://alvinalexander.com/blog/post/jfc-swing/use-animated-gif-image-in-jfc-swing-application
	public SirCadoganTheMadKnight(int width, int height) {
		super(width, height);
		setBackground(brown);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayPhrase(String txt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void append(TextArea word, char letter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void runStoryLine1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchCharName(String cName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchCharImage(Graphic charImage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchBkgrnd(Graphic bkgrnd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void continueScenes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0, getWidth(), getHeight(), "vImages/msEntrance.jpg");
		viewObjects.add(background);
		
		
		
		//knight = new Graphic(350,0,500, 500, "vImages/msKnight.jpg");
		//viewObjects.add(knight);
		
		knight = new Graphic(503,83,226, 400, "vImages/try2.jpg");
		viewObjects.add(knight);
		
		dialogue = new Graphic(80,80,1200,700, "images/textbox.png");
		viewObjects.add(dialogue);
		
		oneR = new Button(600, 600, 100, 100, "Teest1", brown, null);
		oneR.setCustomActiveBorderColor(Color.red);
		viewObjects.add(oneR);
		
	}

}
