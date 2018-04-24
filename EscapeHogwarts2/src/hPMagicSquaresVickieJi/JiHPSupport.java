package hPMagicSquaresVickieJi;

import java.awt.Color;

import guiTeacher.components.Button;
import guiTeacher.components.TextArea;

public interface JiHPSupport {

	void font();
	
	void updateGrid(int num);
	
	Color newColorWithAlpha(Color original, int alpha);
	
	void changeButtonColor(int num, int initial);
	
	void numButtonAction(int num);
	
	Button[] getGridButtons();
	
	TextArea[] getTxtAreas();
	
}
