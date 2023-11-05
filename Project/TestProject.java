package Project;
import java.util.Scanner;

public class TestProject {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ManagerProduct product = new ManagerProduct();
        ManagerCustomer customer = new ManagerCustomer();
        ManagerRateRiews rateReview = new ManagerRateRiews();
        Order order = new Order();
        ShoppingCart cart = new ShoppingCart();
        //Sản phẩm
        product.existProducts();
        int m = 0;
        do{
        //MENU
        System.out.println("Chao mung den voi ANNY shop - chuyen trang suc bac");
        System.out.println("Ban la ai ?\n\t1. Administrator\n\t2. Khach hang");
        System.out.print("   Vui long nhap lua chon: ");
        int number = input.nextInt();
        //Admintrator
        if (number == 1){
            Administrator.Login();
            int choose = 0;
            do{
                //Menu admin
                System.out.println("----------------MENU----------------");
                System.out.println("  1. Xem danh sach khach hang\n"
                                + "  2. Xem danh sach san pham\n"
                                + "  3. Them san pham\n"
                                + "  4. Xoa san pham\n"
                                + "  5. Tim kiem san pham\n"
                                + "  6. Sap xep san pham theo gia\n"
                                + "  7. Thay doi thong tin Admintrator\n"
                                + "  8. Xem danh gia cua khach hang\n"
                                + "  9. Dang xuat\n"
                                + "  0. Thoat khoi chuong trinh");
                System.out.print("Vui long nhap lua chon: ");
                choose = input.nextInt();
                if (choose == 1){//Xem danh sach khach hang
                    boolean a = customer.DisplayList();
                    if(a == false){
                        System.out.println("Chua co khach hang dang ky tai khoan!!!");
                    }
                }else if (choose == 2){//Xem danh sach san pham
                    product.searchProducts();
                }else if (choose == 3){//Them san pham
                    int b = 1;
                    do{
                        System.out.println("Ban muon them san pham nao?");
                        System.out.println("  1. Bong tai\n"
                                        + "  2. Lac tay\n"
                                        + "  3. Lac chan\n"
                                        + "  4. Vong co\n"
                                        + "  5. Nhan\n");
                        System.out.print("Vui long nhap lua chon: ");
                        b = input.nextInt();
                        if (b < 1 || b > 5){
                            System.out.println("Ban nhap sai lua chon!!!");
                        }
                    }while(b < 1 || b > 5);
                    System.out.print("Nhap so luong san pham can them: ");
                    int n = input.nextInt();
                    if (b == 1){//Earring
                        System.out.println("BONG TAI");
                        for (int i = 0; i < n; i++){
                            Earring earring = new Earring();
                            earring.inputInfor();
                            product.addProduct(earring);
                        }
                    }else if (b == 2){//Bangles
                        System.out.println("LAC TAY");
                        for (int i = 0; i < n; i++){
                            Bangle bangle = new Bangle();
                            bangle.inputInfor();
                            product.addProduct(bangle);
                        }
                    }else if (b == 3){//Anklets
                        System.out.println("LAC CHAN");
                        for (int i = 0; i < n; i++){
                            Anklet anklet = new Anklet();
                            anklet.inputInfor();
                            product.addProduct(anklet);
                        }
                    }else if (b == 4){//Necklaces
                        System.out.println("VONG CO");
                        for (int i = 0; i < n; i++){
                            Necklace necklace = new Necklace();
                            necklace.inputInfor();
                            product.addProduct(necklace);
                        }
                    }else if (b == 5){//Rings
                        System.out.println("NHAN");
                        for (int i = 0; i < n; i++){
                            Ring ring = new Ring();
                            ring.inputInfor();
                            product.addProduct(ring);
                        }
                    }
                    input.nextLine();
                    System.out.println("Ban co muon xem lai danh sach san pham sau khi thay doi?");
                    System.out.print("Nhap y de xem, nhan bat ky de tro ve menu: ");
                    String ch = input.nextLine();
                    if (ch.trim().equals("y") || ch.trim().equals("Y")){
                        product.searchProducts();
                    }
                }else if (choose == 4){//Xoa san pham
                    product.searchProducts();
                    System.out.print("Nhap ID san pham ban muon xoa: ");
                    int d = input.nextInt();
                    product.removeID(d);
                }else if (choose == 5){//Tim kiem san pham
                    int i = 0;
                    do {
                        System.out.println("Ban muon tim kiem: \n  1. Theo ten\n  2. Theo ID\n  3. Theo loai san pham");
                        System.out.print("Moi nhap: ");
                        i = input.nextInt();
                        if (i < 1 || i > 3){
                            System.out.println("Ban nhap sai lua chon!!!");
                        }
                    } while (i < 1 || i > 3);
                    if (i == 1){
                        input.nextLine();
                        System.out.print("Nhap ten san pham: ");
                        String ten = input.nextLine();
                        Products foundProduct = product.searchName(ten);
                        if (foundProduct != null) {
                            System.out.println(foundProduct.toString());
                        }else {
                            System.out.println("Khong tim thay san pham.");
                        }
                    }else if(i == 2){
                        System.out.print("Nhap ID san pham: ");
                        int g = input.nextInt();
                        Products foundProduct = product.searchID(g);
                        if (foundProduct != null) {
                            System.out.println(foundProduct.toString());
                        } else {
                            System.out.println("Khong tim thay san pham.");
                        }
                    }else if(i == 3){
                        int h = 0;
                        do {
                            System.out.println("Ban tim kiem loai san pham nao?");
                            System.out.println("  1. Bong tai\n"
                                            + "  2. Lac tay\n"
                                            + "  3. Lac chan\n"
                                            + "  4. Vong co\n"
                                            + "  5. Nhan\n");
                            System.out.print("Vui long nhap lua chon: ");
                            h = input.nextInt();
                            if (h < 1 || h > 5){
                                System.out.println("Ban nhap sai lua chon!!!");
                            }
                        } while (h < 1 || h > 5);
                        if (h == 1){
                            product.searchByType(Earring.class);
                        }else if(h == 2){
                            product.searchByType(Bangle.class);
                        }else if(h == 3){
                            product.searchByType(Anklet.class);
                        }else if(h == 4){
                            product.searchByType(Necklace.class);
                        }else if(h == 5){
                            product.searchByType(Ring.class);
                        }
                    }
                }else if (choose == 6){//Sap xep san pham
                    int w = 0;
                    do {
                        System.out.println("Ban muon sap xep: \n  1. Tat ca cac san pham\n  2. Theo loai san pham");
                        System.out.print("Moi nhap: ");
                        w = input.nextInt();
                        if (w != 1 && w != 2){
                            System.out.println("Ban nhap sai lua chon");
                        }
                    } while (w != 1 && w != 2);
                    if (w == 1){
                        product.sortProducts();
                    }else if(w == 2){
                        int h = 0;
                        do {
                            System.out.println("Ban sap xep loai san pham nao?");
                            System.out.println("  1. Bong tai\n"
                                            + "  2. Lac tay\n"
                                            + "  3. Lac chan\n"
                                            + "  4. Vong co\n"
                                            + "  5. Nhan\n");
                            System.out.print("Vui long nhap lua chon: ");
                            h = input.nextInt();
                            if (h < 1 || h > 5){
                                System.out.println("Ban nhap sai lua chon!!!");
                            }
                        } while (h < 1 || h > 5);
                        if (h == 1){
                            product.sortByType(Earring.class);
                        }else if(h == 2){
                            product.sortByType(Bangle.class);
                        }else if(h == 3){
                            product.sortByType(Anklet.class);
                        }else if(h == 4){
                            product.sortByType(Necklace.class);
                        }else if(h == 5){
                            product.sortByType(Ring.class);
                        }
                    }
                }else if (choose == 7){//Thay doi thong tin 
                    System.out.println("Thong tin cu cua ban: " + Administrator.display());
                    int l = 0;
                    do {//mới sửa
                        System.out.println("Ban muon thay doi: \n  1. Doi so dien thoai\n  2. Doi mat khau\n  0. Tro ve menu");
                        System.out.print("Moi nhap: ");
                        l = input.nextInt();
                        if(l == 0){
                            break;
                        }
                        if (l != 1 && l != 2){
                           System.out.println("Ban nhap sai lua chon!!!"); 
                        }
                    } while (l != 1 && l != 2);
                    if (l == 0){//moi sua
                        continue;
                    }
                    if (l == 1){
                        Administrator.setPhoneNumber();
                    }else if(l == 2){
                        Administrator.setPassWord();
                    }
                }else if (choose == 8){//Xem danh gia cua khach hang
                    boolean a = customer.DisplayList();
                    if (a == true){
                        System.out.print("Vui long nhap ID khach hang ban muon xem: ");
                        int k = input.nextInt();
                        Customer c = new Customer();
                        c = customer.searchCustomerID(k);
                        if (c != null){
                            rateReview.printRateReview(c);
                        }
                    }else{
                        System.out.println("Chua co khach hang!!!");
                    } 
                }else if (choose == 0){//Thoat khoi chuong trinh
                    m = 1;
                    choose = 9;
                    System.out.println("Ban da thoat khoi chuong trinh!!!");
                }else if (choose == 9){//đăng xuất
                    System.out.println("Ban da dang xuat tai khoan!!!");
                }else{//nhập sai
                    System.out.println("Ban nhap sai lua chon!!!");
                }
            }while(choose != 9);
        //Customer
        }else if(number == 2){
            Customer c1 = new Customer();
            int choose = 0;
            int a = 0;
            do {
                System.out.print("1. Dang nhap\n2. Dang ky\nVui long lua chon: ");
                a = input.nextInt();
                if(a == 1){
                    c1 = customer.Login();
                    if (c1 == null){
                        Customer c = new Customer();
                        c.Register();
                        customer.addCustomer(c);
                        c1 = c;
                        System.out.println("Ban da dang ky thanh cong!!!");
                    }
                }else if(a == 2){
                    c1.Register();
                    customer.addCustomer(c1);
                    System.out.println("Ban da dang ky thanh cong!!!");
                }
                if(a != 2 && a != 1){
                    System.out.println("Ban nhap sai lua chon!!!");
                }
            } while (a != 2 && a != 1);
            do{
                //Menu customer
                System.out.println("----------------MENU----------------");
                System.out.println("1. Thay doi thong tin\n"
                                + "2. Tim kiem san pham\n"
                                + "3. Xem gio hang\n"
                                + "4. Xem cac don hang da mua\n"
                                + "5. Danh gia cac san pham da mua\n"
                                + "6. Dang xuat\n"
                                + "0. Thoat khoi chuong trinh");
                System.out.print("   Vui long nhap lua chon: ");
                choose = input.nextInt();
                if (choose == 1){//thay doi thong tin
                    System.out.println("Thong tin cu cua ban: " + c1.toString());
                    int l = 0;
                    do {
                        System.out.println("Ban muon thay doi: \n  1. Doi ten\n  2. Doi so dien thoai\n  3. Doi mat khau\n  4. Doi email\n  0. Tro ve menu");
                        System.out.print("Moi nhap: ");
                        l = input.nextInt();
                        if (l == 0){
                            break;
                        }
                        if (l < 0 || l > 4){
                            System.out.println("Ban nhap sai lua chon!!!");
                        }
                    } while (l < 0 || l > 4);
                    if (l == 0){
                        continue;
                    }
                    if (l == 1){//tên
                        input.nextLine();
                        System.out.print("Nhap ten moi: ");
                        String t = input.nextLine();
                        c1.setName(t);
                    }else if(l == 2){//so dien thoai
                        System.out.print("Nhap so dien thoai moi: ");
                        String t = input.next();
                        c1.setPhoneNumber(t);
                    }else if(l == 3){//Doi mat khau
                        System.out.print("Nhap mat khau moi: ");
                        String t = input.next();
                        c1.setPassWord(t);
                    }else if(l == 4){//Doi email
                        System.out.print("Nhap email moi: ");
                        String t = input.next();
                        c1.setEmai(t);
                    }
                    System.out.println("Thong tin moi cua ban: " + c1.toString());
                }else if(choose == 2){//tim kiem san pham
                    int nm = 0;
                    do {
                        System.out.println("Ban muon tim kiem theo:\n  1. Theo loai san pham\n  2. Theo ten san pham\n  3. Tat ca cac san pham\n  0. Tro ve menu");
                        System.out.print("Moi nhap: ");
                        nm = input.nextInt();
                        if (nm == 0){
                            break;
                        }else if (nm < 1 || nm > 3){
                            System.out.println("Ban nhap sai lua chon");
                        }
                    } while (nm < 1 || nm > 3);
                    if (nm == 0){
                        continue;
                    }
                    Products foundProduct;
                    if (nm == 1){
                        int h = 0;
                        do {
                            System.out.println("Ban tim kiem loai san pham nao?");
                            System.out.println("  1. Bong tai\n"
                                            + "  2. Lac tay\n"
                                            + "  3. Lac chan\n"
                                            + "  4. Vong co\n"
                                            + "  5. Nhan");
                            System.out.print("Vui long nhap lua chon: ");
                            h = input.nextInt();
                            if (h < 1 || h > 5){
                                System.out.println("Ban nhap sai lua chon!!!");
                            }
                        } while (h < 1 || h > 5);
                        input.nextLine();
                        System.out.println("Ban co muon sap xep san pham tang theo gia tien khong? ");
                        System.out.print("Nhap y de xem, nhan bat ky de bo qua: ");
                        String ch = input.nextLine();
                        if (h == 1){
                            if (ch.trim().equals("y") || ch.trim().equals("Y")){
                                product.sortByType(Earring.class);
                            }else{
                                product.searchByType(Earring.class);
                            }
                        }else if(h == 2){
                            if (ch.trim().equals("y") || ch.trim().equals("Y")){
                                product.sortByType(Bangle.class);
                            }else{
                                product.searchByType(Bangle.class);
                            }
                        }else if(h == 3){
                            if (ch.trim().equals("y") || ch.trim().equals("Y")){
                                product.sortByType(Anklet.class);
                            }else{
                                product.searchByType(Anklet.class);
                            }
                        }else if(h == 4){
                            if (ch.trim().equals("y") || ch.trim().equals("Y")){
                                product.sortByType(Necklace.class);
                            }else{
                                product.searchByType(Necklace.class);
                            }
                        }else if(h == 5){
                            if (ch.trim().equals("y") || ch.trim().equals("Y")){
                                product.sortByType(Ring.class);
                            }else{
                                product.searchByType(Ring.class);
                            }
                        }
                    } else if (nm == 3){
                        input.nextLine();
                        System.out.println("Ban co muon sap xep san pham tang theo gia tien khong? ");
                        System.out.print("Nhap y de xem, nhan bat ky de bo qua: ");
                        String ch = input.nextLine();
                        if (ch.trim().equals("y") || ch.trim().equals("Y")){
                            product.sortProducts();
                        }else{
                            product.searchProducts();
                        }
                    }
                    input.nextLine();
                    System.out.print("Nhap ten san pham ban muon xem: ");
                    String ten = input.nextLine();
                    foundProduct = product.searchName(ten);
                    if (foundProduct != null) {
                        System.out.println(foundProduct.toString());
                    }else {
                        System.out.println("Khong tim thay san pham.");
                        continue;
                    }
                    int y = 0;
                    do {
                        System.out.println("Lua chon: \n  1. Mua san pham\n  2. Them vao gio hang\n  0. Tro ve menu");
                        System.out.print("Moi nhap: ");
                        y = input.nextInt();
                        if (y == 0){
                            break;
                        }else if (y != 1 && y != 2){
                            System.out.println("Ban nhap sai lua chon!!!");
                        }
                    } while (y != 1 && y != 2);
                    if (y == 0){
                        continue;
                    }
                    if (y == 1){//mua san pham
                        System.out.print("Nhap so luong ban muon mua: ");
                        int x = input.nextInt();
                        foundProduct.setQuantity(foundProduct.quantity - x);
                        input.nextLine();
                        System.out.print("Nhap dia chi cua ban: ");
                        String address = input.nextLine();
                        int pay = 0;
                        do {
                            System.out.println("Lua chon: \n  1. Tra bang tien mat\n  2. Tra bang the");
                            System.out.print("Nhap lua chon: ");
                            pay = input.nextInt();
                            if (pay != 1 && pay != 2){
                                System.out.println("Ban nhap sai lua chon!!!");
                            }
                        } while (pay != 1 && pay != 2);
                        String payment = null;
                        if (pay == 1){
                            payment = "Tra bang tien mat";
                        }else if(pay == 2){
                            payment = "Tra bang the";
                        }
                        String date = OrderItem.getDate();
                        double priceOrder = x * foundProduct .price;
                        OrderItem orderItems = new OrderItem(foundProduct, x, address, payment, date, priceOrder);
                        order.addOrder(c1, orderItems);
                        System.out.println(orderItems.toString());// in ra thong tin don hang
                    }else if (y == 2){//them vao gio hang
                        cart.addShoppingCart(c1, foundProduct);
                    }
                }else if(choose == 3){//xem gio hang
                    cart.printCart(c1);
                }else if(choose == 4){//xem cac don hang da mua
                    order.printOrder(c1);
                }else if(choose == 5){//Danh gia san pham da mua
                    order.printOrder(c1);
                    input.nextLine();
                    System.out.print("Nhap ten san pham ban muon danh gia: ");
                    String ten = input.nextLine();
                    Products foundProduct = product.searchName(ten);
                    System.out.println(foundProduct.toString());
                    if (foundProduct == null || order.findOrderItemByProduct(foundProduct) == null) {
                        System.out.println("San pham nay chua duoc mua.");
                        continue;
                    }
                    System.out.print("Nhap nhap xet cua ban ve san pham nay: ");
                    String review = input.nextLine();
                    int rate = 0;
                    do {
                        System.out.print("Nhap so sao danh gia (1 den 5): ");
                        rate = input.nextInt();
                        if (rate < 1 || rate > 5){
                            System.out.println("Ban nhap sai!!!");
                        }
                    } while (rate < 1 || rate > 5);
                    RateReview rateRe = new RateReview(foundProduct, rate, review);
                    rateReview.addRateReview(c1, rateRe);
                }else if(choose == 0){//Thoat khoi chuong trinh
                    m = 1;
                    choose = 9;
                }else if (choose == 6){//đăng xuất
                    System.out.println("Ban da dang xuat tai khoan!!!");
                    choose = 9;
                }else{//nhập sai
                    System.out.println("Ban nhap sai lua chon!!!");
                }
            }while(choose != 9);
        }
    }while(m == 0);
}
}
