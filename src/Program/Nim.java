package Program;
import java.util.Comparator;
public class Nim implements Comparator<Mahasiswa> 
{
      @Override
    public int compare(Mahasiswa a, Mahasiswa b)
    {
        return a.getnim().compareToIgnoreCase(b.getnim());
    
    }
}