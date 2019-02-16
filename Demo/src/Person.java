

public class Person 
{
String name;
static int count=0;
public Person(String name)
{
	this.name = name;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
	public int hashCode()
{
		return super.hashCode();
		//return this.getName().charAt(0);
	//return this.getName().length();
	//return 23;
}
@Override
public boolean equals(Object obj) {
	count++;
	if (this.name == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	}
	else if (!name.equals(other.name))
		return false;
	return true;
}
}
