package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
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
		
		t1 = new TextArea(580, 150, 195, 195, "?");

		for (i = 0; i < txt.length; i++) {
			if (i == 0 || i < 3) {
				txt[i] = new TextArea(580 + 110 * i, 150, 195, 195, "?");
				viewObjects.add(txt[i]);
			} else if (i == 3 || i < 6) {
				txt[i] = new TextArea(580 + 110 * (i - 3), 460, 195, 195, "?");
				viewObjects.add(txt[i]);
			} else if (i == 6 || i < 9) {
				txt[i] = new TextArea(580 + 110 * (i - 6), 770, 195, 195, "?");
				viewObjects.add(txt[i]);
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

		// buttons
		/*
		 * b1 = new Button(50, 300, 100,100, "1", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b1.getText();
		 * b1.setBackground(Color.white); error.setVisible(false); } });
		 * viewObjects.add(b1);
		 * 
		 * b2 = new Button(160, 300, 100,100, "2", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b2.getText();
		 * b2.setBackground(Color.white); error.setVisible(false); } });
		 * viewObjects.add(b2);
		 * 
		 * b3 = new Button(270, 300, 100,100, "3", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b3.getText();
		 * b3.setBackground(Color.white); error.setVisible(false); } });
		 * viewObjects.add(b3);
		 * 
		 * b4 = new Button(50, 410, 100,100, "4", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b4.getText();
		 * b4.setBackground(Color.white); error.setVisible(false); } });
		 * viewObjects.add(b4);
		 * 
		 * b5 = new Button(160, 410, 100,100, "5", back, new Action() {
		 * 
		 * @Override public void act() { b5.setVisible(false); numClicked =
		 * b5.getText(); b5.setBackground(Color.white); b5.setVisible(true);
		 * error.setVisible(true); } }); viewObjects.add(b5);
		 * 
		 * b6 = new Button(270, 410, 100,100, "6", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b6.getText();
		 * b6.setBackground(Color.white); error.setVisible(false); } });
		 * viewObjects.add(b6);
		 * 
		 * b7 = new Button(50, 520, 100,100, "7", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b7.getText();
		 * b7.setBackground(Color.white); error.setVisible(false); }
		 * 
		 * }); viewObjects.add(b7);
		 * 
		 * b8 = new Button(160, 520, 100,100, "8", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b8.getText();
		 * b8.setBackground(Color.white); error.setVisible(false); } });
		 * viewObjects.add(b8);
		 * 
		 * b9 = new Button(270, 520, 100,100, "9", back, new Action() {
		 * 
		 * @Override public void act() { numClicked = b9.getText();
		 * b9.setBackground(Color.white); error.setVisible(false); } });
		 * viewObjects.add(b9);
		 */

		// buttons on grid
		t1 = new TextArea(580, 150, 195, 195, "?");
		
		for (i = 0; i < txt.length; i++) {
			if (i == 0 || i < 3) {
				txt[i] = new TextArea(580 + 110 * i, 150, 195, 195,"?");
				viewObjects.add(txt[i]);
			} else if (i == 3 || i < 6) {
				txt[i] = new TextArea(580 + 110 * (i - 3), 150, 195, 195, "?");
				viewObjects.add(txt[i]);
			} else if (i == 6 || i < 9) {
				txt[i] = new TextArea(580 + 110 * (i - 6), 520, 195, 195,"?");
				viewObjects.add(txt[i]);
			}
		}
		
		
		
		//for(int i = 0; i<10; )
			
		g1 = new Button(500, 100, 195, 195, "", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					t1.setText(numClicked);
					t1.update();
				}
			}
		});
		viewObjects.add(g1);
		viewObjects.add(t1);

		g2 = new Button(702, 100, 195, 195, "?", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g2.setText(numClicked);
				}
			}
		});
		viewObjects.add(g2);

		g3 = new Button(905, 100, 195, 195, "?", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g3.setText(numClicked);
				}
			}
		});
		viewObjects.add(g3);

		g4 = new Button(500, 302, 195, 195, "?", back, new Action() {

			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g4.setText(numClicked);
				}
			}
		});
		viewObjects.add(g4);

		g5 = new Button(702, 302, 195, 195, "?", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g5.setText(numClicked);
				}
			}
		});
		viewObjects.add(g5);

		g6 = new Button(905, 302, 195, 195, "?", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g6.setText(numClicked);
				}
			}
		});
		viewObjects.add(g6);

		g7 = new Button(500, 505, 195, 195, "?", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g7.setText(numClicked);
				}
			}
		});
		viewObjects.add(g7);

		g8 = new Button(702, 505, 195, 195, "?", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g8.setText(numClicked);
				}
			}
		});
		viewObjects.add(g8);

		g9 = new Button(905, 505, 195, 195, "?", back, new Action() {
			@Override
			public void act() {
				if (numClicked.equals("0")) {
					error.setVisible(true);
				} else {
					g9.setText(numClicked);
				}
			}
		});
		viewObjects.add(g9);

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
