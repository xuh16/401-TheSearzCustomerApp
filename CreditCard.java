/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesearzcustomerapp;

import java.util.Scanner;

/**
 *
 * @author xuhai
 */
public class CreditCard {
 
//fields
    
    private String creditCompany;
    private int creditNumber;
    private int expYear;
    private int securityCode;

//constructor
    
    public CreditCard(String creditCompany, int creditNumber, int expYear, int securityCode){
        
        setCreditCompany(creditCompany);
        setCreditNumber(creditNumber);
        setExpYear(expYear);
        setSecurityCode(securityCode);
    
    
    }
    
//methods
         
    public void setCreditCompany(String company){
        this.creditCompany = company;
    } 
    public void setCreditNumber(int num){
        this.creditNumber = num;
    }
    public void setExpYear(int year){
        this.expYear = year;
    }
    public void setSecurityCode(int code){
        this.securityCode = code;
    }
    public String getCreditCompany(){
        return creditCompany;
        
    } 
    public int getCreditNumber(){
        return creditNumber;
    }
    public int getExpYear(){
        return expYear;
    }
    public int getSecurityCode(){
        return securityCode;
    }

    

      public static CreditCard creatNewCreditCard(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Credit Card Company");
        String cc = scan.nextLine();
        System.out.println("Please Enter The Credit Card  Number");
        int cn = scan.nextInt();
        System.out.println("Please Enter The Expiration Year");
        int ey = scan.nextInt();
        System.out.println("Please Enter The Security Code");
        int sc = scan.nextInt();
        CreditCard newCreditCard = new CreditCard(cc, cn, ey, sc);
        return newCreditCard;
    }
    
    @Override
    public String toString(){
        String printCreditCardInfo 
                = "Credit Card Company: " + creditCompany + "\n"
                + "Credit Number: " + creditNumber + "\n"
                + "Expiration Year: " + expYear + "\n"
                + "Security Code: " + securityCode;
        return printCreditCardInfo;
    }
}
