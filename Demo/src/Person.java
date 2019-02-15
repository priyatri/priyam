
public class Person extends Entry
{
String name;
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
		
		return this.getName().charAt(0);
	
	}
@Override
public boolean equals(Object obj) {
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








