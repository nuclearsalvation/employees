public class Freelancer extends Employee{

    private double workingHours;

    private double salaryPerHour;

    private Freelancer(String surName, String name, double workingHours, double salaryPerHour, int experience) {
        super(surName, name, 4*salaryPerHour*workingHours, experience);
        this.workingHours = workingHours;
        this.salaryPerHour = salaryPerHour;
    }

    public static Freelancer create(String surName, String name, double workingHours, double salaryPerHour, int experience){
        return new Freelancer(surName, name, workingHours, salaryPerHour, experience);
    }

    @Override
    public double calculateSalary() {
        return 4 * salaryPerHour * workingHours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; почасовая ставка: %.2f руб.; рабочее время в неделю: %.2f часов; заработная плата: %.2f руб.; стаж %d",
                surName, name, salaryPerHour, workingHours, calculateSalary(), experience);
    }
}