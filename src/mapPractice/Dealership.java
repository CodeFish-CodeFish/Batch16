package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dealership {
    Map<String,Car> cars=new HashMap<>();

    public Dealership(Map<String, Car> cars) {
        this.cars = cars;
    }

    public static void main(String[] args) {
        Map<String,Car> cars=new HashMap<>();


        cars.put("978GG483924",new Car("Toyota","Camry",2023,"978GG483924","White"));
        cars.put("978GG4345624",new Car("Honda","Accord",2016,"978GG4345624","Black"));
        cars.put("5y89528764273",new Car("Dodge","RAM",2002,"5y89528764273","Yellow"));
        cars.put("9805y289745",new Car("Lexus","Es300h",2013,"9805y289745","Silver"));
        cars.put("89728347832",new Car("Mercedes","GLS450",2019,"89728347832","dark Blue"));
        cars.put("6593268592379",new Car("BMW","X5",2005,"6593268592379","Red"));

        Dealership dealership1=new Dealership(cars);

        /*
        divide your cars into older and newer (2015) into two maps
         */
        //      VIN    Object
        HashMap<String,Car> older=new HashMap<>();
        HashMap<String,Car> newer=new HashMap<>();
        //keySet()--> gives set of keys
        Set<String> carsVINumbers=dealership1.cars.keySet();
        for(String eachVIN:carsVINumbers){
            if(dealership1.cars.get(eachVIN).year<2015){
                older.put(eachVIN,dealership1.cars.get(eachVIN));
            }
            else {
                newer.put(eachVIN,dealership1.cars.get(eachVIN));
            }
        }
        System.out.println("OLDER");
        for (String i:older.keySet() ){
            System.out.println("Make: "+older.get(i).make);
            System.out.println("Model: "+older.get(i).model);
            System.out.println("Year: "+older.get(i).year);
            System.out.println("Color: "+older.get(i).color);
            System.out.println("VIN: "+older.get(i).VIN);
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("NEWER");
        for (String i:newer.keySet() ){
            System.out.println("Make: "+newer.get(i).make);
            System.out.println("Model: "+newer.get(i).model);
            System.out.println("Year: "+newer.get(i).year);
            System.out.println("Color: "+newer.get(i).color);
            System.out.println("VIN: "+newer.get(i).VIN);
            System.out.println();
        }
    }
}
