/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patient.UI;
import model.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import model.patient.Patient;
import java.awt.event.KeyEvent;

/**
 *
 * @author Gayatri
 */

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class PatientSignUpPage extends javax.swing.JPanel {
Connection con;
    /**
     * Creates new form PatientRegistration1
     * 
     * 
     */

    
    //for validating email id format 
    String PATTERN= "^[a-zA-Z0-9]{0,30}@[a-zA-Z0-9]{0,20}[.][a-zA-Z]{0,5}$";
    Pattern patt= Pattern.compile(PATTERN);
    
    //for validating date format 
    String PATTERNEI = "^[0-9]{2}[/][0-9]{2}[/][0-9]{4}$";
    Pattern pattei = Pattern.compile(PATTERNEI);
    
    
  

    public PatientSignUpPage() throws SQLException {
        

        initComponents();
        try{  
                Class.forName("com.mysql.jdbc.Driver");  
                 this.con=(Connection) DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/AED_DB","root","Snehal1&");  
                
                
            }
        catch(Exception e){ 
                System.out.println(e);
                
        }  
        
           Statement stmt = con.createStatement();
         
          String sql = "select hospital_name from hospital"; 
          ResultSet rs =  stmt.executeQuery(sql);
          while(rs.next()){
              System.out.println(rs.getString(1) );
              txtPatientHospital.addItem(rs.getString(1));
          }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logout1 = new javax.swing.JButton();
        lbl_address = new javax.swing.JLabel();
        txt_City = new javax.swing.JLabel();
        txt_Zip = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_telenum = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        txtPatientGender = new javax.swing.JComboBox<>();
        txtPatientUsername = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtPatientStreet = new javax.swing.JTextField();
        txtPatientPassword = new javax.swing.JTextField();
        txtPatientContact = new javax.swing.JTextField();
        txtPatientZip = new javax.swing.JTextField();
        txtPatientDOB = new javax.swing.JTextField();
        txtPatientCommunity = new javax.swing.JComboBox<>();
        lbl_title = new javax.swing.JLabel();
        lbl_donorname = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        lbl_pswd = new javax.swing.JLabel();
        PatientSignUpBtn = new javax.swing.JButton();
        lbl_dob1 = new javax.swing.JLabel();
        lbl_dob2 = new javax.swing.JLabel();
        txtPatientBG = new javax.swing.JComboBox<>();
        lbl_telenum1 = new javax.swing.JLabel();
        txtPatientEmail = new javax.swing.JTextField();
        txt_Zip1 = new javax.swing.JLabel();
        txtPatientHospital = new javax.swing.JComboBox<>();

        Logout1.setBackground(new java.awt.Color(153, 0, 153));
        Logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Logout1.setText("Back");
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(0, 204, 204));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_address.setText("Street Name:");

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_City.setText("Community:");

        txt_Zip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Zip.setText("Zip Code:");

        lbl_gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_gender.setText("Gender:");

        lbl_telenum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_telenum.setText("Phone no.:");

        lbl_dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob.setText("Date of Birth:");

        txtPatientGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPatientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        txtPatientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientNameKeyPressed(evt);
            }
        });

        txtPatientStreet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientStreetKeyPressed(evt);
            }
        });

        txtPatientContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatientContactMouseClicked(evt);
            }
        });
        txtPatientContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientContactKeyPressed(evt);
            }
        });

        txtPatientZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientZipKeyPressed(evt);
            }
        });

        txtPatientDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientDOBActionPerformed(evt);
            }
        });

        txtPatientCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allston", "Back Bay", "Bay Village", "Beacon Hill", "Brighton", "Charlestown", "Chinatown – Leather District", "Dorchester", "Downtown", "East Boston", "Fenway-Kenmore", "Hyde Park", "Jamaica Plain", "Mattapan", "Mid-Dorchester", "Mission Hill", "North End", "Roslindale", "Roxbury", "South Boston", "South End", "West End", "West Roxbury", " ", " ", " " }));

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_title.setText("                             Patient Details");

        lbl_donorname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_donorname.setText("Patient Name:");

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_uname.setText("Username:");

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");

        PatientSignUpBtn.setBackground(new java.awt.Color(0, 102, 102));
        PatientSignUpBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        PatientSignUpBtn.setText("SIGN UP");
        PatientSignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientSignUpBtnActionPerformed(evt);
            }
        });

        lbl_dob1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob1.setText("Blood Group:");

        lbl_dob2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dob2.setText("Contact Details");

        txtPatientBG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A +ve ", "A -ve", "B +ve", "B -ve", "AB +ve", "AB -ve", "O +ve", "O -ve", "Kidneys", "Liver", "Lungs", "Heart", "Pancreas", "Intestines", "Eyes", " " }));

        lbl_telenum1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_telenum1.setText("Email ID:");

        txtPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientEmailActionPerformed(evt);
            }
        });

        txt_Zip1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Zip1.setText("Hospital Name:");

        txtPatientHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientHospitalActionPerformed(evt);
            }
        });
        txtPatientHospital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientHospitalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(PatientSignUpBtn)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Zip1)
                            .addComponent(lbl_pswd)
                            .addComponent(lbl_donorname)
                            .addComponent(lbl_uname)
                            .addComponent(lbl_address)
                            .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Zip)
                            .addComponent(lbl_gender)
                            .addComponent(lbl_telenum)
                            .addComponent(lbl_dob)
                            .addComponent(lbl_dob1)
                            .addComponent(lbl_dob2)
                            .addComponent(lbl_telenum1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPatientContact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientBG, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPatientDOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPatientHospital, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPatientZip)
                            .addComponent(txtPatientCommunity, javax.swing.GroupLayout.Alignment.LEADING, 0, 461, Short.MAX_VALUE)
                            .addComponent(txtPatientStreet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_donorname)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_uname)
                    .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_address)
                    .addComponent(txtPatientStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_City)
                    .addComponent(txtPatientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Zip, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Zip1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_gender)
                            .addComponent(txtPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dob)
                    .addComponent(txtPatientDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dob1)
                    .addComponent(txtPatientBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lbl_dob2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telenum)
                    .addComponent(txtPatientContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telenum1)
                    .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(PatientSignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtPatientDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientDOBActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Logout1ActionPerformed

    private void PatientSignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:

        // to check cell phone no. length
        String cn= txtPatientContact.getText();        
        int celllength = cn.length();
        
        //for validating email address
        Matcher match=patt.matcher(txtPatientEmail.getText());
        
        //for validating date 
        Matcher matchei=pattei.matcher(txtPatientDOB.getText());
        
        if(txtPatientContact.getText().equals("") || txtPatientDOB.getText().equals("") 
                || txtPatientContact.getText().equals("") || txtPatientName.getText().equals("") || 
                txtPatientEmail.getText().equals("") || txtPatientPassword.getText().equals("") || 
                txtPatientStreet.getText().equals("") || txtPatientUsername.getText().equals("") || 
                txtPatientZip.getText().equals("")){ 
         
            JOptionPane.showMessageDialog(this," All details are not Filled ");
            
        }    
        else if(!matchei.matches())
                {
                 JOptionPane.showMessageDialog(this," Invalid Date format (Valid Format is DD/MM/YYYY)");    
        }
                
                
                
        else if(celllength<10)
                {
                JOptionPane.showMessageDialog(this," Enter 10 digit cell phone number ");
                
            }
        
        else if(!match.matches()){
                 JOptionPane.showMessageDialog(this," Invalid Email id  ");
        }         
        
            
        
        else
        {  
                JOptionPane.showMessageDialog(this," New Patient Details Added ");
                
                
             
                


//        String pname = txtPatientName.getText();
//        String pusername = txtPatientUsername.getText();
//        String ppassword = txtPatientPassword.getText();
//        String streetname = txtPatientStreet.getText();
//        String community = txtPatientCommunity.getSelectedItem().toString();
//        String zipcode = jTextField8.getText();
//        String phospital = jTextField9.getText().toString();
//        String gender = cmb_gender.getSelectedItem().toString();
//        String pphno = txtPatientContact.getText().toString();
//        String pdob = txtPatientDOB.getText().toString();
//        Connection con;
//        Statement stmt;
//        try {
//            stmt = con.createStatement();
//        } catch (SQLException ex) {
//            Logger.getLogger(PatientSignUpPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                System.out.println("Connection established!");
//                ResultSet rs=stmt.executeQuery("select * from admin");  
//                while(rs.next())  
//                System.out.println(rs.getString(1)+"  "+rs.getString(2));

            txtPatientContact.setText("");
            txtPatientDOB.setText("");
            txtPatientEmail.setText("");
            txtPatientName.setText("");
            txtPatientPassword.setText("");
            txtPatientStreet.setText("");
            txtPatientUsername.setText("");
            txtPatientZip.setText("");
            


       }

         Patient p = new Patient();
        p.setPname(txtPatientName.getText());
        p.setPusername(txtPatientUsername.getText());
        p.setPpassword(txtPatientPassword.getText());
        p.setPstreetname(txtPatientStreet.getText());
        p.setPcommunity(txtPatientCommunity.getSelectedItem().toString());
        p.setPzipcode(Integer.parseInt(txtPatientZip.getText()));
        p.setPgender(txtPatientGender.getSelectedItem().toString());
        p.setPdateofbirth(txtPatientDOB.getText());
        p.setPbloodgroup(txtPatientBG.getSelectedItem().toString());
        p.setPphonenumber(Long.valueOf(txtPatientContact.getText()));
        p.setPemailid(txtPatientEmail.getText());
        p.setPhospital(txtPatientHospital.getSelectedItem().toString());
        
        ServicePatient s = new ServicePatient();
        System.out.println("patient sign up button clicked");
        s.addpatientdetails(p);

        
    }                                        
                                


    private void txtPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientEmailActionPerformed

    private void txtPatientHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientHospitalActionPerformed

    private void txtPatientNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            //iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            txtPatientName.setEditable(true);
        }else{
            txtPatientName.setEditable(false);
        }
    }//GEN-LAST:event_txtPatientNameKeyPressed

    private void txtPatientStreetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientStreetKeyPressed
        // TODO add your handling code here:
       char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            //iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            txtPatientStreet.setEditable(true);
        }else{
            txtPatientStreet.setEditable(false);
        }
        
    }//GEN-LAST:event_txtPatientStreetKeyPressed

    private void txtPatientZipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientZipKeyPressed
        // TODO add your handling code here:
        String age= txtPatientZip.getText();
        
        // get length of the string 
        int length = age.length();
        
        char c = evt.getKeyChar();
        
        //check for number 0 to 9 
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit 
            if(length<5){
                //editable true 
                txtPatientZip.setEditable(true);
                //JOptionPane.showMessageDialog(this," Invalid Cell Number ");
                
            }else{
                //not editable if length is more than 10 digit
                txtPatientZip.setEditable(false);
            }
        }else{
            //not allow keys 'backspace' and 'delete' for edit
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                //than allow editable 
                txtPatientZip.setEditable(true);
            }else{
                txtPatientZip.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_txtPatientZipKeyPressed

    private void txtPatientHospitalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientHospitalKeyPressed
        // TODO add your handling code here:
//        char c = evt.getKeyChar();
//        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
//            //iso control for edit operation(delete key and backspace key allow)
//            //if enter character is letter, space and isocontrol char than allow to edit
//            txtPatientHospital.setEditable(true);
//        }else{
//            txtPatientHospital.setEditable(false);
//        }
        
    }//GEN-LAST:event_txtPatientHospitalKeyPressed

    private void txtPatientContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientContactMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_txtPatientContactMouseClicked

    private void txtPatientContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientContactKeyPressed
        // TODO add your handling code here:
        //action when key is pressed 
        String cell_no= txtPatientContact.getText();
        
        // get length of the string 
        int length = cell_no.length();
        
        char c = evt.getKeyChar();
        
        //check for number 0 to 9 
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check for length not more than 10 digit 
            if(length<10){
                //editable true 
                txtPatientContact.setEditable(true);
                //JOptionPane.showMessageDialog(this," Invalid Cell Number ");
                
            }else{
                //not editable if length is more than 10 digit
                txtPatientContact.setEditable(false);
            }
        }else{
            //not allow keys 'backspace' and 'delete' for edit
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                //than allow editable 
                txtPatientContact.setEditable(true);
            }else{
                txtPatientContact.setEditable(false);
            }
        }
        
        
    }//GEN-LAST:event_txtPatientContactKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout1;
    private javax.swing.JButton PatientSignUpBtn;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_dob1;
    private javax.swing.JLabel lbl_dob2;
    private javax.swing.JLabel lbl_donorname;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_telenum;
    private javax.swing.JLabel lbl_telenum1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JComboBox<String> txtPatientBG;
    private javax.swing.JComboBox<String> txtPatientCommunity;
    private javax.swing.JTextField txtPatientContact;
    private javax.swing.JTextField txtPatientDOB;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JComboBox<String> txtPatientGender;
    private javax.swing.JComboBox<String> txtPatientHospital;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientPassword;
    private javax.swing.JTextField txtPatientStreet;
    private javax.swing.JTextField txtPatientUsername;
    private javax.swing.JTextField txtPatientZip;
    private javax.swing.JLabel txt_City;
    private javax.swing.JLabel txt_Zip;
    private javax.swing.JLabel txt_Zip1;
    // End of variables declaration//GEN-END:variables
}
