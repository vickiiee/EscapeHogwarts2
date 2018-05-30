package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPConnect4Areej.ConnectFourAreej;
import hPStartGame.GuiLoadingVickie;

public class Instruction extends FullFunctionScreen{

	private Graphic back;
	private VickieHPFrontEnd magicSquares;
	private Button skip;
	
	public Instruction(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		back = new Graphic(0, 0, getWidth(), getHeight(), "images/MS-instruction.png");
		viewObjects.add(back);
		
		skip = new Button(1000, 50, 100, 100, "Skip", Color.red, new Action() {

			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));
				
			}
			
		});
		
		viewObjects.add(skip);
	}

}
