package Number_one;
//Soda entity with name attribute and compare method to be aid creation of comparator for sort
public class Soda {
	private String name;

	public String getName() {
		return name;
	}

	public Soda(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "Soda [name=" + name + "]";
	}
	
	public static int compare(Soda s1, Soda s2) {
		return s1.getName().compareTo(s2.getName());
		
		
	}
}



