package hPStartGame;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPCatchingGameJi.CatchingGameJi;
import hPCatchingGameJi.CatchingStoryJi;
import hPCatchingGameJi.Storyline;
import hPConnect4Areej.ConnectFourAreej;
import hPConnect4Areej.GamePage;
import hPMagicSquaresVickieJi.Instruction;
import hPMagicSquaresVickieJi.VickieHPFrontEnd;
import hpKevStoryLine.DKTitle;
import hpKevStoryLine.StephStory;

public class GameMenu extends FullFunctionScreen{

	//
	private Button magicSquares;
	private Button connectFour;
	private Button connectLine;
	private Button cGame;
	private Button lightsOut;
	private Button dKiss;
	private Graphic background;
	private Visible directory;
	


	public GameMenu(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/castle.jpg");
		viewObjects.add(background);

		
		directory = new Button(100, 550, 200, 75, "Directory", new Action() {
						
						@Override
						public void act() {
							GuiLoadingVickie.loading.setScreen(new GameMapDirectory(getWidth(), getHeight()));
						}
					});
					viewObjects.add(directory);
		
		magicSquares = new Button(100, 150, 300, 75, "Magic Squares", new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new Instruction(getWidth(), getHeight()));
			}
		});
		viewObjects.add(magicSquares);

		connectFour = new Button(100, 250, 200, 75, "Connect Four", new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new ConnectFourAreej(getWidth(), getHeight()));
			}
		});
		viewObjects.add(connectFour);
		
		connectLine = new Button(100, 450, 200, 75, "C4 Storyline", new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new Storyline(getWidth(), getHeight()));
			}
		});
		viewObjects.add(connectLine);
		
		cGame = new Button(100, 350, 200, 75, "Catching", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new CatchingStoryJi(getWidth(), getHeight()));
			}
		});
		viewObjects.add(cGame);
		
		lightsOut = new Button(500, 350, 300, 75, "Side Story", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new StephStory(getWidth(), getHeight()));
			}
		});
		viewObjects.add(lightsOut);
		
		dKiss = new Button(500, 450, 500, 100, "The Dementor's Kiss", new Action() {
			
			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new DKTitle(getWidth(), getHeight()));
			}
		});
		viewObjects.add(dKiss);
		
		Button p = new Button(500, 550, 500, 100, "Scrambled Image", new Action() {
					
						private String[] args;

						@Override
						public void act() {
							GamePage.main(args);
						}
					});
					viewObjects.add(p);
	}

}
