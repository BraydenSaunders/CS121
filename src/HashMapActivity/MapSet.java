package HashMapActivity;

import java.util.Map;

public class MapSet {
    private Map<String, String> countriesANDcapitals = new java.util.HashMap<>();

    public void addCountiesAndCapitals(String Capital, String Country){
        countriesANDcapitals.put(Capital, Country);
    }

    public void removeCountriesAndCapitals(String Capital, String Country){
        countriesANDcapitals.remove(Capital,Country);
    }

    public Object getCapital(String Country){
        Object capital;
        if (countriesANDcapitals.containsKey(Country)){
            capital = countriesANDcapitals.get(Country);
        }
        else {
            capital = "Not found";
        }
        return capital;
    }

    public void displayCountriesAndCapitals(){
        countriesANDcapitals.forEach( (Capital, Country) -> System.out.printf("Capital: %s, Country: %s\n", Capital, Country));
    }
}
