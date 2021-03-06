
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UDPClientForm extends javax.swing.JFrame {

    /**
     * Creates new form UDPClientForm
     */
    public UDPClientForm() {
        initComponents();
        btnSend.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFileLocation = new javax.swing.JTextField();
        txtListIntegers = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSend = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIPAddress = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnConnect = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrimeNumber = new javax.swing.JTextField();
        cboFileType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CLIENT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("File location to save:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("List integers:");

        txtFileLocation.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Port");

        txtPort.setText("8888");

        btnSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 0, 51));
        btnSend.setText("SEND");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Server host");

        txtIPAddress.setText("localhost");

        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnConnect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConnect.setText("CONNECT");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("File's name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("List prime number:");

        txtPrimeNumber.setEditable(false);

        cboFileType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboFileType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary", "Text" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel1)))
                .addGap(0, 121, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel3)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFileLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtListIntegers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addComponent(txtPrimeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(cboFileType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnect))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFileType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtListIntegers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrimeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        //byte ping[] = new byte[256];
        //ping = "ping".getBytes();
        InetAddress ipser = null;
        int port = -1;
        DatagramSocket client;
        try {
            client = new DatagramSocket();
            // Kh???i t???o ?????i t?????ng DataGramSocket
            ipser = InetAddress.getByName(txtIPAddress.getText());
            port = Integer.parseInt(txtPort.getText());
            sendData("ping", client, ipser, port);
            //System.out.println(receiveData(client).getData());

            byte temp[] = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(temp, temp.length);
            client.setSoTimeout(3000);
            try {
                client.receive(receivePacket);
                String result = new String(receivePacket.getData()).trim();
                if (result.equals("OK")) {
                    JOptionPane.showMessageDialog(this, "Connect Success!");
                    btnSend.setEnabled(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Connect failed!");
                btnSend.setEnabled(false);
            }

        } catch (SocketException ex) {
            Logger.getLogger(UDPClientForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPClientForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPClientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //socket = new Socket(ipser, port); // Connect to server
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Can't connect to server because " + e.getMessage());
            return;
        }


    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = fileChooser.showDialog(this, "Choose");
        txtFileLocation.setText(fileChooser.getSelectedFile() + "");
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        if (txtFileLocation.getText().trim().equals("")
                || txtFileName.getText().trim().equals("")
                || txtListIntegers.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "File location, file name and list integer must not be empty!");
            return;
        }
        String[] temp = txtListIntegers.getText().split(",");
        for (int i = 0; i < temp.length; i++) {
            try {
                Integer.parseInt(temp[i]);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "List integer not valid!");
                return;
            }
        }
        String finalFileName = (txtFileLocation.getText() + "\\" + txtFileName.getText());
        System.out.println(finalFileName);
        
        String listInteger = txtListIntegers.getText();
        System.out.println(listInteger);
        InetAddress ipser = null;
        int port = -1;
        DatagramSocket client;
        try {
            client = new DatagramSocket();
            // Kh???i t???o ?????i t?????ng DataGramSocket
            ipser = InetAddress.getByName(txtIPAddress.getText());
            port = Integer.parseInt(txtPort.getText());
            sendData(cboFileType.getSelectedIndex()+"", client, ipser, port);
            sendData(finalFileName, client, ipser, port);
            sendData(listInteger, client, ipser, port);
            //System.out.println(receiveData(client).getData());

            byte bufferedResult[] = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(bufferedResult, bufferedResult.length);
            client.setSoTimeout(3000);
            try {
                client.receive(receivePacket);
                String result = new String(receivePacket.getData()).trim();
                txtPrimeNumber.setText(result);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Connect failed!");
                btnSend.setEnabled(false);
            }

        } catch (SocketException ex) {
            Logger.getLogger(UDPClientForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPClientForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDPClientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //socket = new Socket(ipser, port); // Connect to server
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Can't connect to server because " + e.getMessage());
            return;
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private DatagramPacket receiveData(DatagramSocket client) throws IOException {
        byte temp[] = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(temp, temp.length);
        client.receive(receivePacket);
        return receivePacket;
    }

    private void sendData(String data, DatagramSocket client, InetAddress ipser, int port) throws IOException {
        byte temp[] = new byte[1024];
        temp = data.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(temp, temp.length, ipser, port);
        client.send(sendPacket);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UDPClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UDPClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UDPClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UDPClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UDPClientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> cboFileType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtFileLocation;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtListIntegers;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtPrimeNumber;
    // End of variables declaration//GEN-END:variables
}
