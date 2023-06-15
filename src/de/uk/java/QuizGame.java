package de.uk.java;

import de.uk.java.utils.QuestionsFromFile;

public class QuizGame {

	public static void main(String[] args) {
		QuestionsFromFile.readQuestionsFile("questions.json");
		
		GameManager game = new GameManager();
	}

}
