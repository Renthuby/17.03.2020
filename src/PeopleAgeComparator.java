import java.util.Comparator;

public class PeopleAgeComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        if (o1.getAge() > o2.getAge())
            return 1;
        else if (o1.getAge() < o2.getAge())
            return -1;
        return 0;
    }
}
