public class Cat extends Animal implements Land {

    private int numberOfLegs = 4;

    public Cat(int mo) {
        super(true, true, mo);
    }

    @Override
    public void sayHello() {
        System.out.println("meow");
    }

    @Override
    public void sayHello(int mo) {
        if (mo == MOOD_HAPPY){
            System.out.println("purr, purr");
        }
        else if (mo == MOOD_SCARE){
            System.out.println("hiss");
        }
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    
}
