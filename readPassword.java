package se;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class readPassword {

	public static void readPassword(String filePath) {
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判斷檔案是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// 考慮到編碼格式
				BufferedReader br = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					se.pw[1] = lineTxt;
				}
			}
		} catch (Exception e) {
			System.out.println("讀取檔案內容出錯");
			e.printStackTrace();
		}
	}

	public static void writePassword(String filePath) throws IOException {
		File writename = new File(filePath); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
		BufferedWriter br = new BufferedWriter(new FileWriter(writename));
		br.write(se.textword);
		br.flush();
		br.close();
	}
}
