package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPConnect4Areej.ConnectFourAreej;
import hPMagicSquaresVickieJi.VickieHPFrontEnd;

public class Scene1 extends FullFunctionScreen{

	private Graphic background;
	private Button magicSquares;
	private Button connectFour;
	private Graphic dialogue;
	private Graphic charHarry;
	private Visible charName;
	private TextArea dialogueTxt;

	public Scene1(int width, int height) {
		super(width, height);
		setVisible(true);
		((TextLabel) charName).setSize(40);
		dialogueTxt.setSize(35);
		//displayDialogue("Hi I am Harry");
		magicSquares.setForeground(Color.LIGHT_GRAY);
	}

	public String displayDialogue(String text) {
		for(int i = 0; i < text.length(); i++){
			dialogueTxt.setText(""+text.charAt(i));
			try {
				Thread.sleep(100); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);

		magicSquares = new Button(100, 150, 300, 75, "Magic Squares", new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
			}
		});
		viewObjects.add(magicSquares);

		connectFour = new Button(100, 250, 200, 75, "Connect Four", new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new ConnectFourAreej(getWidth(), getHeight()));
			}
		});
		viewObjects.add(connectFour);

		dialogue = new Graphic(400, 500, 400, 300, "images/diaglogue.png");
		viewObjects.add(dialogue);

		charName = new TextArea(530, 545, 200, 75, "Harry:");
		viewObjects.add(charName);

		charHarry = new Graphic(450, 545, 100, 100, "images/charHarry.jpg");
		viewObjects.add(charHarry);

		dialogueTxt = new TextArea(530, 650, 300, 100, "");
		viewObjects.add(dialogueTxt);

	}




}
