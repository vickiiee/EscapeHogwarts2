package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.ImageTextButton;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextColoredLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import hPConnect4Areej.ConnectFourAreej;
import hPStartGame.GuiLoadingVickie;

public class Instruction extends VickieHPFrontEnd{ //FullFunctionScreen{

	private Graphic back;
	private VickieHPFrontEnd magicSquares;
	private Button skip;
	private Button story;
	
	private TextAreaColor t;
	private TextColoredLabel g;
	
	private Button[] numberButtons;

	
	//https://www.befunky.com/create/
	
	public Instruction(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	
	/*public void initAllObjects(List<Visible> viewObjects) {
		back = new Graphic(0, 0, getWidth(), getHeight(), "images/MS-instruction.png");
		//viewObjects.add(back);
		
		//timer
		Graphic trans = new Graphic(0,0, 500, 245, "images/transBlack.png");
		//trans.resize(500,500);
		//viewObjects.add(trans);
		
		
		skip = new Button(1000, 50, 100, 100, "Skip", Color.red, new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));

			}

		});

		viewObjects.add(skip);

		story = new Button(500, 50, 100, 100, "Story", Color.blue, new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new SirCadoganTheMadKnight(getWidth(), getHeight()));

			}

		});

		viewObjects.add(story);
	}*/
	
	public void addNecessaryButtons() {
		skip = new Button(1000, 50, 100, 100, "Skip", Color.red, new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new VickieHPFrontEnd(getWidth(), getHeight()));

			}

		});

		viewObjects.add(skip);

		story = new Button(500, 50, 100, 100, "Story", Color.blue, new Action() {

			@Override
			public void act() {
				GuiLoadingVickie.loading.setScreen(new SirCadoganTheMadKnight(getWidth(), getHeight()));

			}

		});

		viewObjects.add(story);
		
		t = new TextAreaColor(600, 600, 100, 100, "IT WORKDDDDDDDDD", trans, null ); //attach image behind it
		viewObjects.add(t);
		t.setVisible(false);
		
		Graphic tB = new Graphic(500,0,300,300,"images/transBlack.png");
		viewObjects.add(tB);
		tB.preserveRatio = false;
		tB.resize(400, 500);
		
		g = new TextColoredLabel(500, 100, 600, 300, "dfwerwerwesderwefs fgdfgsdfhd", null, Color.red);
		viewObjects.add(g);
		
		TextAreaHoverButton te = new TextAreaHoverButton(0,0,500,500,"dfgsfgdfg", trans,t, tB, null) ;
		viewObjects.add(te);
	}
	
	public void startTimer() {
		//make button over timer graphic so hover action can work
	}
	
	/*public void createKeyPadButtons() {
		numberButtons = new Button[9];
		for (int i = 0; i < numberButtons.length; i++) {
			if (i == 0 || i < 3) {
				numberButtons[i] = new Button(50 + 110 * i, 250, 100, 100, i + 1 + "", trans, null);
				viewObjects.add(numberButtons[i]);
			} else if (i == 3 || i < 6) {
				numberButtons[i] = new Button(50 + 110 * (i - 3), 360, 100, 100, i + 1 + "", trans, null);
				viewObjects.add(numberButtons[i]);
			} else if (i == 6 || i < 9) {
				numberButtons[i] = new Button(50 + 110 * (i - 6), 470, 100, 100, i + 1 + "", trans, null);
				viewObjects.add(numberButtons[i]);
			}
		}
		

		numberButtons[0].setAction(new Action() {
			public void act() {
				System.out.println("this shit works");
				TextArea t = new TextArea(0,0,500,500,"UIHUIHIIU");
				viewObjects.add(t);
			}
		});
		numberButtons[1].setAction(new Action() {
			public void act() {
				numButtonAction(1);
			}
		});
		numberButtons[2].setAction(new Action() {
			public void act() {
				numButtonAction(2);
			}
		});
		numberButtons[3].setAction(new Action() {
			public void act() {
				numButtonAction(3);
			}
		});
		numberButtons[4].setAction(new Action() {
			public void act() {
				numButtonAction(4);
			}
		});
		numberButtons[5].setAction(new Action() {
			public void act() {
				numButtonAction(5);
			}
		});
		numberButtons[6].setAction(new Action() {
			public void act() {
				numButtonAction(6);
			}
		});
		numberButtons[7].setAction(new Action() {
			public void act() {
				numButtonAction(7);
			}
		});
		numberButtons[8].setAction(new Action() {
			public void act() {
				numButtonAction(8);
			}
		});
		
		for (int i = 0; i < numberButtons.length; i++) {
			int o = Integer.parseInt(numberButtons[i].getText());
			if (o == initNumBackEnd) {
				numberButtons[i].setAction(null);
				numberButtons[i].setBackground(Color.black);
				numberButtons[i].update();
			}
		}
	}*/

}
