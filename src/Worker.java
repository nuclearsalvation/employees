public class Worker extends Employee{

    private Worker(String surName, String name, double salary, int experience) {
        super(surName, name, salary, experience);
    }

    public static Worker create(String surName, String name, double salary, int experience){
        return new Worker(surName, name, salary, experience);
    }

    @Override
    public double calculateSalary() {
        return salary * 40;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.; стаж %d",
                surName, name, salary, calculateSalary(), experience);
    }
}