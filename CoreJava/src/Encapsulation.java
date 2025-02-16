public class Encapsulation {

    public static void main(String[] args) {
        Human human = new Human();
        human.name = "John";
        human.setAge(20);
        System.out.println(human.name);
        System.out.println(human.getAge());

    }

}

class Human{
    String name;
    private int age;  // this age variable is accessible only from same class and not any other class.

    // this is a setter method
    public void setAge(int age){
        this.age = age;
    }

    // this is a getter method
    public int getAge(){
        return this.age;
    }

    // this keyword refers to the instance of the object , otherwise preference is given to local variable...
}