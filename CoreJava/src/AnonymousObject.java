public class AnonymousObject {
    public static void main(String[] args) {
        new myObject().myMethod();
    }
}

class myObject{
    public void myMethod(){
        System.out.println("Hello World");
    }
}

// this are the object created only in heap without creating the reference in stack and hence can be used only once. If we want to use them again and we create object... It Creates new object...
