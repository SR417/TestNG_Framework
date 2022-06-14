package Arrays;

public class TwoDimensionalArray {
	
	public static void main(String[]args) {
		
		            //0th array    //1st array
		int a[][]= {{10,20,30,40},{50,60,70,80,90}};
		
		
		//First bracket: Which array
		//Second bracket: Which index
		System.out.println(a[1][4]);
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.println(a[i][j]);
			
			}
		}
		
		for(int [] c:a) {
			System.out.println(c[1]);
		}
		
		
		
	}

}
