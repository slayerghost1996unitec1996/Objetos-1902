/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Point;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author T-101
 */
public class Clase {
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1);
                        JFrame v=new JFrame();
                v.setSize(300,300);
               v.setTitle("VIRUS¡¡");
               JLabel jLabel1 = new javax.swing.JLabel();
               jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2222.PNG"))); // NOI18N
               jLabel1.setText("jLabel1");
                
                v.setLocationRelativeTo(null);
                v.setVisible(true);
                 v.getLocationOnScreen();
                 Point p= v.getLocationOnScreen();
                System.out.println("x:"+p.x+",y:"+p.y);
                int largo=p.x*2;
                int alto=p.y*2;
               Random r1=new Random();
               Random r2=new Random();
               int dx=r1.nextInt(largo);
               int dy=r2.nextInt(alto);
               v.setLocation(dx, dy);
                
                    } catch (InterruptedException ex) {
                        
                    }
                    
                }
              
                
            }
        });
        t1.start();
        
    }
}
