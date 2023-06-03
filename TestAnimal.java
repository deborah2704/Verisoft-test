public class TestAnimal {

    public static void main(String[] args) {
        Cat catty = new Cat(1);
        Dog doggy = new Dog(1);
        Frog froggy = new Frog(1);
        
        // Test cat functions 
        System.out.println("Test on Catty:");
        assert catty.isCarnivorous() == true;
        assert catty.isMammals() == true;
        assert catty.getNumberOfLegs() == 4;
        catty.setMammals(false);
        assert catty.isMammals() == false;

        System.out.println("Greeting of Catty:");
        catty.sayHello();
        System.out.println("when Catty is happy");
        catty.sayHello(1);
        System.out.println("when Catty is scared");
        catty.sayHello(2);

        System.out.println("----------------------------------");

        // Test dog functions
        System.out.println("Test on Doggy:");
        assert doggy.isCarnivorous() == true;
        assert doggy.isMammals() == true;
        assert doggy.getNumberOfLegs() == 4;
        doggy.setCarnivorous(false);
        assert doggy.isCarnivorous() == false;

        System.out.println("Greeting of Doggy:");
        doggy.sayHello();
        System.out.println("when Doggy is happy");
        doggy.sayHello(1);
        System.out.println("when Doggy is scared");
        doggy.sayHello(2);

        System.out.println("----------------------------------");

        // Test frog functions        
        System.out.println("Test on Froggy:");
        assert froggy.isCarnivorous() == false;
        assert froggy.isMammals() == false;
        assert froggy.getNumberOfLegs() == 4;
        assert froggy.hasGills() == true;
        assert froggy.hasLaysEggs() == true;
        froggy.setCarnivorous(true);
        assert froggy.isCarnivorous() == true;

        System.out.println("Greeting of Froggy:");
        // If we want to see an error uncomment this line below
        // froggy.sayHello();
        System.out.println("when Froggy is happy");
        froggy.sayHello(1);
        System.out.println("when Froggy is scared");
        froggy.sayHello(2);

        System.out.println("====================================");
        System.out.println("All tests passed!");
    }
}