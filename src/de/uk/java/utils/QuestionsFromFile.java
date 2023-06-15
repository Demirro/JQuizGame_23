/**
 * 
 */
package de.uk.java.utils;

import java.io.*;
import java.util.ArrayList;
import org.json.*;

import de.uk.java.Question;

/**
 * @author Théo Bouveyron
 *
 */
public class QuestionsFromFile {

	public static ArrayList<Question> readQuestionsFile(String path) {
		ArrayList<Question> questionList = new ArrayList<Question>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
			JSONTokener jt = new JSONTokener(br);
			JSONArray ja = new JSONArray(jt);
			
			for (Object object : ja) {
				if (object instanceof JSONObject) {
					JSONObject jobj = (JSONObject) object;
					questionList.add(questionFromJson(jobj));
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return questionList;
	}

	/**
	 * @param jobj
	 * @return
	 */
	private static Question questionFromJson(JSONObject jobj) {
		return null;
	}
}
