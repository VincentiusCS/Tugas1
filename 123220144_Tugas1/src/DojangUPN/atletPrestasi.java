/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DojangUPN;

/**
 *
 * @author vince
 */
public class atletPrestasi extends Atlet{
    private int bonus = 20000;
    protected String nama;
    final String kelas = "Prestasi";
    @Override
    public String nama(){
        return "Dani";
    }
    @Override
    public void bonus() {
        System.out.println("Bonus atlet: " + bonus);
    }
}
