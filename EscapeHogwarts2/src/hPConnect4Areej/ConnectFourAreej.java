package hPConnect4Areej;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ConnectFourAreej extends FullFunctionScreen {

	private Graphic board;
	
	public ConnectFourAreej(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		board = new Graphic(300,300, getWidth(), getHeight(), "images/night.png");
		viewObjects.add(board);
		
	}

}
