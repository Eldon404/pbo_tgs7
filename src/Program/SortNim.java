
package Program;
import java.util.Comparator;
public class SortNim implements Comparator<Mahasiswa>{
    @Override
    public int compare(Mahasiswa a, Mahasiswa b) {
        return a.getNim().compareToIgnoreCase(b.getNim());
    }
}
