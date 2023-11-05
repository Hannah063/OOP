package Project;
import java.util.Scanner;
public abstract class Products{
    protected static int nextid = 1;
    protected int id = nextid++;
    protected String name;
    protected double size;
    protected String brandName;
    protected double price;
    protected int quantity;

    public Products( ){}
    public Products(int id,String name,String brandName,double size,double price, int quantity){
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }
    public double getSize(){
        return size;
    }
    public void setSize(double size){
        this.size = size;
    }
    public int getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public  void  inputInfor(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        this.name = input.nextLine();
        System.out.print("Nhap thuong hieu: ");
        this.brandName = input.nextLine();
        System.out.print("Nhap kich co: ");
        this.size = input.nextDouble();
        System.out.print("Nhap gia ca: ");
        this.price = input.nextDouble();
        System.out.print("Nhap so luong: ");
        this.quantity = input.nextInt();
        System.out.println("--------------------------------------------------------------");
    }

    public String toString() {
            return String.format("%8s%40s%20s%10s%15s%10s |",id,name,brandName,size,price,quantity);
    }
}
