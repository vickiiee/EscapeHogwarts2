package hpKevStoryLine;


import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPStartGame.GuiLoadingVickie;

public class DKTemplate extends FullFunctionScreen {

	private Graphic backImg;
	private Graphic textBox;
	private TextArea name;
	private TextArea dialog;
	private ClickableGraphic nextButton;
	private ClickableGraphic preButton;
	private String[] nameList;
	private String[] dialogList;
	
	public DKTemplate(int width, int height) {
		super(width, height);
		
		name.setSize(40);
		dialog.setSize(35);
		dialog.setForeground(Color.WHITE);
	}
	
	public void initAllObjects(List<Visible> viewObjects) {
		
		backImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/carriage.jpg");
		viewObjects.add(backImg);
		
		name = new TextArea(220,530,200,200,"");
		viewObjects.add(name);
		
		dialog = new TextArea(180,590,1000,500,"");
		viewObjects.add(dialog);
		
		textBox = new Graphic(80,80,1200,700, "simg/textbox.png");
		viewObjects.add(textBox);
		
		nextButton = new ClickableGraphic(1000, 25, "kimg/arrowWhite.png");
		/*
		nextButton.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKInstructions(getWidth(), getHeight()));
				
			}
		});
		*/
		viewObjects.add(nextButton);
		
		preButton = new ClickableGraphic(25,25,200,100, "kimg/arrowWhiteBack.png");
		/*
		preButton.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKDementor(getWidth(), getHeight()));
				
			}
		});
		*/
		viewObjects.add(preButton);
	}

}
