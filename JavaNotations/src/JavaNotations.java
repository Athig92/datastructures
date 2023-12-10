
public class JavaNotations {
	
	public void function(int n) {
		int i,j,k,count=0;
		for(i=n/2;i<=n;i++) { //2 3 4 5
			System.out.println("Value of i "+ i);
			for(j=1;j+n/2<=n;j++) {// 3<=5 4<=5 5<=5
				System.out.println("Value of j "+ j);
				for(k=1;k<=n;k=k*2) { //1 2 4  1 2 4 1 2 4
					System.out.println("Value of k "+ k);
					
					count++; //1 2 3 4 5 6 7 8 9
				}
			}
		}
		System.out.println("Value of count"+ count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaNotations java = new JavaNotations();
		java.function(5);
		
		//loop executed n times
		for(int i=0;i<=5;i++) {
			
			System.out.println("Logarithmic Complexity O(n)");
		}

		//outer loop executed n times
		for(int i=0;i<=5;i++) {
			//inner loop executed n times forms 0(n)^2
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		//Logarithmic Complexity O(logn)
		for(int i=0;i>=5;i=i*2) {
			
			System.out.println("i*2");
		}
		
	}

}
