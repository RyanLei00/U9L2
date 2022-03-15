public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean sleeping;

    public Animal(String name, int age, boolean vaccinated, boolean sleeping){
        this.name = name;
        this.sleeping = sleeping;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public void adopt(){
        System.out.println("Nice! I have been adopted!");
    }

    public void feed(){
        System.out.println("Mmm... I was fed.");
    }

    public void sleep(){
        sleeping = true;
        System.out.println("Zzz... I have been put to sleep");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public boolean isSleeping() {
        return sleeping;
    }
}
