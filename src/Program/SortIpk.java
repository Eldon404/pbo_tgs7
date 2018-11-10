
package Program;
import java.util.Comparator;
public class SortIpk implements Comparator<Mahasiswa>{
    @Override
    public int compare(Mahasiswa a, Mahasiswa b) {
        return Float.compare(a.getIpk(), b.getIpk());
    }
}