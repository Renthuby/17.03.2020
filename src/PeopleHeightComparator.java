import java.util.Comparator;

public class PeopleHeightComparator implements Comparator<People> {
    @Override
    public int compare(People a, People b) {
        if (a.getHeight() > b.getHeight())
            return -1;
        else if (a.getHeight() < b.getHeight())
            return 1;
        return 0;
    }
}
