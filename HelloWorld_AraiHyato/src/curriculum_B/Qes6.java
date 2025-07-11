package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力してください: ");
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.split("、");
		
		Random rand = new Random();
        
        int []data = new int[1];
        
        for(int i = 0; i < data.length; i++){
            int a = (int)(Math.random()*11)+1;
            int b = (int)(Math.random()*11)+1;
            int c = (int)(Math.random()*11)+1;
            int d = (int)(Math.random()*11)+1;
            int e = (int)(Math.random()*11)+1;
            int f = (int)(Math.random()*11)+1;
            int g = (int)(Math.random()*11)+1;
            
            switch (f) {
            case 1:
            	f = 1;
            	g = f == 1?10:20;
            break;	
            case 2:
            	f = 2;
            	g = f == 2?9:20;
            break;
            case 3:
            	f = 3;
            	g = f == 3?8:20;
            break;
            case 4:
            	f = 4;
            	g = f == 4?7:20;
            break;
            case 5:
            	f = 5;
            	g = f == 5?6:20;
            break;
            case 6:
            	f = 6;
            	g = f == 6?5:20;
            break;
            }
        	
            for (String str : stringArray) {
                switch (str){
                  case "パソコン":
                    System.out.println("パソコンの残り台数は" + a + "台です");
                  break;
                  case "冷蔵庫":
                      System.out.println("冷蔵庫の残り台数は" + b + "台です");
                  break;
                  case "扇風機":
                      System.out.println("扇風機の残り台数は"+ c +"台です");
                  break;
                  case "洗濯機":
                      System.out.println("洗濯機の残り台数は" + d +"台です");
                  break;
                  case "加湿器":
                      System.out.println("加湿器の残り台数は" + e +"台です");
                  break;
                  case "テレビ":
                      System.out.println("テレビの残り台数は" + f +"台です");
                  break;
                  case "ディスプレイ":
                      System.out.println("ディスプレイの残り台数は" + g +"台です");
                  break;
                  case "その他商品":
                    System.out.println("『 その他商品 』は指定の商品ではありません");
                  break;
                  default:
                	System.out.println("『受け取った値』は指定の商品ではありません");
                  break;
                }
            }
            scanner.close();
        }
	}

}
