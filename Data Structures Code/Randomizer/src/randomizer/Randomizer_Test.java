/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
package randomizer;

/**
 *
 * @author Hp
 */
public class Randomizer_Test
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
      Randomizer r = new Randomizer();
      r.insert(5);
      r.insert(25);
      r.insert(26);
      r.insert(123);
      r.insert(213);
      r.insert(223);
      r.insert(243);
      r.insert(24);
      r.insert(3);
      r.insert(3);
      r.print();
      }
    
}
