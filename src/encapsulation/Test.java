package encapsulation;

public class Test {

    public static void main(String[] args) {

        Practice john = new Practice();

        john.setAge(21);

        // I am 21 years old

        System.out.println( john.getAge() );;

        System.out.println("I am "+ john.getAge() + " years old!");

        john.setAge(22);
        System.out.println("I am "+ john.getAge() + " years old!");

        Practice python = new Practice();

        System.out.println(  python.getAge()   );

        // for next 5 years print John's age
        // 23, 24, ...

        john.setAge(21);
        int age = john.getAge();

        for ( int i =10; i< 15; i++ ){

            System.out.println("I am "+ age++ + " years old!");

        }

        /////////////////////////////
        City city = new City();

        city.setName("Chicago");
        System.out.println(   city.getName()  );

        city.setPopulation(65875);
        city.setEstablishmentYear(1874);
        city.setState("IL");

        System.out.println( city.getEstablishmentYear() );

        // find out how old this city?
        Integer currentYear = 2023, ageOfCity, establishmentYear = city.getEstablishmentYear();

        ageOfCity = currentYear - establishmentYear;
        System.out.println( ageOfCity );

        ////////////////////////
        System.out.println("==================");
        ImmutablePractice immutable = new ImmutablePractice();
        String brand = immutable.getBrand();
        System.out.println( brand );

        Double price = immutable.getPrice();

        System.out.println( price );

    }
}
