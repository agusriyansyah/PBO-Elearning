package Program;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class Main {
   public static Scanner in = new Scanner (System.in);
   public static  List <Mahasiswa> mhs = new ArrayList<>();

    public static void input()
    {   String sum = in.nextLine();
        System.out.print("Masukan Nim : ");
        String nim = in.nextLine();
         System.out.print("masukan Nama: ");
        String nama = in.nextLine();
         System.out.print("masukan ipk : ");
        float ipk = in.nextFloat();
        Mahasiswa ti = new Mahasiswa (nim,nama,ipk);
        mhs.add(ti);
             
    }
    public static void tampilkan()
    {
        if(mhs.isEmpty())
        {
            System.out.println("Data Belum Di Inputkan");
        }
        else
        {
             System.out.println("-----------------");
             int x = 1;
             for (Mahasiswa Mhs : mhs)
             {
                 System.out.println("Data ke -"+x);
                 System.out.println("Nim  : "+Mhs.getnim());
                 System.out.println("Nama : "+Mhs.getnama());
                 System.out.println("Ipk  : "+Mhs.getipk());
                 x++;
             }
        }
  }
    public static void mengurutkan()
    {
         if(mhs.isEmpty())
        {
            System.out.println("Data Belum Di Inputkan");
        }
         else
         {   int input = 0;
         do
         {
             System.out.println("----------------");
             System.out.println("1. Sorting By Nim ");
             System.out.println("2. Sorting By Nama ");
             System.out.println("3. Sorting By Ipk ");
             System.out.println("4. Kembali Ke Awal");
             System.out.print(" Pilih : ");
             input = in.nextInt();
             switch(input)
                     {
                 case 1 :
                     Collections.sort(mhs , new Nim());
                     int y = 1;
                     for(Mahasiswa mhs : mhs)
                     {
                         System.out.println("---------");
                         System.out.println("Data ke -"+y);
                         System.out.println("Nim  : "+mhs.getnim());
                         System.out.println("Nama : "+mhs.getnama());
                         System.out.println("Ipk  : "+mhs.getipk());
                         y++;
                     }
                     break;
                 case 2 :
                     Collections.sort(mhs , new Nama());
                     int e = 1;
                     for(Mahasiswa mhs : mhs)
                     {
                         System.out.println("---------");
                         System.out.println("Data ke -"+e);
                         System.out.println("Nim  : "+mhs.getnim());
                         System.out.println("Nama : "+mhs.getnama());
                         System.out.println("Ipk  : "+mhs.getipk());
                         e++;
                     }
                     break;
                 case 3 :
                     Collections.sort(mhs, new Ipk());
                     int a = 1;
                     for(Mahasiswa mhs : mhs)
                     {
                         System.out.println("---------");
                         System.out.println("Data ke -"+a);
                         System.out.println("Nim  : "+mhs.getnim());
                         System.out.println("Nama : "+mhs.getnama());
                         System.out.println("Ipk  : "+mhs.getipk());
                         a++;
                     }
                     break;
                  }
              }while (input!=4);
         }
    }  
  public static void main(String[] args) 
    {
        int s = 0;
        do 
        {
            System.out.println("----------");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting Data");
            System.out.println("4. Keluar Data");
            System.out.print("Pilih : "); s=in.nextInt();
            
            switch (s)
            {
                case 1 : 
                    input();
                    break;
                case 2 :
                    tampilkan();
                    break;
                case 3 :
                    mengurutkan();
                    break;         
            }
        }
        while (s!=4);
        
    }
    
}
