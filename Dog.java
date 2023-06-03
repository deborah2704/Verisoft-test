public class Dog extends Animal implements Land {

    private int numberOfLegs;
    
    public Dog(int mo) {
        super(true, true, mo);
    }

    @Override
    public void sayHello() {
        System.out.println("wagging their tails");
    }

    @Override
    public void sayHello(int mo) {
        if (mo == MOOD_HAPPY){
            System.out.println("bark loudly");
        }
        if (mo == MOOD_SCARE){
            System.out.println("whooping");
        }
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    
}