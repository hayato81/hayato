package curriculumG;
import curriculum_G2.Qes24_2;
import curriculum_G2.Qes24_2child;

public class Qes24 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//実行
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！
		 
		 */
		Qes24_2 ne = new Qes24_2("名前", "ステータス");
		Qes24_2child chi = new Qes24_2child(1,1,1,1,1);
		//スーパークラス
	}

}
