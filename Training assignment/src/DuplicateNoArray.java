import java.util.Arrays;

public class DuplicateNoArray {

	public static void main(String[] args) {
		int arr[] = {2, 2, 2, 2, 4, 4, 6, 9, 14 };
		int total =arr.length;
		int freq[] = new int [arr.length];
		int visited =-1;
		for (int i = 0; i < total; i++) 
		{
			int count = 1;
			for (int j = i + 1; j < total; j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			{
			System.out.println(arr[i] + " occurs " + freq[i]+" times");
			}
		}
	}

}
