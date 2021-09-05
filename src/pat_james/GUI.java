package pat_james;

import java.awt.Color;

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

    ArrayList<String> output = new ArrayList<>();
    ArrayList<Bird> birdArr;
    AppManger manger = new AppManger();

    DefaultTreeModel BirdTreeModel;
    DefaultTreeModel LogTreeModel;

    DefaultMutableTreeNode BirdTreeRootNode = new DefaultMutableTreeNode("Birds");
    DefaultMutableTreeNode LogTreeRootNode = new DefaultMutableTreeNode("Log");

    public GUI() {

        manger.createBirds();
        manger.CreateSpecies();
        manger.CreateLogs();

        initCustomModels();
        initComponents();
        btAdmin.setVisible(false);

    }

    private void initCustomModels() {

        CreateBirdNode(BirdTreeRootNode);

        BirdTreeModel = new DefaultTreeModel(BirdTreeRootNode);

    }

    private void CreateBirdNode(DefaultMutableTreeNode top) {
        ArrayList<Species> specArr = manger.getSpecciesArr();
        for (Species specArr1 : specArr) {
            top.add(specArr1);
        }

        birdArr = manger.getBirdArr();

        for (Bird b : birdArr) {

            for (Species s : specArr) {
                if (s.getId() == b.getSpecies()) {
                    s.add(b);
                }
            }
        }
    }

    private void CreateLogNode(DefaultMutableTreeNode top) {
        ArrayList<Log> LogArr = manger.getLogArr();
        for (Log L : LogArr) {

            if (L.getUserID() == userID) {

                top.add(L);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfLogin = new javax.swing.JFrame();
        lblWrongInfo = new javax.swing.JLabel();
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
        lblSignUp = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        CBAdmin = new javax.swing.JCheckBox();
        bthelpNewUser = new javax.swing.JButton();
        lblBackgroundNewUser = new javax.swing.JLabel();
        jfMainMenu = new javax.swing.JFrame();
        btLog = new javax.swing.JButton();
        btFind = new javax.swing.JButton();
        btBirdBook = new javax.swing.JButton();
        btAdmin = new javax.swing.JButton();
        bthelpMainMenu = new javax.swing.JButton();
        lblBGMainMenu = new javax.swing.JLabel();
        jfAdmin = new javax.swing.JFrame();
        btReadSpecies = new javax.swing.JButton();
        btReadBirds = new javax.swing.JButton();
        btReadAll = new javax.swing.JButton();
        btAdminBack = new javax.swing.JButton();
        bthelpAdmin = new javax.swing.JButton();
        lblBGAdmin = new javax.swing.JLabel();
        jfLog = new javax.swing.JFrame();
        lblLogBook = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaLog = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtLog = new javax.swing.JTree();
        btBackMain = new javax.swing.JButton();
        btNewLog = new javax.swing.JButton();
        bthelpLog = new javax.swing.JButton();
        lblbackgroundLog = new javax.swing.JLabel();
        jfCreateLog = new javax.swing.JFrame();
        lblCreateLogBird = new javax.swing.JLabel();
        lblCreateLogLocation = new javax.swing.JLabel();
        txfLogLocation = new javax.swing.JTextField();
        lblCreateLogDate = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txaNewLogDesc = new javax.swing.JTextArea();
        btNewLogOkay = new javax.swing.JButton();
        btNewLogCancel = new javax.swing.JButton();
        lblCreateLogDesc = new javax.swing.JLabel();
        DCLogDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLogBird = new javax.swing.JTree();
        bthelpCreateLog = new javax.swing.JButton();
        lbllogError = new javax.swing.JLabel();
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
        bthelpFind = new javax.swing.JButton();
        lblBGFind = new javax.swing.JLabel();
        jfBirdBook = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaBirdBook = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btBackMain2 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jtBridBook = new javax.swing.JTree();
        lblBirdImageBirdBook = new javax.swing.JLabel();
        bthelpBirdBook = new javax.swing.JButton();
        lblBGBirdBook = new javax.swing.JLabel();
        jfhelp = new javax.swing.JFrame();
        lblBGhelpPage = new javax.swing.JLabel();
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
        bthelpColourPicker = new javax.swing.JButton();
        lblColourError = new javax.swing.JLabel();
        lblBGColourPicker = new javax.swing.JLabel();

        jfLogin.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfLogin.setTitle("Login");
        jfLogin.setMinimumSize(new java.awt.Dimension(600, 399));
        jfLogin.setResizable(false);
        jfLogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWrongInfo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        lblWrongInfo.setForeground(new java.awt.Color(255, 0, 0));
        jfLogin.getContentPane().add(lblWrongInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, 20));

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
        txfUsername.setText("Username");
        txfUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfUsernameMouseClicked(evt);
            }
        });
        jfLogin.getContentPane().add(txfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 90, -1));

        txfPassword.setForeground(new java.awt.Color(166, 155, 155));
        txfPassword.setText("Pin");
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

        lblSignUp.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblSignUp.setText("Sign Up");
        jfNewUser.getContentPane().add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("Admin:");
        jfNewUser.getContentPane().add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 80, -1));
        jfNewUser.getContentPane().add(CBAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        bthelpNewUser.setText("Help");
        bthelpNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpNewUserActionPerformed(evt);
            }
        });
        jfNewUser.getContentPane().add(bthelpNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        jfMainMenu.getContentPane().add(btAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        bthelpMainMenu.setText("Help");
        bthelpMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpMainMenuActionPerformed(evt);
            }
        });
        jfMainMenu.getContentPane().add(bthelpMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBGMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfMainMenu.getContentPane().add(lblBGMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, 400));

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

        bthelpAdmin.setText("Help");
        bthelpAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpAdminActionPerformed(evt);
            }
        });
        jfAdmin.getContentPane().add(bthelpAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBGAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfAdmin.getContentPane().add(lblBGAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 600, 400));

        jfLog.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfLog.setMinimumSize(new java.awt.Dimension(600, 399));
        jfLog.setResizable(false);
        jfLog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogBook.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblLogBook.setText("Log Book");
        jfLog.getContentPane().add(lblLogBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 20));

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

        bthelpLog.setText("Help");
        bthelpLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpLogActionPerformed(evt);
            }
        });
        jfLog.getContentPane().add(bthelpLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblbackgroundLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfLog.getContentPane().add(lblbackgroundLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 399));

        jfCreateLog.setMinimumSize(new java.awt.Dimension(600, 399));
        jfCreateLog.setResizable(false);
        jfCreateLog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCreateLogBird.setText("Bird");
        jfCreateLog.getContentPane().add(lblCreateLogBird, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        lblCreateLogLocation.setText("Location");
        jfCreateLog.getContentPane().add(lblCreateLogLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txfLogLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });
        jfCreateLog.getContentPane().add(txfLogLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        lblCreateLogDate.setText("Date");
        jfCreateLog.getContentPane().add(lblCreateLogDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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
        btNewLogCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewLogCancelActionPerformed(evt);
            }
        });
        jfCreateLog.getContentPane().add(btNewLogCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblCreateLogDesc.setText("Descrition");
        jfCreateLog.getContentPane().add(lblCreateLogDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jfCreateLog.getContentPane().add(DCLogDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, 30));

        jtLogBird.setModel(BirdTreeModel);
        jScrollPane1.setViewportView(jtLogBird);

        jfCreateLog.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 180, 320));

        bthelpCreateLog.setText("Help");
        bthelpCreateLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpCreateLogActionPerformed(evt);
            }
        });
        jfCreateLog.getContentPane().add(bthelpCreateLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jfCreateLog.getContentPane().add(lbllogError, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 304, 180, 30));

        lblBGCreateLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
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

        bthelpFind.setText("Help");
        bthelpFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpFindActionPerformed(evt);
            }
        });
        jfFind.getContentPane().add(bthelpFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBGFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
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
        jfBirdBook.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

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

        bthelpBirdBook.setText("Help");
        bthelpBirdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpBirdBookActionPerformed(evt);
            }
        });
        jfBirdBook.getContentPane().add(bthelpBirdBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBGBirdBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfBirdBook.getContentPane().add(lblBGBirdBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 600, 400));

        jfhelp.setMinimumSize(new java.awt.Dimension(600, 399));
        jfhelp.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jfhelp.getContentPane().add(lblBGhelpPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 607, 401));

        jfPickColour.setTitle("New User");
        jfPickColour.setMinimumSize(new java.awt.Dimension(540, 220));
        jfPickColour.setName("New User"); // NOI18N
        jfPickColour.setResizable(false);
        jfPickColour.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CBPickColourBrown.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CBPickColourBrown.setText("Brown");
        jfPickColour.getContentPane().add(CBPickColourBrown, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        CBPickColourBlue.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        CBPickColourBlue.setText("Blue");
        jfPickColour.getContentPane().add(CBPickColourBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        CBPickColourGreen.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CBPickColourGreen.setText("Green");
        jfPickColour.getContentPane().add(CBPickColourGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        CBPickColourOrange.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CBPickColourOrange.setText("Orange");
        jfPickColour.getContentPane().add(CBPickColourOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        CBPickColourBlack.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CBPickColourBlack.setText("Black");
        jfPickColour.getContentPane().add(CBPickColourBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        CBPickColourRed.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CBPickColourRed.setText("Red");
        jfPickColour.getContentPane().add(CBPickColourRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        CBPickColourWhite.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CBPickColourWhite.setText("White");
        jfPickColour.getContentPane().add(CBPickColourWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        CBPickColourGrey.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        CBPickColourGrey.setText("Grey");
        jfPickColour.getContentPane().add(CBPickColourGrey, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        btColourPickerOK.setText("Okay");
        btColourPickerOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btColourPickerOKActionPerformed(evt);
            }
        });
        jfPickColour.getContentPane().add(btColourPickerOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        bthelpColourPicker.setText("Help");
        bthelpColourPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelpColourPickerActionPerformed(evt);
            }
        });
        jfPickColour.getContentPane().add(bthelpColourPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblColourError.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jfPickColour.getContentPane().add(lblColourError, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 70, 20));

        lblBGColourPicker.setBackground(new java.awt.Color(52, 104, 109));
        lblBGColourPicker.setForeground(new java.awt.Color(0, 72, 72));
        lblBGColourPicker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knysna Tarco on log small.jpg"))); // NOI18N
        jfPickColour.getContentPane().add(lblBGColourPicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 190));

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

        int[] idArr = manger.gettypeID();
        String[] nameArr = manger.getTypeName();

        for (int i = 0; i < idArr.length; i++) {
            String temp = nameArr[i] + ": " + idArr[i];
            DBFindBirdType.addItem(temp);

        }
    }//GEN-LAST:event_btFindActionPerformed

    private void btBirdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBirdBookActionPerformed
        jfBirdBook.setVisible(true);
        jfMainMenu.setVisible(false);


    }//GEN-LAST:event_btBirdBookActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed

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

            if (manger.login(txfUsername.getText(), Integer.parseInt(txfPassword.getText()))) {

                jfLogin.setVisible(false);
                jfMainMenu.setVisible(true);
                btAdmin.setVisible(manger.isAdmin());

                userID = manger.getUserID();
                CreateLogNode(LogTreeRootNode);
                LogTreeModel = new DefaultTreeModel(LogTreeRootNode);
                initComponents();

            } else {
                lblWrongInfo.setText("Wrong username \nor password");

            }
        } else {
            lblWrongInfo.setText("Pin Not Number");
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

        txafoundbirds.setText("");
        String error = "";
        int size = 0;
        try {
            if (Integer.parseInt(txfFindSize.getText()) > 1 && Integer.parseInt(txfFindSize.getText()) < 1500) {
                size = Integer.parseInt(txfFindSize.getText());
            } else {
                error += "enter a vaild number: vaild range 1 to 1500\n";
            }

        } catch (NumberFormatException ex) {
            error += "enter a number\n";
        }

        int birdType = DBFindBirdType.getSelectedIndex() + 1;
        String habitat = "";
        if (CBHabitat.getSelectedIndex() == -1) {
            error += "Pick a habitat\n";
        } else {
            habitat = (String) CBHabitat.getSelectedItem();
        }

        width = txafoundbirds.getWidth();
        if (error.equals("")) {
            birdArr = manger.findBird(birdType, size, habitat, colour);
            output = new ArrayList<>();
            String desc = "";

            for (int i = 0; i < birdArr.size(); i++) {

                output.add(birdArr.get(i).output());

            }

            settxafoundbirds();

        } else {
            txafoundbirds.setText(error);
        }

        txfFindSize.setText("");
        DBFindBirdType.setSelectedIndex(-1);
        CBHabitat.setSelectedIndex(-1);

    }//GEN-LAST:event_btjfFindfindActionPerformed

    private void btNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewUserActionPerformed
        jfNewUser.setVisible(true);
    }//GEN-LAST:event_btNewUserActionPerformed

    private void bthelpLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpLoginActionPerformed

        help(1);
    }//GEN-LAST:event_bthelpLoginActionPerformed

    private void txfNewUserPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNewUserPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNewUserPassword1ActionPerformed

    private void btNewUserEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewUserEnterActionPerformed
        if (txfNewUserPassword1.getText().equals(txfNewUserPassword2.getText())) {
            boolean admin = CBAdmin.isSelected();
            manger.newuser(txfNewUserName.getText(), Integer.parseInt(txfNewUserPassword1.getText()), admin);

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
        boolean error = false;
        String errorMsg = "";

        String Location = txfLogLocation.getText();
        String date = "";
        try {
            int month = DCLogDate.getDate().getMonth();
            String year = "" + DCLogDate.getDate().getYear();
            year = year.substring(1, year.length());
            int day = DCLogDate.getDate().getDate();
            date = day + "/" + month + "/" + year;

        } catch (NullPointerException e) {
            error = true;
            errorMsg += "No Date ";
        }

        String desc = txaNewLogDesc.getText();

        if (Location.equals("")) {
            error = true;
            errorMsg += "No location ";
        }

        Bird bird;
        if (!error) {
            try {
                bird = (Bird) jtLogBird.getLastSelectedPathComponent();
                int birdID = bird.getBirdID();
                manger.newlog(userID, birdID, date, Location, desc);
                jfCreateLog.setVisible(false);
                jfLog.setVisible(true);
            } catch (NullPointerException e) {
                lbllogError.setText("No Bird selected");
            }
        } else {
            lbllogError.setText(errorMsg);
        }

        manger.CreateLogs();
        CreateLogNode(LogTreeRootNode);

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
        try {
            if (colour.charAt(colour.length() - 1) == '#') {
                colour = colour.substring(0, colour.length() - 2);
            }
        } catch (StringIndexOutOfBoundsException e) {
            lblColourError.setText("Select a colour");
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

            lblBirdImageBirdBook.setIcon(manger.Scaleimage("src/" + bird.getImage(), lblBirdImageBirdBook));
        } else if (jtBridBook.getLastSelectedPathComponent() instanceof Species) {

            Species spec = (Species) jtBridBook.getLastSelectedPathComponent();
            txaBirdBook.setText(spec.output());
        }

        txaBirdBook.setCaretPosition(0);

    }//GEN-LAST:event_jtBridBookMousePressed

    private void btReadSpeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadSpeciesActionPerformed
        manger.readSpecies();
    }//GEN-LAST:event_btReadSpeciesActionPerformed

    private void btReadBirdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadBirdsActionPerformed
        manger.readbirds();
    }//GEN-LAST:event_btReadBirdsActionPerformed

    private void btReadAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadAllActionPerformed
        manger.readSpecies();
        manger.readbirds();
    }//GEN-LAST:event_btReadAllActionPerformed

    private void btAdminBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdminBackActionPerformed
        jfAdmin.setVisible(false);
    }//GEN-LAST:event_btAdminBackActionPerformed

    private void jtLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLogMouseClicked

        Log log = (Log) jtLog.getLastSelectedPathComponent();
        int birdID = log.getBirdID();
        int birdbird = 0;
        birdArr = manger.getBirdArr();
        for (Bird birdArr1 : birdArr) {
            if (birdArr1.getBirdID() == birdID) {
                birdbird = birdID;
            }
        }

        txaLog.setText(log.output() + "\n" + birdArr.get(birdbird).toString());

    }//GEN-LAST:event_jtLogMouseClicked

    private void bthelpNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpNewUserActionPerformed
        help(6);
    }//GEN-LAST:event_bthelpNewUserActionPerformed

    private void bthelpMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpMainMenuActionPerformed
        help(2);
    }//GEN-LAST:event_bthelpMainMenuActionPerformed

    private void bthelpAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpAdminActionPerformed
        help(8);
    }//GEN-LAST:event_bthelpAdminActionPerformed

    private void bthelpLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpLogActionPerformed
        help(3);
    }//GEN-LAST:event_bthelpLogActionPerformed

    private void bthelpCreateLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpCreateLogActionPerformed
        help(9);
    }//GEN-LAST:event_bthelpCreateLogActionPerformed

    private void bthelpFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpFindActionPerformed
        help(4);
    }//GEN-LAST:event_bthelpFindActionPerformed

    private void bthelpBirdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpBirdBookActionPerformed
        help(5);
    }//GEN-LAST:event_bthelpBirdBookActionPerformed

    private void bthelpColourPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelpColourPickerActionPerformed
        help(7);
    }//GEN-LAST:event_bthelpColourPickerActionPerformed

    private void btNewLogCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewLogCancelActionPerformed
        jfCreateLog.setVisible(false);
        jfLog.setVisible(true);
    }//GEN-LAST:event_btNewLogCancelActionPerformed
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
    private javax.swing.JButton btBirdBook;
    private javax.swing.JButton btColourPickerOK;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btFindColourPicker;
    private javax.swing.JButton btFindNext;
    private javax.swing.JButton btFindPrevious;
    private javax.swing.JButton btLog;
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
    private javax.swing.JButton bthelpAdmin;
    private javax.swing.JButton bthelpBirdBook;
    private javax.swing.JButton bthelpColourPicker;
    private javax.swing.JButton bthelpCreateLog;
    private javax.swing.JButton bthelpFind;
    private javax.swing.JButton bthelpLog;
    private javax.swing.JButton bthelpLogin;
    private javax.swing.JButton bthelpMainMenu;
    private javax.swing.JButton bthelpNewUser;
    private javax.swing.JButton btjfFindfind;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JFrame jfAdmin;
    private javax.swing.JFrame jfBirdBook;
    private javax.swing.JFrame jfCreateLog;
    private javax.swing.JFrame jfFind;
    private javax.swing.JFrame jfLog;
    private javax.swing.JFrame jfLogin;
    private javax.swing.JFrame jfMainMenu;
    private javax.swing.JFrame jfNewUser;
    private javax.swing.JFrame jfPickColour;
    private javax.swing.JFrame jfhelp;
    private javax.swing.JTree jtBridBook;
    private javax.swing.JTree jtLog;
    private javax.swing.JTree jtLogBird;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblBGAdmin;
    private javax.swing.JLabel lblBGBirdBook;
    private javax.swing.JLabel lblBGColourPicker;
    private javax.swing.JLabel lblBGCreateLog;
    private javax.swing.JLabel lblBGFind;
    private javax.swing.JLabel lblBGMainMenu;
    private javax.swing.JLabel lblBGhelpPage;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBackgroundNewUser;
    private javax.swing.JLabel lblBirdImageBirdBook;
    private javax.swing.JLabel lblColourError;
    private javax.swing.JLabel lblCreateLogBird;
    private javax.swing.JLabel lblCreateLogDate;
    private javax.swing.JLabel lblCreateLogDesc;
    private javax.swing.JLabel lblCreateLogLocation;
    private javax.swing.JLabel lblFindBirdImage;
    private javax.swing.JLabel lblLogBook;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNewUserName;
    private javax.swing.JLabel lblNewUserPassword1;
    private javax.swing.JLabel lblNewUserPassword2;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblWrongInfo;
    private javax.swing.JLabel lblbackgroundLog;
    private javax.swing.JLabel lbllogError;
    private javax.swing.JTextArea txaBirdBook;
    private javax.swing.JTextArea txaLog;
    private javax.swing.JTextArea txaNewLogDesc;
    private javax.swing.JTextArea txafoundbirds;
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
        jfhelp.setVisible(true);
        switch (s) {
            case 1:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/Helplogin.jpg")));
                break;
            case 2:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpMainMenu.jpg")));
                break;
            case 3:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpLog.jpg")));
                break;
            case 4:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpFind.jpg")));
                break;
            case 5:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpBirdBook.jpg")));
                break;
            case 6:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpNewUser.jpg")));
                break;
            case 7:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpColour.jpg")));
                break;
            case 8:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpAdmin.jpg")));
                break;
            case 9:
                lblBGhelpPage.setIcon(new ImageIcon(getClass().getResource("/Images/HelpNewLog.jpg")));
                break;

        }

    }

    private void settxafoundbirds() {
        try {
            String desc = birdArr.get(foundbird).getDescrition();

            txafoundbirds.setText(output.get(foundbird) + "\n\n" + desc);
            lblFindBirdImage.setIcon(manger.Scaleimage("src/" + birdArr.get(foundbird).getImage(), lblFindBirdImage));
            txafoundbirds.setCaretPosition(0);
        } catch (IndexOutOfBoundsException e) {
            txafoundbirds.setText("No birds Found");
        }

    }

}
