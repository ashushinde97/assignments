import java.util.ArrayList;
import java.util.Collections;

interface Binary {
	void BinSearch();
}

public class BinarySearch {

	public static void main(String[] args) {

		Binary b = () -> {
			int arr[] = { 2, 4, 5, 7, 8, 9 };
			int search = 7;
			int low = 0;
			int high = arr.length - 1;
			int mid = (low + high) / 2;
			while (low <= high) 
			{
				if (arr[mid] == search) 
				{
					System.out.println("element is present at " + mid + " position");
					break;
				} else if (arr[mid] < search)
				{
					low = mid + 1;
				} else 
				{
					high = mid - 1;
				}
				mid = (low + high) / 2;
			}
			if (low > high) 
			{
				System.out.println("element not found");
			}

		};
		b.BinSearch();

	}

}
