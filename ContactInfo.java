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
public class ContactInfo {

//fields
    private String email;
    private String phoneNumber;
    private String address;
//constructor

    public ContactInfo(String email, String phoneNumber, String address) {
        
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }
//methods

    public void setEmail(String email) {
        this.email = email;

    }

    public void setPhoneNumber(String num) {
        this.phoneNumber = num;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public static ContactInfo creatNewContactInfo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Email");
        String em = scan.nextLine();
        System.out.println("Please Enter The Phone Number");
        String pn = scan.nextLine();
        System.out.println("Please Enter The Home Adress");
        String ha = scan.nextLine();
        ContactInfo newContactInfo = new ContactInfo(em, pn, ha);
        return newContactInfo;
    }

    @Override
    public String toString() {
        String printContactInfo
                = "Email: " + email + "\n"
                + "Phone: " + phoneNumber + "\n"
                + "Home Address: " + address;
        return printContactInfo;

    }
}
