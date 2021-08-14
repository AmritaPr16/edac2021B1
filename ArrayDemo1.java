import java.util.Scanner;

// Array : is a collection of data of same data type
// array is an object in java, means stored on heap

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
				
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		arr[3] = scan.nextInt();
		arr[4] = scan.nextInt();
		
		double avg = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4])/5.0;
		System.out.println("Average = " + avg);
		
		scan.close();

	}

}
