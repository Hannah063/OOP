package Project;
import java.util.Scanner;
import java.util.ArrayList;

public class ManagerCustomer {
    private ArrayList<Customer> listCustomer;

    public ManagerCustomer(){
        this.listCustomer = new ArrayList<Customer>();
    }
    public ManagerCustomer(ArrayList<Customer> listCustomer){
        this.listCustomer = listCustomer;
    }
    //in danh sách khách hàng
    public boolean DisplayList(){
        if (listCustomer.size() > 0){
            for (Customer customer : listCustomer){
                System.out.println(customer);
            }
            return true;
        }
        return false;
    }
    //đăng nhập
    public Customer Login() {
        Customer c1 = null;
        int n = 0;
        Scanner input = new Scanner(System.in);
        while (n != 1) {
            System.out.println("*****************DANG NHAP***************");
            System.out.print("Nhap so dien thoai: ");
            String num = input.next();
            System.out.print("Nhap mat khau: ");
            String pass = input.next();
            for (Customer customer : listCustomer) {
                if (customer.getPhoneNumber().equals(num) && customer.getPassWord().equals(pass)) {
                    System.out.println(customer.getName() + " da dang nhap thanh cong");
                    c1 = customer;
                    n = 1;
                    break;
                }
            }
            if (c1 == null) {
                System.out.println("Khong tim thay tai khoan nay.Bam so bat ky de dang nhap lai\nNeu chua co tai khoan, bam 1 de dang ky");
                System.out.print("Moi nhap: ");
                n = input.nextInt();
            }
        }
        return c1;
    }
    //thêm khách hàng vào danh sách
    public void addCustomer(Customer customer){
        listCustomer.add(customer);
    }
    
    public Customer searchCustomerID(int id){
        for (Customer customer : listCustomer){
            if(customer.getId() == id){
                return customer;
            }
        }
        System.out.println("Khong co ID nay");
        return null;
    }
}
