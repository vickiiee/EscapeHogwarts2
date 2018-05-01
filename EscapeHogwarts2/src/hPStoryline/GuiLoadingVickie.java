package hPStoryline;

import java.awt.Font;
import java.io.File;

import guiTeacher.GUIApplication;
import guiTeacher.components.StyledComponent;
import hPCatchingGameJi.CatchingGameJi;
import hPConnect4Areej.ConnectFourAreej;
import hPMagicSquaresVickieJi.VickieHPFrontEnd;
import hpKevStoryLine.DKTitle;
import hpKevStoryLine.StephStory;
import hpKevStoryLine.StephStory2;

public class GuiLoadingVickie extends GUIApplication{

	public GuiLoadingVickie(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static GuiLoadingVickie loading;
	public static JiMenu menu;
	//public static Scene1 scene1;
	// public static VickieHPFrontEnd magicSquares;
	public static ConnectFourAreej c4;

	public static Storyline cline;

	public static CatchingGameJi cgame;

	public static StephStory story;
	public static StephStory2 story2;
	public static DKTitle kStory;

	public static void main(String[] args) {
		loading = new GuiLoadingVickie(1200, 800);

		 Thread runner = new Thread(loading);
		 runner.start();
	}

	@Override
	public void initScreen() {
		//StyledComponent.setTextColor(Color.white);
		try {
			 File fontFile = new File("images/HARRYP.ttf");
			 Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			 Font baseFont=font.deriveFont(70f); //default 
			 
			 StyledComponent.setBaseFont(baseFont);

			 } catch (Exception e) {

			 e.printStackTrace();

			 }

		menu = new JiMenu(getWidth(), getHeight());
		//scene1 = new Scene1(getWidth(), getHeight());
		//magicSquares = new VickieHPFrontEnd(getWidth(), getHeight());
		c4 = new ConnectFourAreej(getWidth(), getHeight());
		
		cline = new Storyline(getWidth(),getHeight());
		story = new StephStory(getWidth(), getHeight());
		story2 = new StephStory2(getWidth(), getHeight());
		kStory = new DKTitle(getWidth(), getHeight());
		
		cgame = new CatchingGameJi(getWidth(), getHeight());
		
		setScreen(menu);
		
		GUIApplication.enableCursorChange = true;
	}

}
