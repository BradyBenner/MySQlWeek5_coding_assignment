package number_two;
//Entity Soda with attribute name and toString method

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
	
	

}
