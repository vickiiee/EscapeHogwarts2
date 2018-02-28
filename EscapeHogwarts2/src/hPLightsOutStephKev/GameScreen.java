package hPLightsOutStephKev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import kevinStephRoom.KevinStephLight;

public class GameScreen extends FullFunctionScreen {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GameLights[][] board;
	
	public GameScreen(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		board = new GameLights[4][4];
		createBoard();
		
		Graphic gamebg = new Graphic(0,0, getWidth(), getHeight(), "images/mirrorOfErised.jpg");
		viewObjects.add(gamebg);
		
	}

	public void createBoard() {
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[row].length; col++){
				board[row][col] = new GameLights(row, col); //board is created 
				board[row][col].lightOn(true); // all lights are on
			}
		}
		
	}

}
