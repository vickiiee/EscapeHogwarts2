package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class VickieHPFrontEnd extends FullFunctionScreen implements JiHPSupport {

	private VickieHPSupport backend;

	private Button[] numberButtons;
	private MagicSquareGridButtons[] gB;
	private TextArea[] txtAreas;

	private String numClicked;

	private TextArea error;
	private TextArea counter; // testing purposes

	private int count; // testing purposes

	private Color trans;

	private int c;

	private int[][] magicSquares;

	private int initNumBackEnd; // getInitiateNum()

	public VickieHPFrontEnd(int width, int height) {
		super(width, height);

		setVisible(true);
	}

	public void initAllObjects(List<Visible> viewObjects) {
		backend = new JiHPBackEnd(this);

		numClicked = "0";

		trans = newColorWithAlpha(Color.white, 70);

		numberButtons = new Button[9];
		gB = new MagicSquareGridButtons[9];
		txtAreas = new TextArea[9];

		count = 0; // testing purposes
		// if(count == 0)backend.chooseStartingPoint();

		Graphic background = new Graphic(0, 0, getWidth(), getHeight(), "images/background3.jpg");
		viewObjects.add(background);

		Graphic board = new Graphic(450, 50, 700, 700, "images/mSBoard.jpg");
		viewObjects.add(board);

		Graphic border = new Graphic(450, 50, 700, 700, "images/grid.png");
		viewObjects.add(border);

		error = new TextArea(50, 50, 200, 200, "ERROR: \n Please choose a # button");
		viewObjects.add(error);
		error.setVisible(false);

		counter = new TextArea(50, 50, 700, 700, "" + count); // testing purposes
		viewObjects.add(counter);

		
		 Graphic textb = new Graphic(50, 50, 500, 100, "images/textbox2.png");
		 viewObjects.add(textb);
		 
		createKeyPadButtons();
		createGridButtons();
		createTxtArea();
		setUpGrid();
	}

	public void createKeyPadButtons() {
		//System.out.println("createKeyPadButtons()");
		// create buttons
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
	}

	public void numButtonAction(int num) {
		//System.out.println("numButtonAction(int num)");
		numClicked = numberButtons[num].getText();
		count++;
		counter.setText("" + count);

		changeButtonColor(num, initNumBackEnd);

		numberButtons[num].setVisible(false);

		numberButtons[num].setBackground(Color.white);

		numberButtons[num].setVisible(true);
		error.setVisible(false);
	}

	public void changeButtonColor(int num, int initial) {
		//System.out.println("changenumberButton()");
		//System.out.println("Initial num from method = " + initial);
		for (int i = 0; i < 9; i++) {
			if (i != initial - 1) {
				numberButtons[i].setVisible(false);
				numberButtons[i].setBackground(null);
				numberButtons[i].setVisible(true);
				numberButtons[i].setVisible(false);
				numberButtons[i].setBackground(newColorWithAlpha(Color.white, 120));
				numberButtons[i].setVisible(true);
			} else {
				numberButtons[initial - 1].setVisible(false);
				numberButtons[initial - 1].setBackground(null);
				numberButtons[initial - 1].setVisible(true);
				numberButtons[initial - 1].setVisible(false);
				numberButtons[initial - 1].setBackground(Color.black);
				numberButtons[initial - 1].setVisible(true);
			}
		}
	}

	public void createGridButtons() {
		//System.out.println("createGridButtons()");
		c = -1;

		for (int i = 0; i < gB.length; i++) {
			int r = 0;

			//System.out.println("Coords:(" + r + "," + c + ")");
			if (i == 0 || i < 3) {
				c = c + 1;
				gB[i] = new MagicSquareGridButtons(500 + 202 * i, 100, 195, 195, "", trans, null, r, c);
				viewObjects.add(gB[i]);
				// System.out.println("Coords:(" + r + "," + c + ")");
				//System.out.println(gB[i].getCoord());
				//System.out.println("Gi = " + i);
				if (i == 2) {
					c = -1;
				}
			} else if (i == 3 || i < 6) {
				r = 1;
				c = c + 1;
				gB[i] = new MagicSquareGridButtons(500 + 202 * (i - 3), 302, 195, 195, "", trans, null, r, c);
				viewObjects.add(gB[i]);
				// System.out.println("Coords:(" + r + "," + c);
				//System.out.println(gB[i].getCoord());
				//System.out.println("Gi = " + i);
				if (i == 5) {
					c = -1;
				}
			} else if (i == 6 || i < 9) {
				r = 2;
				c = c + 1;
				gB[i] = new MagicSquareGridButtons(500 + 202 * (i - 6), 505, 195, 195, "", trans, null, r, c);
				viewObjects.add(gB[i]);
				// System.out.println("Coords:(" + r + "," + c);
				//System.out.println(gB[i].getCoord());
				//System.out.println("Gi = " + i);

			}
		}

		gB[0].setAction(new Action() { // (0,0)
			public void act() {
				updateGrid(0);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(0, 0);

			}
		});
		gB[1].setAction(new Action() { // (0,1)
			public void act() {
				updateGrid(1);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(0, 1);
			}
		});
		gB[2].setAction(new Action() { // (0,2)
			public void act() {
				updateGrid(2);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(0, 2);
			}
		});
		gB[3].setAction(new Action() { // (1,0)
			public void act() {
				updateGrid(3);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(1, 0);
			}
		});
		gB[4].setAction(new Action() { // (1,1)
			public void act() {
				updateGrid(4);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(1, 1);
				
			}
		});
		gB[5].setAction(new Action() { // (1,2)
			public void act() {
				updateGrid(5);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(1, 2);
				
			}
		});
		gB[6].setAction(new Action() { // (2,0)
			public void act() {
				updateGrid(6);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(2, 0);
				
			}
		});
		gB[7].setAction(new Action() { // (2,1)
			public void act() {
				updateGrid(7);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(2, 1);
				
			}
		});
		gB[8].setAction(new Action() { // (2,2)
			public void act() {
				updateGrid(8);
				backend.resetMultiples(Integer.parseInt(numClicked));
				setValues(2, 2);
				
			}
		});

	}

	public void updateGrid(int num) {
		//System.out.println("updateGrid()");
		if (numClicked.equals("0")) {
			error.setVisible(true);
		} else {
			for (int i = 0; i < txtAreas.length; i++) {
				// font();
				// String nC = numClicked + "";
				String n = txtAreas[i].getText();
				if (numClicked.equals(n)) {
					// font();
					txtAreas[i].setText("?");

					if (i == 0 || i < 3) {
						txtAreas[i].move(580 + 203 * i, 150, 100);
						viewObjects.add(txtAreas[i]);
					} else if (i == 3 || i < 6) {
						txtAreas[i].move(580 + 203 * (i - 3), 350, 100);// y+203
						viewObjects.add(txtAreas[i]);
					} else if (i == 6 || i < 9) {
						txtAreas[i].move(580 + 203 * (i - 6), 562, 100);
						viewObjects.add(txtAreas[i]);
					}
				}

				txtAreas[num].update();
				// font();
			}

			if (num == 0 || num < 3) {
				txtAreas[num].move(560 + (203 * num), 105, 100);
			} else if (num == 3 || num < 6) {
				txtAreas[num].move(560 + (203 * (num - 3)), 308, 100);// y+203
			} else if (num == 6 || num < 9) {
				txtAreas[num].move(560 + 203 * (num - 6), 511, 100);
			}

			txtAreas[num].setText(numClicked);
			font();
		}

	}

	public void createTxtArea() {
		//System.out.println("createTxtArea()");
		for (int i = 0; i < txtAreas.length; i++) {
			if (i == 0 || i < 3) {
				txtAreas[i] = new TextArea(580 + 203 * i, 150, 195, 195, "?");
				viewObjects.add(txtAreas[i]);
			} else if (i == 3 || i < 6) {
				txtAreas[i] = new TextArea(580 + 203 * (i - 3), 350, 195, 195, "?");// y+203
				viewObjects.add(txtAreas[i]);
			} else if (i == 6 || i < 9) {
				txtAreas[i] = new TextArea(580 + 203 * (i - 6), 562, 195, 195, "?");
				viewObjects.add(txtAreas[i]);
			}
		}
	}

	public void setUpGrid() {
		//System.out.println("setUpGrid()");
		// Get number from backend
		backend.chooseStartingPoint();
		// stores number from backend
		initNumBackEnd = backend.getInitiateNum();
		//System.out.println("Initial num from backend = " + initNumBackEnd);
		// stores initial coordinate from backend
		int r = backend.getRowNum();
		int c = backend.getColNum();
		String p = r + "," + c;

		// compares initial coordinate with every button coordinate
		for (int i = 0; i < gB.length; i++) {
			//System.out.println("String p = gB[i].getCoord();" + p);
			String h = gB[i].getCoord();
			//System.out.println("String h = gB[i].getCoord();" + h);
			// if coordinates are a match, set num to the middle of button and make action
			// null
			if (p.equals(h)) {
				//System.out.println("THE SAME COORDINATES!!()");
				gB[i].setAction(null);
				txtAreas[i].setText("" + initNumBackEnd);
				txtAreas[i].setForeground(Color.red); // maroon color
				if (i == 0 || i < 3) {
					txtAreas[i].move(560 + (203 * i), 105, 100);
				} else if (i == 3 || i < 6) {
					txtAreas[i].move(560 + (203 * (i - 3)), 308, 100);// y+203
				} else if (i == 6 || i < 9) {
					txtAreas[i].move(560 + 203 * (i - 6), 511, 100);
				}
				font();
			}
		}

		// disable number keypad buttons too
		for (int i = 0; i < numberButtons.length; i++) {
			int o = Integer.parseInt(numberButtons[i].getText());
			if (o == initNumBackEnd) {
				numberButtons[i].setAction(null);
				numberButtons[i].setBackground(Color.black);
				numberButtons[i].update();
			}
		}
	}

	public void font() {
		//System.out.println("font()");
		try {
			File fontFile = new File("images/HARRYP.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			Font baseFont = font.deriveFont(150f);
			Font b = font.deriveFont(70f);

			for (int i = 0; i < txtAreas.length; i++) {

				String q = txtAreas[i].getText();
				if (q.equals("?")) {
					txtAreas[i].setFont(b);
				} else {
					txtAreas[i].setFont(baseFont);
				}

			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	/*
	 * public void font(int num) { try { File fontFile = new
	 * File("images/HARRYP.ttf"); Font font = Font.createFont(Font.TRUETYPE_FONT,
	 * fontFile);
	 * 
	 * Font baseFont = font.deriveFont(150f); // default Font b =
	 * font.deriveFont(70f);
	 * 
	 * if(start == false) { start = true;
	 * 
	 * } txtAreas[num].setFont(baseFont); for (int i = 0; i < txtAreas.length; i++)
	 * { if (i != num) { String q = txtAreas[i].getText(); if (q.equals("?")) {
	 * txtAreas[i].setFont(b);
	 * 
	 * // txtAreas[i].move(newX, newY, durationMS); } else {
	 * txtAreas[i].setFont(baseFont); } } }
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace();
	 * 
	 * } }
	 */

	public Color newColorWithAlpha(Color original, int alpha) {
		//System.out.println("newColorAlpha()");
		return new Color(original.getRed(), original.getGreen(), original.getBlue(), alpha);
	}

	public void setValues(int row, int col) {
		//System.out.print("------------------------------------------------------------------------------------------\n");
		//System.out.println("setValues()");
		magicSquares = backend.getBoxes();

		magicSquares[row][col] = Integer.parseInt(numClicked);
		// make method so backend can get new updated magicsquares
		// check by printing it out.
		//System.out.println("SET THE FING VALUES IN 2D ARRAY!! ");
		
		for( int r = 0; r <3; r++) {
			for(int c = 0; c<3; c++) {
				System.out.println(r+","+c+":"+magicSquares[r][c]);
			}
			
		}
		//System.out.print("------------------------------------------------------------------------------------------\n");
		backend.setArr(magicSquares);
		check();
	}
	
	public void check() {
		int count = 0;
		boolean x;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if(magicSquares[row][col]!=0) {
					count++;
				}
			}
		}
		if(count == 9) {
			x =backend.checkTotal();
			if(x) {
				System.out.println("WINNNERNENRNENRNERNNENR!!!");
			}else {
				System.out.println("WRONGNGNGNGNGNGNGNGNGNGNGN!!");
			}
		}
		
		
	}
	
	public void hints() {
		
	}

}
