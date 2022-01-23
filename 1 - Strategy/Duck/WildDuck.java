package Duck;
public class WildDuck extends Duck{
    WildDuck(FlyBehavior wf, QuackBehavior wq) {
        super(wf, wq);
    }
    public void display() {
        System.out.println("Eu sou um pato selvagem.");
    }
}
