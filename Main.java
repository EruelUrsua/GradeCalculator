
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Main {


    public static void main(String[] args) {
        
    setFrame();

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
