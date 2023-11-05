package Project;

public class Necklace extends Products {
    public Necklace(){
        super();
    }

    public Necklace(int id,String name, String brandName,double size,double price, int quantity){
        super(id, name, brandName, size, price, quantity);
    }

    @Override
    public String toString() {
        return "Vong co  -- "+super.toString();
    }
    
}
