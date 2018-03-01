package hPMagicSquaresVickieJi;

import java.util.List;

import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class VickieHPFrontEnd extends FullFunctionScreen{

	public VickieHPFrontEnd(int width, int height) {
		super(width, height);
		setVisible(false);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
		TextArea hi = new TextArea(100,100,100,100, "hi");
	}

}
