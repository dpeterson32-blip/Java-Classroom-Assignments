//Dustin Peterson
//pg 251 09/29/2029
import javax.swing.*;
public class NumberInput 
{
    public static void main(String[] args)
    {
        String inputString;
        int inputNumber;
        int result;
        final int Factor = 10;
        inputString = JOptionPane.showInputDialog(null,"Enter a number");
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * Factor;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + Factor + " = " + result);
    }
}
