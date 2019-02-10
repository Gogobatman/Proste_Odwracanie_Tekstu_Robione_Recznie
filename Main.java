package secretmessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main  extends JFrame  {
    JPanel jp = new JPanel();
    TextField tf= new TextField("",30);
    TextField tf2= new TextField("",30);
    Przycisk button = new Przycisk("Odwroc!");
    public Main(){
        setVisible(true);
        setSize(800,600);
        jp.setLayout(new BoxLayout(jp,BoxLayout.PAGE_AXIS));
        add(jp);
        zaladujPanel(tf,tf2,button);
    }
    public void wyczyscPanel(){
        jp.remove(tf);
        jp.remove(button);
        jp.remove(tf2);
    }
    public void zaladujPanel(TextField tf, TextField tf2, Przycisk button){
        jp.add(tf);
        jp.add(button);
        jp.add(tf2);
    }
    public class Przycisk extends Button{
        public Przycisk(String nazwa){
            super(nazwa);
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Odwroc!");
                    String tekst=tf.getText();
                    String tekstWyjsciowy="";
                    for(int i=0; i<tekst.length();i++){
                        char dodawanie = (char)(tekst.charAt(tekst.length()-i-1));
                        tekstWyjsciowy+=dodawanie;
                    }
                    tf2.setText(tekstWyjsciowy);
                    repaint();
                    revalidate();

                }
            });
        }
    }
    public static void main(String[] args) {
       Main main = new Main();

    }
}
