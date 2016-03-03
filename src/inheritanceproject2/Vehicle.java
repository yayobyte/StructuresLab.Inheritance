/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceproject2;
import java.util.Random;

/**
 *
 * @author Yayo
 */
public abstract class Vehicle {
    
    protected String plate;
    protected int basePricePerDay;
    public Vehicle () {
        this.plate = generateString(new Random(),"ABCDEFGHIJKLMNOPQRSTUVWXYZ", 3)
                + generateString(new Random(),"123456789", 3);
        this.basePricePerDay = 50000;
                
    }
    
    private static String generateString(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
