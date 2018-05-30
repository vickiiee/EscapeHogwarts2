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

public class DKIntro extends FullFunctionScreen {

	private Graphic backgroundImg;
	private TextArea textBox;
	private ClickableGraphic arrow;
	private ClickableGraphic back;
	
	public DKIntro(int width, int height) {
		super(width, height);
		
		textBox.setSize(50);
		textBox.setForeground(Color.LIGHT_GRAY);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/trainStation.png");
		viewObjects.add(backgroundImg);
		
		textBox = new TextArea(225, 475, 675, 320, "As Harry boarded the Hogwart's Express for his third year in Hogwarts, he never expected to meet every otherworldly criminal's worst nightmare");
		viewObjects.add(textBox);
		
		arrow = new ClickableGraphic(1000, 650, "kimg/arrow.png");
		arrow.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTrain(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(arrow);
		
		back = new ClickableGraphic(25,25,200,100, "kimg/arrowBack.png");
		back.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTitle(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(back);
	}

}
