/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ektasharma
 */
public class ProductDB {

    private static String fileName = "productFile.txt";

    /**
     *  Checks whether product with this productCode exists or not.
     * @param productCode
     * @return
     * @throws Exception
     */
    public Product productExists(String productCode) throws Exception {
        ArrayList<Product> productList = getProducts();
        Product foundProduct = null;
        
        for (Product product: productList) {
            if (product.getProductCode().equalsIgnoreCase(productCode)) {
                foundProduct = product;
                break;
            }
        }
        
       return foundProduct;
    }

    /**
     * Read from productFile.text
     * @return
     * @throws Exception
     */
    public ArrayList<Product> getProducts() throws Exception {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        ArrayList<Product> productList = new ArrayList<Product>();

        // Read data from a file
        while (input.hasNext()) {
            Product p = new Product();
            String productCode = input.nextLine();  // ['SO', 'Soap', '4.99']
            String productName = input.nextLine();
            double productPrice = Double.parseDouble(input.nextLine());

            p.setProductCode(productCode);
            p.setProductName(productName);
            p.setProductPrice(productPrice);

            productList.add(p);
        }

        input.close();

        return productList;
    }
}
