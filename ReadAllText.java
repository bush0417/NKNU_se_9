package se;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadAllText {
	static String filePath = "C:\\Users\\USER\\Desktop\\text.csv";

	public static void ReadAllText() throws IOException {
		String str = null;
		String Data[][];
		ArrayList topic = new ArrayList();
		ArrayList answer = new ArrayList();
		ArrayList difficulty = new ArrayList();
		String line = "";
		final String delimiter = ",";
		FileReader fileReader = new FileReader(filePath);
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
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
		se.num = topic.size();
		String[][] alltext = new String[se.num][3];
		for (int i = 0; i < topic.size(); i++) {
			Data[i][0] = (String) topic.get(i);
			Data[i][1] = (String) answer.get(i);
			Data[i][2] = (String) difficulty.get(i);
			alltext[i][0] = Data[i][0];
			alltext[i][1] = Data[i][1];
			alltext[i][2] = Data[i][2];
		}
		
		File writename = new File("C:\\Users\\USER\\Desktop\\text.txt"); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
		writer = new BufferedWriter(new FileWriter(writename));
		for (int i = 0; i < se.num; i++) {
		writer.write("\n" + alltext[i][0] + " " + alltext[i][1] + " " + alltext[i][2] + " "); // \r\n即為換行
		writer.flush();
		}// 把快取區內容壓入檔案
		writer.close(); // 最後記得關閉檔案
	}
}
