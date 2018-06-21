package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.Cursor;

import guiTeacher.GUIApplication;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextColoredLabel;

public class TextAreaHoverButton extends Button {

	private TextColoredLabel t;
	private TextColoredLabel z;
	private TextColoredLabel f;
	private Graphic g;
	private Graphic aG;
	private boolean hoverA;

	public TextAreaHoverButton(int x, int y, int w, int h, String text, Color color, TextColoredLabel t, Graphic g,
			Action action, boolean hoverA) {
		super(x, y, w, h, text, color, action);
		this.t = t;
		this.hoverA = hoverA;
		if (g != null) {
			this.g = g;
			g.preserveRatio = false;
			g.resize(t.getWidth(), t.getHeight());
			g.setX(t.getX());
			g.setY(t.getY());
		}
	}

	public TextAreaHoverButton(int x, int y, int w, int h, String text, Color color, TextColoredLabel t,
			TextColoredLabel z, Graphic g, Action action, boolean hoverA) {
		super(x, y, w, h, text, color, action);
		this.t = t;
		this.z = z;
		this.hoverA = hoverA;
		if (g != null) {
			this.g = g;
			g.preserveRatio = false;
			g.resize(t.getWidth(), t.getHeight() + z.getHeight());
			g.setX(t.getX());
			g.setY(t.getY());
		}
	}

	public TextAreaHoverButton(int x, int y, int w, int h, String text, Color color, TextColoredLabel t,
			TextColoredLabel z, TextColoredLabel f, Graphic g, Action action,boolean hoverA) {
		super(x, y, w, h, text, color, action);
		this.t = t;
		this.z = z;
		this.f = f;
		this.hoverA = hoverA;
		if (g != null) {
			this.g = g;
			g.preserveRatio = false;
			g.resize(t.getWidth(), t.getHeight() + z.getHeight() + f.getHeight());
			g.setX(t.getX());
			g.setY(t.getY());
		}
	}

	public void hoverAction() {
		GUIApplication.mainFrame.setCursor(new Cursor(Cursor.HAND_CURSOR));
		setLeft(false);
		// System.out.println("HOVWER WERWEOFRWE");

		if (hoverA) {
			if (g != null) {
				g.setVisible(true);
			}
			if (aG != null) {
				aG.setVisible(true);
			}
			if (t != null && z == null && f == null) {
				g.resize(t.getWidth(), t.getHeight());
				g.setX(t.getX());
				g.setY(t.getY());
				t.setVisible(true);

			}
			if (t != null && z != null && f == null) {
				g.preserveRatio = false;
				g.resize(t.getWidth(), t.getHeight() + z.getHeight());
				g.setX(t.getX());
				g.setY(t.getY());
				t.setVisible(true);
				z.setVisible(true);
				
			}
			if (t != null && z != null && f != null) {
				g.preserveRatio = false;
				g.resize(t.getWidth(), t.getHeight() + z.getHeight() + f.getHeight());
				g.setX(t.getX());
				g.setY(t.getY());
				t.setVisible(true);
				z.setVisible(true);
				f.setVisible(true);

			}
		}
	}

	public void unhoverAction() {
		if (g != null) {

			g.setVisible(false);
		}
		// System.out.println("UNHO(VER");
		if (aG != null) {
			aG.setVisible(false);
		}
		if (t != null && z == null && f == null) {
			t.setVisible(false);

		}
		if (t != null && z != null && f == null) {
			t.setVisible(false);
			z.setVisible(false);

		}
		if (t != null && z != null && f != null) {
			t.setVisible(false);
			z.setVisible(false);
			f.setVisible(false);

		}
		
		setLeft(true);
		GUIApplication.mainFrame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}

	public void setTextLabel(TextColoredLabel x, TextColoredLabel b,TextColoredLabel a) {
		t = x;
		z = b;
		f= a;
	}
	
	public void setGraphic(Graphic v) {
		this.g=v;
		
		if (t != null && z == null && f == null) {
			g.preserveRatio = false;
			g.resize(t.getWidth(), t.getHeight());
			g.setX(t.getX());
			g.setY(t.getY());

		}
		if (t != null && z != null && f == null) {
			g.preserveRatio = false;
			g.resize(t.getWidth(), t.getHeight() + z.getHeight());
			g.setX(t.getX());
			g.setY(t.getY());
		}
		if (t != null && z != null && f != null) {
			g.preserveRatio = false;
			g.resize(t.getWidth(), t.getHeight() + z.getHeight() + f.getHeight());
			g.setX(t.getX());
			g.setY(t.getY());

		}
	}
	
	public void toggleA(boolean w) {
		this.hoverA=w;
	}
	
	public void additionalImage(Graphic d) {
		this.aG = d;
		
		aG.setX(z.getX()+z.getWidth()/4);
		aG.setY(z.getY()+z.getHeight());
		aG.resize(z.getWidth()/2, 80);
	}
}
