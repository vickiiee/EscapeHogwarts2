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
import jiVickieRoom.JiBackEnd;
import jiVickieRoom.VickieSupport;

public class VickieHPFrontEnd extends FullFunctionScreen implements JiHPSupport{

	private VickieHPSupport backend;
	
	private Button[] numberButtons;
	private Button[] gridButtons;
	private TextArea[] txtAreas;

	private String numClicked;

	private TextArea error;
	private TextArea counter; //testing purposes
	
	private int count; // testing purposes

	//private TextBox tb;

	private Color trans;

	private int placeHolder;

	public VickieHPFrontEnd(int width, int height) {
		super(width, height);
		backend = new JiHPBackEnd(this);
		
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		numClicked = "0";

		Color back = newColorWithAlpha(Color.white, 70);
		
		numberButtons = new Button[9];
		gridButtons= new Button[9];
		txtAreas= new TextArea[9];


		count = 0; //testing purposes

		Graphic background = new Graphic(0, 0, getWidth(), getHeight(), "images/background3.jpg");
		viewObjects.add(background);

		Graphic board = new Graphic(450, 50, 700, 700, "images/mSBoard.jpg");
		viewObjects.add(board);

		Graphic border = new Graphic(450, 50, 700, 700, "images/grid.png");
		viewObjects.add(border);

		error = new TextArea(50, 50, 200, 200, "ERROR: \n Please choose a # button");
		viewObjects.add(error);
		error.setVisible(false);

		counter = new TextArea(50, 50, 700, 700, "" + count); //testing purposes
		viewObjects.add(counter);

		// create buttons
		for (int i = 0; i < numberButtons.length; i++) {
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
		
		// BUTTONS ON GRD
		for (int i = 0; i < gridButtons.length; i++) {
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

		//https://stackoverflow.com/questions/25394296/java-loop-to-create-action-listeners
		for(int i = 0; i < gridButtons.length; i++) {
			placeHolder = i;
			gridButtons[i].setAction(new Action() {

				@Override
				public void act() {
					count++;
					counter.setText("" + count);
					updateGrid(placeHolder--);
					
				}
				
			});
		}
		
		/*gridButtons[0].setAction(new Action() {
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
		});*/
		/*
		 * for(i = 0; i<gridButtons.length; i++) { gridButtons[i].setAction(new Action()
		 * {
		 * 
		 * @Override public void act() { // TODO Auto-generated method stub
		 * updateGrid(i); }
		 * 
		 * }); }
		 */
		
		//Create TextAreas
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
		//tb = new TextBox(100, 100, 100, 100, "hiiiiiii");
	//	viewObjects.add(tb);

		font();
	}

	public void font() {
		try {
			File fontFile = new File("images/HARRYP.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

			Font baseFont = font.deriveFont(150f); // default
			Font b = font.deriveFont(70f);

			for (int i = 0; i < txtAreas.length; i++) {
				String q = txtAreas[i].getText();
				if (q.equals("?")) {
					txtAreas[i].setFont(b);

					// txtAreas[i].move(newX, newY, durationMS);
				} else {
					txtAreas[i].setFont(baseFont);
				}

			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void updateGrid(int num) {
		if (numClicked.equals("0")) {
			error.setVisible(true);
		} else {
			for (int i = 0; i < txtAreas.length; i++) {
				// font();
				//String nC = numClicked + "";
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

	public Color newColorWithAlpha(Color original, int alpha) {
		return new Color(original.getRed(), original.getGreen(), original.getBlue(), alpha);
	}

	public void changeButtonColor(int num) {
		for (int i = 0; i < 9; i++) {
			numberButtons[i].setVisible(false);
			numberButtons[i].setBackground(null);
			numberButtons[i].setVisible(true);
			numberButtons[i].setVisible(false);
			numberButtons[i].setBackground(newColorWithAlpha(Color.white, 120));
			numberButtons[i].setVisible(true);

			/*
			 * if (i == num) { numberButtons[num].setBackground(Color.white); } else {
			 * 
			 * }
			 */
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
