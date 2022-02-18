class Parent{
    public Parent(){
        System.out.println("Parent Class Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Class Constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Class Constructor");
    }
}

public class Constructor {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
    }
}
