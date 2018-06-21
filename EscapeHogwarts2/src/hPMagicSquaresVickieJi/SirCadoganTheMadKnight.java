package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
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
import hPStartGame.GameMenu;
import hPStartGame.GuiLoadingVickie;
import hPStartGame.StoryLineGuideJi;

public class SirCadoganTheMadKnight extends FullFunctionScreen {
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
	
	private Color brownish= new Color(192,118,47);
	
	
	//private TextAreaColor b1;
	//private TextAreaColor b2;
	
	private boolean begin;
	private Font smallF;
	private Font mF;
	private Font bF;
	
	private boolean win;
	
	//https://alvinalexander.com/blog/post/jfc-swing/use-animated-gif-image-in-jfc-swing-application
	public SirCadoganTheMadKnight(int width, int height, boolean first, boolean win) {
		super(width, height);
		System.out.print("1:");
		System.out.print(begin);
		System.out.print("2:");
		System.out.print(win);
		
		System.out.print("--------------------");
		System.out.print("3:");
		//System.out.print(d);
		System.out.print("4:");
		//System.out.print(x);
		setBackground(brown);
		((TextLabel) charName).setSize(50);
		dialogueTxt.setSize(40);
		
		b1.setSize(40);
		b2.setSize(40);
		
		r1.setSize(40);
		begin = first;
		this.win = win;
		System.out.print("5:");
		System.out.print(begin);
		System.out.print("6:");
		System.out.print(win);
		
		if (begin ==true) {
			
			kRes = "Hello There!";
			startSeq =true;
			if (startSeq) {
				runStoryLine1();
			}
			// runStoryLine1();
		}else {
			if(win==true) {
				
				System.out.print("in: Great job! Now I know you are really a GryffindorEh. It's not really secure. Just about anybody can beat it and they dont have to be Gryffindor..... i'll take that into consideration. Wait, you are Gryffindor right?	ys / suree/You may enter");
				//w
				winner();
			}else {
				System.out.print("WIN ++FALSESESES");
				loser();
				//...Are you really a gryffindor? Hermione was able to finish it in under a minute
						//I'm not Hermione
				//Obviously not. Want to try again?
						//y/n
			}
		}
	
		// TODO Auto-generated constructor stub
	}

	public String displayPhrase(String txt) {

		int x = 0;
		for (int i = 0; i < txt.length(); i++) {
			if (txt.substring(i, i + 1).equals(" ")) {
				x++;
			}
		}

		words = new String[x + 1];
		wLen = 0;
		findWords(txt);

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
		
		if(kRes == "Wait ... .. ..... No, no, you might be right ... The puzzle might not be secure. It's back to passwords then.") {
			kRes = "Thank you for the feedback. You've done a great honor for the Gryffindors.";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			runStoryLine1();
		}else
		
		if(kRes == "Wait ... .. ..... No, no, you might be right ... The puzzle might not be secure. It's back to passwords then.") {
			kRes = "Thank you for the feedback. You've done a great honor for the Gryffindors.";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			runStoryLine1();
		}else if(kRes == "Thank you for the feedback. You've done a great honor for the Gryffindors.") {
			kRes ="Now, I'm not entirely sure if you're a Gryffindor. If you are, you'll get the new password from your fellow Gryffindors. Bye now!";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			runStoryLine1();
		}else if(kRes =="Now, I'm not entirely sure if you're a Gryffindor. If you are, you'll get the new password from your fellow Gryffindors. Bye now!") {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			GuiLoadingVickie.loading.setScreen(new GameMenu(getWidth(), getHeight()));
		}
		
		return "";
	}

	public void findWords(String d) {
		int f = d.indexOf(" ");
		if (f != -1) {
			words[wLen] = d.substring(0, f + 1);
			System.out.println(d.substring(0, f+1));
			wLen++;
			d=d.substring(f+1);
			findWords(d);
		}else {
			words[wLen] = d;
		}
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
	
	public Color newColorWithAlpha(Color original, int alpha) {
		// System.out.println("newColorAlpha()");
		return new Color(original.getRed(), original.getGreen(), original.getBlue(), alpha);
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		//begin =true;
		//s1 = 0;
		//begin =false;
		
		
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
		
		dialogueTxt = new TextArea(210, 590, 800, 500, "ooooooo"); //210,590,700,500
		dialogueTxt.setForeground(brownish);//Color.orange
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
		/*
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
		viewObjects.add(threeR);*/
		
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
							
							b2.setY(460);
							b2.setFont(bF);
							b2.setText("Nice to meet you. Is the password 'Flibbertigibbet' today?"); //3 lines
							runStoryLine1();
				}else if (b1.getText().equals("Where's the Fat Lady??")) {
					kRes = "After her ordeal with Sirius Black, I bravely volunteered to take her place and - voila!! Here we are.";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setY(350);
							b1.setFont(mF);
							b1.setText("Let me in. Flibbertigibbet");
							
							b2.setY(460);
							b2.setFont(bF);
							b2.setText("Nice to meet you. Is the password 'Flibbertigibbet' today?");
							runStoryLine1();
				}else if (b1.getText().equals("Let me in. Flibbertigibbet")) {
					kRes = "Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setY(330);
							b1.setFont(bF);
							b1.setText("You can't do that! I'm telling Professor McGonagall.");
							
							b2.setY(480);
							b2.setFont(mF);
							b2.setText("Why?");
					runStoryLine1();
				}else if (b1.getText().equals("You can't do that! I'm telling Professor McGonagall.")) {
					kRes = "Now, where's your courage?? If you were truly a Gryffindor, you wouldn't be running away from the challenge!";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setY(350);
							b1.setFont(mF);
							b1.setText("");//I'll just come back later
							r1.setEnabled(false);
							r1.setBackground(null);
							
							b2.setY(480);
							b2.setFont(mF);
							b2.setText("Fine, I'll do it");
					runStoryLine1();
					
				}else if (b1.getText().equals("I'm not Hermione")) {
					kRes = "Well, Obviously not. Do you want to try again?";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
						b1.setY(350);
						b1.setFont(mF);
						b1.setText("Yes");//I'll just come back later
						//r1.setEnabled(false);
						//r1.setBackground(null);
						
						b2.setY(480);
						b2.setFont(mF);
						b2.setText("Nope");
				runStoryLine1();
			}else if (b1.getText().equals("Yes")) {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
				
				}else if (b1.getText().equals("It's not really secure")) {
					kRes = "I'll take that into consideration. Wait, you are a Gryffindor right?";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
						b1.setY(350);
						b1.setFont(mF);
						b1.setText("Sure");//I'll just come back later
						//r1.setEnabled(false);
						//r1.setBackground(null);
						
						b2.setY(480);
						b2.setFont(mF);
						b2.setText("Yes");
				runStoryLine1();
			}else if (b1.getText().equals("Sure")) {
				kRes = "Wait ... .. ..... No, no, you might be right ... The puzzle might not be secure. It's back to passwords then.";
				runStoryLine1();
				/*kRes = "Wait ... .. ..... No, no, you might be right ... The puzzle might not be secure. It's back to passwords then.";
				b1.setVisible(false);
				b2.setVisible(false);
				r1.setVisible(false);
				r2.setVisible(false);
				
				runStoryLine1();
				
				end();
				*/
		}
				
			}

			
		}); // 800, 510, 295, 75
		//r1.setForeground(Color.orange);
		r1.setVisible(false);
		viewObjects.add(r1);
		
		r2 = new Button(800, 440, 320, 125, "",t , new Action() {

			@Override
			public void act() {
				
				System.out.print("click");
				if (b2.getText().equals("Where's the Fat Lady??")) {
					kRes = "After her ordeal with Sirius Black, I bravely volunteered to take her place and - voila!! Here we are.";
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
							b1.setY(350);
							b1.setFont(mF);
							b1.setText("Let me in. Flibbertigibbet");
							
							b2.setY(460);
							b2.setFont(bF);
							b2.setText("Nice to meet you. Is the password 'Flibbertigibbet' today?");
						runStoryLine1();
				}else
				
				if (b2.getText().equals("Nice to meet you. Is the password 'Flibbertigibbet' today?")) {
					kRes = "Haven't you heard? That was the old way to get in. I'm trying something new today. Instead of telling me a password, just solve this puzzle and then I'll let you in.";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
							b1.setY(330);
							b1.setFont(bF);
							b1.setText("You can't do that! I'm telling Professor McGonagall.");
							
							b2.setY(480);
							b2.setFont(mF);
							b2.setText("Why?");
						runStoryLine1();
				}else
				
				if (b2.getText().equals("Why?")) {
					kRes = "You never know where Sirius Black may be lurking and eavesdropping.";
					b1.setVisible(false);
					b2.setVisible(false);
					r1.setVisible(false);
					r2.setVisible(false);
							b1.setY(350);
							b1.setFont(mF);
							b1.setText("");//I'll just come back later
							r1.setEnabled(false);
							r1.setBackground(null);
							
							b2.setY(480);
							b2.setFont(mF);
							b2.setText("Fine, I'll do it");
						runStoryLine1();
				}else
				
				if (b2.getText().equals("Fine, I'll do it")) {
					GuiLoadingVickie.loading.setScreen(new Instruction(getWidth(), getHeight()));
				}else if(b2.getText().equals("Let me do it again")) {
					GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
				}else if(b2.getText().equals("Nope")) {
					GuiLoadingVickie.loading.setScreen(new GameMenu(getWidth(), getHeight()));
				}else
					
					if (b2.getText().equals("Just about anybody can beat it and they dont have to be a Gryffindor")) {
						kRes = "I'll take that into consideration. Wait, you are a Gryffindor right?";
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
						b1.setVisible(false);
						b2.setVisible(false);
						r1.setVisible(false);
						r2.setVisible(false);
							b1.setY(350);
							b1.setFont(mF);
							b1.setText("Sure");//I'll just come back later
							//r1.setEnabled(false);
							//r1.setBackground(null);
							
							b2.setY(480);
							b2.setFont(mF);
							b2.setText("Yes");
							runStoryLine1();
					}
				if (b2.getText().equals("Yes")) {
					kRes = "Wait ... .. ..... No, no, you might be right ... The puzzle might not be secure. It's back to passwords then.";
					runStoryLine1();
					/*
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					kRes = "Thank you for the feedback. You've done a great honor for the Gryffindors.";
					runStoryLine1();
					//Now, I'm not entirely sure if you're a Gryffindor. If you are, you'll get the new password from your fellow Gryffindors.
				
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					kRes ="Now, I'm not entirely sure if you're a Gryffindor. If you are, you'll get the new password from your fellow Gryffindors. Bye now!";
					runStoryLine1();
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					GuiLoadingVickie.loading.setScreen(new GameMenu(getWidth(), getHeight()));
					*/
				}
			}
			
		}); // 800,600,295,75
		//oneR.setCustomActiveBorderColor(Color.red);
		r2.setVisible(false);
		viewObjects.add(r2);
		
		b1 = new TextColoredLabel(800, 310, 320, 125, "Who are you??", null, Color.red);
		b1.setY(350);
		b1.setVisible(false);
		viewObjects.add(b1);
		b2 = new TextColoredLabel(800, 440, 320, 125, "Where's the Fat Lady??", null, Color.orange);
		b2.setY(480);
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
		
		try {
			File fontFile = new File("images/HARRYP.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			Font baseFont = font.deriveFont(150f);
			//Font a = font.deriveFont(55f);
			Font c = font.deriveFont(38f); // 30 /40
			mF = font.deriveFont(38f);
			bF = font.deriveFont(33f);
			smallF = font.deriveFont(25f);
		} catch (Exception e) {

			e.printStackTrace();

		}
		System.out.print("7");
		System.out.print(begin);
		//begin =true;
		
	/*	if (begin ==true) {
		
			kRes = "Hello There!";
			startSeq =true;
			if (startSeq) {
				runStoryLine1();
			}
			// runStoryLine1();
		}else {
			if(win==true) {
				
				System.out.print("in: Great job! Now I know you are really a GryffindorEh. It's not really secure. Just about anybody can beat it and they dont have to be Gryffindor..... i'll take that into consideration. Wait, you are Gryffindor right?	ys / suree/You may enter");
				//w
			}else {
				System.out.print("WIN ++FALSESESES");
				//...Are you really a gryffindor? Hermione was able to finish it in under a minute
						//I'm not Hermione
				//Obviously not. Want to try again?
						//y/n
			}
		}*/

	}

	/*
	 * P:Well, well, u did it!
	 */
	public void winner() {
		kRes = "Great job! Now I know you are really a Gryffindor!";
		
		b1.setText("It's not really secure");
		b2.setY(440);
		b2.setFont(bF);
		b2.setText("Just about anybody can beat it and they dont have to be a Gryffindor");
		
		runStoryLine1();
	}
	
	public void loser() {
		//...Are you really a gryffindor? Hermione was able to finish it in under a minute
		//I'm not Hermione
//Obviously not. Want to try again?
		//y/n
		kRes = "Are you really a Gryffindor? Hermione was able to finish it in under a minute.";
		b1.setText("I'm not Hermione");
		b2.setText("Let me do it again");

		runStoryLine1();
	}

	public void end() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	kRes = "Thank you for the feedback. You've done a great honor for the Gryffindors.";
	runStoryLine1();
	//Now, I'm not entirely sure if you're a Gryffindor. If you are, you'll get the new password from your fellow Gryffindors.

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	kRes ="Now, I'm not entirely sure if you're a Gryffindor. If you are, you'll get the new password from your fellow Gryffindors. Bye now!";
	runStoryLine1();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	GuiLoadingVickie.loading.setScreen(new GameMenu(getWidth(), getHeight()));
	}
}
