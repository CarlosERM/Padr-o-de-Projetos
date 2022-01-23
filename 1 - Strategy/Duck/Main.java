package Duck;
public class Main {
    public static void main(String[] args) {
        WildFly wf = new WildFly();
        WildQuack wq = new WildQuack();

        CityFly cd = new CityFly();
        CityQuack cq = new CityQuack();

        WildDuck ronaldo = new WildDuck(wf, wq);
        CityDuck richard = new CityDuck(cd, cq);

        richard.display();
        richard.fly();
        richard.quack();

        System.out.println();

        ronaldo.display();
        ronaldo.fly();
        ronaldo.quack();

    }
}