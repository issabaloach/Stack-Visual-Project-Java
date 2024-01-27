package stackvisualproject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MainPageStack extends javax.swing.JFrame {

    public MainPageStack() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        stack2 = new javax.swing.JLabel();
        stack1 = new javax.swing.JLabel();
        stack3 = new javax.swing.JLabel();
        stack4 = new javax.swing.JLabel();
        stack7 = new javax.swing.JLabel();
        stack8 = new javax.swing.JLabel();
        stack6 = new javax.swing.JLabel();
        stack5 = new javax.swing.JLabel();
        top2 = new javax.swing.JLabel();
        top1 = new javax.swing.JLabel();
        top4 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        top8 = new javax.swing.JLabel();
        top7 = new javax.swing.JLabel();
        top6 = new javax.swing.JLabel();
        top5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pushtf = new javax.swing.JTextField();
        pushbtn = new javax.swing.JButton();
        popbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, Color.BLACK));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stack2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 110, 40));

        stack1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 110, 40));

        stack3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 110, 40));

        stack4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 110, 40));

        stack7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, 40));

        stack8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        stack6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 110, 40));

        stack5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stack5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stack5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 110, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 85, -1, -1));

        top2.setBackground(new java.awt.Color(255, 255, 255));
        top2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top2.setForeground(new java.awt.Color(255, 255, 255));
        top2.setEnabled(false);
        jPanel1.add(top2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 66, 30));

        top1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top1.setEnabled(false);
        jPanel1.add(top1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 66, 30));

        top4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top4.setEnabled(false);
        jPanel1.add(top4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 66, 30));

        top3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top3.setEnabled(false);
        jPanel1.add(top3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 66, 30));

        top8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top8.setEnabled(false);
        jPanel1.add(top8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 66, 30));

        top7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top7.setEnabled(false);
        jPanel1.add(top7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 66, 30));

        top6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top6.setEnabled(false);
        jPanel1.add(top6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 66, 30));

        top5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        top5.setEnabled(false);
        jPanel1.add(top5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 66, 30));

        jPanel3.setBackground(new java.awt.Color(105, 0, 153));

        jPanel5.setBackground(new java.awt.Color(102 , 0 , 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Push Pop (Stack Visual)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pushtf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        pushtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pushtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushtfActionPerformed(evt);
            }
        });

        pushbtn.setBackground(new java.awt.Color(255, 255, 255));
        pushbtn.setText("PUSH");
        pushbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.white, null, null));
        pushbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pushbtnMouseClicked(evt);
            }
        });

        popbtn.setBackground(new java.awt.Color(255, 255, 255));
        popbtn.setText("POP");
        popbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        popbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popbtnMouseClicked(evt);
            }
        });
        popbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(popbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pushbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(pushtf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(pushtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pushbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(popbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 570));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pushtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pushtfActionPerformed

    private void pushbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pushbtnMouseClicked
        labels = new ArrayList<>(Arrays.asList(stack1,stack2,stack3,stack4,stack5,stack6,stack7,stack8));
        topLabels = new ArrayList<>(Arrays.asList(top1,top2,top3,top4,top5,top6,top7,top8));
        
        String pushText = pushtf.getText();
        stack.push(pushText);        
        if(i<8){
        labels.get(i).setText(stack.peek());
        topLabels.get(i).setText("Top");
        labels.get(i).setBorder(BorderFactory.createMatteBorder(3, 0, 0, 0, Color.BLACK));
        
         if (i > 0) {
            topLabels.get(i - 1).setText("");
        }
         
        i++;
            System.out.println(i);
            
           
        } else {
            JOptionPane.showMessageDialog(this, "Stack Overflow");
        }
        
        pushtf.setText("");
    }//GEN-LAST:event_pushbtnMouseClicked

    private void popbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popbtnActionPerformed

    private void popbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popbtnMouseClicked
        if(i>0){
        labels.get(--i).setText("");
        topLabels.get(i).setVisible(false); 
        labels.get(i).setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
        
         if (i > 0) {
            topLabels.get(i - 1).setText("Top");
         }
        }
        else{
            JOptionPane.showMessageDialog(this, "Stack is Empty");            
        }
    }//GEN-LAST:event_popbtnMouseClicked
    static Stack<String> stack;
    static ArrayList<JLabel> labels;
    static ArrayList<JLabel> topLabels;
    static int i=0;
    public static void main(String args[]) {
         
        stack = new Stack<>();
//        for(int j=0; j<8; i++){
//            arrowlabels.get(i).setVisible(false);
//        }
// 
        
        
        // Refresh the panel to update the UI
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    void kuchbhi(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton popbtn;
    private javax.swing.JButton pushbtn;
    private javax.swing.JTextField pushtf;
    private javax.swing.JLabel stack1;
    private javax.swing.JLabel stack2;
    private javax.swing.JLabel stack3;
    private javax.swing.JLabel stack4;
    private javax.swing.JLabel stack5;
    private javax.swing.JLabel stack6;
    private javax.swing.JLabel stack7;
    private javax.swing.JLabel stack8;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    private javax.swing.JLabel top4;
    private javax.swing.JLabel top5;
    private javax.swing.JLabel top6;
    private javax.swing.JLabel top7;
    private javax.swing.JLabel top8;
    // End of variables declaration//GEN-END:variables
}
