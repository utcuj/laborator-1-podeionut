import java.util.Comparator;

/**
 * Created by Pode Ionut on 3/4/2018.
 */
public class TrenComparator implements Comparator<Tren> {
    public int compare(final Tren t1, final Tren t2){
        return t1.getOra_plecarii().compareTo(t2.getOra_plecarii());
    }
}
