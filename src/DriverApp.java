import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Size of Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the "+size+ "Elements");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();		
		
		System.out.println("Array Before Sorting"+Arrays.toString(arr));
		
		MergeSort ms=new MergeSort();
		//    array,first index, last index
		ms.sort(arr,0,size-1);
		
		System.out.println("Array After Sorting"+Arrays.toString(arr));
		
		int midElement=size/2;
		ArrayRotation ar=new ArrayRotation();
		ar.rotate(arr,midElement);
		
		System.out.println("Array After Rotation"+Arrays.toString(arr));
		
		System.out.println("Please enter Number to search");
		int n=sc.nextInt();
		ArraySearch as=new ArraySearch();
		int index=as.search(arr,size-1,n);
		
		if(index==-1)
			System.out.println("Element not Found");
		else
			System.out.println("Element found at index "+index);
		
		
	}

}
