package OOPs;

// class calculator{
//    int add(int a,int b){
//         return a+b;
//     }
//
//     int add(int a,int b,int c){
//         return a+b+c;
//     }
//
//     double add(int a, int b, int c, double d){
//         return a+b+c+d;
//     }
//}


// Method Overriding
class shape{
    void draw(){
        System.out.println("Generic shape drawing...");
    }
}

class circle extends shape{
    @Override
    void draw(){
        System.out.println("circle is drawing...");
    }
}

class rect extends shape{
    @Override
    void draw() {
        System.out.println("Rectangle is drawing...");
    }
}

public class polymorphism {
    public static void main(String[] args) {

        // Method Overloading
//        calculator c = new calculator();
//        System.out.println(c.add(5,6));
//        System.out.println(c.add(5,8,3));
//        System.out.println(c.add(2,8,6,4));

        // Method Overriding
        circle c= new circle();
        c.draw();

        rect d = new rect();
        d.draw();

        // same print but upcasting
        shape s = new circle();
        s.draw();
    }
}
