package se;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class readpf {

	public static String readpf(String filePath) {
		final String delimiter = ",";
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // �P�_�ɮ׬O�_�s�b
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// �Ҽ{��s�X�榡
				BufferedReader br = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					String[] token = lineTxt.split(delimiter);
					for (int i = 0; i < token.length; i++) {
						se.pw[i] = token[i];
					}
					login.login();
				}
			}
		} catch (Exception e) {
			System.out.println("Ū���ɮפ��e�X��");
			e.printStackTrace();
		}
		return filePath;

	}


}
