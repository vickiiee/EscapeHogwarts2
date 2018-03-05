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
	
	public VickieHPFrontEnd(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		Color back =newColorWithAlpha(Color.white, 70);
		background = new Graphic(0, 0, getWidth(), getHeight(), "images/background3.jpg");
		viewObjects.add(background);
		
		Graphic board = new Graphic(450,50,700,700, "images/mSBoard.jpg");
		viewObjects.add(board);
		
		Graphic border = new Graphic(450,50,700,700, "images/grid.png");
		viewObjects.add(border);
		
// buttons 
		one = new Button(50, 300, 100,100, "1", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(one);
		
		two = new Button(160, 300, 100,100, "2", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(two);
		
		three = new Button(270, 300, 100,100, "3", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(three);
		
		four = new Button(50, 410, 100,100, "4", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(four);
		
		five = new Button(160, 410, 100,100, "5", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(five);
		
		six = new Button(270, 410, 100,100, "6", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(six);
		
		seven = new Button(50, 520, 100,100, "7", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(seven);
		
		eight = new Button(160, 520, 100,100, "8", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(eight);
		
		nine = new Button(270, 520, 100,100, "9", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(nine);
	
//buttons on grid
		oneG = new Button(500, 100, 216,216, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(oneG);
		
		twoG = new Button(160, 300, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(twoG);
		
		threeG = new Button(270, 300, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(threeG);
		
		fourG = new Button(50, 410, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(fourG);
		
		fiveG = new Button(160, 410, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(fiveG);
		
		sixG = new Button(270, 410, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(sixG);
		
		sevenG = new Button(50, 520, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(sevenG);
		
		eightG = new Button(160, 520, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(eightG);
		
		nineG = new Button(270, 520, 100,100, "?", back, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
		viewObjects.add(nineG);
		
	}
	
	public static Color newColorWithAlpha(Color original, int alpha) {
	    return new Color(original.getRed(), original.getGreen(), original.getBlue(), alpha);
	}

}
