package javaDemoPack;

class Parent {

Parent() {
    System.out.println("S1");
}

}
class Child extends Parent { 

Child(){

    System.out.println("S2");
}


}

public class ConstructorDemo {
public static void main(String[] args) {
    Child child = new Child();

}
}