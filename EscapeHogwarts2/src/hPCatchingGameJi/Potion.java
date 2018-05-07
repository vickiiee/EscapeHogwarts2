package hPCatchingGameJi;

import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;

import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;

public class Potion extends ClickableGraphic{

	public Potion(int x, int y, String imageLocation, Action a) {
		super(x, y, imageLocation);
		setAction(a);
		// TODO Auto-generated constructor stub
	}

	public void addMouseListener(Object mouseAdapter) {
		// TODO Auto-generated method stub
		
	}

}
