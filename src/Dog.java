public class Dog extends Animal{

    private boolean hasBeenWalked;
    private boolean barking;

    public Dog(String name, int age, boolean vaccinated, boolean sleeping, boolean hasBeenWalked, boolean barking){
        super(name, age, vaccinated, sleeping);
        this.hasBeenWalked = hasBeenWalked;
        this.barking = barking;
    }

    public void walk(){
        hasBeenWalked = true;
        System.out.println("Yay! I have been walked.");
    }

    public boolean isHasBeenWalked(){
        return hasBeenWalked;
    }

    public void barking(){
        barking = true;
        System.out.println("Woof Woof");
    }

    public boolean isBarking(){
        return barking;
    }
}
