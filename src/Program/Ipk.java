package Program;
import java.util.Comparator;
public class Ipk implements Comparator<Mahasiswa>
{
    @Override
    public int compare(Mahasiswa a, Mahasiswa b){
        return Float.compare(a.getipk(), b.getipk());
    }
    
}
