package se;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JLabel;

public class textpaper {
	
	static JLabel labelt1 = new JLabel();
	static JLabel labelt2 = new JLabel();
	static JLabel labelt3 = new JLabel();
	static JLabel labelt4 = new JLabel();
	static JLabel labelt5 = new JLabel();
	static JLabel labelt6 = new JLabel();
	static JLabel labelt7 = new JLabel();
	static JLabel labelt8 = new JLabel();
	static JLabel labelt9 = new JLabel();
	static JLabel labelt10 = new JLabel();

	public static void textpaper() {
		
		
		labelt1.setText(se.quiz[0]);
		labelt2.setText(se.quiz[1]);
		labelt3.setText(se.quiz[2]);
		labelt4.setText(se.quiz[3]);
		labelt5.setText(se.quiz[4]);
		labelt6.setText(se.quiz[5]);
		labelt7.setText(se.quiz[6]);
		labelt8.setText(se.quiz[7]);
		labelt9.setText(se.quiz[8]);
		labelt10.setText(se.quiz[9]);
		se.anss = se.answers[0] + se.answers[1] + se.answers[2] + se.answers[3] + se.answers[4] + se.answers[5] + se.answers[6] + se.answers[7]
				+ se.answers[8] + se.answers[9];
		
		for(int i = 0 ; i < 10 ; i ++)
		{
			System.out.println(se.quiz[i] + " " + se.answers[i]);
		}

	}

}
