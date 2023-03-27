package se;

import java.io.File;

public class login {

	public static boolean login() {
		File file = new File("C:\\Users\\USER\\Desktop\\" + se.acc + ".txt");
		if (file.isFile() && file.exists()) {
			readPassword.readPassword("C:\\Users\\USER\\Desktop\\" + se.acc + ".txt");
			if (se.pww.equalsIgnoreCase(se.pw[1])) {
				se.userac = se.acc;
				se.userpw = se.pw[1];
				se.key = true;
				se.cl = se.pw[2];
			}
		} else if (se.acc.equalsIgnoreCase(se.pw[0])) {
			if (se.pww.equalsIgnoreCase(se.pw[1])) {
				se.userac = se.pw[0];
				se.userpw = se.pw[1];
				se.key = true;
				se.cl = se.pw[2];
				return true;
			}
		}
		return false;
	}

}
