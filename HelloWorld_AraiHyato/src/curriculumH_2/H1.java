package curriculumH_2;


public class H1 extends H_main {
	
	public H1(){
		
	}
	
	public H1(String name, double size, int speed, String school){
		super(name, size, speed, school);
		System.out.println("動物名：" + name);
		System.out.println("体長：" + size);
		System.out.println("速度：" + speed);
		System.out.println("学名：" + school);
	}
		
}
