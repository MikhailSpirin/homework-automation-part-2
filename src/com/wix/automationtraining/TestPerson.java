package com.wix.automationtraining;

/**
 * Created by mikhails on 25.07.2016
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Mikhail", new Address("Illicha", "Dnepro", "DN", 15, 49000), 5, 28);
        Person person2 = new Person("Mikhail", new Address("Illicha", "Dnepro", "DN", 15, 49000), 5, 28);
        Person person3 = new Person("Anya", null, 4, 28);
        Person person4 = new Person(null, person1.getAddress().duplicate(), 100, 80);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        System.out.println();

        System.out.println("person1 equal to person2? " + person1.equals(person2));
        System.out.println("person3 equal to person1? " + person3.equals(person1));
        System.out.println("person3 address equal to person2 address? " + person3.getAddress().equals(person2.getAddress()));
        System.out.println("person4 address equal to person1 address? " + person4.getAddress().equals(person1.getAddress()));
    }
}
