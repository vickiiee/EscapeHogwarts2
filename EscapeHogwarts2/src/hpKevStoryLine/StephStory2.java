package hpKevStoryLine;


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
	private Graphic hermione;
	private Graphic ron;
	private Graphic harry;
	private Graphic bg1;
	private Graphic bg2;
	private Graphic bg3;
	private Graphic bg4;
	private Graphic bg5;
	private Graphic bg10;
	private Graphic bg11;
	private Graphic bg14;
	private Graphic bg15;
	
	private boolean endS1;
	private boolean endS2;
	private boolean startSeq;
	
	private TextArea name;
	private TextArea dialogue;
	
	private Button choice1; 
	private Button choice2;
	
	private Visible continueBtn;
	
	private int seconds;
	private int count1;
	private int count2;
	private int s1;
	private int s2;
	
	private String[] storyLine1;
	private String[] storyLine2;
	private String[] matchName = {"Hermione", "Ron", "Harry", "McGonagall", "Snape"};
	
	private Graphic[] imagesList = {hermione, ron, harry};
	private Graphic[] bg = {bg1, bg2, bg3, bg4, bg5, bg10, bg11, bg14, bg15};
	
	public StephStory2(int width, int height) {
		super(width, height);
		name.setSize(40);
		dialogue.setSize(35);
		dialogue.setForeground(Color.WHITE);
		choice1.setSize(30);
		choice2.setSize(30);
		choice1.setForeground(Color.WHITE);
		choice2.setForeground(Color.WHITE);
	}
	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		startSeq = true;
		endS1 = false;
		endS2 = false;
		s1 = -1;
		count1 = 0;
		count2 = 0;
		
		String[] n = {"Where are you going Harry? Class is the other way.","Lets just leave him, "
				+ "McGonagall will kill us if we're late.","","Potter! Weasley! Granger!"
						+ " What are you doing in my class??",
						"Shoot! We're supposed to be in Professor Snape's class!", "You are here to learn the"
								+ " subtle science and exact art of potion-making.", 
						"Sorry we're late!!", "If you weren't a bunch of dunderheads, maybe you'd be early and I wouldn't have to teach."
						, "Now get to work!!"};
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
		
		bg5 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg5.jpg");
		viewObjects.add(bg5);
		bg5.setVisible(false);
		
		bg10 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg10.jpg");
		viewObjects.add(bg10);
		bg10.setVisible(false);
		
		bg11 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg11.jpg");
		viewObjects.add(bg11);
		bg11.setVisible(false);
		
		bg14 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg14.jpg");
		viewObjects.add(bg14);
		bg14.setVisible(false);
		
		bg15 = new Graphic(0, 0, getWidth(), getHeight(), "simg/bg15.png");
		viewObjects.add(bg15);
		bg15.setVisible(false);
		
		chatbox = new Graphic(80,80,1200,700, "simg/textbox.png");
		viewObjects.add(chatbox);
		
		hermione = new Graphic(700,260,400,400,"simg/emma.png");
		viewObjects.add(hermione);
		hermione.setVisible(false);
		
		ron = new Graphic(700,260,400,400,"simg/ron.png");
		viewObjects.add(ron);
		ron.setVisible(false);
		
		harry = new Graphic(700,260,400,400,"simg/harry.jpg");
		viewObjects.add(harry);
		harry.setVisible(false);
		
		name = new TextArea(220,530,200,200,"");
		viewObjects.add(name);
		
		dialogue = new TextArea(180,590,1000,500,"");
		viewObjects.add(dialogue);
		
		choice1 = new Button(200, 700, 100, 50, "", Color.darkGray, new Action() {
			
			@Override
			public void act() {
				dialogue.setText(choice1.getText());
				dialogue.update();
			}
		});
		viewObjects.add(choice1);
		choice1.setVisible(false);
		
		choice2 = new Button(800, 700, 100, 50, "", Color.darkGray, new Action() {
			
			@Override
			public void act() {
				dialogue.setText(choice2.getText());
				dialogue.update();
			}
		});
		viewObjects.add(choice2);
		choice2.setVisible(false);
		
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
	
	public boolean isHarry() {
		if (name.getText().equals("Harry")){
			return true;
		}
		return false;
	}
	
	public void userChoice(String c1, String c2) {
		if(isHarry()) {
			choice1.setText(c1);
			choice2.setText(c2);
			choice1.setVisible(true);
			choice2.setVisible(true);
		}else {
			choice1.setVisible(false);
			choice2.setVisible(false);
		}
	}
	 
	//two different story line paths, (some algorithm) will decide which storyline to show next.
	public void trackStory() {
		
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
		name.update();
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
				} else if (seconds == 0) {
					s1++;

					if (s1 > -1 && s1 < storyLine1.length) {
						String n = storyLine1[s1];
						if(s1 == 2) {
							switchCharName("Harry");
							switchCharImage(harry);
							timer.purge();
							//pause timer until user has chosen an option then resume
							userChoice("hey!", "...");
							
						}else {
							if(s1 == 1) {
								switchCharName("Ron");
								switchCharImage(ron);
							} else {
								if(s1 == 0) {
									switchCharName("Hermione");
									switchCharImage(hermione);
								} else {
									if(s1 == 3) {
										switchCharName("McGonagall");
										switchBkgrnd(bg4);
									} else {
										if(s1 == 4 || s1 == 6) {
											switchCharName("Hermione");
											switchBkgrnd(bg15);
										} else {
											if(s1 == 5 || s1 == 7 || s1 == 9) {
												switchCharName("Snape");
												switchBkgrnd(bg14);
											}
										}
									}
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

