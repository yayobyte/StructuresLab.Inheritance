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
public class Furgon extends Vehicle {
    private int pricePerDay;
    Furgon (){
        super();
        this.pricePerDay = super.basePricePerDay + 60000;
    }
    
    public String message(){
        NumberFormat nf = NumberFormat.getInstance();
        return "La renta del carro cuesta : $" + nf.format(this.pricePerDay) + " por día";
    }
}
