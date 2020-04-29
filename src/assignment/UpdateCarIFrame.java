/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class UpdateCarIFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateCarIFrame
     */
    public UpdateCarIFrame() {
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

        ColorField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ModelNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ManufacturerField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EngineSizeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SeatCountField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        WOFExpiryDatePicker = new org.jdesktop.swingx.JXDatePicker();
        RentedDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel16 = new javax.swing.JLabel();
        ReturnDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RegistrationField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RentPerDayField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        FuelTypeField = new javax.swing.JComboBox<>();
        BodyTypeField = new javax.swing.JComboBox<>();
        StatusField = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Update Car");

        jLabel9.setText("Color");

        jLabel11.setText("Status");

        ModelNameField.setName(""); // NOI18N
        ModelNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelNameFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Model Name");

        jLabel12.setText("Body Type");

        ManufacturerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManufacturerFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Manufacturer");

        jLabel3.setText("Engine Size");

        jLabel4.setText("Number Of Seats");

        SaveButton.setText("SAVE");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        WOFExpiryDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WOFExpiryDatePickerActionPerformed(evt);
            }
        });

        jLabel16.setText("Rented Date");

        jLabel17.setText("Return Date");

        jLabel5.setText("Fuel Type");

        jLabel6.setText("Registration Number");

        jLabel7.setText("WOF Expiry Date");

        jLabel8.setText("Rent per day");

        SearchButton.setText("SEARCH");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        FuelTypeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "petrol", "diesel", "hybrid" }));
        FuelTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuelTypeFieldActionPerformed(evt);
            }
        });

        BodyTypeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sedan", "hatchback", "van", "suv" }));

        StatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "rented", "repairing" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WOFExpiryDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RentedDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SaveButton)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(ReturnDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RegistrationField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ModelNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ColorField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RentPerDayField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SeatCountField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EngineSizeField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ManufacturerField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FuelTypeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BodyTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SaveButton)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(RegistrationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ManufacturerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(EngineSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SeatCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FuelTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ModelNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(RentPerDayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ColorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(BodyTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WOFExpiryDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RentedDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModelNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelNameFieldActionPerformed

    private void ManufacturerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManufacturerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManufacturerFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        String regNo = RegistrationField.getText();
        Car c = CarStore.searchCarByRegistration(regNo);
        //Check if registration number is already taken
            //Car model variables
            c.setModelName(ModelNameField.getText());
            c.setManufacturer(ManufacturerField.getText());
            c.setEngineSize(Double.parseDouble(EngineSizeField.getText()));
            c.setSeatCount(Integer.parseInt(SeatCountField.getText()));
            c.setFuelType(FuelType.valueOf(FuelTypeField.toString()));
            c.setBodyType(CarBodyType.valueOf(BodyTypeField.toString()));
            //Car individual variables
            c.setWOFExpiryDate(WOFExpiryDatePicker.getDate());
            c.setRentPerDay(Double.parseDouble(RentPerDayField.getText()));
            c.setColor(ColorField.getText());
            c.setShopStatus(ShopStatus.valueOf(StatusField.toString()));
            c.setRentDate(RentedDatePicker.getDate());
            c.setReturnDate(ReturnDatePicker.getDate());
            JOptionPane.showMessageDialog(this, "Car Updated");
            
            //Init current date to fill date pickers with
            Date now = new Date();
            //Reset all fields
            /**
            ModelNameField.setText("");
            ManufacturerField.setText("");
            EngineSizeField.setText("");
            SeatCountField.setText("");
            FuelTypeField.setText("");
            BodyTypeField.setText("");
            RegistrationField.setText("");
            WOFExpiryDatePicker.setDate(now);
            RentedDatePicker.setDate(now);
            ReturnDatePicker.setDate(now);
            RentPerDayField.setText("");
            ColorField.setText("");
            StatusField.setText("");
            **/
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void WOFExpiryDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WOFExpiryDatePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WOFExpiryDatePickerActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String regNo = RegistrationField.getText();
        Car c = CarStore.searchCarByRegistration(regNo);
        if(c == null)
        {
            JOptionPane.showMessageDialog(this, "There are no Cars with this registration");
        }else
        {
            ModelNameField.setText(c.getModelName());
            ManufacturerField.setText(c.getManufacturer());
            EngineSizeField.setText(Double.toString(c.getEngineSize()));
            SeatCountField.setText(Integer.toString(c.getSeatCount()));
            FuelTypeField.setSelectedItem(c.getFuelType().toString());
            BodyTypeField.setSelectedItem(c.getBodyType().toString());
            RegistrationField.setText(c.getRegistrationNumber());
            WOFExpiryDatePicker.setDate(c.getWOFExpiryDate());
            RentedDatePicker.setDate(c.getRentDate());
            ReturnDatePicker.setDate(c.getReturnDate());
            RentPerDayField.setText(String.valueOf(c.getRentPerDay()));
            ColorField.setText(c.getColor());
            StatusField.setSelectedItem(c.getShopStatus().toString());
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void FuelTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuelTypeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FuelTypeFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BodyTypeField;
    private javax.swing.JTextField ColorField;
    private javax.swing.JTextField EngineSizeField;
    private javax.swing.JComboBox<String> FuelTypeField;
    private javax.swing.JTextField ManufacturerField;
    private javax.swing.JTextField ModelNameField;
    private javax.swing.JTextField RegistrationField;
    private javax.swing.JTextField RentPerDayField;
    private org.jdesktop.swingx.JXDatePicker RentedDatePicker;
    private org.jdesktop.swingx.JXDatePicker ReturnDatePicker;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SeatCountField;
    private javax.swing.JComboBox<String> StatusField;
    private org.jdesktop.swingx.JXDatePicker WOFExpiryDatePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
