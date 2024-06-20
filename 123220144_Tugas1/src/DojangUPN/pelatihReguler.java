/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DojangUPN;

/**
 *
 * @author vince
 */
public class pelatihReguler extends Pelatih {
    private String nama;
    
    pelatihReguler(){
        setGaji(20000);
        setPresensi(20);
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
}
