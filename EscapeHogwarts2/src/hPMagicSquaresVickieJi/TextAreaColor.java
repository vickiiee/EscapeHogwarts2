package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

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

	/*
	 * public void setCurve(int xPixels, int yPixels){ clear(); this.curveX = 0;
	 * this.curveY = 0; update(); }
	 */

	/*public void drawButton(Graphics2D g, boolean hover) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		drawShape(g, hover);
		g.setColor(getForeground());
		g.setFont(getFont());
		FontMetrics fm = g.getFontMetrics();

		// https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
		if (getText() != null) {
			String[] paragraphs = getText().split("\n");
			final int SPACING = 2;
			int y = 0 + fm.getHeight() + SPACING;
			for (String paragraph : paragraphs) {
				String[] words = paragraph.split(" ");
				if (words.length > 0) {
					int i = 0;
					String line = "";
					// i++;
					while (i < words.length) {
						while (i < words.length && fm.stringWidth(line) + fm.stringWidth(words[i]) < getWidth()) {
							line += words[i] + " ";
							i++;
						}
						if (y < getHeight()) {
							// g.drawString(line, 2, y);
							g.drawString(line, (getWidth() - fm.stringWidth(line)) / 2, // +y/2-50
									(getHeight() + fm.getHeight() - fm.getDescent()) / 2 + ((y) / 2) - 50); // y/2 ->
																				// the box
							y += fm.getDescent() + fm.getHeight() + SPACING;
							line = "";
						} else {
							break;// print no more text
						}
					}
				}
			}

			/*
			 * String t = getText(); //just in case text is too wide, cut off int cutoff =
			 * t.length(); while(cutoff > 0 && fm.stringWidth(t) > getWidth()){ cutoff --; t
			 * = t.substring(0,cutoff); } g.drawString(t, (getWidth()-fm.stringWidth(t))/2,
			 * (getHeight()+fm.getHeight()-fm.getDescent())/2); } }
			 */

		//}
	//}
}
