
package footballprediction;


public class Project extends javax.swing.JFrame {
private int teamA;
private int teamB;
   
    public Project() {
        initComponents();
    }
public void possession(double a, double b){
 double x[]=new double[] {55,59,61,40,38,50};                  //possession x co-ordinates
 double y[]=new double[] {45,41,39,60,62,50};                     //possession y co-ordinates
 double x_test=a;
 double y_test=b;
 double d[]=new double[6];
 for(int i=0;i<6;i++) {
  d[i]=Math.pow((Math.pow(x[i]-x_test, 2))+(Math.pow(y[i]- y_test,2)),0.5);
 }
 double temp=d[0];
 int s=0;
 for (int i=1;i<6;i++) {
  if (d[i]<temp){
   temp=d[i];
   s=i;
  }
 }
 if (s==0 || s==1 || s==2) {
  teamA+=1;                                    //set weightage for possession
 }
 else {
  teamB+=1;                                    //set weightage for possession 
 }
}
public void passAccu(double a, double b){
 double x[]=new double[] {89,84,84,81,81,84};                  //Passing Accuracy x co-ordinates
 double y[]=new double[] {88,71,75,89,92,85};                     //Passing Accuracy y co-ordinates
 double x_test=a;
 double y_test=b;
 double d[]=new double[6];
 for(int i=0;i<6;i++) {
  d[i]=Math.pow((Math.pow(x[i]-x_test, 2))+(Math.pow(y[i]- y_test,2)),0.5);
 }
 double temp=d[0];
 int s=0;
 for (int i=1;i<6;i++) {
  if (d[i]<temp){
   temp=d[i];
   s=i;
  }
 }
  if (s==0 || s==1 || s==2) {
  teamA+=1;                                    //set weightage for Passing Accuracy
 }
 else {
  teamB+=1;                                    //set weightage for Passing Accuracy 
 }
}
public void shotsTaken(double a, double b){
 double x[]=new double[] {16,14,15,7,10,19};                  //Shots Taken x co-ordinates
 double y[]=new double[] {7,9,4,20,5,13};                     //Shots Taken y co-ordinates
 double x_test=a;
 double y_test=b;
 double d[]=new double[6];
 for(int i=0;i<6;i++) {
  d[i]=Math.pow((Math.pow(x[i]-x_test, 2))+(Math.pow(y[i]- y_test,2)),0.5);
 }
 double temp=d[0];
 int s=0;
 for (int i=1;i<6;i++) {
  if (d[i]<temp){
   temp=d[i];
   s=i;
  }
 }
  if (s==0 || s==1 || s==2) {
  teamA+=1;                                    //set weightage for Shots Taken
 }
 else {
  teamB+=1;                                    //set weightage for Shots Taken 
 }
}
public void shotsTarget(double a, double b){
 double x[]=new double[] {11,10,8,6,3,9};                  //Shots Target x co-ordinates
 double y[]=new double[] {6,4,1,15,3,10};                     //Shots Target y co-ordinates
 double x_test=a;
 double y_test=b;
 double d[]=new double[6];
 for(int i=0;i<6;i++) {
  d[i]=Math.pow((Math.pow(x[i]-x_test, 2))+(Math.pow(y[i]- y_test,2)),0.5);
 }
 double temp=d[0];
 int s=0;
 for (int i=1;i<6;i++) {
  if (d[i]<temp){
   temp=d[i];
   s=i;
  }
 }
  if (s==0 || s==1 || s==2) {
  teamA+=1;                                    //set weightage for Shots on Target
 }
 else {
  teamB+=1;                                    //set weightage for Shots on Target
 }
}
public void result(){
    if (teamA>teamB){
        Output.setText("Team A has a better chance of winning");
    }
    else{
        if (teamB>teamA){
            Output.setText("Team B has a better chance of winning");
        }
        else {
            Output.setText("Match might end on draw");
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PosA = new javax.swing.JTextField();
        PosB = new javax.swing.JTextField();
        PassA = new javax.swing.JTextField();
        PassB = new javax.swing.JTextField();
        shotA = new javax.swing.JTextField();
        shotB = new javax.swing.JTextField();
        sTargetA = new javax.swing.JTextField();
        sTargetB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Output = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosBActionPerformed(evt);
            }
        });

        jLabel1.setText("Possession");

        jLabel2.setText("Passing Accuracy");

        jLabel3.setText("Shots Taken");

        jLabel4.setText("Shots on Target");

        jButton1.setText("Predict");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Output.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        Output.setText("Output Here");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Team A");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Team B");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(Output)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PosA, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(PassA)
                            .addComponent(shotA)
                            .addComponent(sTargetA)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4)
                                    .addComponent(jButton1))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PosB, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(PassB)
                            .addComponent(shotB)
                            .addComponent(sTargetB)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shotA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shotB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sTargetA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sTargetB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(Output)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PosBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double PossA=Double.parseDouble(PosA.getText());
        double PossB=Double.parseDouble(PosB.getText());
        possession(PossA,PossB);
        double PasA=Double.parseDouble(PassA.getText());
        double PasB=Double.parseDouble(PassB.getText());
        passAccu(PasA,PasB);
        double shTA=Double.parseDouble(shotA.getText());
        double shTB=Double.parseDouble(shotB.getText());
        shotsTaken(shTA,shTB);
        double shotTargetA=Double.parseDouble(sTargetA.getText());
        double shotTargetB=Double.parseDouble(sTargetB.getText());
        shotsTarget(shotTargetA,shotTargetB);
        
        result();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Output;
    private javax.swing.JTextField PassA;
    private javax.swing.JTextField PassB;
    private javax.swing.JTextField PosA;
    private javax.swing.JTextField PosB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField sTargetA;
    private javax.swing.JTextField sTargetB;
    private javax.swing.JTextField shotA;
    private javax.swing.JTextField shotB;
    // End of variables declaration//GEN-END:variables
}
