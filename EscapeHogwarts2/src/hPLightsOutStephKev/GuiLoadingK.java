package hPLightsOutStephKev;

import java.awt.Font;
import java.io.File;

import guiTeacher.GUIApplication;
import guiTeacher.components.StyledComponent;

public class GuiLoadingK extends GUIApplication{

	public GuiLoadingK(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static GuiLoadingK loading;
	public static GameScreen game;
	
	public static void main(String[] args) {
		loading = new GuiLoadingK(1200, 800);
		
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

		game = new GameScreen(getWidth(), getHeight());
		
		setScreen(game);
		
		GUIApplication.enableCursorChange = true;
	}

}