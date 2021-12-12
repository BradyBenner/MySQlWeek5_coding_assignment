package Number_one;
import java.util.*;


//import Number_one.Soda;

public class Sort_Soda {
//Create and populate list of sodas.  based on value of doByLambda, use lambda method or method reference 
	//to create the comparator comp
	//then sort the list of sodas by "sort" method using comparator comp and print.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Soda> sodas = new ArrayList<>(List.of(new Soda("Coke"), 
				new Soda("Pepsi"), new Soda("Mt Dew"), new Soda("Sprite"), new Soda("AcidReflux")));
		
		
		Comparator<Soda> comp;
		String doByLambda ="method";
		
		if(doByLambda == "lambda") {
			System.out.println("using lamda");
	        comp = (s1, s2) -> { //lambda method for comparator
	            return Soda.compare(s1, s2);
	          };

		 } else {
			 System.out.println("using method reference");
			 comp = Soda::compare;
		 }
		sodas.sort(comp);
		print(sodas);
		
	}

	
	//use lambda for each to print out the list of sodas using its toString method implicitly
	private static void print( List<Soda> sodas) {
		sodas.forEach(soda -> System.out.println(soda));
	}
}
