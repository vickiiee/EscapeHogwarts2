package hPStartGame;

import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextLabel;

public interface StoryLineGuideJi {

	//6:30 -7; Station 8 & 9
	
	
	
	 //Displays one element at a time
	public String displayPhrase(String txt);
		/*
		 * dialogueTxt.setText("");
			for(int i = 0; i < txt.length(); i++) {
				append(dialogueTxt, txt.charAt(i));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return "";
		 */
	
	
	//Adds one letter at a time
	public void append(TextArea word, char letter);
		/*
		 * word.setText(word.getText() + letter);
		 */
	
	//runs array: each element is a sentence
	public void runStoryLine1(); 
		//code will vary
	
	//Switch Name on txtArea
	public void switchCharName(String cName);
		/*
		 * for(int i = 0; i < charNames.length; i++) {
			if(charNames[i] == cName) {
				((TextLabel) charName).setText(cName);
			}
		}
		 */
	
	//Switch images
	public void switchCharImage(Graphic charImage);
		/*
		 * for(int i = 0; i < charImages.length; i++) {
				if(charImages[i] == charImage) {
					for(int j = 0; j < charImages.length; j++) {
						if(charImages[j] != charImage) {
							charImages[j].setVisible(false);
						}
					}
					charImage.setVisible(true);
				}
			}
		 */
	
	
	//Switch background images
	public void switchBkgrnd(Graphic bkgrnd);
		/*
		 * for(int i = 0; i < bkgrnds.length; i++) {
				if(bkgrnds[i] == bkgrnd) {
					for(int j = 0; j < bkgrnds.length; j++) {
						if(bkgrnds[j] != bkgrnd) {
							bkgrnds[j].setVisible(false);
						}
					}
					bkgrnd.setVisible(true);
				}
			}
		 */
	
	//Go from one array to the next
	public void continueScenes();
		//code will vary
}
