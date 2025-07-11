package curriculum_G2;
//処理

public class Qes24_2 {
	private String name;
	private String sta;
	private int num;
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	
	
	/*Qes24_2(int hp, int mp, int attack, int speed, int defence){
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defence = defence;
	}*/
	
	public Qes24_2(){
		
	}
	
	public Qes24_2(String name, String sta){
		this.name = name;
		this.sta = sta;
		System.out.println("こんにちは「" + name + "」さん");
		System.out.println(sta);
	}
	
	public Qes24_2(int num, int num1 ,int num2, int num3, int num4){
		
	}
	
	public void setNum(int num, int num1 ,int num2, int num3, int num4) {
		
		this.num = num;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		
		
	}
	public int getNum() {
		return num;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public int getNum3() {
		return num3;
	}
	
	public int getNum4() {
		return num4;
	}
	
	

}
