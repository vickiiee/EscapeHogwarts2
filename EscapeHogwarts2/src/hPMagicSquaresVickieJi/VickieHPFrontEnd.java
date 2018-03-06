package hPMagicSquaresVickieJi;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class VickieHPFrontEnd extends FullFunctionScreen{

	private Graphic background;
	
	private Button one;
	private Button two;
	private Button three;
	private Button four;
	private Button five;
	private Button six;
	private Button seven;
	private Button eight;
	private Button nine;

	private Button oneG;
	private Button twoG;
	private Button threeG;
	private Button fourG;
	private Button fiveG;
	private Button sixG;
	private Button sevenG;
	private Button eightG;
	private Button nineG;
	
	private String numClicked;
	private int boxClicked;
	
	private TextArea error;
	
	public VickieHPFrontEnd(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		numClicked = "0";
		Color back =newColorWithAlpha(Color.white, 70);
		
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/background3.jpg");
		viewObjects.add(background);
		
		Graphic board = new Graphic(450,50,700,700, "images/mSBoard.jpg");
		viewObjects.add(board);
		
		Graphic border = new Graphic(450,50,700,700, "images/grid.png");
		viewObjects.add(border);
		
		error = new TextArea(50, 50, 200,200, "ERROR: \n Please choose a # button");
		viewObjects.add(error);
		error.setVisible(false);
		
// buttons 
		one = new Button(50, 300, 100,100, "1", back, new Action() {
			@Override
			public void act() {
				numClicked = one.getText();
				one.setBackground(Color.white);
				error.setVisible(false);
			}	
		});
		viewObjects.add(one);
		
		two = new Button(160, 300, 100,100, "2", back, new Action() {
			@Override
			public void act() {
				numClicked = two.getText();
				two.setBackground(Color.white);
				error.setVisible(false);
			}
		});
		viewObjects.add(two);
		
		three = new Button(270, 300, 100,100, "3", back, new Action() {
			@Override
			public void act() {
				numClicked = three.getText();
				three.setBackground(Color.white);
				error.setVisible(false);
			}
		});
		viewObjects.add(three);
		
		four = new Button(50, 410, 100,100, "4", back, new Action() {
			@Override
			public void act() {
				numClicked = four.getText();
				four.setBackground(Color.white);
				error.setVisible(false);
			}	
		});
		viewObjects.add(four);
		
		five = new Button(160, 410, 100,100, "5", back, new Action() {
			@Override
			public void act() {
				five.setVisible(false);
				numClicked = five.getText();
				five.setBackground(Color.white);
				five.setVisible(true);
				error.setVisible(true);
			}
		});
		viewObjects.add(five);
		
		six = new Button(270, 410, 100,100, "6", back, new Action() {
			@Override
			public void act() {
				numClicked = six.getText();
				six.setBackground(Color.white);
				error.setVisible(false);
			}
		});
		viewObjects.add(six);
		
		seven = new Button(50, 520, 100,100, "7", back, new Action() {
			@Override
			public void act() {
				numClicked = seven.getText();
				seven.setBackground(Color.white);
				error.setVisible(false);
			}
			
		});
		viewObjects.add(seven);
		
		eight = new Button(160, 520, 100,100, "8", back, new Action() {
			@Override
			public void act() {
				numClicked = eight.getText();
				eight.setBackground(Color.white);
				error.setVisible(false);
			}
		});
		viewObjects.add(eight);
		
		nine = new Button(270, 520, 100,100, "9", back, new Action() {
			@Override
			public void act() {
				numClicked = nine.getText();
				nine.setBackground(Color.white);
				error.setVisible(false);
			}
		});
		viewObjects.add(nine);
	
//buttons on grid
		oneG = new Button(500, 100, 195,195, "?", back, new Action() {
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					oneG.setText(numClicked);
				}
			}
		});
		viewObjects.add(oneG);
		
		twoG = new Button(702, 100, 195,195, "?", back, new Action() {
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					twoG.setText(numClicked);
				}
			}
		});
		viewObjects.add(twoG);
		
		threeG = new Button(905, 100, 195,195, "?", back, new Action() {
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					threeG.setText(numClicked);
				}
			}
		});
		viewObjects.add(threeG);
		
		fourG = new Button(500, 302, 195,195, "?", back, new Action() {

			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					fourG.setText(numClicked);
				}
			}
		});
		viewObjects.add(fourG);
		
		fiveG = new Button(727, 327, 145,145, "?", Color.white, new Action() { //702, 302 195,195
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					fiveG.setText(numClicked);
				}
			}
		});
		viewObjects.add(fiveG);
		
		sixG = new Button(905, 302, 195,195, "?", back, new Action() {
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					sixG.setText(numClicked);
				}
			}
		});
		viewObjects.add(sixG);
		
		sevenG = new Button(500, 505, 195,195, "?", back, new Action() {
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					sevenG.setText(numClicked);
				}
			}
		});
		viewObjects.add(sevenG);

		eightG = new Button(702, 505, 195,195, "?", back, new Action() {
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					eightG.setText(numClicked);
				}
			}
		});
		viewObjects.add(eightG);
		
		nineG = new Button(905, 505, 195,195, "?", back, new Action() {
			@Override
			public void act() {
				if(numClicked.equals("0")) {
					error.setVisible(true);
				}else {
					nineG.setText(numClicked);
				}
			}
		});
		viewObjects.add(nineG);
		
	}
	
	public static Color newColorWithAlpha(Color original, int alpha) {
	    return new Color(original.getRed(), original.getGreen(), original.getBlue(), alpha);
	}

}
