package hPMagicSquaresVickieJi;

public interface VickieHPSupport {

	//void checkMultiples(String character);
	//when adding numbers to game, add in array
	
	//void usedNumbers();
	//checks throughout the string to see if the number is used, and if it is, replace the number on the game (front end)

	//void startGame();
	
	boolean checkTotal();
	//compare rows to total
	
	//String validNumbers();
	//gives valid numbers
	
	//*** FRONT END
	//void notifyNumbers(); 
	//tells to use only numbers
	//*** FRONT END
	//public void notifyNumbers() {
		//	System.out.println("You can only type a number.");
		//}
	
	int generateNumber(int max);
	//generates number based on maximum integer
	
	boolean isCornerNumber(int num);
	//returns true if outer else false
	
	//int getMid();
	//outlier method when number not outer or inner, mid can only equal 5
	
	void chooseStartingPoint();
	//choose first fixed number
	
	void createInitiateNum();
	//create first num
	
	 int getInitiateNum();
	 //fixed initiateNum
	
	 int getRowNum();
	 //fixed RowNum
	
	 int getColNum() ;
	 //fixed ColNum
	 
	 void resetMultiples(int num);
	 //check if number is more than 1
	 

	int getiRow();

	int getiCol();

	int getiNum();
	
	int getRandomInitialIndex();
	//generate first col and row
	
	//thinking to define these two methods
	//boolean isFixedRowCol();
	//booean isFixedNum();
	
	void setArr(int [][] arr);
	
	int[][] getBoxes();
}
//
