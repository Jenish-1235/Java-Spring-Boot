public class Methods {
    public static void main(String[] args) {

        Computer computer = new Computer();
        System.out.println(computer.getMeComputer());

    }

    /* methods are the behaviour of object of any class.
    This are basically functions that are connected with classes or
    say object and can be used on object of that specific class only.
     */


    /*
    Method Overloading

    Having methods with same name but different number of variables or different data type of variables...
     */
}

class Computer{
    public String getMeComputer(){
        return "I am a computer";
    }
}
