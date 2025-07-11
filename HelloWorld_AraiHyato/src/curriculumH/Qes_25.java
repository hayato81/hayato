package curriculumH;

import java.util.Scanner;

import curriculumH_2.H1;

public class Qes_25 {
	/*
	 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("文字列を入力してください");
        String input = scanner.nextLine();
		
		H1 h1 = new H1("ライオン",2.1,80,"パンテラ レオ");
		H1 h2 = new H1("ゾウ",3.2,40,"ロキソドンタ・サイクロティス");
		H1 h3 = new H1("パンダ",1.9,30,"アイルロポダ・メラノレウカ");
		H1 h4 = new H1("チンパンジー",0.94,25,"パン・トゥログロディテス");
		H1 h5 = new H1("シマウマ",2.4,65,"チャップマンシマウマ");
		H1 h6 = new H1("インコ",0.1,50,"不明");
        
        
        /*if (input.contains(lionText)) {
        	
        } else if (input.contains(zouText)) {
        	H1 h21 = new H1("ゾウ",3.2,40,"ロキソドンタ・サイクロティス");
        } else if (input.contains(pandaText)) {
        	H1 h31 = new H1("パンダ",1.9,30,"アイルロポダ・メラノレウカ");
        } else if (input.contains(thin)) {
        	H1 h41 = new H1("チンパンジー",0.94,25,"パン・トゥログロディテス");
        } else if (input.contains(shima)) {
        	H1 h51 = new H1("シマウマ",2.4,65,"チャップマンシマウマ");
        }	else if (input.contains(innko)) {
        	H1 h61 = new H1("インコ",0.1,50,"不明");
        }  else  {
        	System.out.println("");
        }*/
        
	}

}
