package hPStoryline;

import java.awt.Color;
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
import hPConnect4Areej.ConnectFourAreej;
import hPMagicSquaresVickieJi.VickieHPFrontEnd;

public class Scene1 extends FullFunctionScreen {

	private int seconds;
	private int s1;
	private int s2;
	private boolean endS1;
	private boolean endS2;

	private Button connectLine;
	
	private Graphic background;
	private Button magicSquares;
	private Button connectFour;
	private Graphic dialogue;
	private Graphic charHarry;
	private Visible charName;
	private TextArea dialogueTxt;
	private Graphic charHerm;
	private Graphic charRon;
	private Graphic background1;
	private Graphic background2;

	private String[] storyLine1;
	private String[] storyLine2;
	private boolean startSeq;

	private String[] charNames = {"Harry: ", "Hermione: ", "Ron: "};
	private Graphic[] charImages = {charHarry, charHerm, charRon};
	private Graphic[] bkgrnds = {background1, background2};
	private Visible continueBtn;

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(false);
		setVisible(true);
		((TextLabel) charName).setSize(40);
		dialogueTxt.setSize(35);

		magicSquares.setForeground(Color.LIGHT_GRAY);
	}

	/*
	public String displayDialogue(String text) {
		for (int i = 0; i < text.length(); i++) {
			append(dialogueTxt, text.charAt(i));
		}
		return "";
	}

	public void append(TextArea word, char letter) {
		word.setText(word.getText() + letter);
	}
	*/

	public void runStoryLine1() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				if (endS1) {
					cancel();
				} else if (seconds > 0) {
					seconds--;
					System.out.println("Seconds:" + seconds); // testing

				} else if (seconds == 0) {
					s1++;

					if (s1 > -1 && s1 < storyLine1.length) {
						String n = storyLine1[s1];
						if(s1 != 4 && s1!=5) {
							switchCharName("Harry: ");
							switchCharImage(charHarry);
						}else {
							if(s1 == 4) {
								switchCharName("Ron: ");
								switchCharImage(charRon);
							} else {
								if(s1 == 5) {
									switchCharName("Hermione: ");
									switchCharImage(charHerm);
								}
							}
						}
						dialogueTxt.setText(n);
						System.out.println(n);
						seconds = 1;
					} else {
						endS1 = true;
						continueBtn.setVisible(true);
					}

				}

			}

		};
		timer.schedule(task, 0, 1000);
	}

	public void runStoryLine2() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				if (endS2) {
					cancel();
				} else if (seconds > 0) {
					seconds--;
					System.out.println("Seconds:" + seconds); // testing

				} else if (seconds == 0) {
					s2++;

					if (s2 > -1 && s2 < storyLine2.length) {
						if(s2 == 0 || s2 == 2 || s2 == 6) {
							switchCharName("Ron: ");
							switchCharImage(charRon);
						}else {
							if(s2 != 5) {
								switchCharName("Hermione: ");
								switchCharImage(charHerm);
							}else {
								switchCharName("Harry: ");
								switchCharImage(charHarry);
							}
						}
						String n2 = storyLine2[s2];
						dialogueTxt.setText(n2);
						System.out.println(n2);
						seconds = 1;
					} else {
						endS2 = true;
					}

				}

			}
		};
		timer.schedule(task, 0, 1000);
	}

	public void switchCharName(String cName) {
		for(int i = 0; i < charNames.length; i++) {
			if(charNames[i] == cName) {
				((TextLabel) charName).setText(cName);
			}
		}
	}

	public void switchCharImage(Graphic charImage) {
		for(int i = 0; i < charImages.length; i++) {
			if(charImages[i] == charImage) {
				for(int j = 0; j < charImages.length; j++) {
					if(charImages[j] != charImage) {
						charImages[j].setVisible(false);
					}
				}
				charImage.setVisible(true);
			}
		}
	}

	public void switchBkgrnd(Graphic bkgrnd) {
		for(int i = 0; i < bkgrnds.length; i++) {
			if(bkgrnds[i] == bkgrnd) {
				for(int j = 0; j < bkgrnds.length; j++) {
					if(bkgrnds[j] != bkgrnd) {
						bkgrnds[j].setVisible(false);
					}
				}
				bkgrnd.setVisible(true);
			}
		}
	}

	private void continueScenes() {
		if(endS1 && !endS2) {
			runStoryLine2();
			switchBkgrnd(background2);
			continueBtn.setVisible(false);
		}else {
			//GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
		}
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		startSeq = true;
		s1 = -1;
		endS1 = false;
		endS2 = false;
		
		String[] n = { "Ron..!! Hermione..!", "Wake up, we ought to go out now!",
				"We don't got much time now, we must leave before anyone sees us!", "...",
				"Harry, are you still sure about this?", "What if you get caught?",
				"This might be our only chance to go to Hogsmeade together! Besides, once I get my invisibility cloak "
						+ "I'll be fine.",
						"Can you imagine all the things we'll do there?!",
		"We especially have to go to Honeydukes, the sweets are in high demand!" };
		storyLine1 = n;

		String[] n2 = {"We need to make it to the station by the afternoon.", "At this time ... it looks like we have a few"
				+ " hours at most.", "Make sure you both got all your thi-"
				,"Harry!!! We forgot our tickets for the train back in Dumbledore's headquarters.", "My goodness, if it wasn't for you, Ron, I would"
						+ " have not known at all.", "I know where it is but we have to enter the correct passcode since"
								+ " they changed it this term.", "We better be quick before anyone suspects you're going."};
		storyLine2 = n2;
		/*
				"It is oddly quiet at this hour.", "Everyone must happen to be asleep.", "Harry, which way do we go now?",
				"You see that room upstairs?", "We just need to enter the right pattern to enter."};
		 */
		
		/*
		String[] n3 = {"Oh no, the power's on!", "If we enter the next door we might trigger the alarm.",
				"Let's make sure no one knows we're here."};
		storyLine3 = n3;

		String[] n4 = {"...", "If we go past this hallway, we might just make it to the hidden closet where my cloak is.",
				"Everyone rarely comes here so-", "Har-", "Now now, what are you doing at this hour?",
				"Hey! W-We were just taking a walk.", "Harry wasn't feeling well so we thought we'd accompany him.",
				"Well off you go, I have matters to attend to.",
				"Be back to your rooms right this moment. I don't want to see more trouble going around."};
		storyLine4 = n4;
		 */
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);

		background1 = new Graphic(0, 0, getWidth(), getHeight(), "images/hallway.jpg");
		viewObjects.add(background1);
		background1.setVisible(false);

		background2 = new Graphic(0, 0, getWidth(), getHeight(), "images/castle2.png");
		viewObjects.add(background2);
		background2.setVisible(false);

		magicSquares = new Button(100, 150, 300, 75, "Magic Squares", new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
			}
		});
		viewObjects.add(magicSquares);

		connectFour = new Button(100, 250, 200, 75, "Connect Four", new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new ConnectFourAreej(getWidth(), getHeight()));
			}
		});
		viewObjects.add(connectFour);
		
		connectLine = new Button(100, 450, 200, 75, "C4 Storyline", new Action() {

			@Override
			public void act() {
				//GuiLoadingVickie.loading.setScreen(new Storyline(getWidth(), getHeight()));
			}
		});
		viewObjects.add(connectLine);

		dialogue = new Graphic(400, 500, 400, 300, "images/diaglogue.png");
		viewObjects.add(dialogue);

		charName = new TextArea(530, 545, 200, 75, "");
		viewObjects.add(charName);

		charHarry = new Graphic(450, 545, 100, 100, "images/charHarry.jpg");
		viewObjects.add(charHarry);
		charHarry.setVisible(false);

		charHerm = new Graphic(450, 545, 100, 100, "images/charHerm.jpg");
		viewObjects.add(charHerm);
		charHerm.setVisible(false);

		charRon = new Graphic(450, 545, 100, 100, "images/charRon.png");
		viewObjects.add(charRon);
		charRon.setVisible(false);

		dialogueTxt = new TextArea(530, 650, 300, 100, "");
		viewObjects.add(dialogueTxt);

		continueBtn = new Button(740, 600, 300, 100, "Continue", new Action() {

			@Override
			public void act() {
				continueScenes();
			}

		});
		viewObjects.add(continueBtn);
		continueBtn.setVisible(false);

		if (startSeq) {
			runStoryLine1();
		}
	}

}
