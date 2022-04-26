package Test;


interface Maximum
{
	void FindMax();
}
public class Ex1 {

	public static void main(String[] args) {
		
		Maximum obj = () ->{
			int arr[]= {50,51,30,5};
			int max=arr[0];
			for(int i=0;i<arr.length;i++)
			{
					if(arr[i]>max)
					{
						max=arr[i];
					}
			}
			System.out.println("Max no :"+max);
		};
		obj.FindMax();
	}

}
