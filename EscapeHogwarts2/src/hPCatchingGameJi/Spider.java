package hPCatchingGameJi;

import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import guiTeacher.components.Action;
import guiTeacher.components.ClickableGraphic;

public class Spider extends ClickableGraphic{
	
	private int index;

	public Spider(int x, int y, String imageLocation, int index, Action a) {
		super(x, y, imageLocation);
		this.index = index;
		setAction(a);
		// TODO Auto-generated constructor stub
	}

	public void addMouseListener(Object mouseAdapter) {
		// TODO Auto-generated method stub
		
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int idx) {
		index = idx;
	}

}
