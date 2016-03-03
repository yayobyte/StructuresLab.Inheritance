/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceproject2;
import java.text.NumberFormat;

/**
 *
 * @author Yayo
 */
public class Auto extends Vehicle{
    private int pricePerDay;
    
    public Auto(){
        super();
        this.pricePerDay = super.basePricePerDay + 20000;
    }
    
    
    public String message(){
        NumberFormat nf = NumberFormat.getInstance();
        return "La renta del carro cuesta : $" + nf.format(this.pricePerDay) + " por día";
    }
}