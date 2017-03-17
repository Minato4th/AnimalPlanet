
public abstract class Bird implements Animal{
    String fly;
    @Override
    public void itMoves() {
        this.fly = "Flying and Moving";
    }

    abstract void flying();
    abstract void liveOn();
    abstract void getName();
}
