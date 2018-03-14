package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.StyledComponent;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextBox;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class VickieHPFrontEnd extends FullFunctionScreen {

	private Graphic background;

	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Button b6;
	private Button b7;
	private Button b8;
	private Button b9;

	// GRID BUTTONS
	private Button g1;
	private Button g2;
	private Button g3;
	private Button g4;
	private Button g5;
	private Button g6;
	private Button g7;
	private Button g8;
	private Button g9;

	private int i;
	private int act;

	private Button[] numberButtons;
	private Button[] gridButtons;

	private TextArea[] txt;

	private TextArea t1;

	private String numClicked;
	private int boxClicked;

	private TextArea error;

	private TextArea counter;
	private int count;

	private TextBox tb;
	
	private Color trans;
	
	public VickieHPFrontEnd(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		numClicked = "0";
		i = 0;
		Color back = newColorWithAlpha(Color.white, 70);
		trans = newColorWithAlpha(Color.white, 70);
		Button n[] = new Button[9];
		numberButtons = n;

		Button g[] = new Button[9];
		gridButtons = g;

		TextArea t[] = new TextArea[9];
		txt = t;

		count = 0;

		background = new Graphic(0, 0, getWidth(), getHeight(), "images/background3.jpg");
		viewObjects.add(background);

		Graphic board = new Graphic(450, 50, 700, 700, "images/mSBoard.jpg");
		viewObjects.add(board);

		Graphic border = new Graphic(450, 50, 700, 700, "images/grid.png");
		viewObjects.add(border);

		error = new TextArea(50, 50, 200, 200, "ERROR: \n Please choose a # button");
		viewObjects.add(error);
		error.setVisible(false);

		counter = new TextArea(50, 50, 700, 700, "" + count);
		viewObjects.add(counter);

		// create buttons
		for (i = 0; i < numberButtons.length; i++) {
			if (i == 0 || i < 3) {
				numberButtons[i] = new Button(50 + 110 * i, 300, 100, 100, i + 1 + "", back, null);
				viewObjects.add(numberButtons[i]);
			} else if (i == 3 || i < 6) {
				numberButtons[i] = new Button(50 + 110 * (i - 3), 410, 100, 100, i + 1 + "", back, null);
				viewObjects.add(numberButtons[i]);
			} else if (i == 6 || i < 9) {
				numberButtons[i] = new Button(50 + 110 * (i - 6), 520, 100, 100, i + 1 + "", back, null);
				viewObjects.add(numberButtons[i]);
			}
		}
		

		numberButtons[0].setAction(new Action() {
			public void act() {
				numButtonAction(0);
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
//BUTTONS ON GRD
		for (i = 0; i < gridButtons.length; i++) {
			if (i == 0 || i < 3) {
				gridButtons[i] = new Button(500 + 202 * i, 100, 195, 195, "", back, null);
				viewObjects.add(gridButtons[i]);
			} else if (i == 3 || i < 6) {
				gridButtons[i] = new Button(500 + 202 * (i - 3), 302, 195, 195, "", back, null);
				viewObjects.add(gridButtons[i]);
			} else if (i == 6 || i < 9) {
				gridButtons[i] = new Button(500 + 202 * (i - 6), 505, 195, 195, "", back, null);
				viewObjects.add(gridButtons[i]);
			}
		}
		
		gridButtons[0].setAction(new Action() {
			public void act() {
				updateGrid(0);
			}
		});
		gridButtons[1].setAction(new Action() {
			public void act() {
				updateGrid(1);
			}
		});
		gridButtons[2].setAction(new Action() {
			public void act() {
				updateGrid(2);
			}
		});
		gridButtons[3].setAction(new Action() {
			public void act() {
				updateGrid(3);
			}
		});
		gridButtons[4].setAction(new Action() {
			public void act() {
				updateGrid(4);
			}
		});
		gridButtons[5].setAction(new Action() {
			public void act() {
				updateGrid(5);
			}
		});
		gridButtons[6].setAction(new Action() {
			public void act() {
				updateGrid(6);
			}
		});
		gridButtons[7].setAction(new Action() {
			public void act() {
				updateGrid(7);
			}
		});
		gridButtons[8].setAction(new Action() {
			public void act() {
				updateGrid(8);
			}
		});
		/*for(i = 0; i<gridButtons.length; i++) {
			gridButtons[i].setAction(new Action() {

				@Override
				public void act() {
					// TODO Auto-generated method stub
					updateGrid(i);
				}
				
			});
		}
		*/
		
		for (i = 0; i < txt.length; i++) {
			if (i == 0 || i < 3) {
				txt[i] = new TextArea(560 + 203 * i, 105, 195, 195, "?");
				viewObjects.add(txt[i]);
			} else if (i == 3 || i < 6) {
				txt[i] = new TextArea(560 + 203 * (i - 3), 308, 195, 195, "?");// y+203
				viewObjects.add(txt[i]);
			} else if (i == 6 || i < 9) {
				txt[i] = new TextArea(560 + 203 * (i - 6), 511, 195, 195, "?");
				viewObjects.add(txt[i]);
			}
		}
		tb = new TextBox(100, 100, 100, 100, "hiiiiiii");
		viewObjects.add(tb);
		

		
		try {
			 File fontFile = new File("images/HARRYP.ttf");
			 Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			 Font baseFont=font.deriveFont(150f); //default 
			 
			 for(int i = 0; i<txt.length; i++) {
				  txt[i].setFont(baseFont);
			 }
			 
			 for(int i = 0; i<gridButtons.length; i++) {
				 gridButtons[i].setFont(baseFont);
			 }
			
			 
			 

			 } catch (Exception e) {

			 e.printStackTrace();

			 }
	}

	public void updateGrid(int num) {
		if (numClicked.equals("0")) {
			error.setVisible(true);
		} else {
			for(int i = 0; i<txt.length; i++) {
				String nC = numClicked+"";
				String n = txt[i].getText();
				if(nC.equals(n)) {
					txt[i].setText("?");
					txt[num].update();
				}
				txt[num].setText(numClicked+"");
				
			}
			
		}
	}
	
	public Color newColorWithAlpha(Color original, int alpha) {
		return new Color(original.getRed(), original.getGreen(), original.getBlue(), alpha);
	}

	public void changeButtonColor(int num) {
		for (int i = 0; i < 9; i++) {
			numberButtons[i].setVisible(false);
			numberButtons[i].setBackground(null);
			numberButtons[i].setVisible(true);
			numberButtons[i].setVisible(false);
			numberButtons[i].setBackground(newColorWithAlpha(Color.white, 100));
			numberButtons[i].setVisible(true);
			
			
			/*if (i == num) {
				numberButtons[num].setBackground(Color.white);
			} else {
				
			}*/
		}
	}

	public void numButtonAction(int num) {

		numClicked = numberButtons[num].getText();
		count++;
		counter.setText("" + count);
		
		changeButtonColor(num);
		
		numberButtons[num].setVisible(false);
		
		numberButtons[num].setBackground(Color.white);
		
		numberButtons[num].setVisible(true);
		error.setVisible(false);
	}

}
