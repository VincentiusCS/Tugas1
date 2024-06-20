/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DojangUPN;

/**
 *
 * @author vince
 */
public class Pelatih {
    private int gaji;
    private int presensi;
    private String nama;
    
    int hitungHonor(int gaji, int presensi){
        return gaji * presensi;
    }
    
    void setPresensi(int presensi){
        this.presensi = presensi;
    }
       
    void setGaji(int gaji){
        this.gaji = gaji;
    }
    int getTotalHonor(){
        return hitungHonor(gaji, presensi);
    }
}
