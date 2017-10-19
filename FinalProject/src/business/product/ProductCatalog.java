/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mwhai_000
 */
public class ProductCatalog {
    
    private List<Product> productList;

    public ProductCatalog() {
    productList = new ArrayList<Product>();
    }
    

    public List<Product> getProductCatalog() {
        return productList;
    }
    
    
    public Product addProduct(){
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productList.remove(p);
    }
    
    public Product searchProduct(int id){
        for (Product product : productList) {
            if(product.getModelNumber()==id){
                return product;
            }
        }
        return null;
    }
}
