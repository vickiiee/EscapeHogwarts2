package hPStoryline;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKSummary extends FullFunctionScreen {

	private Graphic backgroundImg;
	private TextArea title;
	private TextArea summary;
	
	public DKSummary(int width, int height) {
		super(width, height);
		title.setForeground(Color.LIGHT_GRAY);
		summary.setForeground(Color.LIGHT_GRAY);
		summary.setSize(50);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/dementorSchool.jpg");
		viewObjects.add(backgroundImg);
		
		title = new TextArea(550,100,200,100,"Overview");
		viewObjects.add(title);
		
		summary = new TextArea(200,300,700,750,"In The Dementor's Kiss, you, the player, are a new professor in Hogwarts School of Witchcraft and Wizardry. In the process of replacing Remus Lupin, the original Defense Against the Dark Arts professor, you must save Harry Potter from magical creatures, other professors, and even himself.");
		viewObjects.add(summary);
	}

}