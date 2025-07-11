package curriculum_G2;

import java.util.Random;

//import java.util.Random;

public class Qes24_2child extends Qes24_2 {
	
	public Qes24_2child(){
	
	}
	
	public Qes24_2child(int num, int num1 ,int num2, int num3, int num4){
		super(num,num1,num2,num3,num4);
		
		Random random = new Random();
        /*int min = 1;
        int max = 999;
        
        // minからmaxまでの範囲の乱数を生成
        num = random.nextInt((max - min) + 1) + min;*/
        
        for(int i = 0; i < 5 ; i++) {
        	num = (int)(Math.random()*999);
        	num1 = (int)(Math.random()*999);
        	num2 = (int)(Math.random()*999);
        	num3 = (int)(Math.random()*999);
        	num4 = (int)(Math.random()*999);
        }
        System.out.println("HP:" + num);
        System.out.println("MP:" + num1);
        System.out.println("攻撃力:" + num2);
        System.out.println("素早さ:" + num3);
        System.out.println("防御力:"+ num4);
        System.out.println("さあ冒険に出かけよう！");
		
	}

}
