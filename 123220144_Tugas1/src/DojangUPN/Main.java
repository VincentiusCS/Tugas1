/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DojangUPN;

/**
 *
 * @author vince
 */
public class Main implements Dojang{
    
    public static void main(String[] args) {
       atletPemula pemula = new atletPemula();
       atletPrestasi prestasi = new atletPrestasi();
       pelatihFisik fisik = new pelatihFisik();
       pelatihReguler reguler = new pelatihReguler();
       
       System.out.println("nama dojang: " + nama);
       System.out.println("kebangsaan: " + nationality);
       
       
       System.out.println("Nama Atlet: " + pemula.nama());
       System.out.println("Kelas: " + pemula.kelas);
       pemula.bonus();
       
       System.out.println("Nama Atlet: " + prestasi.nama());
       System.out.println("Kelas: " + prestasi.kelas);
       prestasi.bonus();
            
       fisik.setNama("Jhony");
       System.out.println("Nama pelatih Fisik: " + fisik.getNama());
       System.out.println("Gaji pelatih fisik = " + fisik.getTotalHonor());
       
       reguler.setNama("Aldi");
       System.out.println("Nama pelatih Reguler: " + reguler.getNama());
       System.out.println("Gaji pelatih reguler = " + reguler.getTotalHonor());
    }
}
