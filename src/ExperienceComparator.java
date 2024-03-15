import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2){
        return Integer.compare(o1.experience, o2.experience);

    }

}