/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakitan;

/**
 *
 * @author HEND PC
 */
public class Komputer {
    private CPU cpu;
    public Komputer(CPU cpu){
        this.cpu=cpu;
    }
    
    public void memasang(CPU cpu){
        this.cpu=cpu;
        System.out.println("CPU :"+this.cpu.getCPUData()+"GHz"+"Dipasang");
        
    }
    public void melepas(CPU cpu){
        this.cpu=cpu;
        System.out.println("CPU :"+this.cpu.getCPUData()+"GHz"+"Dilepas");
    }
    public void cetakInfo(CPU cpu){
        System.out.println("CPU :"+this.cpu.getCPUData()+"GHz");
    }
  
}
