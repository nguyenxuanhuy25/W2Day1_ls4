// superclass
public abstract class Animals {
    String locaion ;
    double boudaries ;

    String foods;

    public Animals(){
        //empty
    }
    public Animals(String locaion, double boudaries , String foods){
        this.locaion = locaion;
        this.boudaries = boudaries;
        this.foods = foods;
    }

    // Method
    public void makeNoise(){
        System.out.println("animals make some noise :");
    }

    public void eat(String foods){
        System.out.println("animals eat : ");
    }
    public void run(){
        System.out.println("animals run : ");
    }
    public void move(){
        System.out.println("animals move : ");
    }
}
