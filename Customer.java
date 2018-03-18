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
public class Customer {

    Scanner sc = new Scanner(System.in);

//fields
    Person person;
    ContactInfo contactInfo;
    CreditCard creditCard;
    int customerSince;

//constructors
    public Customer(Person person, ContactInfo contactInfo, CreditCard creditCard, int customerSince) {
        setPersonInfo(person);
        setContactInfo(contactInfo);
        setCreditCardInfo(creditCard);
        setCustomerSinceInfo(customerSince);

    }

    public Customer() {
        this.person = Person.creatNewPerson();
        this.contactInfo = ContactInfo.creatNewContactInfo();
        this.creditCard = CreditCard.creatNewCreditCard();
    }

//methods
    public void setPersonInfo(Person person) {
        this.person = person;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setCreditCardInfo(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setCustomerSinceInfo(int customerSince) {
        this.customerSince = customerSince;
    }    
    
    public Person getPersonInfo( ) {
        return person;
    }

    public ContactInfo getContactInfo( ) {
        return contactInfo;
    }

    public CreditCard getCreditCardInfo( ) {
        return creditCard;
    }

    public int getCustomerSinceInfo( ) {
        return customerSince;
    }
    

    @Override
    public String toString() {
        String printCustomerInfo
                = person.toString() + "\n"
                + contactInfo.toString() + "\n"
                + creditCard.toString() + "\n"
                + "Customer Since: " + customerSince + "\n";

        return printCustomerInfo;
    }

    public boolean equals(Customer customer) {

        if ((customer == null) && !(customer instanceof Customer)) {
            return false;
        } else if ((customer.person.getSsn()) == (this.person.getSsn())) {
            return true;
        } else {
            return false;
        }
    }

}
