package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKInstructions extends FullFunctionScreen {

	private Graphic backgroundImg;
	private TextArea textBox;
	private ClickableGraphic arrow;
	private TextArea title;
	private TextArea summary;
	private ClickableGraphic back;
	
	public DKInstructions(int width, int height) {
		super(width, height);
		title.setForeground(Color.WHITE);
		summary.setForeground(Color.WHITE);
		summary.setSize(50);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		//memoryPuzzle
	
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/train.png");
		viewObjects.add(backgroundImg);
		
		title = new TextArea(350,70,425,100,"How To Save Harry");
		viewObjects.add(title);
		
		summary = new TextArea(200,350,810,750, "In your blight, you have forgotten which spell repels dementors! Your memories of it have taken the form of several blank cards. Quickly match two identical memories together to reveal bits of the spell and cast it.");
		viewObjects.add(summary);
		
		arrow = new ClickableGraphic(1000, 650, "kimg/arrowWhite.png");
		arrow.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKKissGame(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(arrow);
		
		back = new ClickableGraphic(25,25,200,100, "kimg/arrowWhiteBack.png");
		back.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKKiss(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(back);
	}

}
