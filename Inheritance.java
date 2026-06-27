package OOPs;

class Vehicle{
    String name;
    String model;
    int noOfTyres;
    Vehicle(String name,String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.printf("The Engine is starting of %s : %s\n ", name, model);
    }
    void stopEngine(){
        System.out.printf("The Engine is stopping of %s : %s\n ", name, model);
    }
}

class car extends Vehicle{
    int noOfDoors;
    String transmissionType;

    car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    void startAc(){
        System.out.println("AC is started of " + name);
    }
}

class motorCycle extends Vehicle{
    String handleBarStyle;
    String suspensionType;

    motorCycle(String name, String model, int noOfTyres ,String handleBarStyle, String suspensionType) {
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    void wheelie(){
        System.out.println("motorCycle is wheelieee! " + name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        car c = new car("Maruti","800", 4, 5,"Auto");
//        c.startEngine();
//        c.startAc();
//        c.stopEngine();

        motorCycle m = new motorCycle("splendor","Xline",2,"U","soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
