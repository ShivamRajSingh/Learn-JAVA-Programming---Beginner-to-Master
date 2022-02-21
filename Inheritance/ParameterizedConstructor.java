class Parent{
    public Parent(){
        System.out.println("Non-Parameterized constructor of Parent Class");
    }
    public Parent(int x){
        System.out.println("Parameterized constructor of Parent Class " + x);
    }    
}

class Child extends Parent{
    public Child(){
        System.out.println("Non-Parameterized constructor of Child Class");
    }
    public Child(int y){
        System.out.println("Parameterized constructor of Child Class");
    }    
    public Child(int x, int y){
        super(x); // must be the first line 
        System.out.println("Parameterized constructor of Child Class " + y);
    }
}


public class ParameterizedConstructor {
    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println("");
        Child child2 = new Child(10);
        System.out.println("");
        Child child3 = new Child(10,20);
    }
}
