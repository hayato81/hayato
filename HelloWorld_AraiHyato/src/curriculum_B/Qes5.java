package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 9; i++) {  
		    for (int j = 1; j <= 20; j++) { 
		    	String f = String.format("%03d", i);
		    	String s = String.format("%03d", j);
		    	int total = i * j;
		    	String t = String.format("%03d", total);
		    	System.out.print(f + "×" + s + "=" + t + "||"); 
		    }
		    System.out.println();
		}

	}

}
