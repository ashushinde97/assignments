import java.util.Scanner;

interface Sequence
{
	default void sentence()
	{
		int start;
		int end;
		String st="This is default sentence";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start");
		start = sc.nextInt();
		System.out.println("enter end");
		end = sc.nextInt();
		String s1="";
		
		for(int i=start;i<=end;i++)
		{
			s1=s1+st.charAt(i);
		}
		System.out.println(s1);

		//System.out.println("Sequence of characters :"+st.subSequence(start, end));
	}
}
public class SequenceOfCharacter implements Sequence {
	public void sentense()
	{
		Sequence.super.sentence();
	}

	public static void main(String[] args) {
		
		SequenceOfCharacter sen = new SequenceOfCharacter();
		sen.sentense();
	}

}
