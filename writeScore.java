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
			if (file.isFile() && file.exists()) { // �P�_�ɮ׬O�_�s�b
				fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8")); // ���I�s�X�榡�A�H�KŪ���ɤ���r�Ų��`
				fw.write(score + " ");
				fw.flush(); // �����g�J�w�s�������e
			} else {
				File writename = new File(filePath); // �۹���|�A�p�G�S���h�n�إߤ@�ӷs��output�Ctxt�ɮ�
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write(score + " "); // \r\n�Y������
				out.flush(); // ��֨��Ϥ��e���J�ɮ�
				out.close(); // �̫�O�o�����ɮ�
			}
		} catch (Exception e) {
			System.out.println("Ū���ɮפ��e�X��");
			e.printStackTrace();
		}
	}

}
