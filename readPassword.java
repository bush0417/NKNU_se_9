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
			if (file.isFile() && file.exists()) { // �P�_�ɮ׬O�_�s�b
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// �Ҽ{��s�X�榡
				BufferedReader br = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					se.pw[1] = lineTxt;
				}
			}
		} catch (Exception e) {
			System.out.println("Ū���ɮפ��e�X��");
			e.printStackTrace();
		}
	}

	public static void writePassword(String filePath) throws IOException {
		File writename = new File(filePath); // �۹���|�A�p�G�S���h�n�إߤ@�ӷs��output�Ctxt�ɮ�
		BufferedWriter br = new BufferedWriter(new FileWriter(writename));
		br.write(se.textword);
		br.flush();
		br.close();
	}
}
