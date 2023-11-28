import javax.swing.JOptionPane;

public class ComplexNumbers {
    Double Imaginery;
    public final Double PI = 3.1415926535897932384626433832795;
    ComplexNumbers()
    {

    }
    public void oneComplex(double real, double Imaginery)
    {
        double argument;
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
        JOptionPane.showMessageDialog(null, "The Modulus of the complex number: z="+real+"+("+Imaginery+")i is "+modulus+" With the argument "+argument+" Radians");
    }
    public void TwoComplex(double real1, double real2,double Imaginery1, double Imaginery2)
    {
        double modulus1,modulus2,modulusresult,argumentresult,argument2,argument,ImagineryResult,realresult;
        int option;
        modulus1 = Math.sqrt(real1*real1+Imaginery1*Imaginery1);
        modulus2 = Math.sqrt(real1*real1+Imaginery1*Imaginery1);
        //for the first argumenent
        if(real1 > 0 && Imaginery1 > 0) //First quadrant
        {
            argument = Math.abs(Math.atan(Imaginery1/real1));// Provided value is in radians
        }
        else if(real1 > 0 && Imaginery1 < 0) //4th Quadrant
        {
            argument = 2*PI - Math.abs(Math.atan(Imaginery1/real1));
        }
        else if(real1 < 0 && Imaginery1 < 0) //3rd quadrant 
        {
            argument = PI + Math.abs(Math.atan(Imaginery1/real1));
        }
        else { //Second quadrant
            argument = PI - Math.abs(Math.atan(Imaginery1/real1));
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
                realresult = real1 + real2;
                ImagineryResult = Imaginery1 + Imaginery2;
                modulusresult = Math.sqrt(realresult*realresult +ImagineryResult*ImagineryResult);
                if (realresult > 0 && ImagineryResult > 0) // First quadrant
                {
                    argumentresult = Math.abs(Math.atan(ImagineryResult / realresult));// Provided value is in radians
                } else if (realresult > 0 && ImagineryResult < 0) // 4th Quadrant
                {
                    argumentresult = 2 * PI - Math.abs(Math.atan(ImagineryResult / realresult));
                } else if (realresult < 0 && ImagineryResult < 0) // 3rd quadrant
                {
                    argumentresult = PI + Math.abs(Math.atan(ImagineryResult / realresult));
                } else if (ImagineryResult == 0 && realresult > 0) {
                    argumentresult = 0;
                } else if (ImagineryResult == 0 && realresult < 0) // 2nd Quadrant
                {
                    argumentresult = 6.283185307179586476925286766559;
                } else { // Second quadrant
                    argumentresult = PI - Math.abs(Math.atan(ImagineryResult / realresult));
                }
                JOptionPane.showMessageDialog(null,"The resulting Complex number z1="+realresult+"+("+ImagineryResult+")i with the argument of "+argumentresult+" Radians, and Modulus of "+modulusresult);
                break;
            case 2: //Multiplication
                modulusresult = modulus1*modulus2;
                //sintheta = opposite(y)/Hypotenuse(Modulus),costheta = adjacent(x)/Hypotenuse(Modulus)
                argumentresult = argument + argument2;
                realresult = modulusresult*Math.cos(argumentresult);
                ImagineryResult = modulusresult*Math.sin(argumentresult);
                JOptionPane.showMessageDialog(null,"The resulting Complex number z1="+realresult+"+("+ImagineryResult+")i with the argument of "+argumentresult+" Radians, and Modulus of "+modulusresult);
                break;
            case 3: //Division
                modulusresult = modulus1/modulus2;
                argumentresult = argument-argument2;
                realresult = modulusresult*Math.cos(argumentresult);
                ImagineryResult = modulusresult*Math.sin(argumentresult);
                JOptionPane.showMessageDialog(null,"The resulting Complex number z1="+realresult+"+("+ImagineryResult+")i with the argument of "+argumentresult+" Radians, and Modulus of "+modulusresult);
                break;
            case 4: //Subtraction
                realresult = real1 - real2;
                ImagineryResult = Imaginery1 - Imaginery2;
                modulusresult = Math.sqrt(realresult*realresult +ImagineryResult*ImagineryResult);
                if (realresult > 0 && ImagineryResult > 0) // First quadrant
                {
                    argumentresult = Math.abs(Math.atan(ImagineryResult / realresult));// Provided value is in radians
                } else if (realresult > 0 && ImagineryResult < 0) // 4th Quadrant
                {
                    argumentresult = 2 * PI - Math.abs(Math.atan(ImagineryResult / realresult));
                } else if (realresult < 0 && ImagineryResult < 0) // 3rd quadrant
                {
                    argumentresult = PI + Math.abs(Math.atan(ImagineryResult / realresult));
                } else if (ImagineryResult == 0 && realresult > 0) {
                    argumentresult = 0;
                } else if (ImagineryResult == 0 && realresult < 0) // 2nd Quadrant
                {
                    argumentresult = 6.283185307179586476925286766559;
                } else { // Second quadrant
                    argumentresult = PI - Math.abs(Math.atan(ImagineryResult / realresult));
                }
                JOptionPane.showMessageDialog(null,"The resulting Complex number z1="+realresult+"+("+ImagineryResult+")i with the argument of "+argumentresult+" Radians, and Modulus of "+modulusresult);
                break;
        default:
                JOptionPane.showMessageDialog(null, "The Option chose was invalid!","ERROR 402",JOptionPane.ERROR_MESSAGE);
                break;
        }
        
    }
}
