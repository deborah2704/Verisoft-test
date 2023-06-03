public class Frog extends Animal implements Land, Water{

    private int numberOfLegs;

    public Frog(int mo) {
        super(false, false, mo);
    }

    @Override
    public void sayHello() {
        // Do nothing
        throw new UnsupportedOperationException("Unimplemented method 'sayHello'");
    }

    @Override
    public void sayHello(int mo) {
        if (mo == MOOD_HAPPY){
            System.out.println("quack quack quack");
        }
        if (mo == MOOD_SCARE){
            System.out.println("plop into the water");
        }
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

}