package hPStoryline;

import java.util.List;

import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class StephStory extends FullFunctionScreen {

	private TextArea description;
	
	public StephStory(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		description = new TextArea(650, 330, 700, 400, "Story");
		viewObjects.add(description);

	}

	

}
