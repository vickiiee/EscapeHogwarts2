package hpKevStoryLine;


import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPStoryline.GuiLoadingVickie;

public class DKTrain extends FullFunctionScreen {

	private Graphic backgroundImg;
	private TextArea textBox;
	private ClickableGraphic arrow;
	private ClickableGraphic back;
	
	public DKTrain(int width, int height) {
		super(width, height);
		
		textBox.setSize(100);
		textBox.setForeground(Color.GRAY);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/dementorHand.jpg");
		viewObjects.add(backgroundImg);
		
		
		textBox = new TextArea(175, 150, 400, 300, "A Dementor");
		viewObjects.add(textBox);
		
		arrow = new ClickableGraphic(1000, 650, "kimg/arrowWhite.png");
		arrow.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKDementor(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(arrow);
		
		back = new ClickableGraphic(25,25,200,100, "kimg/arrowWhiteBack.png");
		back.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKIntro(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(back);
	}

}
