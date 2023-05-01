package encapsulation;
public class City {
    /*
    create 'City' class
    -population, establishmentYear, name, state
    *use encapsulation process to modify the 'City' class
    *give a value for each field and show them to user
     */
   private int population, establishmentYear;
   private String name, state;

   public void setPopulation (int population1){
       population = population1;
   }
   public int getPopulation(){
       return population;
   }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void main(String[] args) {

       City city = new City();



    }
}
