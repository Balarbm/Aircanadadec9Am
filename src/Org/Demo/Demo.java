package Org.Demo;

public class Demo {
	public static void main(String[] args) {
		int a[]=new int[7];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[5]=100;
		System.out.println(a[0]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("***********");
		for(Integer k:a) {
		System.out.println(k);	
		}
		
		
	}

}
