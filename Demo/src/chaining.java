
class Car1{

    int year;
    String model;

    Car1(){
        System.out.println("Constructor called");
    }

    Car1(String model){
        this();
        this.model=model;
        System.out.println("model: "+model);
    }

    Car1(String model,int year){

        this(model);
        this.year=year;
        System.out.println("model: "+model + ", year: "+year);
    }
    void show(){
        System.out.println(year+" "+model);
    }
}

public class chaining {


    public static void main(String[] args) {
        
              Car1 c = new Car1("BMW",2001);
              c.show();
          
    }
      


}
