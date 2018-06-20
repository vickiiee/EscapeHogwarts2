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
import guiTeacher.components.TextColoredLabel;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPConnect4Areej.ConnectFourAreej;
import hPStartGame.GuiLoadingVickie;
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
	
	private String[] storyLine1;
	private boolean startSeq;
	
	private String[] words;
	private int wLen;
	
	private int s1;
	private Timer timer;
	private TimerTask task;
	
	
	private String[] madK;
	private String[] response1;
	
	private String[] response2;
	
	private String kRes;
	private Button r1;
	private Button r2;
	
	private TextColoredLabel b1;
	private TextColoredLabel b2;
	
	
	//private TextAreaColor b1;
	//private TextAreaColor b2;
	
	private boolean one;
	
	//https://alvinalexander.com/blog/post/jfc-swing/use-animated-gif-image-in-jfc-swing-application
	public SirCadoganTheMadKnight(int width, int height) {
		super(width, height);
		setBackground(brown);
		((TextLabel) charName).setSize(50);
		dialogueTxt.setSize(40);
		
		b1.setSize(40);
		b2.setSize(40);
		
		r1.setSize(40);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayPhrase(String txt) {

		int x = 0;
		for (int i = 0; i < txt.length(); i++) {
			if (txt.substring(i, i + 1).equals(" ")) {
				x++;
			}
		}

		words = new String[x + 1];
		wLen = 0;
		yut(txt);

		dialogueTxt.setText("");
		for (int i = 0; i < words.length; i++) {
			append(dialogueTxt, words[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		r1.setVisible(true);
		r2.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		
		return "";
	}

	public void yut(String d) {
		int f = d.indexOf(" ");
		if (f != -1) {
			words[wLen] = d.substring(0, f + 1);
			System.out.println(d.substring(0, f+1));
			wLen++;
			d=d.substring(f+1);
			yut(d);
		}else {
			words[wLen] = d;
		}
	}

	@Override
	public void append(TextArea word, char letter) {
		word.setText(word.getText() + letter);

	}
	
	public void append(TextArea phrase, String word) {
		phrase.setText(phrase.getText() + word);

	}
	
	
	public void runStoryLine1() {
	
			 timer = new Timer();
			 task = new TimerTask() {
			
				
				public void run() {
						//System.out.println("Running");
						//System.out.println(s1);
							//displayPhrase(kRes);
							displayPhrase(kRes);//storyLine1[s1]
							timer.cancel();
							
				}

			};
			timer.schedule(task, 0, 2000);
		

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
		s1 = 0;
		
		kRes = "Hello There!";
		
		String[] n = { "Ron..!! Hermione..!", "Wake up, we ought to go now!",
				"We don't got much time now, we must leave before anyone sees us!", "...",
				"Harry, are you still sure about this?", "What if you get caught?",
				"This might be our only chance to go to Hogsmeade together! Besides, once I get my invisibility cloak "
						+ "I'll be fine.",
						"Can you imagine all the things we'll do there?!",
		"We especially have to go to Honeydukes, the sweets are top priority!" };
		storyLine1 = n;
		
		String[] x = { "Hello There!", "I am Sir Cadogan, the Brave Knight and the guardian of Gryffindor Tower!"};
		madK = x;
		
		String[] k = { "Who are you?", "I am Sir Cadogan, the Brave Knight and the guardian of Gryffindor Tower!"};
		response1 = k;
		
		String[] a = { "Where's the Fat Lady?", "I am Sir Cadogan, the Brave Knight and the guardian of Gryffindor Tower!"};
		response2 = a;
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
		
		charName = new TextArea(230, 520, 200, 75, "Cadogan");
		viewObjects.add(charName);
		
		dialogueTxt = new TextArea(210, 590, 700, 500, "ooooooo"); //210,590,700,500
		viewObjects.add(dialogueTxt);
		
		/*oneR = new Button(800, 310, 295, 75, "",t , new Action() {

			
			public void act() {
				if(s1 != storyLine1.length-1) {
						s1++;
						runStoryLine1();
					}
	
				
				//System.out.println("Running");
				//System.out.println(s1);
				//	displayPhrase(storyLine1[s1]);
					
				
			}
			
		}); //800, 510, 295, 75
		oneR.setForeground(Color.orange);
		viewObjects.add(oneR);
		*/
		//System.out.println(oneR.getActiveBorderColor()+"uyifguy");
		
	//	oneR.setStaticBorderColor(Color.red);
		//oneR.setCustomActiveBorderColor(Color.red);
		
		
		/*twoR = new Button(800, 400, 295, 75, "Teest2",t , null); // 800,600,295,75
		//oneR.setCustomActiveBorderColor(Color.red);
		viewObjects.add(twoR);
		*/
		
		threeR = new Button(800, 490, 295, 75, "Teest3",t , new Action() {

			@Override
			public void act() {
					if(s1 != storyLine1.length-1) {
							s1++;
							runStoryLine1();
						}
		
					
					//System.out.println("Running");
					//System.out.println(s1);
					//	displayPhrase(storyLine1[s1]);
						
					
				}
			
			
		}); //800,690,295,75
		//oneR.setCustomActiveBorderColor(Color.red);
		viewObjects.add(threeR);
		
		//TO SET HOVER ACTION, MAKE NEW CLASS EXTENDING BUTTON CLASS AND OVERRIDE hoverACTION METHOD
		
		/*
		 * StoryLine:
		 * firstTIme boolean
		 * P: Hello There!
		 * 
		 * 		U: Who are you??
		 * 			P: I am Sir Cadogan, the Brave Knight and the guardian of Gryffindor Tower!
		 * 				U: Where's the Fat Lady??
		 * 					P: After her ordeal with Sirius Black, I bravely volunteered to replace her and - ta da!! Here we are.
		 * 						U:Let me in Dorm Password
		 * 							P: Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.
		 * 								U: You can't do that! I'm telling professor McGonagall.
		 * 									P: Where's your courage, lad?? If you were truly Gryfindor, you wouldn't be running away from the challenge!
		 * 										//U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 								U: Why?
		 * 									P:You never know where Sirius Black may be lurking and eavesdropping.
		 * 										U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 						U: Oh nice to meet you. Is the password "x" today?
		 * 							P: Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.
		 * 								U: You can't do that! I'm telling professor McGonagall.
		 * 									P: Where's your courage, lad?? If you were truly Gryfindor, you wouldn't be running away from the challenge!
		 * 										U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 								U: Why?
		 * 									P:You never know where Sirius Black may be lurking and eavesdropping.
		 * 										U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 				U: Oh, Nice to meet you/Dorm Password
		 * 					P: Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.
		 * 						U: You can't do that! I'm telling Dumbledore/McGonagall.
		 * 							P: Where's your code of honor??
		 * 								Not brave enough to try it, huh? Guess you arent Gryffindor. Get out of here. Byeeeee //EXIT
		 * 						U: Why?
		 * 							P:You never know where Sirius Black may be lurking and eavesdropping.
		 * 								U: Uh, I'll just come back later//EXIT
		 * 								U: Okay, I'll do it.
		 * 				
		 * 		U: Where's the Fat Lady??
		 * 			P: After her ordeal with Sirius Black, I bravely volunteered to replace her and - ta da!! Here we are.
		 * 				U: Who are you??
		 * 					P:I am Sir Cadogan, the Brave Knight and the guardian of Gryffindor Tower!
		 * 						U:Let me in Dorm Password
		 * 							P: Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.
		 * 								U: You can't do that! I'm telling professor McGonagall.
		 * 									P: Where's your courage, lad?? If you were truly Gryfindor, you wouldn't be running away from the challenge!
		 * 										U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 								U: Why?
		 * 									P:You never know where Sirius Black may be lurking and eavesdropping.
		 * 										U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 						U: Oh nice to meet you. Is the password "x" today?
		 * 							P: Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.
		 * 								U: You can't do that! I'm telling professor McGonagall.
		 * 									P: Where's your courage, lad?? If you were truly Gryfindor, you wouldn't be running away from the challenge!
		 * 										U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 								U: Why?
		 * 									P:You never know where Sirius Black may be lurking and eavesdropping.
		 * 										U: I'll just come back later //EXIT
		 * 										U: Fine, I'll do it.
		 * 				U: Let me in//Dorm Password
		 * 					P: Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.
		 * 						U: You can't do that! I'm telling professor McGonagall.
		 * 							P: Where's your courage, lad?? If you were truly Gryfindor, you wouldn't be running away from the challenge!
		 * 								U: I'll just come back later //EXIT
		 * 								U: Fine, I'll do it.
		 * 						U: Why?
		 * 							P:You never know where Sirius Black may be lurking and eavesdropping.
		 * 								U: I'll just come back later //EXIT
		 * 								U: Fine, I'll do it.
		 * 
		 * 		U: //something else
		 * 			
		 * P:Back again, huh? In order to get into the dorm, just solve the puzzle!
		 * you dont know where he may be lurking
		 */

		r1 = new Button(800, 310, 320, 125, "", t, new Action() {

			public void act() {
				if (b1.getText().equals("Who are you??")) {
					kRes = "I am Sir Cadogan, the Brave Knight and the guardian of Gryffindor Tower!";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setText("Where's the Fat Lady??");
							b2.setText("Nice to meet you. Is the password 'Flibbertigibbet' today?");
							runStoryLine1();
				}else if (b1.getText().equals("Where's the Fat Lady??")) {
					kRes = "After her ordeal with Sirius Black, I bravely volunteered to replace her and - ta da!! Here we are.";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setText("Let me in. Flibbertigibbet");
							b2.setText("Nice to meet you. Is the password 'Flibbertigibbet' today?");
							runStoryLine1();
				}else if (b1.getText().equals("Let me in. Flibbertigibbet")) {
					kRes = "Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setText("You can't do that! I'm telling Professor McGonagall.");
							b2.setText("Why?");
					runStoryLine1();
				}else if (b1.getText().equals("You can't do that! I'm telling Professor McGonagall.")) {
					kRes = "Now, where's your courage?? If you were truly a Gryffindor, you wouldn't be running away from the challenge!";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setText("I'll just come back later");
							b2.setText("Fine, I'll do it");
					runStoryLine1();
				}
				
			}
		}); // 800, 510, 295, 75
		//r1.setForeground(Color.orange);
		viewObjects.add(r1);
		
		r2 = new Button(800, 440, 320, 125, "",t , new Action() {

			@Override
			public void act() {
				
				System.out.print("click");
				if (b2.getText().equals("Where's the Fat Lady??")) {
					kRes = "After her ordeal with Sirius Black, I bravely volunteered to take her place and - ta da!! Here we are.";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
							b1.setText("Let me in. Flibbertigibbet");
							b2.setText("Who are you??");
						runStoryLine1();
				}else
				
				if (b2.getText().equals("Who are you??")) {
					kRes = "I am Sir Cadogan, the Brave Knight and the guardian of Gryffindor Tower!";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
							b1.setText("Let me in. Flibbertigibbet");
							b2.setText("Nice to meet you. Is the password 'Flibbertigibbet' today?");
						runStoryLine1();
				}else
				
				if (b2.getText().equals("Nice to meet you. Is the password 'Flibbertigibbet' today?")) {
					kRes = "Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
							b1.setText("You can't do that! I'm telling Professor McGonagall.");
							b2.setText("Why?");
						runStoryLine1();
				}else
				
				if (b2.getText().equals("Why?")) {
					kRes = "You never know where Sirius Black may be lurking and eavesdropping.";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
							b1.setText("I'll just come back later");
							b2.setText("Fine, I'll do it");
						runStoryLine1();
				}else
				
				if (b2.getText().equals("Fine, I'll do it")) {
					GuiLoadingVickie.loading.setScreen(new Instruction(getWidth(), getHeight()));
				}
			}
			
		}); // 800,600,295,75
		//oneR.setCustomActiveBorderColor(Color.red);
		viewObjects.add(r2);
		
		b1 = new TextColoredLabel(800, 310, 320, 125, "Who are you??", Color.black, Color.orange);
		b1.setVisible(false);
		viewObjects.add(b1);
		b2 = new TextColoredLabel(800, 440, 320, 125, "Where's the Fat Lady??", null, Color.orange);
		b2.setVisible(false);
		viewObjects.add(b2);
		
		/*b1 = new TextAreaColor(800, 310, 295, 125, "Who are you??", null, null);
		b1.setVisible(false);
		b1.setForeground(Color.orange);
		viewObjects.add(b1);
		b2 = new TextAreaColor(800, 440, 295, 125, "Where's the Fat Lady??", null, null);
		b2.setForeground(Color.orange);
		b2.setVisible(false);
		viewObjects.add(b2);*/
		
		startSeq =true;
		if (startSeq) {
			runStoryLine1();
		}
		//runStoryLine1();
		
		
	}

	/*
	 * P:Well, well, u did it!
	 */
	
}
