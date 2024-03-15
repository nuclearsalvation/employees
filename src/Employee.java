public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }


    protected String name;

    protected String surName;

    protected double salary;

    protected int experience;

    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary, int experience) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}