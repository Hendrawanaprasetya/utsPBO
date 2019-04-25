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
public class Rakitan {

  public static void main(String[] args){
      intel Intel1 = new intel(2);
      AMD amd1 = new AMD(3);
      Komputer komputer1 = new Komputer(Intel1);
      
      komputer1.cetakInfo(Intel1);
      komputer1.memasang(amd1);
      komputer1.melepas(Intel1);
      komputer1.cetakInfo(amd1);
      
  }
            
}
