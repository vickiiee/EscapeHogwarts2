package hPStoryline;

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
	
	public DKDementor(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/dementorTrain.jpg");
		viewObjects.add(backgroundImg);
		
		
		textBox = new TextArea(175, 150, 400, 300, "");
		viewObjects.add(textBox);
		
		arrow = new ClickableGraphic(1000, 650, "kimg/arrow.png");
		arrow.setAction(new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTrain(getWidth(), getHeight()));
				
			}
		});
		viewObjects.add(arrow);
	}
}
