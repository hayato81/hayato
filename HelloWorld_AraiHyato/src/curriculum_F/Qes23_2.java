package curriculum_F;

public class Qes23_2 {
	
	private String name;
	private double size;
	private int speed;
	
	public String getName() { 
		return name;
		}
	
	public void setNum(double size, int speed) { //public void set<プロパティ名>(<プロパティの型> <引数名>)
		this.size = size;
		this.speed = speed;
	}
	
	public void greet() {
        System.out.println("体長：" + size + "m");
        System.out.println("速度" + speed + "km/s");
    }
}
