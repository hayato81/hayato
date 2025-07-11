package curriculumI_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class main {
   
    public void scan(String[] scan2){
    	Scanner scanner2 = new Scanner(System.in);
        System.out.println("数値を入力してください（,区切り）:");

        String line = scanner2.nextLine();
        String[] num = line.split(",");
        
        System.out.println("入力された数値:");
        for (String number : num) {
            System.out.println(number);
        }
        up(num);
        addList(num);
    }
    
    
	//昇順、降順
    public void up(String[] arr) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("入力: ");
        String upDown = scanner.next();
        
        
        if (upDown.equals("昇順")) {
        	Arrays.sort(arr);
            System.out.println("昇順: " + Arrays.toString(arr));
        } else if (upDown.equals("降順")){
        	Arrays.sort(arr, Collections.reverseOrder());
            System.out.println("降順: " + Arrays.toString(arr));
        } else {
        	System.out.println("失敗");
        }
    }
    
    	public void addList(String[] b) {
    	int[] num2 = Stream.of(b).mapToInt(Integer::parseInt).toArray();
    	
    	List<String> list = new ArrayList<>();
	    list.add("北海道");
	    list.add("青森県");
	    list.add("岩手県");
	    list.add("宮城県");
	    list.add("秋田県");
	    list.add("山形県");
	    list.add("福島県");
	    list.add("茨城県");
	    list.add("栃木県");
	    list.add("群馬県");
	    list.add("埼玉県");
	    
	    List<String> list2 = new ArrayList<>();
	    list2.add("札幌市");
	    list2.add("青森市");
	    list2.add("盛岡市");
	    list2.add("仙台市");
	    list2.add("秋田市");
	    list2.add("山形市");
	    list2.add("福島市");
	    list2.add("水戸市");
	    list2.add("宇都宮市");
	    list2.add("前橋市");
	    list2.add("さいたま市");
	    
	    List<String> list3 = new ArrayList<>();
	    list3.add("83424");
	    list3.add("9646");
	    list3.add("15275");
	    list3.add("7282");
	    list3.add("11638");
	    list3.add("9323");
	    list3.add("13784");
	    list3.add("6097");
	    list3.add("6408");
	    list3.add("6362");
	    list3.add("3798");
	    
	    String[] array = list.toArray(new String[0]);
	    String[] array2 = list2.toArray(new String[0]);
	    String[] array3 = list3.toArray(new String[0]);
	    
	    for(int i = 0;i < 1; i++) {
	    	for(int hh : num2) {        		
	    		String nn = array[hh];
	        	String mm = array2[hh];
	        	String ll = array3[hh];
	        	 System.out.println("都道府県名：" + nn);
	        	 System.out.println("県庁所在地：" + mm);
	        	 System.out.println("面積：" + ll);
	    		
	    	}
	    
	    }
    	
    }
    	 
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	
    
   
   
   
}
