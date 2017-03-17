
public class Eagle extends Bird {
    @Override
    void flying() {
        System.out.println("Flying - Like a wind");
    }

    @Override
    void liveOn() {
        System.out.println("Live On - Mountains");
    }

    @Override
    void getName() {
        System.out.println("Name - Mora");
    }

    @Override
    public boolean itIsAlive() {
        System.out.print("It Is Alive ");
        return true;
    }

    @Override
    public void itEats() {
        System.out.println("It Eats - Rabbits");
    }
}
