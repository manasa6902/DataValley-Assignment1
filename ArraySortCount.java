import java.util.Arrays;
import java.util.Scanner;
public class ArraySortCount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		System.out.println("Enter array elements : ");
		int arr[]= new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		Arrays.sort(arr);
		int c=0;
		System.out.println("Sorted array is :");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
			if(number==arr[i]){
				c++;
			}
		}
		System.out.println();
		System.out.println("Count of occurences of "+number+" is : "+c);
	}
}
