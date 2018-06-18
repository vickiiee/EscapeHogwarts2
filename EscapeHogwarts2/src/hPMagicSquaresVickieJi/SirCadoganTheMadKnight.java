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
	private Graphic dialogueG;
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
		dialogueTxt.setText("");
		for(int i = 0; i < txt.length(); i++) {
			append(dialogueTxt, txt.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return "";
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
		
		dialogueG = new Graphic(80,80,1200,700, "images/textbox.png");
		viewObjects.add(dialogueG);
		
		charName = new TextArea(230, 520, 200, 75, "Name");
		viewObjects.add(charName);
		
		dialogueTxt = new TextArea(210, 590, 700, 500, "ooooooo"); //210,590,700,500
		viewObjects.add(dialogueTxt);
		
		oneR = new Button(800, 310, 295, 75, "Teest1",t , null); //800, 510, 295, 75
		oneR.setForeground(Color.orange);
		//System.out.println(oneR.getActiveBorderColor()+"uyifguy");
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
		
		//TO SET HOVER ACTION, MAKE NEW CLASS EXTENDING BUTTON CLASS AND OVERRIDE hoverACTION METHOD
		
		/*
		 * StoryLine:
		 * P: Hello There!
		 * 		U://Dorm Password
		 * 			P: I am Sir Cadogan the Brave Knight, though some people call me mad.
		 * 				U: Let me in! Idc who you are!
		 * 					P: RUDE BITCH //EXIT
		 *				U: Where's the Fat Lady??
		 *					P: After her ordeal with Sirius Black, I was graciously asked to replace her and - ta da!! Here we are.
		 *						U:
		 * 		U: Who are you??
		 * 			P: I am Sir Cadogan the Brave Knight, though some people call me mad.
		 * 				U: Where's the Fat Lady??
		 * 					P: After her ordeal with Sirius Black, I was graciously asked to replace her and - ta da!! Here we are.
		 * 				U: Dorm Password
		 * 					P: Nuh-uh. That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.
		 * 						U: You can't do that! I'm telling Dumbledore/McGonagall.
		 * 							P: Where's your code of honor??
		 * 								Not brave enough to try it, huh? Guess you arent Gryffindor. Get out of here. Byeeeee //EXIT
		 * 						U: Why?
		 * 							P:If you are Gryffindor, you'd shut up and do it.
		 * 								U: Guess I'm not Gryffindor //EXIT
		 * 								U: Okay, I'll do it.
		 * 		U: //something else
		 * 			
		 */
		
	}

}
