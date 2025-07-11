package curriculum_F;

public class Qes23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
		Qes23_2 a = new Qes23_2();
		String num = a.getName();
		num = "ライオン";
		System.out.println("動物名：" + num);
		a.setNum(2.1, 80);
		a.greet();
	}

}
