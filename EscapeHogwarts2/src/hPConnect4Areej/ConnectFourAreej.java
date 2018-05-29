package hPConnect4Areej;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ConnectFourAreej extends FullFunctionScreen {

	private Graphic background;
	private Graphic player;
	private Graphic comp;
	private Graphic board;
	private Graphic galleon;
	
	public ConnectFourAreej(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0,0, getWidth(), getHeight(), "images/party.jpg");
		viewObjects.add(background);
		
		for(int i = 360; i<900; i+=85) {
			for(int j = 225; j < 700 ; j+=85) {
				player = new Graphic(i,j, 85, 85, "images/pp.gif");
				viewObjects.add(player);
			}
		}
		
		for(int i = 360; i<900; i+=85) {
			for(int j = 225; j < 700 ; j+=85) {
				comp = new Graphic(i,j, 85, 85, "images/cp.gif");
				viewObjects.add(comp);
			}
		}
		
		board = new Graphic(300,200, 700, getHeight(), "images/cboard.png");
		viewObjects.add(board);
		
		galleon = new Graphic(300,200, 100, 100, "images/chip4.png");
		viewObjects.add(galleon);		
	}

}
