package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			/*******************************************************************************************
			 １ログイン時の入力チェックシステムを下記条件で作成してください
			 ・コンソールにユーザー名を入力できるようにしてください
			 ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
			 ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
			 ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
			 ２・ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
			 *******************************************************************************************/
			Scanner scanner = new Scanner(System.in);
		    System.out.print("name:");
		    String name = scanner.next();
		    
		    if  (name.length()>10) {
		    	System.out.println("名前を10文字以内にしてください");
		    } else if (name == null || name.length() == 0) {
		    	System.out.println("名前を入力してください");
		    } else if(!name.matches("^[A-Za-z0-9]+$")) {
		    	System.out.println("「半角英数字のみで名前を入力してください」");
		    } else {
		    	System.out.println("ユーザー名" + name + "を登録しました");
		    }
		    
		    /*******************************************************************************************
			「概要」ジャンケン
			 *******************************************************************************************/
		    Scanner scanner2 = new Scanner(System.in);
	        Random random = new Random();
	        
	        String[] hands = {"グー", "チョキ", "パー"};
	        int userChoice;
	        int computerChoice;
	        int result;
	        int count = 1;
	        do {
	            System.out.println("じゃんけん！ (0:グー, 1:チョキ, 2:パー):");
	            userChoice = scanner2.nextInt();
	            // コンピューターの選択
	            computerChoice = random.nextInt(3);
	            // 勝敗判定
	            System.out.println(name + "は: " + hands[userChoice]);
	            System.out.println("相手の手は " + hands[computerChoice]);
	            
	            result = determineWinner(userChoice, computerChoice);

	            if (result == 0) {
	            	count += 1;
	                System.out.println("DRAW あいこ もう一回しましょう！");
	            } else if (result == 1) {
	                System.out.println("やるやん。");
	                System.out.println("次は俺にリベンジさせて");
	                System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	            } else if (result == -2) {
	            	count += 1;
	                System.out.println("俺の勝ち！");
	                System.out.println("負けは次につながるチャンスです！");
	                System.out.println("ネバーギブアップ");
	            } else if (result == -3) {
	            	count += 1;
	                System.out.println("俺の勝ち！");
	                System.out.println("たかがじゃんけん、そう思ってないですか？");
	                System.out.println("それやったら次も、俺が勝ちますよ");
	            } else {
	            	count += 1;
	            	System.out.println("俺の勝ち！");
	                System.out.println("なんで負けたか、明日まで考えといてください。");
	                System.out.println("そしたら何かが見えてくるはずです");
	            }
	        }while (result == 0 || result == -1 || result == -2 || result == -3 ); // あいこ、負け場合はループを続ける
	        scanner.close();	
		}
		// 勝敗を判定するメソッド
	    public static int determineWinner(int user, int computer) {
	        // 0:あいこ, 1:ユーザー勝ち, -1:ユーザー負け
	        if (user == computer) {
	            return 0;
	        } else if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0)) {
	            return 1;
	        } else if (user == 0 && computer == 2){
	            return -1;
	        } else if (user == 1 && computer == 0){
	            return -2;
	        } else {
	            return -3;
	        }
	    }
}
