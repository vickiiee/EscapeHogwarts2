package hpKevStoryLine;


import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.ClickableGraphic;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class DKKissGame extends FullFunctionScreen{

	private Graphic backgroundImg;
	private ClickableGraphic[] cardArray;
	private int[] numList;
	private String[] cardList;
	
	private int[] count;
	
	public DKKissGame(int width, int height) {
		super(width, height);
		
	}

	
	public void initAllObjects(List<Visible> viewObjects) {
		cardArray = new ClickableGraphic[12];
		numList = new int[6];
		cardList = new String[6];
		
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/memoryReel.png");
		viewObjects.add(backgroundImg);
		
		cardList[0] = "kimg/cardHarry.jpg";
		cardList[1] = "kimg/cardHermione.jpg";
		cardList[2] = "kimg/cardRon.jpg";
		cardList[3] = "kimg/cardPatronus.png";
		cardList[4] = "kimg/cardRemus.jpg";
		cardList[5] = "kimg/cardVoldemort.png";
		
		for (int n = 0; n < numList.length; n++) {
			numList[n] = 0;
		}
		
		for (int i = 0; i < cardArray.length; i++) {
			cardArray[i] = new ClickableGraphic((50 + (i%6)*180),(75 + (i/6)*350), 150, 300, "kimg/cardBack.png");
			viewObjects.add(cardArray[i]);
		}
		
		cardArray[0].setAction(new Action() {
			
			@Override
			public void act() {

				flipCard(cardArray[0]);
				
			}
		});
		cardArray[1].setAction(new Action() {
			
			@Override
			public void act() {

				flipCard(cardArray[1]);
				
			}
		});
		cardArray[2].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[2]);
			
			}
		});
		cardArray[3].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[3]);
		
			}
		});
		cardArray[4].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[4]);
		
			}
		});
		cardArray[5].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[5]);
		
			}
		});
		cardArray[6].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[6]);
		
			}
		});
		cardArray[7].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[7]);
		
			}
		});
		cardArray[8].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[8]);
		
			}
		});
		cardArray[9].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[9]);
		
			}
		});
		cardArray[10].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[10]);
		
			}
		});
		cardArray[11].setAction(new Action() {
			
			@Override
			public void act() {

				flipCard(cardArray[11]);
		
			}
		});
	
	}
	
	public void flipCard(ClickableGraphic cg) {
		int num = (int)(Math.random()*6);
		
		for(int i = 0; i < numList.length; i++) {
			if(i == num && numList[i] < 2) {
				numList[i]++;
			}else if(numList[i] >= 2) {
				flipCard(cg);
			}
		}
		
		cg.loadImages(cardList[num], 150, 300);
		
	}
	
}
