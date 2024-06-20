/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DojangUPN;

/**
 *
 * @author vince
 */
public class atletPemula extends Atlet{
    private int bonus = 10000;
    protected String nama;
    final String kelas = "Pemula";
    @Override
    public String nama(){
        return "Ojan";
    }
    @Override
    public void bonus() {
        System.out.println("Bonus atlet: " + bonus);
    }
    
}
