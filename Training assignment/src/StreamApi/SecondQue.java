package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class SecondQue {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("rohit");
		name.add("ashutosh");
		name.add("akash");
		name.add("rohan");
		
		List<String> list = name.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
		System.out.println(list);
	}

}
