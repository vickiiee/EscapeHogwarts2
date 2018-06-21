package hPCatchingGameJi;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPStartGame.GuiLoadingVickie;

public class CatchingStoryJi extends FullFunctionScreen{

	private int seconds;
	private int s1;

	private String[] storyLine;
	private Graphic charHarry;
	private Graphic background;
	private TextArea dialogueTxt;
	private TextArea charName;

	public CatchingStoryJi(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void append(TextArea word, char letter) {
		word.setText(word.getText() + letter);
	}

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

	public void runStoryLine() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {


			@Override
			public void run() {
				if (seconds > 0) {
					seconds--;
				} else if (seconds == 0) {
					s1++;

					if (s1 > -1 && s1 < storyLine.length) {
						String n = storyLine[s1];
						if(s1 == 1|| s1==4) {
							charName.setText("Harry");
							charHarry.setVisible(true);
						}else {
							charName.setText("???");
							charHarry.setVisible(false);
						}
						displayPhrase(storyLine[s1]);
						seconds = 1;
					} else {
						GuiLoadingVickie.loading.setScreen(new CatchingGameJi(getWidth(), getHeight()));
					}

				}

			}

		};
		timer.schedule(task, 0, 1000);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0,getWidth(), getHeight(), "images/background4.jpg");
		viewObjects.add(background);

		String[] n = {"And what may you seek..?","I seek the potion of strength.","To receive the potion of strength..", "You must fight off the evil spirits.",
				"...", "Then I shall grant you the item you wish.", "Go forth!"};
		storyLine = n;
		s1= -1;

		dialogueTxt = new TextArea(210, 590, 700, 500, "");
		viewObjects.add(dialogueTxt);

		charName = new TextArea(230, 520, 200, 75, "");
		viewObjects.add(charName);

		charHarry = new Graphic(700,260,400,400, "images/charHarry1.png");
		viewObjects.add(charHarry);
		charHarry.setVisible(false);

	}
}