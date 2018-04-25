package hPStoryline;

import java.awt.Color;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephStory2 extends FullFunctionScreen {

	private Graphic background;
	private Graphic chatbox;
	private Graphic bg1;
	private Graphic bg2;
	private Graphic bg3;
	private Graphic bg4;
	private Graphic hermione;
	private Graphic ron;
	private Graphic harry;
	
	private boolean endS1;
	private boolean endS2;
	private boolean startSeq;
	
	private TextArea name;
	private TextArea dialogue;
	
	private ClickableGraphic nextB; 
	
	private Button choice1; 
	private Button choice2;
	
	private Visible continueBtn;
	
	private int clicks;
	private int seconds;
	private int s1;
	private int s2;
	
	private String[] storyLine1;
	private String[] storyLine2;
	private String[] matchName = {"Hermione", "Ron", "Harry", "Mcgonagall"};
	
	private Graphic[] imagesList = {hermione, ron, harry};
	private Graphic[] bg = {bg1, bg2, bg3, bg4};
	
	public StephStory2(int width, int height) {
		super(width, height);
		clicks = 0;
		name.setSize(40);
		dialogue.setSize(35);
		dialogue.setForeground(Color.WHITE);
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		startSeq = true;
		s1 = -1;
		endS1 = false;
		endS2 = false;
		
		String[] n = {"Where are you going Harry? Class is the other way.","Lets just leave him, "
				+ "Mcgonagall will kill us if we're late.","...","Potter! Weasley! Granger!"
						+ " Why are you late to my class again?!",
						"We got lost.", "Moving on, today's lesson will be about potions, "
						+ "gather your things and follow me.", 
						"Choose a partner and we'll begin."};
		storyLine1 = n;
		
		background = new Graphic(0, 0, getWidth(), getHeight(), "simg/background.jpg");
		viewObjects.add(background);
		
		bg1 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg1.jpg");
		viewObjects.add(bg1);
		bg1.setVisible(false);
		
		bg2 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg2.jpg");
		viewObjects.add(bg2);
		bg2.setVisible(false);
		
		bg3 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg3.jpg");
		viewObjects.add(bg3);
		bg3.setVisible(false);
		
		bg4 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg4.jpg");
		viewObjects.add(bg4);
		bg4.setVisible(false);
		
		chatbox = new Graphic(80,80,1200,700, "simg/textbox.png");
		viewObjects.add(chatbox);
		
		/* nextB = new ClickableGraphic(1100, 700, 50, 50, "simg/symbol.png");
		nextB.setAction(new Action() {
			
			@Override
			public void act() {
				clicks++;
				storyline();
			}
		});
		viewObjects.add(nextB);
		*/
		
		hermione = new Graphic(700,260,400,400,"simg/emma.png");
		viewObjects.add(hermione);
		hermione.setVisible(false);
		
		ron = new Graphic(700,260,400,400,"simg/ron.png");
		viewObjects.add(ron);
		ron.setVisible(false);
		
		harry = new Graphic(700,260,400,400,"simg/harry.png");
		viewObjects.add(harry);
		harry.setVisible(false);
		
		name = new TextArea(220,530,200,200,"");
		viewObjects.add(name);
		
		dialogue = new TextArea(180,590,1000,500,"");
		viewObjects.add(dialogue);
		
		choice1 = new Button(200, 600, 100, 50, "", Color.darkGray, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		choice2 = new Button(800, 600, 100, 50, "", Color.darkGray, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
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
	
	public String displayPhrase(String txt) {
		dialogue.setText("");
		for(int i = 0; i < txt.length(); i++) {
			append(dialogue, txt.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";//
	}
	

	public void append(TextArea word, char letter) {
		word.setText(word.getText() + letter);
	}
	
	public void switchBkgrnd(Graphic bgs) {
		for(int i = 0; i < bg.length; i++) {
			if(bg[i] == bgs) {
				for(int j = 0; j < bg.length; j++) {
					if(bg[j] != bgs) {
						bg[j].setVisible(false);
					}
				}
				bgs.setVisible(true);
			}
		}
	}
	
	public void switchCharName(String cName) {
		for(int i = 0; i < matchName.length; i++) {
			if(matchName[i] == cName) {
				name.setText(cName);
			}
		}
	}

	public void switchCharImage(Graphic charImage) {
		for(int i = 0; i < imagesList.length; i++) {
			if(imagesList[i] == charImage) {
				for(int j = 0; j < imagesList.length; j++) {
					if(imagesList[j] != charImage) {
						imagesList[j].setVisible(false);
					}
				}
				charImage.setVisible(true);
			}
		}
	}
			
	private void continueScenes() {
		if(endS1 && !endS2) {
			//runStoryLine2();
			//switchBkgrnd(background2);
		}else {
			//GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
		}
		continueBtn.setVisible(false);
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
					//System.out.println("Seconds:" + seconds); // testing

				} else if (seconds == 0) {
					s1++;

					if (s1 > -1 && s1 < storyLine1.length) {
						String n = storyLine1[s1];
						if(s1 != 4 && s1!=5) {
							switchCharName("Harry: ");
							switchCharImage(harry);
						}else {
							if(s1 == 4) {
								switchCharName("Ron: ");
								switchCharImage(ron);
							} else {
								if(s1 == 5) {
									switchCharName("Hermione: ");
									switchCharImage(hermione);
								}
							}
						}
						displayPhrase(storyLine1[s1]);
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
	
}

