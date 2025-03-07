class Car {
    String model;
    int year;

    
    Car() {
        System.out.println("Default constructor called");
    }

    void display(){
        System.out.println("model " +model + ", year: "+year);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
       
        Car c1 = new Car();
        c1.display();
    }
}
