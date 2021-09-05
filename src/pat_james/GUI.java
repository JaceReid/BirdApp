package pat_james;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author James Devine
 */
public class GUI extends javax.swing.JFrame {

    static String password = "";
    static int userID = 0;
    static String colour = "";
    static int foundbird = 0;
    int width;

    static ArrayList<String> output = new ArrayList<>();
    ArrayList<Bird> birdArr;
    BirdsManger bm = new BirdsManger();
    AppManger am = new AppManger();
    SpeciesManger sm = new SpeciesManger();
    LogManger lm = new LogManger();

    DefaultTreeModel BirdTreeModel;
    DefaultTreeModel LogTreeModel;

    DefaultMutableTreeNode BirdTreeRootNode = new DefaultMutableTreeNode("Birds");
    DefaultMutableTreeNode LogTreeRootNode = new DefaultMutableTreeNode("Log");

    public GUI() {
        initCustomModels();
        initComponents();

    }

    private void initCustomModels() {

        CreateBirdNode(BirdTreeRootNode);

        BirdTreeModel = new DefaultTreeModel(BirdTreeRootNode);

    }

    private void CreateBirdNode(DefaultMutableTreeNode top) {
        ArrayList<Species> specArr = sm.getSpecciesArr();
        for (Species specArr1 : specArr) {
            top.add(specArr1);
        }

        ArrayList<Bird> birdArr = bm.getBirdArr();

        for (Bird b : birdArr) {

            for (Species s : specArr) {
                if (s.getId() == b.getSpecies()) {
                    s.add(b);
                }
            }
        }
    }

    private void CreateLogNode(DefaultMutableTreeNode top) {
        ArrayList<Log> LogArr = lm.getLogArr();
        for (Log L : LogArr) {
//            System.out.println(userID);
            if (L.getUserID() == userID) {

                top.add(L);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfLogin = new javax.swing.JFrame();
        jLabel21 = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        txfUsername = new javax.swing.JTextField();
        txfPassword = new javax.swing.JTextField();
        btNewUser = new javax.swing.JButton();
        bthelpLogin = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        jfNewUser = new javax.swing.JFrame();
        txfNewUserName = new javax.swing.JTextField();
        txfNewUserPassword1 = new javax.swing.JTextField();
        txfNewUserPassword2 = new javax.swing.JTextField();
        lblNewUserName = new javax.swing.JLabel();
        lblNewUserPassword1 = new javax.swing.JLabel();
        lblNewUserPassword2 = new javax.swing.JLabel();
        btNewUserEnter = new javax.swing.JButton();
        btNewUserCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CBAdmin = new javax.swing.JCheckBox();
        lblBackgroundNewUser = new javax.swing.JLabel();
        jfMainMenu = new javax.swing.JFrame();
        btLog = new javax.swing.JButton();
        btFind = new javax.swing.JButton();
        btBirdBook = new javax.swing.JButton();
        btAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jfAdmin = new javax.swing.JFrame();
        btReadSpecies = new javax.swing.JButton();
        btReadBirds = new javax.swing.JButton();
        btReadAll = new javax.swing.JButton();
        btAdminBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jfLog = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaLog = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtLog = new javax.swing.JTree();
        btBackMain = new javax.swing.JButton();
        btNewLog = new javax.swing.JButton();
        lblbackgroundLog = new javax.swing.JLabel();
        jfCreateLog = new javax.swing.JFrame();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txfLogLocation = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txaNewLogDesc = new javax.swing.JTextArea();
        btNewLogOkay = new javax.swing.JButton();
        btNewLogCancel = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        DCLogDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLogBird = new javax.swing.JTree();
        lblBGCreateLog = new javax.swing.JLabel();
        jfFind = new javax.swing.JFrame();
        btBackMain1 = new javax.swing.JButton();
        DBFindBirdType = new javax.swing.JComboBox();
        CBHabitat = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txafoundbirds = new javax.swing.JTextArea();
        btjfFindfind = new javax.swing.JButton();
        btFindColourPicker = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txfFindSize = new javax.swing.JTextField();
        btFindNext = new javax.swing.JButton();
        btFindPrevious = new javax.swing.JButton();
        lblFindBirdImage = new javax.swing.JLabel();
        lblBGFind = new javax.swing.JLabel();
        jfBirdBook = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaBirdBook = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btBackMain2 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jtBridBook = new javax.swing.JTree();
        lblBirdImageBirdBook = new javax.swing.JLabel();
        lblbackgroundLog2 = new javax.swing.JLabel();
        jfhelp = new javax.swing.JFrame();
        lblhelpPage = new javax.swing.JLabel();
        jfPickColour = new javax.swing.JFrame();
        CBPickColourBrown = new javax.swing.JCheckBox();
        CBPickColourBlue = new javax.swing.JCheckBox();
        CBPickColourGreen = new javax.swing.JCheckBox();
        CBPickColourOrange = new javax.swing.JCheckBox();
        CBPickColourBlack = new javax.swing.JCheckBox();
        CBPickColourRed = new javax.swing.JCheckBox();
        CBPickColourWhite = new javax.swing.JCheckBox();
        CBPickColourGrey = new javax.swing.JCheckBox();
        btColourPickerOK = new javax.swing.JButton();
        lblBGColourPicker = new javax.swing.JLabel();
        jfBirdIDList = new javax.swing.JFrame();
        lblBackgroundBirdIDList = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTree3 = new javax.swing.JTree();
        btBackMain3 = new javax.swing.JButton();
        lblbackgroundLog3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btBackMain4 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txafoundbirds1 = new javax.swing.JTextArea();
        btjfFindfind1 = new javax.swing.JButton();
        lblbackgroundLog4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTree4 = new javax.swing.JTree();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        btBackMain5 = new javax.swing.JButton();
        lblbackgroundLog5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpMainMenu = new javax.swing.JPanel();
        btLog1 = new javax.swing.JButton();
        btFind1 = new javax.swing.JButton();
        btBirdBook1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jpLog = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTree5 = new javax.swing.JTree();
        btBackMain6 = new javax.swing.JButton();
        lblbackgroundLog6 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        jfLogin.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfLogin.setTitle("Login");
        jfLogin.setMinimumSize(new java.awt.Dimension(600, 399));
        jfLogin.setResizable(false);
        jfLogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jfLogin.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, 20));

        btLogin.setText("Enter");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jfLogin.getContentPane().add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, -1));

        lblLogin.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lblLogin.setText("Login:");
        jfLogin.getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        txfUsername.setForeground(new java.awt.Color(166, 155, 155));
        txfUsername.setText("James");
        txfUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfUsernameMouseClicked(evt);
            }
        });
        jfLogin.getContentPane().add(txfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, -1));

        txfPassword.setForeground(new java.awt.Color(166, 155, 155));
        txfPassword.setText("1234");
        txfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfPasswordMouseClicked(evt);
            }
        });
        jfLogin.getContentPane().add(txfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 90, -1));

        btNewUser.setText("New User?");
        btNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewUserActionPerformed(evt);
            }
        });
        jfLogin.getContentPane().add(btNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        bthelpLogin.setText("Help");
        bthelpLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpLoginActionPerformed(evt);
            }
        });
        jfLogin.getContentPane().add(bthelpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfLogin.getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 370));

        jfNewUser.setTitle("New User");
        jfNewUser.setMinimumSize(new java.awt.Dimension(600, 399));
        jfNewUser.setName("New User"); // NOI18N
        jfNewUser.setResizable(false);
        jfNewUser.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jfNewUser.getContentPane().add(txfNewUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, -1));

        txfNewUserPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNewUserPassword1ActionPerformed(evt);
            }
        });
        jfNewUser.getContentPane().add(txfNewUserPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, -1));
        jfNewUser.getContentPane().add(txfNewUserPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, -1));

        lblNewUserName.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        lblNewUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblNewUserName.setText("Name:");
        jfNewUser.getContentPane().add(lblNewUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        lblNewUserPassword1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        lblNewUserPassword1.setForeground(new java.awt.Color(255, 255, 255));
        lblNewUserPassword1.setText("Password:");
        jfNewUser.getContentPane().add(lblNewUserPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        lblNewUserPassword2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        lblNewUserPassword2.setForeground(new java.awt.Color(255, 255, 255));
        lblNewUserPassword2.setText("Comfirm Password:");
        jfNewUser.getContentPane().add(lblNewUserPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        btNewUserEnter.setText("Confirm");
        btNewUserEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewUserEnterActionPerformed(evt);
            }
        });
        jfNewUser.getContentPane().add(btNewUserEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        btNewUserCancel.setText("Cancel");
        btNewUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewUserCancelActionPerformed(evt);
            }
        });
        jfNewUser.getContentPane().add(btNewUserCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel11.setText("Sign Up");
        jfNewUser.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Admin:");
        jfNewUser.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 80, -1));
        jfNewUser.getContentPane().add(CBAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        lblBackgroundNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfNewUser.getContentPane().add(lblBackgroundNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 601, 391));

        jfMainMenu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfMainMenu.setTitle("Main Menu");
        jfMainMenu.setMaximumSize(new java.awt.Dimension(600, 399));
        jfMainMenu.setMinimumSize(new java.awt.Dimension(600, 399));
        jfMainMenu.setPreferredSize(new java.awt.Dimension(600, 399));
        jfMainMenu.setResizable(false);
        jfMainMenu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btLog.setText("Log");
        btLog.setMaximumSize(new java.awt.Dimension(55, 23));
        btLog.setMinimumSize(new java.awt.Dimension(55, 23));
        btLog.setPreferredSize(new java.awt.Dimension(85, 30));
        btLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogActionPerformed(evt);
            }
        });
        jfMainMenu.getContentPane().add(btLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        btFind.setText("Find");
        btFind.setMaximumSize(new java.awt.Dimension(55, 23));
        btFind.setMinimumSize(new java.awt.Dimension(55, 23));
        btFind.setPreferredSize(new java.awt.Dimension(85, 30));
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });
        jfMainMenu.getContentPane().add(btFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        btBirdBook.setText("Bird Book");
        btBirdBook.setMaximumSize(new java.awt.Dimension(55, 23));
        btBirdBook.setMinimumSize(new java.awt.Dimension(55, 23));
        btBirdBook.setPreferredSize(new java.awt.Dimension(85, 30));
        btBirdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBirdBookActionPerformed(evt);
            }
        });
        jfMainMenu.getContentPane().add(btBirdBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        btAdmin.setText("Admin Page");
        btAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdminActionPerformed(evt);
            }
        });
        jfMainMenu.getContentPane().add(btAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfMainMenu.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, 400));

        jfMainMenu.getAccessibleContext().setAccessibleParent(this);

        jfAdmin.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfAdmin.setTitle("Main Menu");
        jfAdmin.setMinimumSize(new java.awt.Dimension(600, 399));
        jfAdmin.setResizable(false);
        jfAdmin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btReadSpecies.setText("Read Species");
        btReadSpecies.setMaximumSize(new java.awt.Dimension(55, 23));
        btReadSpecies.setMinimumSize(new java.awt.Dimension(55, 23));
        btReadSpecies.setPreferredSize(new java.awt.Dimension(85, 30));
        btReadSpecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReadSpeciesActionPerformed(evt);
            }
        });
        jfAdmin.getContentPane().add(btReadSpecies, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 180, 110, -1));

        btReadBirds.setText("Read Birds");
        btReadBirds.setMaximumSize(new java.awt.Dimension(55, 23));
        btReadBirds.setMinimumSize(new java.awt.Dimension(55, 23));
        btReadBirds.setPreferredSize(new java.awt.Dimension(85, 30));
        btReadBirds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReadBirdsActionPerformed(evt);
            }
        });
        jfAdmin.getContentPane().add(btReadBirds, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        btReadAll.setText("Read All");
        btReadAll.setMaximumSize(new java.awt.Dimension(55, 23));
        btReadAll.setMinimumSize(new java.awt.Dimension(55, 23));
        btReadAll.setPreferredSize(new java.awt.Dimension(85, 30));
        btReadAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReadAllActionPerformed(evt);
            }
        });
        jfAdmin.getContentPane().add(btReadAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        btAdminBack.setText("Back");
        btAdminBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdminBackActionPerformed(evt);
            }
        });
        jfAdmin.getContentPane().add(btAdminBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfAdmin.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, 400));

        jfLog.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfLog.setMinimumSize(new java.awt.Dimension(600, 399));
        jfLog.setResizable(false);
        jfLog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jfLogWindowClosed(evt);
            }
        });
        jfLog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setText("Log Book");
        jfLog.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 20));

        txaLog.setColumns(20);
        txaLog.setRows(5);
        jScrollPane2.setViewportView(txaLog);

        jfLog.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 310, 280));

        jtLog.setModel(LogTreeModel);
        jtLog.setRootVisible(false);
        jtLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLogMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtLog);

        jfLog.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 42, 140, 280));

        btBackMain.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btBackMain.setText("Back");
        btBackMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMainActionPerformed(evt);
            }
        });
        jfLog.getContentPane().add(btBackMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        btNewLog.setText("New");
        btNewLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewLogActionPerformed(evt);
            }
        });
        jfLog.getContentPane().add(btNewLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        lblbackgroundLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco in tree small.jpg"))); // NOI18N
        jfLog.getContentPane().add(lblbackgroundLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 399));

        jfCreateLog.setMinimumSize(new java.awt.Dimension(600, 399));
        jfCreateLog.setResizable(false);
        jfCreateLog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Bird");
        jfCreateLog.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel24.setText("Location");
        jfCreateLog.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txfLogLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });
        jfCreateLog.getContentPane().add(txfLogLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel25.setText("Date");
        jfCreateLog.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txaNewLogDesc.setColumns(20);
        txaNewLogDesc.setRows(5);
        jScrollPane13.setViewportView(txaNewLogDesc);

        jfCreateLog.getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, 110));

        btNewLogOkay.setText("Okay");
        btNewLogOkay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewLogOkayActionPerformed(evt);
            }
        });
        jfCreateLog.getContentPane().add(btNewLogOkay, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        btNewLogCancel.setText("Cancel");
        jfCreateLog.getContentPane().add(btNewLogCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel26.setText("Descrition");
        jfCreateLog.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jfCreateLog.getContentPane().add(DCLogDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, 30));

        jtLogBird.setModel(BirdTreeModel);
        jScrollPane1.setViewportView(jtLogBird);

        jfCreateLog.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 180, 320));

        lblBGCreateLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco in tree small.jpg"))); // NOI18N
        lblBGCreateLog.setText("jLabel22");
        jfCreateLog.getContentPane().add(lblBGCreateLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        jfFind.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfFind.setMinimumSize(new java.awt.Dimension(600, 399));
        jfFind.setResizable(false);
        jfFind.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btBackMain1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btBackMain1.setText("Back");
        btBackMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMain1ActionPerformed(evt);
            }
        });
        jfFind.getContentPane().add(btBackMain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        jfFind.getContentPane().add(DBFindBirdType, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 150, -1));

        CBHabitat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grasslands", "Forest", "Fynbos", "Lake", "River", "Ocean", "Seashore", "Karoo" }));
        CBHabitat.setToolTipText("");
        jfFind.getContentPane().add(CBHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 90, -1));

        jLabel4.setText("Bird Type");
        jfFind.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setText("Size");
        jfFind.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel6.setText("Habitat");
        jfFind.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setText("Colour");
        jfFind.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txafoundbirds.setColumns(20);
        txafoundbirds.setRows(5);
        jScrollPane5.setViewportView(txafoundbirds);

        jfFind.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 360, 250));

        btjfFindfind.setText("Find");
        btjfFindfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjfFindfindActionPerformed(evt);
            }
        });
        jfFind.getContentPane().add(btjfFindfind, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        btFindColourPicker.setText("Pick a colour");
        btFindColourPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindColourPickerActionPerformed(evt);
            }
        });
        jfFind.getContentPane().add(btFindColourPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel8.setText("cm");
        jfFind.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 30, 20));
        jfFind.getContentPane().add(txfFindSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, -1));

        btFindNext.setText("Next");
        btFindNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindNextActionPerformed(evt);
            }
        });
        jfFind.getContentPane().add(btFindNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 80, -1));

        btFindPrevious.setText("Previous");
        btFindPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindPreviousActionPerformed(evt);
            }
        });
        jfFind.getContentPane().add(btFindPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        lblFindBirdImage.setMaximumSize(new java.awt.Dimension(120, 150));
        lblFindBirdImage.setMinimumSize(new java.awt.Dimension(90, 120));
        lblFindBirdImage.setPreferredSize(new java.awt.Dimension(100, 130));
        jfFind.getContentPane().add(lblFindBirdImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 140));

        lblBGFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco in tree 2 small.jpg"))); // NOI18N
        jfFind.getContentPane().add(lblBGFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 600, 400));

        jfBirdBook.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfBirdBook.setMinimumSize(new java.awt.Dimension(600, 399));
        jfBirdBook.setResizable(false);
        jfBirdBook.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaBirdBook.setColumns(20);
        txaBirdBook.setRows(5);
        jScrollPane4.setViewportView(txaBirdBook);

        jfBirdBook.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 260, 320));

        jLabel3.setText("Bird Book");
        jfBirdBook.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btBackMain2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btBackMain2.setText("Back");
        btBackMain2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMain2ActionPerformed(evt);
            }
        });
        jfBirdBook.getContentPane().add(btBackMain2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        jtBridBook.setModel(BirdTreeModel);
        jtBridBook.setEditable(true);
        jtBridBook.setRootVisible(false);
        jtBridBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtBridBookMousePressed(evt);
            }
        });
        jScrollPane15.setViewportView(jtBridBook);

        jfBirdBook.getContentPane().add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 320));
        jfBirdBook.getContentPane().add(lblBirdImageBirdBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 214, 140, 140));

        lblbackgroundLog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna_Turaco in tree 3 small.jpg"))); // NOI18N
        jfBirdBook.getContentPane().add(lblbackgroundLog2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 600, 400));

        jfhelp.setMinimumSize(new java.awt.Dimension(600, 399));
        jfhelp.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jfhelp.getContentPane().add(lblhelpPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 607, 401));

        jfPickColour.setTitle("New User");
        jfPickColour.setMinimumSize(new java.awt.Dimension(540, 185));
        jfPickColour.setName("New User"); // NOI18N
        jfPickColour.setResizable(false);
        jfPickColour.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBPickColourBrown.setText("Brown");
        jfPickColour.getContentPane().add(CBPickColourBrown, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        CBPickColourBlue.setText("Blue");
        jfPickColour.getContentPane().add(CBPickColourBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        CBPickColourGreen.setText("Green");
        jfPickColour.getContentPane().add(CBPickColourGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        CBPickColourOrange.setText("Orange");
        jfPickColour.getContentPane().add(CBPickColourOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        CBPickColourBlack.setText("Black");
        jfPickColour.getContentPane().add(CBPickColourBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        CBPickColourRed.setText("Red");
        jfPickColour.getContentPane().add(CBPickColourRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        CBPickColourWhite.setText("White");
        jfPickColour.getContentPane().add(CBPickColourWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        CBPickColourGrey.setText("Grey");
        jfPickColour.getContentPane().add(CBPickColourGrey, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btColourPickerOK.setText("Okay");
        btColourPickerOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btColourPickerOKActionPerformed(evt);
            }
        });
        jfPickColour.getContentPane().add(btColourPickerOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        lblBGColourPicker.setBackground(new java.awt.Color(52, 104, 109));
        lblBGColourPicker.setForeground(new java.awt.Color(0, 72, 72));
        lblBGColourPicker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna_Turaco in tree 3 small.jpg"))); // NOI18N
        jfPickColour.getContentPane().add(lblBGColourPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 190));

        jfBirdIDList.setTitle("List of Bird ID");
        jfBirdIDList.setBackground(new java.awt.Color(4, 120, 134));
        jfBirdIDList.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jfBirdIDList.setMinimumSize(new java.awt.Dimension(599, 398));
        jfBirdIDList.setResizable(false);
        jfBirdIDList.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackgroundBirdIDList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco in tree small.jpg"))); // NOI18N
        jfBirdIDList.getContentPane().add(lblBackgroundBirdIDList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel10.setText("Log Book");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 20));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 270, 220));

        jScrollPane7.setViewportView(jTree3);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 42, 140, 220));

        btBackMain3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btBackMain3.setText("Back");
        btBackMain3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMain3ActionPerformed(evt);
            }
        });
        jPanel1.add(btBackMain3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        lblbackgroundLog3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco in tree small.jpg"))); // NOI18N
        jPanel1.add(lblbackgroundLog3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 399));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btBackMain4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btBackMain4.setText("Back");
        btBackMain4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMain4ActionPerformed(evt);
            }
        });
        jPanel2.add(btBackMain4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel12.setText("Bird Type");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel13.setText("Size");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel14.setText("Habitat");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel15.setText("Colour");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel16.setText("Beak type");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel17.setText("Time seen");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txafoundbirds1.setColumns(20);
        txafoundbirds1.setRows(5);
        jScrollPane8.setViewportView(txafoundbirds1);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 70, 230, 230));

        btjfFindfind1.setText("Find");
        btjfFindfind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjfFindfind1ActionPerformed(evt);
            }
        });
        jPanel2.add(btjfFindfind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        lblbackgroundLog4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco in tree 2 small.jpg"))); // NOI18N
        jPanel2.add(lblbackgroundLog4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 600, 400));

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane9.setViewportView(jTree4);

        jPanel3.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 320));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane10.setViewportView(jTextArea4);

        jPanel3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 330, 320));

        jLabel18.setText("Bird Book");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btBackMain5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btBackMain5.setText("Back");
        btBackMain5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMain5ActionPerformed(evt);
            }
        });
        jPanel3.add(btBackMain5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        lblbackgroundLog5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna_Turaco in tree 3 small.jpg"))); // NOI18N
        jPanel3.add(lblbackgroundLog5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 600, 400));

        jTabbedPane1.addTab("tab3", jPanel3);

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btLog1.setText("Log");
        btLog1.setMaximumSize(new java.awt.Dimension(55, 23));
        btLog1.setMinimumSize(new java.awt.Dimension(55, 23));
        btLog1.setPreferredSize(new java.awt.Dimension(85, 30));
        btLog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLog1ActionPerformed(evt);
            }
        });
        jpMainMenu.add(btLog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        btFind1.setText("Find");
        btFind1.setMaximumSize(new java.awt.Dimension(55, 23));
        btFind1.setMinimumSize(new java.awt.Dimension(55, 23));
        btFind1.setPreferredSize(new java.awt.Dimension(85, 30));
        btFind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFind1ActionPerformed(evt);
            }
        });
        jpMainMenu.add(btFind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        btBirdBook1.setText("Bird Book");
        btBirdBook1.setMaximumSize(new java.awt.Dimension(55, 23));
        btBirdBook1.setMinimumSize(new java.awt.Dimension(55, 23));
        btBirdBook1.setPreferredSize(new java.awt.Dimension(85, 30));
        btBirdBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBirdBook1ActionPerformed(evt);
            }
        });
        jpMainMenu.add(btBirdBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jpMainMenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, 400));

        jLayeredPane1.add(jpMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        jpLog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel20.setText("Log Book");
        jpLog.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 20));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane11.setViewportView(jTextArea5);

        jpLog.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 270, 220));

        jScrollPane12.setViewportView(jTree5);

        jpLog.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 42, 140, 220));

        btBackMain6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btBackMain6.setText("Back");
        btBackMain6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMain6ActionPerformed(evt);
            }
        });
        jpLog.add(btBackMain6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        lblbackgroundLog6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco in tree small.jpg"))); // NOI18N
        jpLog.add(lblbackgroundLog6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 399));

        jLayeredPane1.add(jpLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane14.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        setMaximumSize(new java.awt.Dimension(600, 399));
        setMinimumSize(new java.awt.Dimension(600, 399));
        setPreferredSize(new java.awt.Dimension(600, 399));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

// <editor-fold defaultstate="collapsed" desc="GUI Actions">  
    private void btLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogActionPerformed
        jfLog.setVisible(true);
        jfMainMenu.setVisible(false);
    }//GEN-LAST:event_btLogActionPerformed

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        jfFind.setVisible(true);
        jfMainMenu.setVisible(false);
        ArrayList<Integer> idArr = am.gettypeID();
        ArrayList<String> nameArr = am.getTypeName();

        for (int i = 0; i < idArr.size(); i++) {
            String temp = nameArr.get(i) + ": " + idArr.get(i);
            DBFindBirdType.addItem(temp);

        }
    }//GEN-LAST:event_btFindActionPerformed

    private void btBirdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBirdBookActionPerformed
        jfBirdBook.setVisible(true);
        jfMainMenu.setVisible(false);


    }//GEN-LAST:event_btBirdBookActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed

        btAdmin.setVisible(false);
        String pass = txfPassword.getText();
        boolean vaild = false;
        Scanner sc;
        int test = 0;
        for (int i = 0; i < pass.length(); i++) {

            sc = new Scanner(pass);
            if (sc.hasNextInt()) {

            } else {
                test += 1;
            }
        }
        if (test == 0) {
            vaild = true;
        }
        if (vaild) {

            if (am.login(txfUsername.getText(), Integer.parseInt(txfPassword.getText()))) {

                jfLogin.setVisible(false);
                jfMainMenu.setVisible(true);
                
                userID = am.getUserID();
                CreateLogNode(LogTreeRootNode);
                LogTreeModel = new DefaultTreeModel(LogTreeRootNode);
                initComponents();
                
                if (am.isAdmin()) {
                    btAdmin.setVisible(true);
                }
            } else {
                jLabel21.setText("Wrong username \nor password");

            }
        } else {
            System.out.println("Pass not number");
        }


    }//GEN-LAST:event_btLoginActionPerformed

    private void txfUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfUsernameMouseClicked
        txfUsername.setText(null);
        txfUsername.setForeground(Color.black);
    }//GEN-LAST:event_txfUsernameMouseClicked

    private void txfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfPasswordMouseClicked
        txfPassword.setText(null);
        txfPassword.setForeground(Color.black);
    }//GEN-LAST:event_txfPasswordMouseClicked

    private void jfLogWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jfLogWindowClosed
        jfMainMenu.setVisible(true);
    }//GEN-LAST:event_jfLogWindowClosed

    private void btBackMain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMain1ActionPerformed
        backToMain();
    }//GEN-LAST:event_btBackMain1ActionPerformed

    private void btBackMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMainActionPerformed
        backToMain();
    }//GEN-LAST:event_btBackMainActionPerformed

    private void btBackMain2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMain2ActionPerformed
        backToMain();
    }//GEN-LAST:event_btBackMain2ActionPerformed

    private void btjfFindfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjfFindfindActionPerformed
        output = new ArrayList<>();
        txafoundbirds.setText("");
        int size = Integer.parseInt(txfFindSize.getText());
        int birdType = DBFindBirdType.getSelectedIndex() + 1;
        String habitat = (String) CBHabitat.getSelectedItem();
        width = txafoundbirds.getWidth();
        birdArr = bm.findBird(birdType, size, habitat, colour);

        String desc = "";

        for (int i = 0; i < birdArr.size(); i++) {

            output.add(birdArr.get(i).output());

        }

        settxafoundbirds();

        txfFindSize.setText("");
        DBFindBirdType.setSelectedIndex(-1);
        CBHabitat.setSelectedIndex(-1);

    }//GEN-LAST:event_btjfFindfindActionPerformed

    private void btNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewUserActionPerformed
        jfNewUser.setVisible(true);
    }//GEN-LAST:event_btNewUserActionPerformed

    private void bthelpLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpLoginActionPerformed
        jfhelp.setVisible(true);
        help(1);
    }//GEN-LAST:event_bthelpLoginActionPerformed

    private void txfNewUserPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNewUserPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNewUserPassword1ActionPerformed

    private void btNewUserEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewUserEnterActionPerformed
        if (txfNewUserPassword1.getText().equals(txfNewUserPassword2.getText())) {
            boolean admin = CBAdmin.isSelected();
            am.newuser(txfNewUserName.getText(), Integer.parseInt(txfNewUserPassword1.getText()), admin);

            jfNewUser.setVisible(false);
            jfLogin.setVisible(true);

        } else {
            System.out.println("Password not the same");
        }


    }//GEN-LAST:event_btNewUserEnterActionPerformed

    private void btNewUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewUserCancelActionPerformed
        jfNewUser.setVisible(false);
        jfLogin.setVisible(true);

    }//GEN-LAST:event_btNewUserCancelActionPerformed

    private void btBackMain3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMain3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBackMain3ActionPerformed

    private void btBackMain4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMain4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBackMain4ActionPerformed

    private void btjfFindfind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjfFindfind1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btjfFindfind1ActionPerformed

    private void btBackMain5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMain5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBackMain5ActionPerformed

    private void btLog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLog1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLog1ActionPerformed

    private void btFind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFind1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFind1ActionPerformed

    private void btBirdBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBirdBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBirdBook1ActionPerformed

    private void btBackMain6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMain6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBackMain6ActionPerformed

    private void btNewLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewLogActionPerformed
        jfCreateLog.setVisible(true);
        btFindPrevious.setVisible(false);
        btFindNext.setVisible(true);


    }//GEN-LAST:event_btNewLogActionPerformed

    private void btFindColourPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindColourPickerActionPerformed
        jfPickColour.setVisible(true);
        colour = "";
    }//GEN-LAST:event_btFindColourPickerActionPerformed

    private void btNewLogOkayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewLogOkayActionPerformed
        jfCreateLog.setVisible(false);
        jfLog.setVisible(true);
        String Location = txfLogLocation.getText();
        int month = DCLogDate.getDate().getMonth();
        String year = "" + DCLogDate.getDate().getYear();
        year = year.substring(1, year.length());
        int day = DCLogDate.getDate().getDate();
        String date = day + "/" + month + "/" + year;

        String desc = txaNewLogDesc.getText();

        Bird bird = (Bird) jtLogBird.getLastSelectedPathComponent();

        int birdID = bird.getBirdID();
        userID = am.getUserID();

        am.newlog(userID, birdID, date, Location, desc);

    }//GEN-LAST:event_btNewLogOkayActionPerformed

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void btAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdminActionPerformed

        jfAdmin.setVisible(true);
    }//GEN-LAST:event_btAdminActionPerformed

    private void btColourPickerOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btColourPickerOKActionPerformed

        if (CBPickColourBlack.isSelected()) {
            colour += "Black#";
        }
        if (CBPickColourBlue.isSelected()) {
            colour += "Blue#";
        }
        if (CBPickColourBrown.isSelected()) {
            colour += "Brown#";
        }
        if (CBPickColourGreen.isSelected()) {
            colour += "Green#";
        }
        if (CBPickColourGrey.isSelected()) {
            colour += "Grey#";
        }
        if (CBPickColourOrange.isSelected()) {
            colour += "Orange#";
        }
        if (CBPickColourRed.isSelected()) {
            colour += "Red#";
        }
        if (CBPickColourWhite.isSelected()) {
            colour += "White#";
        }

        if (colour.charAt(colour.length() - 1) == '#') {
            colour = colour.substring(0, colour.length() - 2);
        }

        CBPickColourBlack.setSelected(false);
        CBPickColourBlue.setSelected(false);
        CBPickColourBrown.setSelected(false);
        CBPickColourGreen.setSelected(false);
        CBPickColourGrey.setSelected(false);
        CBPickColourOrange.setSelected(false);
        CBPickColourRed.setSelected(false);
        CBPickColourWhite.setSelected(false);

        jfPickColour.setVisible(false);
    }//GEN-LAST:event_btColourPickerOKActionPerformed

    private void btFindNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindNextActionPerformed
        if (output.size() - 1 > foundbird) {
            foundbird++;
        }

        settxafoundbirds();
    }//GEN-LAST:event_btFindNextActionPerformed

    private void btFindPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindPreviousActionPerformed

        if (0 < foundbird) {
            foundbird--;
        }

        settxafoundbirds();
    }//GEN-LAST:event_btFindPreviousActionPerformed

    private void jtBridBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBridBookMousePressed
        
        width = txaBirdBook.getWidth();
        if (jtBridBook.getLastSelectedPathComponent() instanceof Bird) {

            Bird bird = (Bird) jtBridBook.getLastSelectedPathComponent();
            txaBirdBook.setText(bird.output() + "\n" + bird.getDescrition());
            System.out.println(bird.getImage());
            lblBirdImageBirdBook.setIcon(am.Scaleimage("src/" +bird.getImage() ));
        } else if (jtBridBook.getLastSelectedPathComponent() instanceof Species) {

            Species spec = (Species) jtBridBook.getLastSelectedPathComponent();
            txaBirdBook.setText(spec.output());
        }
        
        txaBirdBook.setCaretPosition(0);

    }//GEN-LAST:event_jtBridBookMousePressed

    private void btReadSpeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadSpeciesActionPerformed
        sm.readSpecies();
    }//GEN-LAST:event_btReadSpeciesActionPerformed

    private void btReadBirdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadBirdsActionPerformed
        bm.readbirds();
    }//GEN-LAST:event_btReadBirdsActionPerformed

    private void btReadAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadAllActionPerformed
        sm.readSpecies();
        bm.readbirds();
    }//GEN-LAST:event_btReadAllActionPerformed

    private void btAdminBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdminBackActionPerformed
        jfAdmin.setVisible(false);
    }//GEN-LAST:event_btAdminBackActionPerformed

    private void jtLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLogMouseClicked
        

            Log log = (Log) jtLog.getLastSelectedPathComponent();
            int birdID = log.getBirdID();
            int birdbird = 0;
            birdArr = bm.getBirdArr();
            for (Bird birdArr1 : birdArr) {
                if (birdArr1.getBirdID() == birdID) {
                    birdbird = birdID;
                }
            }

            txaLog.setText(log.output() + "\n" + birdArr.get(birdbird).getName());
        
    }//GEN-LAST:event_jtLogMouseClicked
// </editor-fold>

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().jfLogin.setVisible(true);
            }
        });
    }

// <editor-fold defaultstate="collapsed" desc="Variables declaration">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBAdmin;
    private javax.swing.JComboBox CBHabitat;
    private javax.swing.JCheckBox CBPickColourBlack;
    private javax.swing.JCheckBox CBPickColourBlue;
    private javax.swing.JCheckBox CBPickColourBrown;
    private javax.swing.JCheckBox CBPickColourGreen;
    private javax.swing.JCheckBox CBPickColourGrey;
    private javax.swing.JCheckBox CBPickColourOrange;
    private javax.swing.JCheckBox CBPickColourRed;
    private javax.swing.JCheckBox CBPickColourWhite;
    private javax.swing.JComboBox DBFindBirdType;
    private com.toedter.calendar.JDateChooser DCLogDate;
    private javax.swing.JButton btAdmin;
    private javax.swing.JButton btAdminBack;
    private javax.swing.JButton btBackMain;
    private javax.swing.JButton btBackMain1;
    private javax.swing.JButton btBackMain2;
    private javax.swing.JButton btBackMain3;
    private javax.swing.JButton btBackMain4;
    private javax.swing.JButton btBackMain5;
    private javax.swing.JButton btBackMain6;
    private javax.swing.JButton btBirdBook;
    private javax.swing.JButton btBirdBook1;
    private javax.swing.JButton btColourPickerOK;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btFind1;
    private javax.swing.JButton btFindColourPicker;
    private javax.swing.JButton btFindNext;
    private javax.swing.JButton btFindPrevious;
    private javax.swing.JButton btLog;
    private javax.swing.JButton btLog1;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btNewLog;
    private javax.swing.JButton btNewLogCancel;
    private javax.swing.JButton btNewLogOkay;
    private javax.swing.JButton btNewUser;
    private javax.swing.JButton btNewUserCancel;
    private javax.swing.JButton btNewUserEnter;
    private javax.swing.JButton btReadAll;
    private javax.swing.JButton btReadBirds;
    private javax.swing.JButton btReadSpecies;
    private javax.swing.JButton bthelpLogin;
    private javax.swing.JButton btjfFindfind;
    private javax.swing.JButton btjfFindfind1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTree jTree3;
    private javax.swing.JTree jTree4;
    private javax.swing.JTree jTree5;
    private javax.swing.JFrame jfAdmin;
    private javax.swing.JFrame jfBirdBook;
    private javax.swing.JFrame jfBirdIDList;
    private javax.swing.JFrame jfCreateLog;
    private javax.swing.JFrame jfFind;
    private javax.swing.JFrame jfLog;
    private javax.swing.JFrame jfLogin;
    private javax.swing.JFrame jfMainMenu;
    private javax.swing.JFrame jfNewUser;
    private javax.swing.JFrame jfPickColour;
    private javax.swing.JFrame jfhelp;
    private javax.swing.JPanel jpLog;
    private javax.swing.JPanel jpMainMenu;
    private javax.swing.JTree jtBridBook;
    private javax.swing.JTree jtLog;
    private javax.swing.JTree jtLogBird;
    private javax.swing.JLabel lblBGColourPicker;
    private javax.swing.JLabel lblBGCreateLog;
    private javax.swing.JLabel lblBGFind;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBackgroundBirdIDList;
    private javax.swing.JLabel lblBackgroundNewUser;
    private javax.swing.JLabel lblBirdImageBirdBook;
    private javax.swing.JLabel lblFindBirdImage;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNewUserName;
    private javax.swing.JLabel lblNewUserPassword1;
    private javax.swing.JLabel lblNewUserPassword2;
    private javax.swing.JLabel lblbackgroundLog;
    private javax.swing.JLabel lblbackgroundLog2;
    private javax.swing.JLabel lblbackgroundLog3;
    private javax.swing.JLabel lblbackgroundLog4;
    private javax.swing.JLabel lblbackgroundLog5;
    private javax.swing.JLabel lblbackgroundLog6;
    private javax.swing.JLabel lblhelpPage;
    private javax.swing.JTextArea txaBirdBook;
    private javax.swing.JTextArea txaLog;
    private javax.swing.JTextArea txaNewLogDesc;
    private javax.swing.JTextArea txafoundbirds;
    private javax.swing.JTextArea txafoundbirds1;
    private javax.swing.JTextField txfFindSize;
    private javax.swing.JTextField txfLogLocation;
    private javax.swing.JTextField txfNewUserName;
    private javax.swing.JTextField txfNewUserPassword1;
    private javax.swing.JTextField txfNewUserPassword2;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
// </editor-fold>

    private void backToMain() {
        jfLog.setVisible(false);
        jfFind.setVisible(false);
        jfBirdBook.setVisible(false);
        jfMainMenu.setVisible(true);

    }

    private void help(int s) {
        switch (s) {
            case 1:
                lblhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/Helplogin.jpg")));
                break;
            case 2:
                lblhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpMain.jpg")));
                break;
            case 3:
                lblhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpLog.jpg")));
                break;
            case 4:
                lblhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpFind.jpg")));
                break;
            case 5:
                lblhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpBirdBook.jpg")));
                break;
        }

    }

    private void settxafoundbirds() {

        String desc = birdArr.get(foundbird).getDescrition();

        txafoundbirds.setText(output.get(foundbird) + "\n\n" + desc);
        lblFindBirdImage.setIcon(am.Scaleimage("src/" +birdArr.get(foundbird).getImage()));
        txafoundbirds.setCaretPosition(0);
    }

}
