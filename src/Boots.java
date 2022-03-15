public class Boots extends Shoes {

    private String soleSize;

    public Boots(String color, int size, int price, String soleSize){
        super(color, size, price);
        this.soleSize = soleSize;
    }

    public void raining(){
        System.out.println("It is raining outside. Better put on my boots!");
    }

    public String getSoleSize() {
        return soleSize;
    }
}
