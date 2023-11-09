
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/*
 *
 * @author Sam
*/
public class StopWatch1 extends javax.swing.JFrame {
        private javax.swing.JButton Jstart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jReset;
    private javax.swing.JButton jStop;
    private javax.swing.JLabel jTime;

    /**
     * Creates new form Stopwatch
     */
    public static int delay = 1000;
    public static int seconds = 0;
    public static int minutes = 0;
    public static int hours = 0;
    public static boolean status = false;
    
    Timer timer = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        if(status)
        {
            seconds++;
            if(seconds == 60)
            {
                minutes++;
                seconds = 0;
            }
            if(minutes == 60)
            {
                minutes = 0;
                seconds = 0;
                hours++;
            }
            if(hours == 24)
            {
                hours = seconds = minutes = 0;
            }
    String Hoursstring = String.format("%02d", hours);
    String Secondsstring = String.format("%02d", seconds);
    String Minutesstring = String.format("%02d", minutes);
    jTime.setText(Hoursstring+ ":" +Minutesstring+ ": " +Secondsstring);
    
        }
        }
    });
     
    public void start()
    {
        timer.start();
    }
    public void stop()
    {
        timer.stop();
    }
    public void reset()
    {
        timer.stop();
       minutes = hours = seconds = 0;
       
    }
    public StopWatch1() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();
        Jstart = new javax.swing.JButton();
        jStop = new javax.swing.JButton();
        jReset = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTime.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTime.setText("00:00:00");

        Jstart.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Jstart.setText("Start");
        Jstart.setFocusPainted(false);
        Jstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JstartActionPerformed(evt);
            }
        });

        jStop.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jStop.setText("Stop");
        jStop.setFocusPainted(false);
        jStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStopActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jReset.setText("Reset");
        jReset.setFocusPainted(false);
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jstart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jReset))
                    .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jstart)
                    .addComponent(jStop)
                    .addComponent(jReset))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setBounds(0, 0, 483, 243);
    }// </editor-fold>                        

    private void jStopActionPerformed(java.awt.event.ActionEvent evt) {                                      
        status = false;
        stop();
    }                                     

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {                                       
 
        status = false;
        reset();
        
    }                                      

    private void JstartActionPerformed(java.awt.event.ActionEvent evt) {                                       
         status = true;
         start();
         System.out.println("Stopwatch.JstartActionPerformed()"+minutes+""+seconds);
         
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(StopWatch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StopWatch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StopWatch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StopWatch1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StopWatch1().setVisible(true);
            }
        });
    }                 

}