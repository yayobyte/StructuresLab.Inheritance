/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceproject2;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yayo
 */
public class InheritanceProject2 {

    /**
     * @param args the command line arguments
     */
    
    public static final String[] options = { "Carro", "Microbus", "Furgón", "Camioneta", "Salir" };
    
    public static void main(String[] args) {
        String option;
        Auto car = new Auto();
        MicroBus mBus = new MicroBus();
        Furgon fur = new Furgon();
        Truck truck = new Truck();
        JFrame frame = new JFrame("Input Dialog Example 3");
        
        option = (String) JOptionPane.showInputDialog(frame, 
            "¿Qué vehículo quiere alquilar?",
            "Seleccione",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
        while (!"Salir".equals(option)){
            switch (option){
                case "Carro":
                    JOptionPane.showMessageDialog(null, car.message());
                    break;
                case "Microbus":
                    JOptionPane.showMessageDialog(null, mBus.message());
                    break;
                case "Furgón":
                    JOptionPane.showMessageDialog(null, fur.message());
                    break;
                case "Camioneta":
                    JOptionPane.showMessageDialog(null, truck.message());
                    break;
            }
            option = (String) JOptionPane.showInputDialog(frame, 
            "¿Qué vehículo quiere alquilar?",
            "Seleccione",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
        }
        JOptionPane.showMessageDialog(frame, "Gracias por usar nuestros servicios");
        Runtime.getRuntime().exit(0);
        
    }
    
}
