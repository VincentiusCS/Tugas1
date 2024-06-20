/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DojangUPN;

/**
 *
 * @author vince
 */
public class pelatihFisik extends Pelatih{
    private String nama;
    
    pelatihFisik(){
        setGaji(30000);
        setPresensi(11);
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
}
