package curriculumH_2;
public class H_main {
	
	public String name;
	public double size;
	public int speed;
	public String school;
	
	public H_main(){
		
	}
	
	public H_main(String name, double size, int speed, String school){
		
	}
	
	public void setName(String name,double size, int speed, String school) {
	    this.name = name;
	    this.size = size;
	    this.speed = speed;
	    this.school = school;
	  }
	  // 動物の名前を取得する
	  public String getName() {
	    return name;
	  }
	  public double getSize() {
		    return size;
	  }
	  public int getSpeed() {
		    return speed;
	  }
	  public String getSchool() {
		    return school;
	  }
}
