package curriculum_B;
import java.util.Scanner;

public class Qes7  {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください(2人以上): ");
        int inputString = scan.nextInt();
		// 受け取り用配列
		int[][] line = new int[inputString][3];

		// トークン取得、配列格納
		for (int i = 0; i < inputString; i++) {
			Scanner eng = new Scanner(System.in);
            System.out.print(i+1 + "人目の「英語」の点数を入力してください: ");
            System.out.printf("\n");
            //int averageE = scanner.nextInt();
            
            Scanner math = new Scanner(System.in);
            System.out.print(i+1 + "人目の「数学」の点数を入力してください: ");
            System.out.printf("\n");
            //int averageM = scanner.nextInt();
            
            Scanner science = new Scanner(System.in);
            System.out.print(i+1 + "人目の「理科」の点数を入力してください: ");
            System.out.printf("\n");
            //int averageS = scanner.nextInt();
            
            Scanner social = new Scanner(System.in);
            System.out.print(i+1 + "人目の「社会」の点数を入力してください: ");
            System.out.printf("\n");
            //int averageC = scanner.nextInt();
            
			line[i] = new int[4];
			for (int j = 0; j < 4; j++) {
				line[i][j] = scan.nextInt();
			}
		}
				
		// 配列の中身表示
		for (int i = 0; i < line.length; i++) {
			for (int j = 0; j < line[0].length; j++) {
				System.out.println("line[" + i + "][" + j + "] = " + line[i][j]);
			}
            	
      	}
		
		for (int i = 0; i < inputString ; i++) {
			System.out.println(i+1 + "人目の平均点は" + (line[i][0] + line[i][1] + line[i][2] + line[i][3]) / 4 + "点です。");
		}
		
		 // 合計点を計算する変数
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i <line.length; i++) {
            sum += line[i][0];
        }
        for (int i = 0; i <line.length; i++) {
            sum1 += line[i][1];
        }
        for (int i = 0; i <line.length; i++) {
            sum2 += line[i][2];
        }
        for (int i = 0; i <line.length; i++) {
            sum3 += line[i][3];
        }
		
		System.out.println("英語の平均点は" + (double)sum  / line.length + "点です");
		System.out.println("数学の平均点は" + (double)sum1  / line.length + "点です");
		System.out.println("理科の平均点は" + (double)sum2  / line.length + "点です");
		System.out.println("社会の平均点は" + (double)sum3  / line.length + "点です");
		
		int total = 0;
        int count = 0;

        // 二次元配列のすべての要素を走査
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].length; j++) {
                total += line[i][j]; // 合計値に加算
                count++; // 要素数をカウント
            }
        }
        System.out.println("全体の平均点は" + (double)total  / count + "点です");
	}

}