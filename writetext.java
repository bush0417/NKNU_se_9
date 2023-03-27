package se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class writetext {
	public static void writetext(String filePath) throws IOException {
		BufferedWriter fw = null;
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判斷檔案是否存在
				fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8")); // 指點編碼格式，以免讀取時中文字符異常
				fw.write( "\n" + se.textword + "," + se.textans  + "," + se.textd);
				fw.flush(); // 全部寫入緩存中的內容
			} else {
				File writename = new File(filePath); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write( "\n" + se.textword + "," + se.textans  + "," + se.textd); // \r\n即為換行
				out.flush(); // 把快取區內容壓入檔案
				out.close(); // 最後記得關閉檔案
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

	}
}
