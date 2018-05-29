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
	private Boolean[] flipList;
	
	private int[] count;
	
	public DKKissGame(int width, int height) {
		super(width, height);
		
	}

	
	public void initAllObjects(List<Visible> viewObjects) {
		cardArray = new ClickableGraphic[12];
		numList = new int[6];
		cardList = new String[6];
		flipList = new Boolean[12];
		
		backgroundImg = new Graphic(0, 0, getWidth(), getHeight(), "kimg/memoryReel.png");
		viewObjects.add(backgroundImg);
		
		for (int j = 0; j < flipList.length; j++) {
			flipList[j] = false;
		}
		
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
				checkPair(flipList);
				
			}
		});
		cardArray[1].setAction(new Action() {
			
			@Override
			public void act() {

				flipCard(cardArray[1]);
				checkPair(flipList);
				
			}
		});
		cardArray[2].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[2]);
				checkPair(flipList);
			
			}
		});
		cardArray[3].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[3]);
				checkPair(flipList);
		
			}
		});
		cardArray[4].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[4]);
				checkPair(flipList);
		
			}
		});
		cardArray[5].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[5]);
				checkPair(flipList);
		
			}
		});
		cardArray[6].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[6]);
				checkPair(flipList);
		
			}
		});
		cardArray[7].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[7]);
				checkPair(flipList);
		
			}
		});
		cardArray[8].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[8]);
				checkPair(flipList);
		
			}
		});
		cardArray[9].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[9]);
				checkPair(flipList);
		
			}
		});
		cardArray[10].setAction(new Action() {
	
			@Override
			public void act() {

				flipCard(cardArray[10]);
				checkPair(flipList);
		
			}
		});
		cardArray[11].setAction(new Action() {
			
			@Override
			public void act() {

				flipCard(cardArray[11]);
				checkPair(flipList);
		
			}
		});
	
	}
	
	public void flipCard(ClickableGraphic cg) {
		int num = (int)(Math.random()*6);
		
		for(int i = 0; i < numList.length; i++) {
			if(i == num && numList[i] < 2) {
				flipList[i] = true;
				numList[i]++;
				cg.loadImages(cardList[i], 150, 300);
				checkPair(flipList);
			}
		}
		
	}
	
	public void checkPair(Boolean[] fList) {
		for (int i = 0; i < fList.length; i++) {
			if (fList[i] == true) {
				for(int n = (i+1); n < fList.length; n++) {
					if(fList[i] == fList[n]) {
						if(compareValues(cardList[i], cardList[n]) == false) {
							fList[i] = false;
							fList[n] = false;
							
							numList[i]--;
							numList[n]--;
						}
					}
				}
			}
		}
	}


	public boolean compareValues(String card1, String card2) {
		if (card1.equals(card2) != true){
			return false;
		}
		
		return true;
	}
	
}
