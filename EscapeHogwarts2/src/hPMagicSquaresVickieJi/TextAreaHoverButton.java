package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.Cursor;

import guiTeacher.GUIApplication;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextColoredLabel;

public class TextAreaHoverButton extends Button{
	
	private TextColoredLabel t;
	private Graphic g;
	
	public TextAreaHoverButton(int x, int y, int w, int h, String text, Color color, TextColoredLabel t, Graphic g, Action action) {
		super(x, y, w, h, text, color, action);
		this.t = t;
		if (g != null) {
			this.g = g;
			g.preserveRatio = false;
			g.resize(t.getWidth(), t.getHeight());
			g.setX(t.getX());
			g.setY(t.getY());
		}
	}

	public void hoverAction(){
		GUIApplication.mainFrame.setCursor(new Cursor(Cursor.HAND_CURSOR));
		System.out.println("HOVWER WERWEOFRWE");
		
		if(g != null) {
		g.setVisible(true);}
		t.setVisible(true);
		setLeft(false);
	}
	
	public void unhoverAction(){
		if(g != null) {
		g.setVisible(false);}
		System.out.println("UNHO(VER");
		t.setVisible(false);
		setLeft(true);
		GUIApplication.mainFrame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
}
