package se;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class readQ {

	public static void readQ(String filePath) {
		String str = null;
		String Data[][];
		ArrayList topic = new ArrayList();
		ArrayList answer = new ArrayList();
		ArrayList difficulty = new ArrayList();
		String line = "";
		final String delimiter = ",";
		int ez = 0;
		int nom = 0;
		int hd = 0;
		int ram = 0;
		int count = 0;
		int score = 0;
		try {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader reader = null;
			reader = new BufferedReader(
					new InputStreamReader(new FileInputStream("C:\\Users\\USER\\Desktop\\text.csv"), "UTF-8"));
			while ((str = reader.readLine()) != null) // loops through every line until null found
			{
				String tempArray[] = str.split("\\,");
				topic.add(tempArray[0]);
				answer.add(tempArray[1]);
				difficulty.add(tempArray[2]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Data = new String[topic.size()][3];
		for (int i = 0; i < topic.size(); i++) {
			Data[i][0] = (String) topic.get(i);
			Data[i][1] = (String) answer.get(i);
			Data[i][2] = (String) difficulty.get(i);
		}
		
		for (int i = 0; i < Data.length; i++) {
			if (Data[i][2].equalsIgnoreCase("1")) {
				ez += 1;
			} else if (Data[i][2].equalsIgnoreCase("2")) {
				nom += 1;
			} else if (Data[i][2].equalsIgnoreCase("3")) {
				hd += 1;
			}
		}
		int j = 0;
		if (se.diff == 1) {
			String q[] = new String[ez];
			String a[] = new String[ez];
			ram = (int) (Math.random() * ez);
			for (int i = 0; i < Data.length; i++) {
				if (Data[i][2].equalsIgnoreCase("1")) {
					q[j] = Data[i][0];
					a[j] = Data[i][1];
					j += 1;
				}
			}
			for (int i = ram; i < q.length; i++) {
				if (count == 10) {
					break;
				}
				if (i == q.length - 1) {
					i = 0;
				}
				se.quiz[count] = q[count];
				se.answers[count] = a[count];
				count++;
			}
		}

		else if (se.diff == 2) {
			String q[] = new String[nom];
			String a[] = new String[nom];
			ram = (int) (Math.random() * nom);
			for (int i = 0; i < Data.length; i++) {
				if (Data[i][2].equalsIgnoreCase("2")) {
					q[j] = Data[i][0];
					a[j] = Data[i][1];
					j += 1;
				}
			}
			for (int i = ram; i < q.length; i++) {
				if (count == 10) {
					break;
				}
				if (i == q.length - 1) {
					i = 0;
				}
				se.quiz[count] = q[count];
				se.answers[count] = a[count];
				count++;
			}
		} else if (se.diff == 3) {
			String q[] = new String[hd];
			String a[] = new String[hd];
			ram = (int) (Math.random() * hd);
			for (int i = 0; i < Data.length; i++) {
				if (Data[i][2].equalsIgnoreCase("3")) {
					q[j] = Data[i][0];
					a[j] = Data[i][1];
					j += 1;
				}
			}
			for (int i = ram; i < q.length; i++) {
				if (count == 10) {
					break;
				}
				if (i == q.length - 1) {
					i = 0;
				}
				se.quiz[count] = q[count];
				se.answers[count] = a[count];
				count++;
			}
			
		}
	}


}
