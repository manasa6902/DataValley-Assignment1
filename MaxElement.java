import java.util.Arrays;
import java.util.Scanner;
class MaxElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=sc.nextInt();
		System.out.println("Enter array elements : ");
		int arr[]= new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int max;
		System.out.println("Maximum element is "+max);
	}
}
