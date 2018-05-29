package hPStartGame;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPConnect4Areej.ConnectFourAreej;

public class Storyline extends FullFunctionScreen {

	private Graphic background;
	private Button load;
	private Button quit;
	
	private Graphic nick;
	private Graphic harry;
	private Graphic hermione;
	private Graphic ron;
	private TextArea charName;
	private String[] charNames = {"Harry: ", "Ron: ", "Hermione: "};
	private Graphic[] charImages = {harry, ron, hermione};
	private Graphic dialogue;
	private TextArea dial;	
	
	
	public Storyline(int width, int height) {
		super(width, height);
		load.setSize(30);
		quit.setSize(30);
		setVisible(true);
	} 

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/stair.jpg");
		viewObjects.add(background);
		
		
		load = new Button(1000,100,100,50,"Play", Color.LIGHT_GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new ConnectFourAreej(getWidth(), getHeight()));
			}
		});
		viewObjects.add(load);
				
		quit = new Button(1000,200,100,50,"Go Back",Color.LIGHT_GRAY,new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new Scene1(getWidth(), getHeight()));
			}
		}); 
		viewObjects.add(quit);
		
		charName = new TextArea(530, 545, 200, 75, "");
		viewObjects.add(charName);
		
		harry = new Graphic(50, 680, 100, 100, "images/charHarry.jpg");
		viewObjects.add(harry);
		harry.setVisible(false);

		hermione = new Graphic(50, 680, 100, 100, "images/charHerm.jpg");
		viewObjects.add(hermione);
		hermione.setVisible(false);

		ron = new Graphic(50, 680, 100, 100, "images/charRon.png");
		viewObjects.add(ron);
		ron.setVisible(false);		
		
		nick = new Graphic(50, 680, 100, 100, "images/sirnick.jpg");
		viewObjects.add(nick);
		
		dialogue = new Graphic(80,80,1200,700, "images/textbox.png");
		viewObjects.add(dialogue);
		
		dial = new TextArea(530, 650, 300, 100, "");
		viewObjects.add(dial);

		
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
			"Be back to your rooms right this moment. I don't want to see more trouble going around.", "I wonder what has him in such a bad mood.",
			"Oh come on don't be obvious, he hates us.", "Right, but I wonder why.", "Guys I think we should really head back, I don't think I can face
			him or his abnormally large nose again!", "He's right, let's get going Harry."};
			storyLine4 = n4;
			
			String[] n5 = {"Good evening Harry! Hermione, Ron, evening to you both as well.","Hello Sir Nick, how are you.","I'm great thank you for asking, 
			but I'd be even better if you and the others would join me for my 500th birthday party tonight!","500th?!","Yes, I'm still quite young you know.",
			"Will their be food?","A ton."," I'm down","It'd be our pleasure to join you Sir Nick.","Besides, anything is better than going back to the common rooms.",};
			storyLine5= n5
			
			String[] n6 = {"I take that back, I want to go to the common rooms.","Oh don't be rude Ron, we just got here, we can't leave so suddenly.",
			"Yeah but I wasn't aware that the food would practically be inedible, it's 500 years old and covered with cobwebs and dust!",
			"SHH, he's coming this way!","Harry, Ron, Hermione! Enjoying yourselves I hope.","Of course sir, but I'm sorry to request our leave, I just realized
			that we have two rolls of parchment to finish up for potions that are due tomorrow.","Alas, I understand, however, in order to leave, Harry will have to beat me in a game
			I've recently discovered. If he wins, you're all welcome to leave, if not, then you must stay till dinner for the toast.","Very well sir.","You better win this Harry or I'm holding it
			against you.","Alright, alright, I'll try my best.","Good luck Harry!"};
			storyLine6= n6; 
		 */
		
	
	}

}