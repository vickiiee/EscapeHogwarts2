package hPStoryline;

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
	private Graphic nick;
	private Button load;
	private Button quit;
	
	public Storyline(int width, int height) {
		super(width, height);
		load.setSize(30);
		quit.setSize(30);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/stairs.jpg");
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
		
		nick = new Graphic(40, 700, 100, 100, "images/sirnick.jpg");
		viewObjects.add(nick);
		
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
		
	
	}

}