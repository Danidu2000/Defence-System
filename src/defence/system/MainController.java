/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defence.system;

/**
 *
 * @author danid
 */
public class MainController extends javax.swing.JFrame implements Observer{
    private ObservableInterface Observable;

    /**
     * Creates new form MainController
     */
    public MainController() {
        initComponents();
    }
    MainController(ObservableInterface Observable){
	this.Observable=Observable;
        initComponents();
        setVisible(true);
    }
    @Override
    public void update(boolean areaClear,String commanMsg){
    }
    @Override
    public void update(String[] subInfoArray) {
        subSoldierDisplay.setText(subInfoArray[0]);
        subAmmoDisplay.setText(subInfoArray[1]);
        subFuelDisplay.setText(subInfoArray[2]);
        subEnergyDisplay.setText(subInfoArray[3]);
        subOxygenDisplay.setText(subInfoArray[4]);
    }
    @Override
    public void update(String[] heliInfoArray,int a) {
        heliSoldierDisplay.setText(heliInfoArray[0]);
        heliAmmoDisplay.setText(heliInfoArray[1]);
        heliFuelDisplay.setText(heliInfoArray[2]);
    }
    @Override
    public void update(String[] tankInfoArray,int a,int b){
        tankSoldierDisplay.setText(tankInfoArray[0]);
        tankAmmoDisplay.setText(tankInfoArray[1]);
        tankFuelDisplay.setText(tankInfoArray[2]);
    }
    @Override
    public void update(String subMassage){
        commanTextArea.setText(subMassage);
    }
    @Override
    public void update(String heliMassage,double a){
        commanTextArea.setText(heliMassage);
    }
    @Override
    public void update(String tankMassage,double a,double b){
        commanTextArea.setText(tankMassage);
    }
    @Override
    public void update(int position){
        
    }
    @Override
    public void update(String subText,int a,double b){
    
    }
    @Override
    public void update(String tankText,int a,int c,double b){
        
    }
    
    @Override
    public void update(String heliText,int a,int c,int d,double b){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        areaClearCheck = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tankSoldierDisplay = new javax.swing.JLabel();
        subSoldierDisplay = new javax.swing.JLabel();
        heliSoldierDisplay = new javax.swing.JLabel();
        subAmmoDisplay = new javax.swing.JLabel();
        tankAmmoDisplay = new javax.swing.JLabel();
        heliAmmoDisplay = new javax.swing.JLabel();
        subFuelDisplay = new javax.swing.JLabel();
        tankFuelDisplay = new javax.swing.JLabel();
        heliFuelDisplay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        subEnergyDisplay = new javax.swing.JLabel();
        subOxygenDisplay = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        positionSlider = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        commanTextArea = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        subTxt = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        tankTxt = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        heliTxt = new javax.swing.JTextArea();
        privateChek = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defence/system/images/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 76, 75));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main Defence Controller");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 19, 759, 71));

        areaClearCheck.setBackground(new java.awt.Color(0, 0, 0));
        areaClearCheck.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        areaClearCheck.setForeground(new java.awt.Color(153, 153, 153));
        areaClearCheck.setText("Area Clear");
        areaClearCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearCheckActionPerformed(evt);
            }
        });
        getContentPane().add(areaClearCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 303, 101, 33));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel1.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Soldier Count");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Fuel Percentage");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 104, -1, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Ammo Count");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 69, 78, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tank");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 49, -1));

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Submarine");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Helicopter");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        tankSoldierDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        tankSoldierDisplay.setForeground(new java.awt.Color(0, 153, 0));
        tankSoldierDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tankSoldierDisplay.setText("0");
        jPanel1.add(tankSoldierDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 36, 50, -1));

        subSoldierDisplay.setBackground(new java.awt.Color(0, 0, 0));
        subSoldierDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        subSoldierDisplay.setForeground(new java.awt.Color(0, 153, 0));
        subSoldierDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subSoldierDisplay.setText("0");
        jPanel1.add(subSoldierDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 36, 67, -1));

        heliSoldierDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        heliSoldierDisplay.setForeground(new java.awt.Color(0, 153, 0));
        heliSoldierDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heliSoldierDisplay.setText("0");
        jPanel1.add(heliSoldierDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 36, 70, -1));

        subAmmoDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        subAmmoDisplay.setForeground(new java.awt.Color(0, 153, 0));
        subAmmoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subAmmoDisplay.setText("0");
        jPanel1.add(subAmmoDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 65, 67, -1));

        tankAmmoDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        tankAmmoDisplay.setForeground(new java.awt.Color(0, 153, 0));
        tankAmmoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tankAmmoDisplay.setText("0");
        jPanel1.add(tankAmmoDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 65, 50, -1));

        heliAmmoDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        heliAmmoDisplay.setForeground(new java.awt.Color(0, 153, 0));
        heliAmmoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heliAmmoDisplay.setText("0");
        jPanel1.add(heliAmmoDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 65, 70, -1));

        subFuelDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        subFuelDisplay.setForeground(new java.awt.Color(0, 153, 0));
        subFuelDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subFuelDisplay.setText("0%");
        jPanel1.add(subFuelDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 100, 67, -1));

        tankFuelDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        tankFuelDisplay.setForeground(new java.awt.Color(0, 153, 0));
        tankFuelDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tankFuelDisplay.setText("0%");
        jPanel1.add(tankFuelDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 100, 50, -1));

        heliFuelDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        heliFuelDisplay.setForeground(new java.awt.Color(0, 153, 0));
        heliFuelDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heliFuelDisplay.setText("0%");
        jPanel1.add(heliFuelDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 100, 70, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Energy Percentage");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 139, -1, -1));

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Oxygen Percentage");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 168, -1, -1));

        subEnergyDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        subEnergyDisplay.setForeground(new java.awt.Color(0, 153, 0));
        subEnergyDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subEnergyDisplay.setText("0%");
        jPanel1.add(subEnergyDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 135, 67, -1));

        subOxygenDisplay.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        subOxygenDisplay.setForeground(new java.awt.Color(0, 153, 0));
        subOxygenDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subOxygenDisplay.setText("0%");
        jPanel1.add(subOxygenDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 164, 67, -1));

        jLabel21.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("-");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 135, 50, -1));

        jLabel22.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("-");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 164, 50, -1));

        jLabel23.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("-");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 135, 70, -1));

        jLabel24.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("-");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 164, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 384, 189));

        positionSlider.setBackground(new java.awt.Color(0, 0, 0));
        positionSlider.setForeground(new java.awt.Color(153, 153, 153));
        positionSlider.setMajorTickSpacing(10);
        positionSlider.setMinorTickSpacing(5);
        positionSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        positionSlider.setPaintLabels(true);
        positionSlider.setPaintTicks(true);
        positionSlider.setSnapToTicks(true);
        positionSlider.setValue(0);
        positionSlider.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        positionSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                positionSliderStateChanged(evt);
            }
        });
        getContentPane().add(positionSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 127, -1, 568));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        commanTextArea.setBackground(new java.awt.Color(0, 0, 0));
        commanTextArea.setColumns(20);
        commanTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        commanTextArea.setForeground(new java.awt.Color(0, 153, 0));
        commanTextArea.setRows(5);
        jScrollPane3.setViewportView(commanTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 353, 130));

        sendBtn.setBackground(new java.awt.Color(204, 0, 0));
        sendBtn.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        sendBtn.setText("Send");
        sendBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 136, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Main console");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 108, 372, 189));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(0, 153, 0));
        btn1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btn1.setText("send");
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        btn1.setEnabled(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 60, 40));

        jLabel12.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("submarine console");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        subTxt.setBackground(new java.awt.Color(0, 0, 0));
        subTxt.setColumns(20);
        subTxt.setForeground(new java.awt.Color(0, 153, 0));
        subTxt.setRows(5);
        subTxt.setEnabled(false);
        jScrollPane2.setViewportView(subTxt);

        jScrollPane6.setViewportView(jScrollPane2);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 215, 89));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 342, 230, 151));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setBackground(new java.awt.Color(0, 153, 0));
        btn2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btn2.setText("send");
        btn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        btn2.setEnabled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel5.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 9, 60, 40));

        jLabel13.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("tank console");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        tankTxt.setBackground(new java.awt.Color(0, 0, 0));
        tankTxt.setColumns(20);
        tankTxt.setForeground(new java.awt.Color(0, 153, 0));
        tankTxt.setRows(5);
        tankTxt.setEnabled(false);
        jScrollPane8.setViewportView(tankTxt);

        jScrollPane7.setViewportView(jScrollPane8);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 215, 89));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 342, 229, 151));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3.setBackground(new java.awt.Color(0, 153, 0));
        btn3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        btn3.setText("send");
        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        btn3.setEnabled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel6.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 9, 60, 40));

        jLabel14.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("helicopter console");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        heliTxt.setBackground(new java.awt.Color(0, 0, 0));
        heliTxt.setColumns(20);
        heliTxt.setForeground(new java.awt.Color(0, 153, 0));
        heliTxt.setRows(5);
        heliTxt.setEnabled(false);
        jScrollPane10.setViewportView(heliTxt);

        jScrollPane9.setViewportView(jScrollPane10);

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 215, 89));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 342, 238, 151));

        privateChek.setBackground(new java.awt.Color(0, 0, 0));
        privateChek.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        privateChek.setForeground(new java.awt.Color(153, 153, 153));
        privateChek.setText("Private");
        privateChek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateChekActionPerformed(evt);
            }
        });
        getContentPane().add(privateChek, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 303, 95, 33));

        jLabel15.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("position");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 108, 56, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defence/system/images/Main display.gif"))); // NOI18N
        jLabel16.setText("jLabel16");
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 5, true));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 505, 400, 190));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\danid\\OneDrive\\Desktop\\ICET\\Assignments\\OOP\\Course work\\Final Course work\\Defence System\\src\\defence\\system\\images\\Speaker 1.png")); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 170, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\danid\\OneDrive\\Desktop\\ICET\\Assignments\\OOP\\Course work\\Final Course work\\Defence System\\src\\defence\\system\\images\\Speaker 1.png")); // NOI18N
        jLabel20.setText("jLabel17");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 170, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defence/system/images/Backgrond for main.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaClearCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClearCheckActionPerformed
        boolean areaClear = areaClearCheck.isSelected();
        Observable.setAreaClear(areaClear);
    }//GEN-LAST:event_areaClearCheckActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
    String commanMsg = commanTextArea.getText();
    Observable.setCommanText(commanMsg);// TODO add your handling code here:
    }//GEN-LAST:event_sendBtnActionPerformed

    private void positionSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_positionSliderStateChanged
        int position = positionSlider.getValue();
        Observable.setPosition(position);// TODO add your handling code here:
    }//GEN-LAST:event_positionSliderStateChanged

    private void privateChekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateChekActionPerformed
        if(privateChek.isSelected()){
            subTxt.setEnabled(true);
            tankTxt.setEnabled(true);
            heliTxt.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
        }else{
            subTxt.setEnabled(false);
            tankTxt.setEnabled(false);
            heliTxt.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_privateChekActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
           String text = subTxt.getText();
           Observable.setsubText(text);// TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String text = tankTxt.getText();
        Observable.settankText(text);// TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String text = heliTxt.getText();
        Observable.heliText(text);// TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox areaClearCheck;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JTextArea commanTextArea;
    private javax.swing.JLabel heliAmmoDisplay;
    private javax.swing.JLabel heliFuelDisplay;
    private javax.swing.JLabel heliSoldierDisplay;
    private javax.swing.JTextArea heliTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider positionSlider;
    private javax.swing.JCheckBox privateChek;
    private javax.swing.JButton sendBtn;
    private javax.swing.JLabel subAmmoDisplay;
    private javax.swing.JLabel subEnergyDisplay;
    private javax.swing.JLabel subFuelDisplay;
    private javax.swing.JLabel subOxygenDisplay;
    private javax.swing.JLabel subSoldierDisplay;
    private javax.swing.JTextArea subTxt;
    private javax.swing.JLabel tankAmmoDisplay;
    private javax.swing.JLabel tankFuelDisplay;
    private javax.swing.JLabel tankSoldierDisplay;
    private javax.swing.JTextArea tankTxt;
    // End of variables declaration//GEN-END:variables

}
