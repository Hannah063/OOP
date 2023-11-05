package Project;

public class Bangle extends Products {
    public Bangle(){
        super();
    }

    public Bangle(int id,String name, String brandName,double size,double price, int quantity){
        super(id, name, brandName, size, price, quantity);
    }

    @Override
    public String toString() {
        return "Lac tay  -- "+super.toString();
    }
}
