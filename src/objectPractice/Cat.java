package objectPractice;

public class Cat {

    String name;
    String color;
    char gender;
    int foodAmount;

    /*
    create a 'run' method
    it will take a parameter for destination
    it will print out > "..Ginger. is running to ..home.."
    create another class to call run method, so that you can test it

     if cat has some amount of food
        "cat is eating and remaining food is ...."
        every time it will reduce food amount by 1
     */


    public void run(String destination){

        System.out.println(name + " is running to "+ destination);

        if (foodAmount > 0){
            System.out.println( name + " is eating and remaining food is " + --foodAmount+ "after run");
        }else {
            System.out.println( "There is no food left to feed the cat");
        }

    }

    // create a method that will take a parameter and set that parameter as color of cat value

    public  void setColor(String color1){
        color = color1;
    }
    // set foodAmount and gender for cat by creating method

    public void setFoodAmount(int amount){
        foodAmount = amount;
    }
    public void setGender(char gender1){
        gender = gender1;
    }

    public String getName(){

        return name;
    }
    public String getColor(){
        return color;
    }

    public char getGender(){
        return gender;
    }
    public  int getFoodAmount(){
        return foodAmount;
    }
}
