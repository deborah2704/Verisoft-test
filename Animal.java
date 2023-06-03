public abstract class Animal {
    private boolean mammals;
    private boolean carnivorous;
    protected int MOOD_HAPPY = 1;
    protected int MOOD_SCARE = 2;
    private int mood;

    public Animal(boolean m, boolean c, int mo) {
        mammals = m;
        carnivorous = c;
        mood = mo;
    }

    public abstract void sayHello();
    public abstract void sayHello(int mo);

    public boolean isMammals() {
        return mammals;
    }

    public void setMammals(boolean sm) {
        mammals = sm;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }
    
    public void setCarnivorous(boolean sc) {
        carnivorous = sc;
    }

}
