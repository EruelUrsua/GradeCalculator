
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Main {


    public static void main(String[] args) {
    
        double numC = 0, numU = 0, grade = 0, average = 0, total = 0;
        int numS = 0, num;
        Scanner input = new Scanner(System.in);

        do { 
            System.out.println("\nEnter number of Courses: ");
             numS = input.nextInt();
            if (numS <=0)
            {
                    System.out.println("Invalid Input!");
            }


        } while (numS <=0);
        
        for(num = 0; num<numS; num++){

            int c = num + 1;
            System.out.println("Enter the grade of course number "+c+":");
            grade = input.nextDouble();
            total = getTotal(grade, total);


        }

        double sub = numS;

        average = total / sub ;

        System.err.println("Number of Courses: " + numS);
        System.err.println("Average GPA: " + average);

    }

    static double getTotal(double a , double b)
    {
        return  a + b;
    }


    static void setFrame(){

    JFrame frame = new JFrame();
    JLabel label = new JLabel();

        label.setText("Hello World"); 
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        

        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        


    }

}
