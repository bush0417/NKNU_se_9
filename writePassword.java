package se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writePassword {

	public static void writePassword(String filePath) throws IOException {
		File writename = new File(filePath); // �۹���|�A�p�G�S���h�n�إߤ@�ӷs��output�Ctxt�ɮ�
		BufferedWriter br = new BufferedWriter(new FileWriter(writename));
		br.write(se.textword);
		br.flush();
		br.close();
	}

}
