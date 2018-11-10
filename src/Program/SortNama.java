
package Program;

import java.util.Comparator;
public class SortNama implements Comparator<Mahasiswa>{
    @Override
    public int compare(Mahasiswa a, Mahasiswa b) {
        return a.getNama().compareToIgnoreCase(b.getNama());
    }
}