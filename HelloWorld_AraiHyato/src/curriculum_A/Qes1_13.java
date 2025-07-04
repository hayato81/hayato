package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.下記9個をローカル変数として宣言のみしてください
		byte number1;
		short number2;
		int number3;
		long number4;
		float number5;
		double number6;
		char eng;
		String name2;
		boolean count;
		
		//2.それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		number1 = 0;
		number2 = 0;
		number3 = 0;
		number4 = 0;
		number5 = 0.0F;
		number6 = 0.0;
		eng = '0';
		name2 = "";
		count = false;
		
		//3.初期化をしたそれぞれの変数に下記の値を代入してください
		number1 = 10;
		number2 = 100;
		number3 = 1000;
		number4 = 10000;
		number5 = 9.5F;
		number6 = 10.5;
		eng = 'a';
		name2 = "ハロー";
		count = true;
		
		//4.下記の通りにコンソール出力されるようにしてください
		System.out.println(number1 + number2 + number3 + number4);
		System.out.println(number1 + number1);
		System.out.println(eng + name2 + count);
		System.out.println(number1 + number2 + number3 + number4 + 20);
		System.out.println(number1 * number2 * number3 * number4);
		System.out.println(number6 / number2);
		System.out.println(number1 - number2);
		
		/*5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。*/
		int num= 20;
		int num1= 23;
		System.out.println("ハローJAVA"+(num+num1));
		
		/*6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してくださいローカル変数に代入し○○に入れてください
		『山田太郎 18歳 170.5cm 62.2kg 寿司』*/
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String eat = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + eat + "です");
		
		//7.6で作成した自己紹介に続いてBMIが出力されるようにしてください
		double height2 = height / 100;
		System.out.println("BMIは" + weight / (height2 * height2) + "です");
		
		//8.6で宣言した変数に再代入し下記の通りコンソールに出力してください
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		eat = "オムライス";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + eat + "です");
		
		height2 = height / 100;
		System.out.println("BMIは" + weight / (height2 * height2) + "です");
		
		//9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		
		age += 24;
		height += 168.5;
		weight += 64.2;
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + eat + "です");
		
		height2 = height / 100;
		System.out.println("BMIは" +(weight / (height2 * height2)) + "です");
		
		//10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		boolean overAge;
		age = 24;
		overAge = age < 25;
		System.out.println(overAge);
		
		boolean underAge;
		underAge = age > 25;
		System.out.println(underAge);
		
		//11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		age = 24;
		height = 168.5;
		weight = 64.2;
		
		String age2 = String.valueOf(age);
		String height3 = String.valueOf(height);
		String weight3= String.valueOf(weight);
		
		System.out.println(age2 + height3 + weight3);
		
		//12.11で変換した【年齢・身長】を整数型に変換して出力してください
		int ageInt = Integer.parseInt(age2);
		double height4 = Double.parseDouble(height3);
		double weight4 = Double.parseDouble(weight3);
		int heightInt = (int) height4;
		int weightInt = (int) weight4;
		
		System.out.println(ageInt);
		System.out.println(heightInt);
		System.out.println(weightInt);
		
		//13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		boolean ageHeight;
		ageHeight = ageInt == 25 || heightInt >= 160;
		System.out.println(ageHeight);
		
		int java;
		java = 3;
		System.out.println(java);
	}

}
