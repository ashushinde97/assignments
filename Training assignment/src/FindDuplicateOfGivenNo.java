
public class FindDuplicateOfGivenNo {

	public static void main(String[] args) {
		int arr[] = {2, 2, 2, 2, 4, 4, 6, 9, 14 };
		int count =0;
		int ele=0;
		int n=4;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				count++;
			}
			ele=count;
		}
		System.out.println(n+" "+"count="+ele);
	}

}
