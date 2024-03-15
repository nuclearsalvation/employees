import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String[] employeeClasses = new String[] {"Worker", "Freelancer"};
        int experience = random.nextInt(1, 20);

        String employeeClass = employeeClasses[random.nextInt(2)];
        if (employeeClass.equals("Worker")){
            int salary = random.nextInt(500, 5000);
            return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,
                experience
            );

        }
        else{
            int workingHours = random.nextInt(8,39);
            int salaryPerHour = random.nextInt(1000, 10001);
            return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                workingHours,
                salaryPerHour,
                experience
            );
        }
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            employees[i] = generateEmployee();
        }
        return employees;
    }



}
