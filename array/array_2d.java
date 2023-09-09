package array;
import java.util.Scanner;
public class array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an array");
		for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					arr[i][j]=sc.nextInt();	
				}	
		}
		System.out.println("your array..");
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(" "+arr[i][j]);
			}	
			System.out.println();
		}

	}

}

	