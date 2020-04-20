import java.util.Scanner;import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LMS
{

    LMS(){
        System.out.println("enter your registration no");
        Scanner scan =new Scanner(System.in);
        String reg =scan.nextLine();
        System.out.println("your registration no="+reg);
        }
  

}
class Screen extends JFrame{
    Screen(){

    
    JButton b1,b2;
    b1=new JButton("ADMIN");
    b2=new JButton("Student");
    b1.setBounds(50,150,200,25);
b2.setBounds(50,200,200,25);

    add(b1);
    add(b2);
    setVisible(true);
    }



}

class javaproject{
    public static void main(String args[]){
     //LMS obj=new LMS();
     Screen obj1=new Screen();
    }


}

