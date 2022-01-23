package Duck;

// O Padrão Strategy define uma família de Algoritmos( um conjunto de algoritmos) e cada um deles são intercambiáveis.
// Além disso, são independentes do cliente. Ele separa o algoritmo daquele que está usando o algorcliente.
// Ou seja, se o cliente variar, o algoritmo não precisa variar junto.

// Aquele que usa o algoritmo não é forçado a mudar por conta dele, mesmo no caso desse algoritmo variar.

// Minha definição: O Padrão Strategy cria uma família de algoritmos indepentes do cliente e intercambiáveis(podem ser trocados);

public abstract class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }

    public void display(){};
    public void quack() {
        this.qb.quack();
    }

    public void fly() {
        this.fb.fly();
    }
}
