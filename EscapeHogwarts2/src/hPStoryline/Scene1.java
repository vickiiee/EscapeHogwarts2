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

public class Scene1 extends FullFunctionScreen{

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
	private String[] storyLine1 = {"Ron..!! Hermione..!", 
			"Wake up, we ought to go out now!", "We don't got much time now, we must leave before anyone sees us!","...",
			""};

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(true);
		((TextLabel) charName).setSize(40);
		dialogueTxt.setSize(35);
		storyLine1();
		magicSquares.setForeground(Color.LIGHT_GRAY);
	}

	public String displayDialogue(String text) {
		for(int i = 0; i < text.length(); i++) {
			append(dialogueTxt, text.charAt(i));
		}
		return "";
	}
	
	public void append(TextArea word, char letter) {
		 word.setText(word.getText() + letter);		
		 //Timer();
	}
	
	public void Timer() {
		Timer timer = new Timer();
		TimerTask task;
		task = new TimerTask() {
			@Override
			public void run() { 
				int seconds = 3;
				if (seconds > 0) {
					seconds--;
				} else {
					cancel();
				}
			}
		};
		timer.schedule(task, 0, 1000);
	}
	
	public void switchCharName() {
		
	}
	
	public void switchCharImage() {
		
	}
	
	public void switchBkgrnd() {
		
	}
	
	public void storyLine1() {
		dialogueTxt.setText("Ron..!! Hermione..!");
		Timer();
		dialogueTxt.setText("Wake up, we ought to go out now!");
		Timer();
		dialogueTxt.setText("We don't got much time now, we must leave before anyone sees us!");
		Timer();
		dialogueTxt.setText("...");
		Timer();
		
		charHarry.setVisible(false);
		charRon.setVisible(true);
		((TextLabel) charName).setText("Ron: ");
		dialogueTxt.setText("Harry, are you sure about this?"); //ron
		Timer();
		
		charRon.setVisible(false);
		charHerm.setVisible(true);
		((TextLabel) charName).setText("Hermione: ");
		dialogueTxt.setText("What if we get caught?"); //hermione
		Timer();
		
		charHerm.setVisible(false);
		charHarry.setVisible(true);
		((TextLabel) charName).setText("Harry: ");
		dialogueTxt.setText("This might be our only chance to go to Hogsmeade!"); //harry
		//harry explains why they are going there
	}
	
	public void storyLine2() {
		background.setVisible(false);
		background1.setVisible(true);
		
		dialogueTxt.setText("...");
		Timer();
		dialogueTxt.setText("If we go past this hallway, we might just make it past the others.");
		Timer();
		dialogueTxt.setText("Everyone rarely comes here so-");
		Timer();
		dialogueTxt.setText("Oh!");
		Timer();
		
		dialogueTxt.setText("Now now, what do we have here?"); //professor
		Timer();
		
		dialogueTxt.setText("Oh hey! W-We were just taking a walk. You know, fresh air."); //harry
		Timer();
		
		//minigame
		
		//when harry wins mini game
		dialogueTxt.setText("Well off I go, I have matters to attend to."); //professor
		
		//when harry loses mini game
		dialogueTxt.setText("Be back to your rooms right this moment. I don't want to see more trouble going around."); //professor
	}
	
	public void storyLine2_1(){
		//when harry wins minigame 1
		
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {

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


	}

}
