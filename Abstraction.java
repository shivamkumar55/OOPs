package OOPs;

//abstract class Bird{
//    abstract void fly();
//    abstract void eat();
//}
//
//class Sparrow extends Bird{
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying..");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("sparrow eating..");
//    }
//}


interface Bird{
    void fly();
    void eat();
}

class Sparrow implements Bird{
    public void fly() {
        System.out.println("Sparrow flying..");
    }
    public void eat() {
        System.out.println("sparrow eating..");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
        b.eat();
    }
}
