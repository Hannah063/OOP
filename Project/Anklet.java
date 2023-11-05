package Project;

public class Anklet extends Products{
    public Anklet(){
        super();
    }

    public Anklet(int id,String name, String brandName,double size,double price, int quantity){
        super(id, name, brandName, size, price, quantity);
    }

    @Override
    public String toString() {
        return "Lac chan -- "+super.toString();
    }
}
