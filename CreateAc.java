package se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CreateAc {

	public static void CreateAc() {
		BufferedWriter fw = null;
		String ss;
		for (int i = 0; i < 101; i++) {
			ss = Integer.toString(i);
			if(i>49) {
				se.cl = "2";
			}
			try {
				File file = new File("C:\\Users\\USER\\Desktop\\login.csv");
				fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
				fw.write("\n" + "4109770" + ss + "," + ss + "nknu" + "," + se.cl);
				fw.flush();
				File file2 = new File("C:\\Users\\USER\\Desktop\\login2.csv");
				fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), "UTF-8"));
				fw.write("\n" + "nknupr" + ss + "," + ss + "nknupr" + "," + se.cl);
				fw.flush();
				fw.close();
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
}
