package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKDementor extends FullFunctionScreen{
	
	private Graphic backgroundImg;
	private TextArea textBox;
	private ClickableGraphic arrow;
	private ClickableGraphic back;
	
	public DKDementor(int width, int height) {
		super(width, height);
		textBox.setSize(60);
		textBox.setForeground(Color.WHITE);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/dementorTrain.jpg");
		viewObjects.add(backgroundImg);
		
		
		textBox = new TextArea(150, 455, 850, 300, "As the Dementor entered the compartment, water froze and windows frosted over. The embodiment of despair wrought death with its mere presence");
		viewObjects.add(textBox);
		
		arrow = new ClickableGraphic(1000, 650, "kimg/arrowWhite.png");
		arrow.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKKiss(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(arrow);
		
		back = new ClickableGraphic(25,25,200,100, "kimg/arrowWhiteBack.png");
		back.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTrain(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(back);
	}
}
