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
			if (file.isFile() && file.exists()) { // �P�_�ɮ׬O�_�s�b
				fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8")); // ���I�s�X�榡�A�H�KŪ���ɤ���r�Ų��`
				fw.write( "\n" + se.textword + "," + se.textans  + "," + se.textd);
				fw.flush(); // �����g�J�w�s�������e
			} else {
				File writename = new File(filePath); // �۹���|�A�p�G�S���h�n�إߤ@�ӷs��output�Ctxt�ɮ�
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write( "\n" + se.textword + "," + se.textans  + "," + se.textd); // \r\n�Y������
				out.flush(); // ��֨��Ϥ��e���J�ɮ�
				out.close(); // �̫�O�o�����ɮ�
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
