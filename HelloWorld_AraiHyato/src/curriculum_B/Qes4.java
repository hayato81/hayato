package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for (int i = 1; i <= 9; i++) {  
		    for (int j = 1; j <= 9; j++) { 
		    	String f = String.format("%02d", i);
		    	String s = String.format("%02d", j);
		    	System.out.print(s + "×" + f + "=" + i * j+ "||"); 
		    }
		    System.out.println();
		}

	}

}
