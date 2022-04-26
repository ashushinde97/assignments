package StreamApi;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;

class Student
{
	int stid;
	String stname;
    int marks;
	public Student(int stid, String stname, int marks) {
		this.stid = stid;
		this.stname = stname;
		this.marks = marks;
	}
	
}
public class AvgMarks {

	public static void main(String[] args) {
		
		List<Student> list= new ArrayList<Student>(); 
		  list.add(new Student(101,"sunil kumar",26));
		  list.add(new Student(102,"sunil sharma",22));
		  list.add(new Student(103,"aman kumar",34));
		  list.add(new Student(104,"vijay kumar",40));
		  
		  
		 Double avg=list.stream().collect(Collectors.averagingInt(emp -> emp.marks));
		 System.out.println(avg);
		  
//		 OptionalDouble avgmarks = list.stream().mapToInt(sv->sv.marks).average();
//		 System.out.println("Average of student marks: "+avgmarks.getAsDouble());
	}
	

}
