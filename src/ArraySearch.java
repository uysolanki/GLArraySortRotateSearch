
public class ArraySearch {

	public int search(int[] arr, int right, int s) {
		
		int split=right/2;
		if(s==arr[split])
		return split;
		else if(s>=arr[0])
		{
			return binarySearch(arr,0,split-1,s);
		}
		else
		{
			return binarySearch(arr,split+1,right,s);
		}
	}

	private int binarySearch(int[] arr, int left, int right, int s) {
		// TODO Auto-generated method stub
		if(left>right)
			return -1;
		
		int mid=(left+right)/2;
		if(s==arr[mid])
			return mid;
		else if(s>arr[mid])
			return binarySearch(arr, mid+1, right, s);
		else
			return binarySearch(arr, left, mid-1, s);
	}

}
