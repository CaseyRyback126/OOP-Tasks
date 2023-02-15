package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList(){
        return productList;
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public Product getProductByName(String name){
        for (Product product : productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Product product : productList){
            text.append(product.toString()).append("\n");
        }
        return text.toString();
    }
}