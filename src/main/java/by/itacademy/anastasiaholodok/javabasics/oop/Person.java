package by.itacademy.anastasiaholodok.javabasics.oop;

public class Person extends Student{
    private Integer salary;

    @Override
    public Integer getIncome() {
        return (super.getIncome() + salary);
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}