package se;

import java.io.IOException;

public class alt2 {

	public static void alt2() {
		se.textword = se.jtpw.getText();
		try {
			writePassword.writePassword("C:\\Users\\USER\\Desktop\\" + se.acc + ".txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
