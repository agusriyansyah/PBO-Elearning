package Program;
import java.util.Comparator;
public class Nama implements Comparator<Mahasiswa> 
{
      @Override
    public int compare(Mahasiswa a, Mahasiswa b)
    {
        return a.getnama().compareToIgnoreCase(b.getnama());   
    }
}