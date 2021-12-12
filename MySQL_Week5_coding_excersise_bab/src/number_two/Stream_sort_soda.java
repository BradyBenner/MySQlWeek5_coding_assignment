package number_two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
//streaming method of natural sorting

public class Stream_sort_soda {

	public static void main(String[] args) {
		List<Soda> sodas = new ArrayList<>(List.of(new Soda("Coke"), 
				new Soda("Pepsi"), new Soda("Mt Dew"), new Soda("Sprite"), new Soda("AcidReflux")));
		List<String> collect = sodas.stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
        System.out.println(collect);

	}

}
