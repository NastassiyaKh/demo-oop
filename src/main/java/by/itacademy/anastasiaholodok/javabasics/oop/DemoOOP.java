package by.itacademy.anastasiaholodok.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {
        Book book = new Book();
        Car car = new Car();
        Customer customer = new Customer();

        Person user3 = new Person();
        user3.setGrant((Integer)120);
        user3.setSalary((Integer)200);
        System.out.println(user3.getIncome());
    }
}