package hPMagicSquaresVickieJi;

import java.awt.Color;

public interface JiHPSupport {

	void font();
	
	void updateGrid(int num);
	
	Color newColorWithAlpha(Color original, int alpha);
	
	void changeButtonColor(int num);
	
	void numButtonAction(int num);
	
}
