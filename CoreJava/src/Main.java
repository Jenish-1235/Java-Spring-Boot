public class Main {
    public static void main(String[] args) {
        // Object Oriented Programming

        /* Classes and Objects */

        // Objects
        /*  can have properties and behaviours which in java we call properties and methods. */
        // Classes are blueprints on which objects rely.

        // JVM Creates the objects from the class.

        Pen pen = new Pen("Red", 10);  // pen object
        pen.draw(); // draw method call
        pen.write(); // write method call
    }
}

class Pen{
    String color;
    int size;

    public Pen(String color, int size){
        this.color = color;
        this.size = size;
    }

    public void draw(){
        System.out.println("Drawing");
    }
    public void write(){
        System.out.println("Writing");
    }
}