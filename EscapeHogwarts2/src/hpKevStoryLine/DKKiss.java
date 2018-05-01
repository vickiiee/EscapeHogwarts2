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

public class DKKiss extends FullFunctionScreen {

	private Graphic backgroundImg;
	private TextArea textBox;
	private ClickableGraphic arrow;
	private ClickableGraphic back;
	
	public DKKiss(int width, int height) {
		super(width, height);
		textBox.setForeground(Color.LIGHT_GRAY);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/harryKiss.png");
		viewObjects.add(backgroundImg);
		
		textBox = new TextArea(900,100,250,500, "The Dementor is trying to kiss Harry. Save him!");
		viewObjects.add(textBox);
		
		arrow = new ClickableGraphic(1000, 650, "kimg/arrowWhite.png");
		arrow.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKInstructions(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(arrow);
		
		back = new ClickableGraphic(25,25,200,100, "kimg/arrowWhiteBack.png");
		back.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKDementor(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(back);
	}

}
