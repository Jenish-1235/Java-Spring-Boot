public class StaticKeyword {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.brand = "Samsung";
        mobile.price = 10000;
        mobile.name = "Galaxy S20 Ultra";
    }

}

class Mobile{
    String brand;
    int price;
    static String name; // here name variable is static and hence when changing value of this variable it will affect all the existing object instances of this class.

    // static variables should be called with their class name and not object variable name
    // eg : Mobile.name = "Samsung";
    public void showMobileDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    /* this is static method :-
    This method applies changes to all the existing object instances
    You can use static variables inside a static method , but can't use non static variable in static method without object reference...
     */
    public static void changeMobileName(){
        Mobile.name = "Galaxy S21 Ultra";
    }

    // static block is code block called only once , when first object instance is created regardless of any number of subsequent object instance creating.
    // To load class without object creation , we can use Class.forname(<classname>); this will load and call the class and static block respectively.
    static{
        System.out.println("Static block is called once");
    }

}