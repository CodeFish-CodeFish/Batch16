package inheritance.inheritancePractice5;

final public  class T_Shirt extends Shirt {

    public T_Shirt(){
        super(100);
    }

    //override final 'washed' method from parent class to check if that is possible

   // @Override
   // public void washed(){

    // washed()' cannot override 'washed()' in 'inheritance.inheritancePractice5.Shirt';
    // overridden method is final

   // }

    public void info(){
        System.out.println("info");
    }
}
