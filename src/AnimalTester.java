public class AnimalTester {
    public static void main(String[] args) {
        System.out.println("Animal Test");
        Animal myAnimal = new Animal("Spots", 4, true, false);
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.isSleeping());
        System.out.println(myAnimal.isVaccinated());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.sleep();
        System.out.println(myAnimal.isSleeping());
        System.out.println("===============================================");

        System.out.println("Dog Test");
        Dog myDog = new Dog("Sage", 10, true, false, false, false);
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.isVaccinated());
        System.out.println(myDog.isSleeping());
        System.out.println(myDog.isHasBeenWalked());
        System.out.println(myDog.isBarking());
        myDog.barking();
        myDog.walk();
        System.out.println(myDog.isHasBeenWalked());
        System.out.println(myDog.isBarking());
        System.out.println("===============================================");

        System.out.println("Cat Test");
        Cat myCat = new Cat("Whiskers", 2, false, true, false, false);
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println(myCat.isVaccinated());
        System.out.println(myCat.isSleeping());
        System.out.println(myCat.isFeed());
        System.out.println(myCat.isHasPlayedWith());
        myCat.feed();
        myCat.play();
        System.out.println(myCat.isFeed());
        System.out.println(myCat.isHasPlayedWith());
    }
}
