package se;

public class checkans {

	public static void checkans() {
		se.ansu = se.ans.getText();
		char s;
		char u;
		for (int i = 0; i < 10; i++) {
			s = se.anss.charAt(i);
			u = se.ansu.charAt(i);
			if (s != u) {
				se.scc -= 10;
			}
		}
		
		if(se.scc >=70)
		{
			se.diff +=1;
			if(se.diff >= 3)
			{
				se.diff =3;
			}
		}
		
		frsc.frsc();
		se.frame4.dispose();
	}
}
