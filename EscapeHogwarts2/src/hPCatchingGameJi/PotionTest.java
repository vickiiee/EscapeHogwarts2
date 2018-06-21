package hPCatchingGameJi;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;

public class PotionTest extends ClickableGraphic{
	
	private boolean collected;

	public PotionTest(int xPos, int yPos, String imageLocation, Action act) {
		super(xPos, yPos, imageLocation);
		collected = false;
	}
	
	public void checkIfCollected() {
		//if(CatchingGameTest.getGameStatus()) {
			
		//}
	}

}
