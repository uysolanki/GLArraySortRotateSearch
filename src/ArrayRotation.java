
public class ArrayRotation {

	public void rotate(int[] arr, int nor) {
	for(int z=1;z<=nor;z++)
	{
			int temp=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
		
		arr[j]=temp;
	}
		
	}

}
