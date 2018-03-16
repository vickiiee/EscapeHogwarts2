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
	private boolean endS1;

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

	private String[] storyLine2 = { "...",
			"If we go past this hallway, we might just make it to the hidden " + "closet where my cloak is.",
			"Everyone rarely comes here so-", "Har-", "Now now, what are you doing at this hour?",
			"Hey! W-We were just taking a walk.", "Harry wasn't feeling well so we thought we'd accompany him.",
			"Well off you go, I have matters to attend to.",
			"Be back to your rooms right this moment. I don't want to see more trouble going around." };

	private String[] storyLine3 = { "Phew, that was close.", "Harry, which way do we go now?",
			"You see that room upstairs?", "We just need to enter the right pattern to enter." };

	private String[] storyLine4 = {};
	private int startSeq;

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(false);
		setVisible(true);
		((TextLabel) charName).setSize(40);
		dialogueTxt.setSize(35);

		magicSquares.setForeground(Color.LIGHT_GRAY);
	}

	public String displayDialogue(String text) {
		for (int i = 0; i < text.length(); i++) {
			append(dialogueTxt, text.charAt(i));
		}
		return "";
	}

	public void append(TextArea word, char letter) {
		word.setText(word.getText() + letter);
		// Timer();
	}

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

					if (s1 > -1 && s1 < 9) {
						String n = storyLine1[s1];
						dialogueTxt.setText(n);
						System.out.println(n);
						seconds = 3;
					} else {
						endS1 = true;
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
				// TODO Auto-generated method stub
				
			}
		};
	}

	public void switchCharName() {

	}

	public void switchCharImage() {

	}

	public void switchBkgrnd() {

	}

	public void storyLine1() {
		dialogueTxt.setText("Ron..!! Hermione..! It's Hogsmeade Day!");
		runStoryLine1();

		dialogueTxt.setText("Wake up, we ought to go out now!");
		// Timer();

		dialogueTxt.setText("We don't got much time now, we must leave before anyone sees us!");
		// Timer();

		dialogueTxt.setText("...");
		// Timer();

		dialogueTxt.setText("Harry, are you sure about this?"); // ron
		// Timer();

		dialogueTxt.setText("What if you get caught?"); // hermione
		// Timer();

		dialogueTxt.setText("This might be our only chance to go to Hogsmeade together! "
				+ " Besides, once I get my invisibility cloak I'll be fine."); // harry
		// Timer();

		dialogueTxt.setText("Can you imagine all the things we'll do there?!");
		// Timer();

		dialogueTxt.setText("We especially have to go to Honeydukes, the sweets are in high " + "demand!"); // harry
	}

	public void storyLine2() {
		background.setVisible(false);
		background1.setVisible(true);

		dialogueTxt.setText("...");
		// Timer();
		dialogueTxt.setText(
				"If we go past this hallway, we might just make it to" + " the hidden closet where my cloak is.");
		// Timer();
		dialogueTxt.setText("Everyone rarely comes here so-");
		// Timer();
		dialogueTxt.setText("Har-"); // ron
		// Timer();

		dialogueTxt.setText("Now now, what are you doing at this hour?"); // professor
		// Timer();

		dialogueTxt.setText("Hey! W-We were just taking a walk."); // harry
		// Timer();

		dialogueTxt.setText("Harry wasn't feeling well so we " + "thought we'd accompany him."); // herm

		// minigame to persuade professor

		// when harry wins mini game
		dialogueTxt.setText("Well off you go, I have matters to attend to."); // professor

		// when harry loses mini game
		dialogueTxt.setText(
				"Be back to your rooms right this moment. I don't want to " + "see more trouble going around."); // professor
	}

	public void storyLine3() {
		// when harry wins minigame 1
		// "Phew, that was close." //ron

		// "Harry, which way do we go now?" //herm

		// "You see that room upstairs?" //harry

		// "We just need to enter the right pattern to enter." //harry

		// minigame 2
	}

	public void storyLine4() {
		// harry gets cloak
		// harry gets out of hogwarts without being detected
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		seconds = 3;
		startSeq = 100;
		s1 = -1;

		endS1 = false;

		String[] n = { "Ron..!! Hermione..!", "Wake up, we ought to go out now!",
				"We don't got much time now, we must leave before anyone sees us!", "...",
				"Harry, are you sure about this?", "What if you get caught?",
				"This might be our only chance to go to Hogsmeade together! Besides, once I get my invisibility cloak "
						+ "I'll be fine.",
				"Can you imagine all the things we'll do there?!",
				"We especially have to go to Honeydukes, the sweets are in high demand!" };
		storyLine1 = n;

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

		dialogue = new Graphic(400, 500, 400, 300, "images/diaglogue.png");
		viewObjects.add(dialogue);

		charName = new TextArea(530, 545, 200, 75, "Harry:");
		viewObjects.add(charName);

		charHarry = new Graphic(450, 545, 100, 100, "images/charHarry.jpg");
		viewObjects.add(charHarry);

		charHerm = new Graphic(450, 545, 100, 100, "images/charHerm.jpg");
		viewObjects.add(charHerm);
		charHerm.setVisible(false);

		charRon = new Graphic(450, 545, 100, 100, "images/charRon.png");
		viewObjects.add(charRon);
		charRon.setVisible(false);

		dialogueTxt = new TextArea(530, 650, 300, 100, "");
		viewObjects.add(dialogueTxt);

		
		
		if (startSeq == 100) {
			storyLine1();
		}
	}

}
