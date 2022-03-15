public class Cat extends Animal{

    public boolean hasPlayedWith;
    public boolean feed;

    public Cat(String name, int age, boolean vaccinated, boolean sleeping, boolean hasPlayedWith, boolean feed){
        super(name, age, vaccinated, sleeping);
        this.hasPlayedWith = hasPlayedWith;
        this.feed = feed;
    }

    public void play(){
        hasPlayedWith = true;
        System.out.println("Yay! I have been played with.");
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public void feed(){
        feed = true;
        System.out.println("I have been fed!");
    }

    public boolean isFeed() {
        return feed;
    }
}
