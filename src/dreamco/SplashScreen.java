
package dreamco;

//by JERRY <3
public class SplashScreen extends javax.swing.JFrame {


    public SplashScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);
        jPanel1.add(loadingbar);
        loadingbar.setBounds(0, 360, 700, 20);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loading Resources");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 390, 700, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dreamco/SplashScreen.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 460);

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

        setSize(new java.awt.Dimension(700, 460));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    public void runSplashScreen() {      
        SplashScreen sc= new SplashScreen();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);                
            }
        });
        
        ///////////////////////////////////////////////////////////////////Progress Counter Starts here
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                sc.loadingbar.setValue(i);
                
                
                if(i<20){
                    jLabel1.setText("Initializing features to get an A+");
                }
                if(i<40 && i>20){
                    jLabel1.setText("Hoping that these features will get us an A+");
                }
                if(i<60 && i>40){
                    jLabel1.setText("Implementing algorithms to save our grades this semester");
                }
                if(i<80 && i>60){
                    jLabel1.setText("Please have mercy on us Dr Liew");
                }
                if(i<100 && i>80){
                    jLabel1.setText("Loading Complete");
                }                
                
                
                    
            }
        }
        catch(Exception e){
        }
        sc.setVisible(false);
        LoginFrame lf= new LoginFrame();
        lf.runLoginFrame();
        sc.dispose();        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingbar;
    // End of variables declaration//GEN-END:variables
}
