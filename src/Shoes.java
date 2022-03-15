public class Shoes {
    private String color;
    private int size;
    private int price;

    public Shoes(String color, int size, int price){
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void wear(int steps){
        System.out.println("You wore these shoes for " + steps + " steps");
    }

    public void broken(){
        System.out.println("Oh no! Your shoes broke");
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
