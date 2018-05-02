package hpKevStoryLine;


import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKKissGame extends FullFunctionScreen{

	private Graphic backgroundImg;
	private ClickableGraphic[] cardArray;
	
	
	private int[] count;
	
	public DKKissGame(int width, int height) {
		super(width, height);
		
	}

	
	public void initAllObjects(List<Visible> viewObjects) {
		cardArray = new ClickableGraphic[11];
		
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/memoryReel.png");
		viewObjects.add(backgroundImg);
		
		for (int i = 0; i < cardArray.length; i++) {
			cardArray[i] = new ClickableGraphic((50 + (i%6)*180),(75 + (i/6)*350), 150, 300, "kimg/cardBack.png");
			viewObjects.add(cardArray[i]);
			cardArray[i].setAction(new Action() {
				
				@Override
				public void act() {
					flipCard();
					
				}
			});
		}
	
	}
	
	public void flipCard() {
		
	}
	
}
