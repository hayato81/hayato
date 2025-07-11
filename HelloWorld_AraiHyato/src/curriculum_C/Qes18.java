package curriculum_C;

import java.util.Arrays;
import java.util.Random;

public class Qes18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
			// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
				
			// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
					
			// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
				
			// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
			// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
			// ※0は出力＆格納しないようにしてください。

			// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
			// ※小数点以下も表示されるようにしてください。
			
			// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    // 作成したメソッドをここで呼び出してください	
		
		//Q1
		String valName = valMes("Hello JavaS ");
		int valNum = square(11);
		System.out.println(valName + valNum);
		
		//Q2
		int num1 = 10;
        int num2 = 5;
        int sum = add(num1, num2); 
        System.out.println(sum); 
        
        //Q3
        int arrey[] = {1,2,3,4};
        arrey2(arrey);
        
        //Q4
        double dou1 = 1.5;
        double dou2 = 1.7;
        double sum2 = add(dou1, dou2);
        System.out.println(sum2); 
        
        //Q5
        int ten = 10;
        int min = 1;
        int max = 100;
        
        int[] randomNumbers = getNum(ten, min, max);
        System.out.println(Arrays.toString(randomNumbers)); 
        
        //Q6
        int[] ave = randomNumbers;
        int ve = aveRum(ave);
        System.out.println("平均点：" + (double)ve);
        
        //Q7
        int fal = ve;
        iff(fal);
	}	
	//Q1メソッド
	static int square(int value) {
		int num = value;
		return num;
	}
	static String valMes(String name) {
		String mess = name;
		return mess;
	}
	//Q2メソッド
	static int add(int a, int b) {
        return a * b;
    }
	
	//Q3メソッド
	private static void arrey2(int[] arrey) {
		for(int str: arrey) {
			System.out.print(" " + str+ " ");
		}
	}
	
	//Q4メソッド
	static double add(double a, double b) {
        return a * b;
    }
	
	//Q5メソッド
	static int[] getNum(int count, int min, int max) {
		if (count <= 0) {
			return new int[0];
		}
		
		int[] numbers = new int [count];
		Random random = new Random();
		
		for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        return numbers;
	}
	
	//Q6 メソッド
	static int aveRum(int[] arr) {
		int sum = 0;
        int cou = 0;
		for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
            cou++;
        }
		int re = sum / cou;
		return re;
	}
	
	//Q7 メソッド
	static boolean iff(int o) {
		if(o >= 50) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
		
	}
	
}

