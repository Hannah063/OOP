package Project;
import java.util.Scanner;

public class Customer {
    protected static int count = 1;
    protected int id = count++;
    protected String name;
    protected String phoneNumber;
    protected String email;
    protected String passWord;
    static Scanner input = new Scanner(System.in);
    
    public Customer(){}
    public Customer(int id, String name, String phoneNumber, String email, String passWord){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passWord = passWord;
    }

    public void Register(){
        System.out.println("*****************DANG KY*****************");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.name = input.nextLine();
        System.out.print("Nhap email: ");
        this.email = input.nextLine();
        System.out.print("Nhap so dien thoai: ");
        this.phoneNumber = input.nextLine();
        System.out.print("Nhap mat khau: ");
        this.passWord = input.nextLine();
    }
    @Override
    public String toString(){
        return "ID: " + this.id + ", ten: " + this.name + ", so dien thoai: " + this.phoneNumber + ", email: " + this.email + ", mat khau: " + this.passWord;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmai(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    public String getPassWord(){
        return this.passWord;
    }
    public int getId(){
        return this.id;
    }
}