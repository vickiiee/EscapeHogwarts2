package hPMagicSquaresVickieJi;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class MagicSquareGridButtons extends Button{
	private int row;
	private int col;
	private Color c;
	
	public MagicSquareGridButtons(int x, int y, int w, int h, String text, Color color, Action action, int row, int col) {
		super(x, y, w, h, text, color, action);
		this.row = row;
		this.col = col;
	}


	
	public Color getc() {
		return c;
	}

	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
}
