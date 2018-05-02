package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextLabel;

public class TextAreaColor extends Button {

	public TextAreaColor(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isHovered(int x, int y) {
		return false;
	}
	
	public void setCurve(int xPixels, int yPixels){
		clear();
		this.curveX = 0;
		this.curveY = 0;
		update();
	}
}