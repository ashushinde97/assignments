import java.util.Scanner;

@FunctionalInterface
interface Find {
	void search();
}
public class FindCharLambda {

	public static void main(String[] args) {

		Find df = () -> {

			String s1 = "Ashutosh";
			char ch[] = s1.toCharArray();
			int index;
			Scanner sc = new Scanner(System.in);
			System.out.println("Index no: ");
			index = sc.nextInt();
			System.out.println(ch[index]);

		};
		df.search();
		Find cd= () -> {
			String s1 = "Ashutosh";
			char ch[] = s1.toCharArray();
			char c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter character: ");
			c = sc.next().charAt(0);
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==c)
				{
					System.out.println(ch[i]+" is present in given string at "+i+" position");
				}
			}
		};
		cd.search();
	}
}
