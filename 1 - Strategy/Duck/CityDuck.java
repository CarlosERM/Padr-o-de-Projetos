package Duck;
public class CityDuck extends Duck{

    CityDuck(FlyBehavior wf, QuackBehavior wq) {
        super(wf, wq);
    }
     public void display() {
        System.out.println("Eu sou um pato da cidade.");
    }
}
