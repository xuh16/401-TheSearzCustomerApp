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
public class Person {

    Scanner sc = new Scanner(System.in);
//fields

    private String firstName;
    private String lastName;
    private int ssn;
    private int age;

//constructor
    public Person(String firstName, String lastName, int ssn, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setAge(age);

    }

//methode
    public void setFirstName(String name) {
        this.firstName = name;

    }

    public void setLastName(String name) {
        this.lastName = name;

    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;

    }

    public String getLastName() {
        return firstName;

    }

    public int getSsn() {
        return ssn;

    }

    public int getAge() {
        return age;

    }

    public static Person creatNewPerson() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Name");
        String fn = scan.nextLine();
        System.out.println("Please Enter The Last Name");
        String ln = scan.nextLine();
        System.out.println("Please Enter The SSN");
        int sn = scan.nextInt();
        System.out.println("Please Enter The Age");
        int a = scan.nextInt();
        Person newPerson = new Person(fn, ln, sn, a);
        return newPerson;
    }

    @Override
    public String toString() {
        String printPersonInfo
                = "Customer: " + firstName + " " + lastName + "\n"
                + "Social Security Number: " + ssn + "\n"
                + "Age: " + age;
        return printPersonInfo;
    }

}
