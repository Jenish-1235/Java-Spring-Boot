public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
        System.out.println(child.x);
        System.out.println(child.y);
    }
}

// Inheritance refers to some class implementing the features i.e. properties and methods of some other class usually making the hierarchy like
/* like in family tree in order to make multiple classes implementing the features of a common parent class.

// Extends keyword is used in order to define a class  which inherits any parent class.

// A child class can only implement the single parent class in inheritance.

 */

class Parent{
    int x = 10;
    void parentMethod(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    int y = 20;
    void childMethod(){
        System.out.println("Child method");
    }
}