/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author ektasharma
 */
    public class Bill {

    private int billNumber;
    private Date dateOfSale;
    private ArrayList<Product> products;

    
    /**
     *
     */
    public Bill() {
        generateBillNumber();
        generateDate();
        products = new ArrayList<Product>();
    }
    
    /**
     * Generate bill number.
     */
    private void generateBillNumber() {
        Random rand = new Random();
        this.billNumber = rand.nextInt(50) + 1;
    }
    
    /**
     * Generate system date.
     */
    private void generateDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        this.dateOfSale = date;
    }

    /**
     *
     * @return
     */
    public int getBillNumber() {
        return billNumber;
    }
    
    /**
     *
     * @param billNumber
     */
    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    /**
     *
     * @return
     */
    public Date getDateOfSale() {
        return dateOfSale;
    }

    /**
     *
     * @param dateOfSale
     * @throws NullPointerException
     */
    public void setDateOfSale(Date dateOfSale) throws NullPointerException {
        this.dateOfSale = dateOfSale;
    }
    
    /**
     *
     * @param p
     */
    public void addProduct(Product p) {
        this.products.add(p);
    }
    
    /**
     * 
     * @return ArrayList of products.
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * 
     * @return totalSubTotalAmount
     */
   public double calSubTotalAmount(){
        double totalSubAmount = 0;
        for(Product p: products) {
         totalSubAmount += (p.getProductPrice() * p.getQuantity());
       }
        return totalSubAmount;
    }
   
   /**
    * 
    * @return amount after adding 13 % tax
    */
    public double amountAfterAddingTax(){
        return calSubTotalAmount() * 1.13;
    }
   
    /**
     * 
     * @return BillPurchase,dateOfSale.
     */
    
    @Override
    public String toString() {
        return "BillPurchase{" + "billNumber=" + billNumber + ", dateOfSale=" + dateOfSale + '}';
    }


}
