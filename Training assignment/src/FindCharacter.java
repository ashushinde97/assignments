
interface Findchar
{
	void find();
}
public class FindCharacter {

	public static void main(String[] args) {
	
		Findchar fd = () ->{
			String s1="Ashutosh";
			int index = s1.indexOf('s');
			System.out.println("character is at index "+index);
		};
		fd.find();
	}

}
