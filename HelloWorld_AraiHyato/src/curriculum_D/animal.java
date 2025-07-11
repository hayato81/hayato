package curriculum_D;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog animal = new Dog("犬");
		String str1 = animal.name;
		System.out.println(str1);
				// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog bar = new Dog(3);
		int str2 = bar.num;
		System.out.println(str2);
				// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf2 =
        	DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formatNowDate = dtf2.format(ldt);
		System.out.println(formatNowDate); // 202012201332
	}

}
