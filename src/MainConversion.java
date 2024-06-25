
import javax.swing.JOptionPane;


public class MainConversion extends javax.swing.JFrame {

    
    public MainConversion() {
        initComponents();
        tabs.setSelectedIndex(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Numbers = new javax.swing.JPanel();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        buttonbp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TempButton = new javax.swing.JButton();
        number = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UnitsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        IOPane = new javax.swing.JPanel();
        InputField = new javax.swing.JTextField();
        OutputField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Convert = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        units = new javax.swing.JPanel();
        inputCombo = new javax.swing.JComboBox<>();
        outputCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        temp = new javax.swing.JPanel();
        tempOutput = new javax.swing.JComboBox<>();
        tempInput = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        baseNum = new javax.swing.JPanel();
        numberOutput = new javax.swing.JComboBox<>();
        numberInput = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        time = new javax.swing.JPanel();
        timeInput = new javax.swing.JComboBox<>();
        timeOutput = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        volume = new javax.swing.JPanel();
        volumeInput = new javax.swing.JComboBox<>();
        volumeOutput = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Numbers.setBackground(new java.awt.Color(102, 102, 102));

        One.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        One.setContentAreaFilled(false);
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        Two.setContentAreaFilled(false);
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        Three.setContentAreaFilled(false);
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        Four.setContentAreaFilled(false);
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png"))); // NOI18N
        Five.setContentAreaFilled(false);
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        Six.setContentAreaFilled(false);
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        Seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.png"))); // NOI18N
        Seven.setContentAreaFilled(false);
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8.png"))); // NOI18N
        Eight.setContentAreaFilled(false);
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.png"))); // NOI18N
        Nine.setContentAreaFilled(false);
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.png"))); // NOI18N
        Zero.setContentAreaFilled(false);
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/period.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CLEAR.png"))); // NOI18N
        clear.setContentAreaFilled(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        buttonbp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKSPACE.png"))); // NOI18N
        buttonbp.setContentAreaFilled(false);
        buttonbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbpActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        TempButton.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        TempButton.setForeground(new java.awt.Color(255, 255, 255));
        TempButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temp.png"))); // NOI18N
        TempButton.setContentAreaFilled(false);
        TempButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempButtonActionPerformed(evt);
            }
        });

        number.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NumberSystem.png"))); // NOI18N
        number.setContentAreaFilled(false);
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("FSP DEMO - Proxima Nova Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUMBER SYSTEMS");
        jLabel1.setAutoscrolls(true);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimeCon.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("FSP DEMO - Proxima Nova Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIME");

        jLabel3.setFont(new java.awt.Font("FSP DEMO - Proxima Nova Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TERMPERATURE");

        UnitsButton.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        UnitsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Length.png"))); // NOI18N
        UnitsButton.setContentAreaFilled(false);
        UnitsButton.setMaximumSize(new java.awt.Dimension(573, 519));
        UnitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitsButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("FSP DEMO - Proxima Nova Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LENGTH");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Volume.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("FSP DEMO - Proxima Nova Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VOLUME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(114, 114, 114))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TempButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(UnitsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(number)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TempButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(UnitsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NumbersLayout = new javax.swing.GroupLayout(Numbers);
        Numbers.setLayout(NumbersLayout);
        NumbersLayout.setHorizontalGroup(
            NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumbersLayout.createSequentialGroup()
                .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumbersLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonbp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NumbersLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(One, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NumbersLayout.createSequentialGroup()
                                .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NumbersLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NumbersLayout.createSequentialGroup()
                                        .addComponent(Eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NumbersLayout.createSequentialGroup()
                                .addComponent(Five)
                                .addGap(18, 18, 18)
                                .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NumbersLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Two)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        NumbersLayout.setVerticalGroup(
            NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumbersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear)
                    .addComponent(buttonbp))
                .addGap(15, 15, 15)
                .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(One, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Two))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Four)
                    .addComponent(Five)
                    .addComponent(Six))
                .addGap(18, 18, 18)
                .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eight)
                    .addComponent(Seven)
                    .addComponent(Nine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Zero)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Numbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, 580, 620));

        IOPane.setBackground(new java.awt.Color(204, 204, 204));

        InputField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        InputField.setToolTipText("Set value");
        InputField.setBorder(null);

        OutputField.setEditable(false);
        OutputField.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        OutputField.setToolTipText("Set value");
        OutputField.setBorder(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimise.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Convert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free-convert-icon-3210-thumb.png"))); // NOI18N
        Convert.setContentAreaFilled(false);
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("FSP DEMO - Proxima Nova Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONVERT");

        javax.swing.GroupLayout IOPaneLayout = new javax.swing.GroupLayout(IOPane);
        IOPane.setLayout(IOPaneLayout);
        IOPaneLayout.setHorizontalGroup(
            IOPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IOPaneLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(IOPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OutputField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(InputField))
                .addGroup(IOPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IOPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(IOPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(IOPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(Convert))
                        .addGap(44, 44, 44))))
        );
        IOPaneLayout.setVerticalGroup(
            IOPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IOPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IOPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(4, 4, 4)
                .addGroup(IOPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IOPaneLayout.createSequentialGroup()
                        .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OutputField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IOPaneLayout.createSequentialGroup()
                        .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(IOPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 400, 210));

        units.setBackground(new java.awt.Color(153, 153, 153));

        inputCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inches", "Feet", "Yard", "Miles", "Millimeters", "Centimeters", "Meters", "Kilometers" }));
        inputCombo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        inputCombo.setVerifyInputWhenFocusTarget(false);

        outputCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inches", "Feet", "Yard", "Miles", "Millimeters", "Centimeters", "Meters", "Kilometers" }));

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel8.setText("Length");

        javax.swing.GroupLayout unitsLayout = new javax.swing.GroupLayout(units);
        units.setLayout(unitsLayout);
        unitsLayout.setHorizontalGroup(
            unitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsLayout.createSequentialGroup()
                .addGroup(unitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(unitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, unitsLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(outputCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(unitsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(inputCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(unitsLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel8)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        unitsLayout.setVerticalGroup(
            unitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tabs.addTab("tab1", units);

        temp.setBackground(new java.awt.Color(153, 153, 153));

        tempOutput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));

        tempInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setText("Temperature");

        javax.swing.GroupLayout tempLayout = new javax.swing.GroupLayout(temp);
        temp.setLayout(tempLayout);
        tempLayout.setHorizontalGroup(
            tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tempLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tempOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        tempLayout.setVerticalGroup(
            tempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tempLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tempOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tabs.addTab("tab2", temp);

        baseNum.setBackground(new java.awt.Color(153, 153, 153));

        numberOutput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary", "Decimal", "Hexadecimal", "Octal" }));

        numberInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary", "Decimal", "Hexadecimal", "Octal" }));

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel9.setText("Numbers");

        javax.swing.GroupLayout baseNumLayout = new javax.swing.GroupLayout(baseNum);
        baseNum.setLayout(baseNumLayout);
        baseNumLayout.setHorizontalGroup(
            baseNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseNumLayout.createSequentialGroup()
                .addGroup(baseNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(baseNumLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel9))
                    .addGroup(baseNumLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(baseNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        baseNumLayout.setVerticalGroup(
            baseNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseNumLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        tabs.addTab("tab3", baseNum);

        time.setBackground(new java.awt.Color(153, 153, 153));

        timeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seconds", "Minutes", "Hours", "Days", "Weeks", "Months", "Years", " " }));

        timeOutput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seconds", "Minutes", "Hours", "Days", "Weeks", "Months", "Years", " " }));

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel11.setText("Time");

        javax.swing.GroupLayout timeLayout = new javax.swing.GroupLayout(time);
        time.setLayout(timeLayout);
        timeLayout.setHorizontalGroup(
            timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeLayout.createSequentialGroup()
                .addGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(timeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(timeLayout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(timeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(timeLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel11)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        timeLayout.setVerticalGroup(
            timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(timeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tabs.addTab("tab4", time);

        volume.setBackground(new java.awt.Color(153, 153, 153));

        volumeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milliliters", "Liters", "Cubic Meters", "Cubic Centimeters", "Gallons" }));

        volumeOutput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milliliters", "Liters", "Cubic Meters", "Cubic Centimeters", "Gallons" }));

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel10.setText("Volume");

        javax.swing.GroupLayout volumeLayout = new javax.swing.GroupLayout(volume);
        volume.setLayout(volumeLayout);
        volumeLayout.setHorizontalGroup(
            volumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volumeLayout.createSequentialGroup()
                .addGroup(volumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(volumeLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(volumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(volumeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volumeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(volumeLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel10)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        volumeLayout.setVerticalGroup(
            volumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volumeLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volumeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        tabs.addTab("tab5", volume);

        getContentPane().add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -39, 260, 250));

        setSize(new java.awt.Dimension(576, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        try {
            int selectedIndex = tabs.getSelectedIndex();
            switch (selectedIndex) {
                case 0:
                    // For unit conversions
                    float input = Float.parseFloat(InputField.getText());

                    String unitOut = (String) outputCombo.getSelectedItem();
                    String unit = (String) inputCombo.getSelectedItem();

                    Conversion.setUnit(unit, unitOut);
                    Conversion.setInput(input);

                    // Perform the conversion and set the output field text
                    float output = Conversion.result();
                    OutputField.setText(String.format("%.2f", output));
                    break;

                case 1:
                    // For temperature conversions
                    input = Float.parseFloat(InputField.getText());

                    unitOut = (String) tempOutput.getSelectedItem();
                    unit = (String) tempInput.getSelectedItem();

                    TemperatureConversion.setUnit(unit, unitOut);
                    TemperatureConversion.setInput(input);

                    Float tempOutputValue = TemperatureConversion.result();
                    if (tempOutputValue == null) {
                        JOptionPane.showMessageDialog(null, "Invalid conversion units.");
                        return;
                    }
                    OutputField.setText(String.format("%.2f", tempOutputValue));
                    break;

                case 2:
                    // For number conversions
                    String inputText = InputField.getText();

                    unitOut = (String) numberOutput.getSelectedItem();
                    unit = (String) numberInput.getSelectedItem();

                    NumberConversion.setBase(unit, unitOut);
                    NumberConversion.setInput(inputText);

                    String numberOutputValue = NumberConversion.result();
                    if (numberOutputValue == null) {
                        JOptionPane.showMessageDialog(null, "Invalid conversion units.");
                        return;
                    }
                    OutputField.setText(numberOutputValue);
                    break;

                case 3:
                    // For time conversions
                    inputText = InputField.getText();
                    double timeInputValue = Double.parseDouble(inputText);

                    unitOut = (String) timeOutput.getSelectedItem();
                    unit = (String) timeInput.getSelectedItem();

                    TimeConversion.setUnit(unit, unitOut);
                    TimeConversion.setInput(timeInputValue);

                    double timeOutputValue = TimeConversion.result();
                    OutputField.setText(String.format("%.2f", timeOutputValue));
                    break;

                default:
                    // For volume conversions
                    inputText = InputField.getText();
                    double volumeInputValue = Double.parseDouble(inputText);

                    unitOut = (String) volumeOutput.getSelectedItem();
                    unit = (String) volumeInput.getSelectedItem();

                    VolumeConversion.setUnit(unit, unitOut);
                    VolumeConversion.setInput(volumeInputValue);

                    double volumeOutputValue = VolumeConversion.result();
                    OutputField.setText(String.format("%.2f", volumeOutputValue));
                    break;
            }  
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            InputField.setText("");
        }
    }//GEN-LAST:event_ConvertActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "1";
        InputField.setText(newText);
    }//GEN-LAST:event_OneActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "2";
        InputField.setText(newText);
    }//GEN-LAST:event_TwoActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "3";
        InputField.setText(newText);
    }//GEN-LAST:event_ThreeActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "4";
        InputField.setText(newText);
    }//GEN-LAST:event_FourActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "5";
        InputField.setText(newText);
    }//GEN-LAST:event_FiveActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "6";
        InputField.setText(newText);
    }//GEN-LAST:event_SixActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "7";
        InputField.setText(newText);
    }//GEN-LAST:event_SevenActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "8";
        InputField.setText(newText);
    }//GEN-LAST:event_EightActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "9";
        InputField.setText(newText);
    }//GEN-LAST:event_NineActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + "0";
        InputField.setText(newText);
    }//GEN-LAST:event_ZeroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(MainConversion.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String currentText = InputField.getText();
        String newText = currentText + ".";
        InputField.setText(newText);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void UnitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitsButtonActionPerformed
        tabs.setSelectedIndex(0);
        clearActionPerformed(evt);
    }//GEN-LAST:event_UnitsButtonActionPerformed

    private void TempButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempButtonActionPerformed
        tabs.setSelectedIndex(1);
        clearActionPerformed(evt);
    }//GEN-LAST:event_TempButtonActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        InputField.setText("");
        OutputField.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        tabs.setSelectedIndex(2);
        clearActionPerformed(evt);
        
                
    }//GEN-LAST:event_numberActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tabs.setSelectedIndex(3);
        clearActionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tabs.setSelectedIndex(4);
        clearActionPerformed(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void buttonbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbpActionPerformed
       String currentText = InputField.getText();
        if (currentText.length() > 0) {
            String newText = currentText.substring(0, currentText.length() - 1);
            InputField.setText(newText);
        } else {
            InputField.setText(currentText);
        }       
    }//GEN-LAST:event_buttonbpActionPerformed

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
            java.util.logging.Logger.getLogger(MainConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainConversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JPanel IOPane;
    private javax.swing.JTextField InputField;
    private javax.swing.JButton Nine;
    private javax.swing.JPanel Numbers;
    private javax.swing.JButton One;
    private javax.swing.JTextField OutputField;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton TempButton;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton UnitsButton;
    private javax.swing.JButton Zero;
    private javax.swing.JPanel baseNum;
    private javax.swing.JButton buttonbp;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> inputCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton number;
    private javax.swing.JComboBox<String> numberInput;
    private javax.swing.JComboBox<String> numberOutput;
    private javax.swing.JComboBox<String> outputCombo;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPanel temp;
    private javax.swing.JComboBox<String> tempInput;
    private javax.swing.JComboBox<String> tempOutput;
    private javax.swing.JPanel time;
    private javax.swing.JComboBox<String> timeInput;
    private javax.swing.JComboBox<String> timeOutput;
    private javax.swing.JPanel units;
    private javax.swing.JPanel volume;
    private javax.swing.JComboBox<String> volumeInput;
    private javax.swing.JComboBox<String> volumeOutput;
    // End of variables declaration//GEN-END:variables
}
