package se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class writeScore {

	public static void writeScore(String filePath, String score) {
		BufferedWriter fw = null;
		try {
			File file = new File("C:\\Users\\USER\\Desktop\\" + se.acc + "textpaper.csv");
			if (file.isFile() && file.exists()) {
				fw = new BufferedWriter(new FileWriter(file));
				for (int i = 0; i < 10; i++) {
					fw.write("\n" + se.quiz[i] + "," + se.answers[i]);
					fw.flush();
				}
				fw.write("\n" + " " + "," + se.s);
				fw.close();
			}
			else
			{
				fw = new BufferedWriter(new FileWriter(file));
				for (int i = 0; i < 10; i++) {
					fw.write("\n" + se.quiz[i] + "," + se.answers[i]);
					fw.flush();
				}
				fw.write("\n" + " " + "," + se.s);
				fw.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判斷檔案是否存在
				fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8")); // 指點編碼格式，以免讀取時中文字符異常
				fw.write(score + " ");
				fw.flush(); // 全部寫入緩存中的內容
			} else {
				File writename = new File(filePath); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write(score + " "); // \r\n即為換行
				out.flush(); // 把快取區內容壓入檔案
				out.close(); // 最後記得關閉檔案
			}
		} catch (Exception e) {
			System.out.println("讀取檔案內容出錯");
			e.printStackTrace();
		}
	}

}
