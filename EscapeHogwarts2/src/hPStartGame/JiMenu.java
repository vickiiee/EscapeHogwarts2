package hPStartGame;

import java.awt.Color;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextLabel;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPCatchingGameJi.Scene1;
import hPMagicSquaresVickieJi.SirCadoganTheMadKnight;

public class JiMenu extends FullFunctionScreen {

	private Graphic logo;
	private Button play;
	private Graphic harrylogo;
	private Graphic hogwarts;
	private Graphic background;
	private TextArea description;
	private Graphic birdies;
	private String[] words;
	private int wLen;
	private Timer timer;
	private TimerTask task;

	private String phrase;
	private Timer pTim;
	private TimerTask pTask;

	public JiMenu(int width, int height) {
		super(width, height);
		description.setSize(50);
		play.setSize(80);
		description.setForeground(Color.LIGHT_GRAY);
		play.setForeground(Color.LIGHT_GRAY);
		setVisible(true);

		action();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/night.png");
		viewObjects.add(background);

		birdies = new Graphic(700, 350, 500, 500, "images/birdies.jpg");
		viewObjects.add(birdies);

		harrylogo = new Graphic(380, 170, 500, 500, "images/harrypotter2.png");
		harrylogo.setAlpha(0);
		viewObjects.add(harrylogo);

		hogwarts = new Graphic(100, 520, 500, 500, "images/hogwarts.png");

		viewObjects.add(hogwarts);

		description = new TextArea(650, 330, 700, 400, ""); 
		viewObjects.add(description);

		phrase = "and The Adventures at Hogwarts";

		play = new Button(550, 450, 100, 100, "Play", new Action() {

			@Override
			public void act() {
				timer.cancel();
				pTim.cancel();
				GuiLoadingVickie.loading.setScreen(new GameMapDirectory(getWidth(), getHeight()));
			}
		});
		play.setAlpha(0);
		viewObjects.add(play);
	}

	public void action() {
		Timer r = new Timer();
		TimerTask x = new TimerTask() {

			float num = 0.0f;// FADE OUT

			public void run() {
				System.out.print("1:" + num + "\n");

				if (num >= 0.9f) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					runStoryLine1();
					r.cancel();
				} else {
					System.out.print("2:" + num + "\n");
					num = (float) (num + .10f);// FADE OUT
					harrylogo.setAlpha(num); // FADE OUT
				}

			}

		};

		r.schedule(x, 0, 100);

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

		description.setText("");
		for (int i = 0; i < words.length; i++) {
			append(description, words[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("pladfasf");
		playAction();
		return "";
	}

	public void findWords(String d) {
		int f = d.indexOf(" ");
		if (f != -1) {
			words[wLen] = d.substring(0, f + 1);
			System.out.println(d.substring(0, f + 1));
			wLen++;
			d = d.substring(f + 1);
			findWords(d);
		} else {
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
				displayPhrase(phrase);
				timer.cancel();

			}

		};
		timer.schedule(task, 0, 2000);

	}

	public void playAction() {
		pTim = new Timer();
		pTask = new TimerTask() {

			float num = 0.0f;// FADE OUT

			public void run() {
				System.out.print("kfhjfgjhg");

				if (num >= 0.9f) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					pTim.cancel();
				} else {
					System.out.print("2:" + num + "\n");
					num = (float) (num + .10f);// FADE OUT
					play.setAlpha(num); // FADE OUT
				}

			}
		};
		pTim.schedule(pTask, 0, 100);
	}
}
