/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.IntelligentSystem;
import java.awt.Button;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author David Clavijo
 */
public class UserGUI extends java.awt.Frame {

    /**
     * Creates new form UserGUI
     */
    ArrayList<JButton> listBtn = new ArrayList<>();
    int nextMatriz = 0;
    
    
    ArrayList<int[][]> listOK = new ArrayList<>();
    int[][] NormalList = new int[4][4];
    int[][] AlteredList = new int[4][4];
    
    
    
    PuzzleShuffle initialstate = new PuzzleShuffle();
    IntelligentSystem intelSys = new IntelligentSystem();
    
    
   
    
    public void InitialDataState(int[][] myarray){
        
                int cont = 0;
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        myarray[i][j]=(cont);
                        cont+=1;
                    }
                }
       
    }
    
    
    
    
    public UserGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        

        this.setSize(690, 530);
        
       
        
        
/**
        int[][] test1 = {
            {0, 15, 14, 13},
            {12, 11, 10, 9},
            {8, 7, 6, 5},
            {4, 3, 2, 1}

        };
        

        int[][] test2 = {
            {15, 0, 14, 13},
            {12, 11, 10, 9},
            {8, 7, 6, 5},
            {4, 3, 2, 1}

        };

        int[][] test3 = {
            {15, 11, 14, 13},
            {12, 0, 10, 9},
            {8, 7, 6, 5},
            {4, 3, 2, 1}

        };

        listOK.add(test1);
        listOK.add(test2);
        listOK.add(test3);
        
        */
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btnAlter = new javax.swing.JButton();
        btnSolve = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Sig = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/1.PNG"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        add(btn1);
        btn1.setBounds(70, 200, 70, 60);

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/2.PNG"))); // NOI18N
        btn2.setText("jButton1");
        btn2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        add(btn2);
        btn2.setBounds(140, 200, 70, 60);

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/4.PNG"))); // NOI18N
        btn4.setText("jButton1");
        btn4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        add(btn4);
        btn4.setBounds(280, 200, 70, 60);

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/3.PNG"))); // NOI18N
        btn3.setText("jButton1");
        btn3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        add(btn3);
        btn3.setBounds(210, 200, 70, 60);

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/5.PNG"))); // NOI18N
        btn5.setText("jButton1");
        btn5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        add(btn5);
        btn5.setBounds(70, 260, 70, 60);

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/6.PNG"))); // NOI18N
        btn6.setText("jButton1");
        btn6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        add(btn6);
        btn6.setBounds(140, 260, 70, 60);

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/7.PNG"))); // NOI18N
        btn7.setText("jButton1");
        btn7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        add(btn7);
        btn7.setBounds(210, 260, 70, 60);

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/9.PNG"))); // NOI18N
        btn9.setText("jButton1");
        btn9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        add(btn9);
        btn9.setBounds(70, 320, 70, 60);

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/8.PNG"))); // NOI18N
        btn8.setText("jButton1");
        btn8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        add(btn8);
        btn8.setBounds(280, 260, 70, 60);

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/10.PNG"))); // NOI18N
        btn10.setText("jButton1");
        btn10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        add(btn10);
        btn10.setBounds(140, 320, 70, 60);

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/12.PNG"))); // NOI18N
        btn12.setText("jButton1");
        btn12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        add(btn12);
        btn12.setBounds(280, 320, 70, 60);

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/11.PNG"))); // NOI18N
        btn11.setText("jButton1");
        btn11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        add(btn11);
        btn11.setBounds(210, 320, 70, 60);

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/13.PNG"))); // NOI18N
        btn13.setText("jButton1");
        btn13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        add(btn13);
        btn13.setBounds(70, 380, 70, 60);

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/14.PNG"))); // NOI18N
        btn14.setText("jButton1");
        btn14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        add(btn14);
        btn14.setBounds(140, 380, 70, 60);

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/15.PNG"))); // NOI18N
        btn15.setText("jButton1");
        btn15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        add(btn15);
        btn15.setBounds(210, 380, 70, 60);

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/0.PNG"))); // NOI18N
        btn16.setText("jButton1");
        btn16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        add(btn16);
        btn16.setBounds(280, 380, 70, 60);

        btnAlter.setText("ALTERNAR");
        btnAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterActionPerformed(evt);
            }
        });
        add(btnAlter);
        btnAlter.setBounds(410, 170, 110, 60);

        btnSolve.setText("RESOLVER");
        btnSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolveActionPerformed(evt);
            }
        });
        add(btnSolve);
        btnSolve.setBounds(530, 170, 110, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Leonardo Gonzalez");
        add(jLabel5);
        jLabel5.setBounds(60, 110, 230, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("David Clavijo");
        add(jLabel6);
        jLabel6.setBounds(60, 130, 200, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Información");
        jLabel7.setToolTipText("");
        add(jLabel7);
        jLabel7.setBounds(410, 240, 110, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(400, 270, 250, 200);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/monitorias.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(350, 50, 190, 70);

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/fr2.1.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel1);
        jLabel1.setBounds(50, 170, 320, 300);

        Sig.setText("Sig.");
        Sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigActionPerformed(evt);
            }
        });
        add(Sig);
        Sig.setBounds(260, 480, 70, 23);

        jButton1.setText("Ant.");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(140, 480, 70, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/Wood-Wallpaper.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showMatriz(int[][] matriz) {

        String fullPath = "";
        int num = 0;
        ImageIcon icon = null;

        myArrayBtn();
        int head = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                num = matriz[i][j];
                AlteredList [i][j]= num;
                fullPath = "./Img/" + num + ".PNG";
                icon = new ImageIcon(getClass().getResource(fullPath));
                listBtn.get(head).setIcon(icon);
                head++;
            }

        }

    }

    public void myArrayBtn() {
        listBtn.add(btn1);
        listBtn.add(btn2);
        listBtn.add(btn3);
        listBtn.add(btn4);
        listBtn.add(btn5);
        listBtn.add(btn6);
        listBtn.add(btn7);
        listBtn.add(btn8);
        listBtn.add(btn9);
        listBtn.add(btn10);
        listBtn.add(btn11);
        listBtn.add(btn12);
        listBtn.add(btn13);
        listBtn.add(btn14);
        listBtn.add(btn15);
        listBtn.add(btn16);
    }

    public void animationPuzzle(ArrayList<int[][]> answUser, boolean option) {

        if (option) {

            if (nextMatriz+1 <= answUser.size()) {//<<<<<<<<<<<<<---------------------
                nextMatriz++;
            }

        } else {

            if (nextMatriz >= 0) { //<<<<<<<<<<<<<<<<<----------------------------------
                nextMatriz--;
            }

        }

        showMatriz(answUser.get(nextMatriz));

    }
    
    

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        //btn12.setPressedIcon (new ImageIcon("0.PNG"));;
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn15ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       InitialDataState(NormalList);
       listOK = intelSys.showPath(NormalList, AlteredList);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn16ActionPerformed

    private void btnSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolveActionPerformed
       
       //showMatriz();
       
        //mmeterla dentro del show path devuelve un arraylist
        //arraylist a listOK se le pasa a la solucion 

    }//GEN-LAST:event_btnSolveActionPerformed

    private void SigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigActionPerformed
        animationPuzzle(listOK, true);
    }//GEN-LAST:event_SigActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        animationPuzzle(listOK, false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterActionPerformed
       showMatriz(initialstate.RandomMatrix());
     
    }//GEN-LAST:event_btnAlterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sig;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAlter;
    private javax.swing.JButton btnSolve;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
