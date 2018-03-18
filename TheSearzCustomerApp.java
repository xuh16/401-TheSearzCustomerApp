package thesearzcustomerapp;

import PauloAPI.DirectMailPromotions;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author xuhai
 */
public class TheSearzCustomerApp {

    public static void main(String[] args) throws IOException {
        new TheSearzCustomerApp();
    }

    private int numberOfCurrentCustomers = 4;
    private int numberOfInfoFromCustomers = 12;
    Customer[] initialCustomers = new Customer[numberOfCurrentCustomers];
//    private String[] emailList = new String[numberOfCurrentCustomers];
//    private int numberOfPersonalInfo = 4;
//    private int numberOfContactInfo = 3;
//    private int numberOfCreditCardInfo = 4;
//    private int numberOfCustomerinfo = 1;

    public TheSearzCustomerApp() throws IOException {
        Scanner sc = new Scanner(System.in);
        initialCustomers = retrieveInitialCustomers("InitialCustomers.txt");
        boolean cont = true;
        while (cont) {

            System.out.println("Please Choose Option");
            System.out.println("    1: List Current Customers");
            System.out.println("    2: Add Customer to out Direct Mail");
            System.out.println("    3: Create a New Customer ");
            System.out.println("    4: Exit");

            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    printInitialCustomers(initialCustomers);
                    break;
                case 2:
                    addCustomerToMail();
                    break;
                case 3:
                    creatNewCustomer();
                    break;
                case 4:
                    cont = false;
            }
        }

    }

    public Customer[] retrieveInitialCustomers(String file) throws IOException {
        Scanner fileInput = new Scanner(new File(file));
        String oneCustomer;
        for (int i = 0; i < numberOfCurrentCustomers; i++) {

            oneCustomer = fileInput.nextLine();
            String[] parts = oneCustomer.split(",");
            Person person = new Person(parts[0], parts[1], Integer.parseInt(parts[2].trim()), Integer.parseInt(parts[3].trim()));
            ContactInfo contactInfo = new ContactInfo(parts[4].trim(), parts[5], parts[6]);
            CreditCard creditCard = new CreditCard(parts[7], Integer.parseInt(parts[8].trim()), Integer.parseInt(parts[9].trim()), Integer.parseInt(parts[10].trim()));
            int customerSince = Integer.parseInt(parts[11].trim());
            initialCustomers[i] = new Customer(person, contactInfo, creditCard, customerSince);

        }
        return initialCustomers;
    }

    public void printInitialCustomers(Customer[] initialCustomers) {
        int customerIndex = 1;
        for (Customer i : initialCustomers) {
            System.out.printf("**** Customer #%s *************** \n", customerIndex);
            System.out.println(i);
            customerIndex++;
        }
    }

    public void addCustomerToMail() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Customer email to be added to the Direct Mail: ");
        int customerToAdd = scan.nextInt();
        DirectMailPromotions.addEmailToTheDirectMail(initialCustomers[customerToAdd - 1]);
        System.out.print("\n");
        DirectMailPromotions.sendPromotionViaEmail();
        System.out.print("\n");

    }

    public void creatNewCustomer() {

        Customer newCustomer = new Customer();
        System.out.print(newCustomer);
        for (Customer i : initialCustomers) {

            if (i.equals(newCustomer)) {
                System.out.println("\n\nCustomer has been found in Searz database as shown below: \n");
                System.out.println(i);
            } else {
                initialCustomers = addNewCustomer(initialCustomers, newCustomer);
                break;
            }
        }

    }

    public Customer[] addNewCustomer(Customer[] initialCustomers, Customer newCustomer) {
        Customer[] customer = new Customer[(initialCustomers.length + 1)];
        System.arraycopy(initialCustomers, 0, customer, 0, initialCustomers.length);
        customer[initialCustomers.length] = newCustomer;
        return customer;
    }

}
