import javax.swing.JOptionPane;

public class ComplexNumbers {
    Double Imaginery;
    ComplexNumbers()
    {

    }
    public void oneComplex(double real, double Imaginery)
    {
        Double modulus = Math.sqrt(real*real+Imaginery*Imaginery);
        //For complex number 3
        if(real > 0 && Imaginery > 0) //First quadrant
        {
            argument = Math.abs(Math.atan(Imaginery/real));// Provided value is in radians
        }
        else if(real > 0 && Imaginery < 0) //4th Quadrant
        {
            argument = 2*PI - Math.abs(Math.atan(Imaginery/real));
        }
        else if(real < 0 && Imaginery < 0) //3rd quadrant 
        {
            argument = PI + Math.abs(Math.atan(Imaginery/real));
        }
        else if(Imaginery == 0 && real > 0) //First Quadrant
        {
            argument = 0;
        }
        else if(Imaginery == 0 && real < 0) //2nd Quadrant
        {
            argument = 6.283185307179586476925286766559;
        }
        else { //Second quadrant
            argument = PI - Math.abs(Math.atan(Imaginery/real)); //"The resulting complex number : "+realResult+"+("+ImagineryResult+" )i"
        }
        JOptionPane.showMessageDialog(null, "The Modulus of the complex number: z="+real+"+("+Imaginery+")i is "+modulus+" With the argument "+argument"Radians");
    }
    public void TwoComplex(double real1, double real1,double Imaginery1, double Imaginery2)
    {
        double modulus1,modulus2,modulusresult,argumentresult,argument2,argument,
        int option;
        modulus1 = Math.sqrt(real1*real1+Imaginery1*Imaginery1);
        modulus2 = Math.sqrt(real1*real1+Imaginery1*Imaginery1);
        //for the first argumenent
        if(real1 > 0 && Imaginery1 > 0) //First quadrant
        {
            argument1 = Math.abs(Math.atan(Imaginery1/real1));// Provided value is in radians
        }
        else if(real1 > 0 && Imaginery1 < 0) //4th Quadrant
        {
            argument1 = 2*PI - Math.abs(Math.atan(Imaginery1/real1));
        }
        else if(real1 < 0 && Imaginery1 < 0) //3rd quadrant 
        {
            argument1 = PI + Math.abs(Math.atan(Imaginery1/real1));
        }
        else { //Second quadrant
            argument1 = PI - Math.abs(Math.atan(Imaginery1/real1));
        }
        //For complex number 2
        if(real2 > 0 && Imaginery2 > 0) //First quadrant
        {
            argument2 = Math.abs(Math.atan(Imaginery2/real2));// Provided value is in radians
        }
        else if(real2 > 0 && Imaginery2 < 0) //4th Quadrant
        {
            argument2 = 2*PI - Math.abs(Math.atan(Imaginery2/real2));
        }
        else if(real2 < 0 && Imaginery2 < 0) //3rd quadrant 
        {
            argument2 = PI + Math.abs(Math.atan(Imaginery2/real2));
        }
        else if(Imaginery2 == 0 && real2 > 0)
        {
            argument2 = 0;
        }
        else if(Imaginery2 == 0 && real2 < 0) //2nd Quadrant
        {
            argument2 = 6.283185307179586476925286766559;
        }
        else { //Second quadrant
            argument2 = PI - Math.abs(Math.atan(Imaginery2/real2));
        }
        //Allow Operations of complex number
        option = Integer.parseInt(JOptionPane.showInputDialog("What Complex number Operation do you want to perform:\n1.Addition\n2.Multiplication\n3.Division\n4.Subtraction"));
        switch (option) {
            case 1://Addition
                
                break;
        
            default:
                break;
        }
    }
}
