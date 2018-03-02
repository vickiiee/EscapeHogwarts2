package hPMagicSquaresVickieJi;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class VickieHPFrontEnd extends FullFunctionScreen{

	public VickieHPFrontEnd(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		Graphic board = new Graphic(300,100,700,700, "images/mSBoard.jpg");
		viewObjects.add(board);
		
		Graphic border = new Graphic(300,100,700,700, "images/grid.png");
		viewObjects.add(border);
		
		TextArea hi = new TextArea(100,100,100,100, "hi");
		viewObjects.add(hi);
		
		
	}

}
