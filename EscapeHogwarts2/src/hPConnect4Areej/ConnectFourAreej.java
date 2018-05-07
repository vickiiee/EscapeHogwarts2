package hPConnect4Areej;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ConnectFourAreej extends FullFunctionScreen {

	private Graphic background;
	private Graphic back;
	private Graphic board;
	private Graphic galleon;
	
	public ConnectFourAreej(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0, getWidth(), getHeight(), "images/background2.jpg");
		viewObjects.add(background);
		
		back = new Graphic(350,220, 600, 620, "images/mSCBoard.jpg");
		viewObjects.add(back);
		
		board = new Graphic(300,200, 700, getHeight(), "images/cboard.png");
		viewObjects.add(board);
		
		galleon = new Graphic(300,200, 100, 100, "images/chip4.png");
		viewObjects.add(galleon);		
	}

}
