package se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writePassword {

	public static void writePassword(String filePath) throws IOException {
		File writename = new File(filePath); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
		BufferedWriter br = new BufferedWriter(new FileWriter(writename));
		br.write(se.textword);
		br.flush();
		br.close();
	}

}
