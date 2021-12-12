package number_three;


import java.util.NoSuchElementException;
import java.util.Optional;

//create a soda. pass soda to method b. pass a null to method b
//make sure to catch the exception
public class optionals_app {

	public static void main(String[] args) {
		Soda s = new Soda("Pepsi");
		try {
		b(s);}
		catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
		try {
			b(null);}
			catch (NoSuchElementException e) {
				System.out.println("No soda present");
			}
		
		

	}
	//return the object in stuff via orElseThrow or throw the exception with custom comment 
	private static Soda a(Optional<Soda> stuff) {
		Soda s = stuff.orElseThrow(()->new NoSuchElementException("There is nothing there."));
		
		
		return s;
		
	}
	
	//create a optional wrapper around soda s and print out what method a returns on passing it the optional
	private static void b(Soda s) {
		Optional<Soda> o = Optional.ofNullable(s);
		System.out.println(a(o));
	}

}
