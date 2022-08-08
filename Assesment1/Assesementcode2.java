import java.util.HashMap;

public class Assesementcode2{

	public static void main(String[] args) {
		
		//Create an object of Country Class
		Country data=new Country();
		data.saveCountryCapital("China", "Beijing");
		data.saveCountryCapital("India", "Delhi");
		data.saveCountryCapital("South Africa", "Cape Town");
		
		System.out.println("Capital of South Africa is: "+data.getCapital("South Africa"));
		System.out.println("Country of Delhi is: "+data.getCountry("Delhi"));
		System.out.println("All Country Name:"+data.countryName());
		//Print all Swap data stored in a HashMap M2
		HashMap<String, String> M2 = Country.swappingValues();
		System.out.println(M2);
	}
}