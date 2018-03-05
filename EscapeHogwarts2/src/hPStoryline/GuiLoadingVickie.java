package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPConnect4Areej.ConnectFourAreej;
import hPMagicSquaresVickieJi.VickieHPFrontEnd;

public class Scene1 extends FullFunctionScreen{

	private Graphic background;
	private Button magicSquares;
	private Button connectFour;

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(true);
		magicSquares.setForeground(Color.LIGHT_GRAY);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);
		
		magicSquares = new Button(100, 450, 300, 75, "Magic Squares", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
			}
		});
		viewObjects.add(magicSquares);
		
		connectFour = new Button(100, 550, 200, 75, "Connect Four", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new ConnectFourAreej(getWidth(), getHeight()));
			}
		});
		viewObjects.add(connectFour);
	}

}