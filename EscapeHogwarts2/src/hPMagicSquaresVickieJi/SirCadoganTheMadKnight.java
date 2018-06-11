package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;
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
	private TextArea charName;
	//private boolean true;
	private Button threeR;
	private Button twoR;
	
	
	
	//https://alvinalexander.com/blog/post/jfc-swing/use-animated-gif-image-in-jfc-swing-application
	public SirCadoganTheMadKnight(int width, int height) {
		super(width, height);
		setBackground(brown);
		((TextLabel) charName).setSize(50);
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

	
	public Color newColorWithAlpha(Color original, int alpha) {
		// System.out.println("newColorAlpha()");
		return new Color(original.getRed(), original.getGreen(), original.getBlue(), alpha);
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		//Color trans = VickieHPFrontEnd.trans;
		
		Color t = newColorWithAlpha(Color.black, 60);
		background = new Graphic(0,0, getWidth(), getHeight(), "vImages/msEntrance.jpg");
		viewObjects.add(background);
		
		
		
		//knight = new Graphic(350,0,500, 500, "vImages/msKnight.jpg");
		//viewObjects.add(knight);
		
		knight = new Graphic(503,83,226, 400, "vImages/try2.jpg");
		viewObjects.add(knight);
		
		dialogue = new Graphic(80,80,1200,700, "images/textbox.png");
		viewObjects.add(dialogue);
		
		charName = new TextArea(230, 520, 200, 75, "Name");
		viewObjects.add(charName);
		
		dialogueTxt = new TextArea(210, 590, 700, 500, "ooooooo"); //210,590,700,500
		viewObjects.add(dialogueTxt);
		
		oneR = new Button(800, 310, 295, 75, "Teest1",t , null); //800, 510, 295, 75
		oneR.setForeground(Color.orange);
		System.out.println(oneR.getActiveBorderColor()+"uyifguy");
		oneR.setHoverAction(new Action() {

			@Override
			public void act() {
				System.out.println(oneR.getActiveBorderColor()+"uyifguy");
			}
			
		});
	//	oneR.setStaticBorderColor(Color.red);
		//oneR.setCustomActiveBorderColor(Color.red);
		viewObjects.add(oneR);
		
		twoR = new Button(800, 400, 295, 75, "Teest2",t , null); // 800,600,295,75
		//oneR.setCustomActiveBorderColor(Color.red);
		viewObjects.add(twoR);
		
		threeR = new Button(800, 490, 295, 75, "Teest3",t , null); //800,690,295,75
		//oneR.setCustomActiveBorderColor(Color.red);
		viewObjects.add(threeR);
		
		
		
	}

}
