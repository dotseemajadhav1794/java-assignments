//Q 18 (ii) Write a programe for number pattern

public class NumberPattern_2 {
	public static void main(String args[]) {
		int n = 5;
		//Loop to iterate over each row
		for(int i=1;i<=n;i++){
			//Loop to iterate over each column of the ith row
			for(int j=1;j<=i;j++){
				System.out.print(i+ " "); 
			}
			System.out.println();
		}
	}
}
/*
output
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/
