import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateNo {

	public static void main(String[] args) {
		
		int arr[] = { 2, 2, 2, 2, 4, 4, 6, 9, 14 };
		boolean visited[]= new boolean[arr.length];
		Arrays.fill(visited, false);
		for (int i = 0; i < arr.length; i++) {
			if(visited[i]==true)
				continue;
			int count = 1;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr[i] + " occurs " + count+" times");
		}
	}
}
