package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Scene1 extends FullFunctionScreen{

	private Graphic background;
	private Button magicSquares;
	private Button connectFour;
	private Button lightsOut;

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(true);
		lightsOut.setForeground(Color.LIGHT_GRAY);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);
		
		magicSquares = new Button(100, 450, 300, 75, "Lights Out", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
			}
		});
		viewObjects.add(lightsOut);
		
}
