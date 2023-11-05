package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class ManagerProduct {
    ArrayList <Products> listProducts;

    public ManagerProduct(){
        this.listProducts = new ArrayList<Products>();
    }
    public ManagerProduct(ArrayList <Products> listProduct){
        this.listProducts = listProduct;
    }

    //đầu vào
    public void existProducts() {
        listProducts.add(new Anklet(Products.nextid, "Lac chan nu bac cao cap", "Mirin", 1.2, 130500, 10));
        listProducts.add(new Anklet(Products.nextid, "Lac chan nu bac titan", "Hermes", 1.2, 120500, 10));
        listProducts.add(new Anklet(Products.nextid, "Lac chan bac", "Flat Circle", 1.2, 120000, 10));
        listProducts.add(new Anklet(Products.nextid, "Lac chan titan", "Diamond Line", 1.2, 150500, 10));

        listProducts.add(new Bangle(Products.nextid, "Lac tay Daniel Wellington", "Elan Unity", 1.0, 120000, 10));
        listProducts.add(new Bangle(Products.nextid, "Lac tay co bon la", "Fidelia", 1.0, 120000, 10));
        listProducts.add(new Bangle(Products.nextid, "Lac tay cao cap", "Julius", 1.0, 120000, 10));
        listProducts.add(new Bangle(Products.nextid, "Lac tay bac", "Basic Twist", 1.0, 120000, 10));
    
        listProducts.add(new Ring(Products.nextid, "Nhan xoan tron", "Basic", 1.0, 120000, 10));
        listProducts.add(new Ring(Products.nextid, "Nhan bac tim", "Gypsy", 1.0, 120000, 10));
        listProducts.add(new Ring(Products.nextid, "Nhan bac", "Midi gems", 1.0, 120000, 10));
        listProducts.add(new Ring(Products.nextid, "Nhan doi", "Hieu Minh", 1.0, 120000, 10));
    
        listProducts.add(new Earring(Products.nextid, "Bong tai bac Raindrop", "Juzstyle", 1.0, 120000, 10));
        listProducts.add(new Earring(Products.nextid, "Bong tai hinh chiec la", "KenTa", 1.0, 120000, 10));
        listProducts.add(new Earring(Products.nextid, "Bong tai hinh trai tim", "Tojoro", 1.0, 120000, 10));
        listProducts.add(new Earring(Products.nextid, "Bong tai tiny", "Mango", 1.0, 120000, 10));
    
        listProducts.add(new Necklace(Products.nextid, "Vong co mat doi canh thien than", "Miaoya", 1.0, 120000, 10));
        listProducts.add(new Necklace(Products.nextid, "Vong co mat hinh luc giac", "CC", 1.0, 120000, 10));
        listProducts.add(new Necklace(Products.nextid, "Vong co", "Swarovski", 1.0, 120000, 10));
        listProducts.add(new Necklace(Products.nextid, "Vong co Aquamarine tho", "Veronica", 1.0, 120000, 10));
    }
    //thêm sản phẩm
    public void addProduct(Products product){
        listProducts.add(product);
    }
    // Tìm kiếm tất cả sản phẩm dựa trên kiểu class
    public void searchByType(Class<?> type) {
        for (Products product : listProducts) {
            if (type.isInstance(product)) {
                System.out.println(product);
            }
        }
    }
    //tìm kiếm tất cả sản phẩm
    public void searchProducts(){
        ManagerProduct.print();
        ManagerProduct.println();
        
       
        for (Products product : listProducts) {
            System.out.println(product);
        }
        ManagerProduct.print();
    }
    //tìm kiếm sản phẩm theo id
    public Products searchID(int id){
        for (Products product : listProducts){
            if(product.getId() == id){
                ManagerProduct.println();
                return product;
            }
        }
        return null;
    }
    //tìm kiếm sản phẩm theo tên
    public Products searchName(String name){
        for (Products product : listProducts){
            if (product.getName().trim().equals(name.trim())) {
                ManagerProduct.println();
                return product;
            }//moi sua
        }
        return null;
    }
    //xóa sản phẩm theo id
    public void removeID(int id){
        ManagerProduct.print();
        ManagerProduct.println();
        ManagerProduct.print();
        Iterator<Products> iterator = listProducts.iterator();
        while (iterator.hasNext()) {
            Products product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                System.out.println("Ban da xoa san pham " + product.getName());
                break; 
            }
        }
    }
    //sắp xếp danh sách các sản phẩm cùng kiểu theo giá
    public void sortByType(Class<?> type) {
        ManagerProduct.print();
        ManagerProduct.println();
        // ManagerProduct.print();
        List<Products> productsOfType = new ArrayList<>();
        //phân loại kiểu
        for (Products product : listProducts) {
            if (type.isInstance(product)) {
                productsOfType.add(product);
            }
        } 
        Collections.sort(productsOfType, new Comparator<Products>() {
            @Override
            public int compare(Products p1, Products p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        // in 
        
        for (Products product : productsOfType) {
            System.out.println(product);
        }
        ManagerProduct.print();
    }
    //sắp xếp tất cả sản phẩm theo giá
    public void sortProducts() {
        ManagerProduct.print();
        ManagerProduct.println();
        Collections.sort(listProducts, new Comparator<Products>() {
            @Override
            public int compare(Products p1, Products p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        // in 
        for (Products product : listProducts) {
            System.out.println(product);
        } ManagerProduct.print();
      
    }  
    public static void print(){
       for(int i=0;i<116;i++){
            System.out.print("_");}
        System.out.println(" ");
    }

    public static void println(){
        System.out.printf("\n%5s%7s%40s%20s%10s%15s%10s |\n\n","Loai san pham","ID","Ten san pham","Ten thuong hieu","Kich co","Gia ca","So luong");}
   
}
