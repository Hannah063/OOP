package Project;

public class Earring extends Products {
    public Earring(){
        super();
    }

    public Earring(int id,String name, String brandName,double size,double price, int quantity){
        super(id, name, brandName, size, price, quantity);
    }

    @Override
    public String toString() {
        return "Bong tai -- "+super.toString();
    }
}
