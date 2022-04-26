@FunctionalInterface
interface MaxNo
{
	void FindMax();
}
class MaxNoLambda {

	public static void main(String[] args) {
		
//		MaxNo obj = () ->{
//			int arr[]= {50,4,30,9,14};
//			int temp;
//			for(int i=0;i<arr.length;i++)
//			{
//				for(int j=i+1;j<arr.length;j++)
//				{
//					if(arr[i]>arr[j])
//					{
//						temp =arr[i];
//						arr[i]= arr[j];
//						arr[j]=temp;
//					}
//				}
//			}
//			System.out.println("Max no :"+arr[arr.length-1]);
//		};
//		obj.FindMax();
		
		
		MaxNo obj = () ->{
			int arr[]= {50,4,30,5,72,14,69};
			int temp;
			for(int i=0;i<arr.length-1;i++)
			{
					if(arr[i]>arr[i+1])
					{
						temp =arr[i];
						arr[i]= arr[i+1];
						arr[i+1]=temp;
					}
				
			}
			System.out.println("Max no :"+arr[arr.length-1]);
		};
		obj.FindMax();

	}

}
