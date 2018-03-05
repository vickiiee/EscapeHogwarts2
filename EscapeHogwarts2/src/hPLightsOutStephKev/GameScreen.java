package hPLightsOutStephKev;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class GameScreen extends FullFunctionScreen {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Button light1A;
	private Button light1B; 
	private Button light1C;
	private Button light1D;
	private Button light1E;
	
	private Button light2A;
	private Button light2B; 
	private Button light2C;
	private Button light2D;
	private Button light2E;
	
	private Button light3A;
	private Button light3B; 
	private Button light3C;
	private Button light3D;
	private Button light3E;
	
	private Button light4A;
	private Button light4B; 
	private Button light4C;
	private Button light4D;
	private Button light4E;
	
	private Button light5A;
	private Button light5B; 
	private Button light5C;
	private Button light5D;
	private Button light5E;
	
	public GameScreen(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		Graphic gamebg = new Graphic(0,0, getWidth(), getHeight(), "images/mirrorOfErised.jpg");
		viewObjects.add(gamebg);
		
		List<Button> lightsRowOne = new ArrayList<Button>(5);
		List<Button> lightsRowTwo = new ArrayList<Button>(5);
		List<Button> lightsRowThree = new ArrayList<Button>(5);
		List<Button> lightsRowFour = new ArrayList<Button>(5);
		List<Button> lightsRowFive = new ArrayList<Button>(5);
		
		light1A = new Button(100, 100, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		light1B = new Button(250, 100, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light1C = new Button(400, 100, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light1D = new Button(550, 100, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light1E = new Button(700, 100, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light2A = new Button(100, 250, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light2B = new Button(250, 250, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light2C = new Button(400, 250, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light2D = new Button(550, 250, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light2E = new Button(700, 250, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light3A = new Button(100, 400, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		light3B = new Button(250, 400, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light3C = new Button(400, 400, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light3D = new Button(550, 400, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light3E = new Button(700, 400, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light4A = new Button(100, 550, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light4B = new Button(250, 550, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light4C = new Button(400, 550, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light4D = new Button(550, 550, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light4E = new Button(700, 550, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light5A = new Button(100, 700, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light5B = new Button(250, 700, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light5C = new Button(400, 700, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light5D = new Button(550, 700, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		light5E = new Button(700, 700, 100, 100, "", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		lightsRowOne.add(light1A);
		lightsRowOne.add(light1B);
		lightsRowOne.add(light1C);
		lightsRowOne.add(light1D);
		lightsRowOne.add(light1E);
		
		lightsRowTwo.add(light2A);
		lightsRowTwo.add(light2B);
		lightsRowTwo.add(light2C);
		lightsRowTwo.add(light2D);
		lightsRowTwo.add(light2E);
		
		lightsRowThree.add(light3A);
		lightsRowThree.add(light3B);
		lightsRowThree.add(light3C);
		lightsRowThree.add(light3D);
		lightsRowThree.add(light3E);
		
		lightsRowFour.add(light4A);
		lightsRowFour.add(light4B);
		lightsRowFour.add(light4C);
		lightsRowFour.add(light4D);
		lightsRowFour.add(light4E);
		
		lightsRowFive.add(light5A);
		lightsRowFive.add(light5B);
		lightsRowFive.add(light5C);
		lightsRowFive.add(light5D);
		lightsRowFive.add(light5E);
		
		viewObjects.addAll(lightsRowOne);
		viewObjects.addAll(lightsRowTwo);
		viewObjects.addAll(lightsRowThree);
		viewObjects.addAll(lightsRowFour);
		viewObjects.addAll(lightsRowFive);
	}
	
}
