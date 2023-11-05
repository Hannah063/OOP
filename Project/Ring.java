package Project;

public class Ring extends Products{
    public Ring(){
        super();
    }

    public Ring(int id,String name, String brandName,double size,double price, int quantity){
        super(id, name, brandName, size, price, quantity);
    }

    @Override
    public String toString() {
        return "Nhan     -- "+super.toString();
    }
}
