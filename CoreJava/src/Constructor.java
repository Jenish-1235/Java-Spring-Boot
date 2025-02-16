public class Constructor {
    public static void main(String[] args) {

    }
}

class Man{
    String name;
    int age;
    Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    // constructor looks like method itself, but it's just we don't specify return type for it..
    // constructor have same name as class name
    // default constructor - that is empty constructor.
    // everytime we create a object we call the constructor.
    // we can assign the default values in constructors.
    // Constructor overloading , that is one class can have multiple constructor
    // parameterised constructor :- Constructor which can have some parameters and expects the arguments when the object is being created from it..
    // for overloading  - each constructor should have different number of parameters being accepted.


}
