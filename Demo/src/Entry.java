import java.util.HashSet;

public class Entry
{
public static void main(String[] args)
{
	
HashSet<Person> set=new HashSet();
Person p1= new Person("Akhilesh");
Person p2= new Person("Priyam");
Person p3= new Person("Shubham");
Person p4= new Person("Priya");
Person p5= new Person("Shivi");
Person p6= new Person("Tanisha");
Person p7= new Person("Manas");
Person p8= new Person("Saurabh");
Person p9= new Person("Akhilesh");
set.add(p1);
set.add(p2);
set.add(p3);
set.add(p4);
set.add(p5);
set.add(p6);
set.add(p7);
set.add(p8);
set.add(p9);
System.out.println(set.size());
}
}
