/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author ektasharma
 */
public class Product {
    private String productCode;
    private String productName;
    private double productPrice;
    private int quantity;
    
    /**
     *
     */
    public Product() {
    }

    /**
     *
     * @param productCode
     * @param productName
     * @param productPrice
     * @param quantity
     */
    public Product(String productCode, String productName, double productPrice, int quantity){
        setProductCode(productCode);
        setProductName(productName);
        setProductPrice(productPrice);
        setQuantity(quantity);
    }
    
    /**
     *
     * @return
     */
    public String getProductCode() {
        return productCode;
    }
       
    /**
     *
     * @param productCode
     * @throws NullPointerException
     */
    public void setProductCode(String productCode) throws NullPointerException {
        if (productCode==null || productCode.trim().length() == 0) {
            throw new NullPointerException("Product code is null");
        } else {
            this.productCode = productCode;
        }
    }

    /**
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     *
     * @param productName
     * @throws NullPointerException
     */
    public void setProductName(String productName) throws NullPointerException {
        if (productName == null || productName.equals("")) {
            throw new NullPointerException("Product name is null");
        } else {
            this.productName = productName;
        }
    }

    /**
     *
     * @return
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     *
     * @param productPrice
     * @throws ArithmeticException
     */
    public void setProductPrice(double productPrice) throws ArithmeticException {
        if (productPrice == 0) {
            throw new ArithmeticException("Product price is zero ");
        } else if (productPrice < 0) {
            throw new ArithmeticException("Product price is less than zero ");
        } else {
            this.productPrice = productPrice;
        }
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     * @throws ArithmeticException
     */
    public void setQuantity(int quantity) throws ArithmeticException {
        if (quantity == 0) {
            throw new ArithmeticException("Quantity is zero ");
        } else if (quantity < 0) {
            throw new ArithmeticException("Quantity is less than zero ");
        } else {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return quantity + " " + productCode + " " + productName + " " + productPrice*quantity;
    }
    
    
      
}
