/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bitco
 */
public class transactions extends javax.swing.JFrame {

    /**
     * Creates new form transactions
     */
    DefaultTableModel model;
    public transactions() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(900, 600);
        fillCustomerComboBox();
        fillProductComboBox();
        
        String [] judul = {"ID","Customer", "Product","Amount", "Date", "Total"};
        model = new DefaultTableModel(judul,0);
        table.setModel(model);
        showTable();
        
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
    }
    
    private List<String> getCustomerNames() {
        List<String> customerNames = new ArrayList<>();
        String query = "SELECT id_customer FROM customer"; 
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ritel_app", "root", "");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                customerNames.add(resultSet.getString("id_customer"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerNames;
    }
    
    private void fillCustomerComboBox() {
        List<String> customerNames = getCustomerNames();

        customer.removeAllItems(); // Kosongkan JComboBox sebelum menambah item
        for (String name : customerNames) {
            customer.addItem(name);
        }
        customer.setSelectedItem(null);
    }
    
    private List<String> getProductNames() {
        List<String> productNames = new ArrayList<>();
        String query = "SELECT id_product FROM product"; 
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ritel_app", "root", "");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                productNames.add(resultSet.getString("id_product"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productNames;
    }

    private void fillProductComboBox() {
        List<String> productNames = getProductNames();

        product.removeAllItems(); // Kosongkan JComboBox sebelum menambah item
        for (String name : productNames) {
            product.addItem(name);
        }
        product.setSelectedItem(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        customersMenu = new javax.swing.JButton();
        productsMenu = new javax.swing.JButton();
        transactionMenu = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        product = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        customer = new javax.swing.JComboBox<>();
        amount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        navigasiSebelum = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        navigasiBerikut = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        customersMenu.setText("Customers");
        customersMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersMenuActionPerformed(evt);
            }
        });

        productsMenu.setText("Products");
        productsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsMenuActionPerformed(evt);
            }
        });

        transactionMenu.setText("Transactions");
        transactionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customersMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productsMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transactionMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(customersMenu)
                    .addComponent(productsMenu)
                    .addComponent(transactionMenu))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        idField.setText("auto (tidak perlu diisi)");
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("Customer");

        product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });

        jLabel5.setText("Product");

        customer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        jLabel6.setText("Date");

        jLabel7.setText("Amount");

        date.setText("YYYY-MM-DD");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        navigasiSebelum.setText("Sebelumnya");
        navigasiSebelum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigasiSebelumActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Product", "Amount", "Date", "Total"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        navigasiBerikut.setText("Berikutnya");
        navigasiBerikut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigasiBerikutActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Add Transactions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(navigasiSebelum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(navigasiBerikut)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navigasiSebelum)
                    .addComponent(navigasiBerikut))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //        this.setVisible(false);
        //        home homePage = new home(fullName);
        //        homePage.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void customersMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        customers customersPage = new customers(); // Membuat instance dari kelas register
        customersPage.setVisible(true);
    }//GEN-LAST:event_customersMenuActionPerformed

    private void productsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        product productPage = new product(); // Membuat instance dari kelas register
        productPage.setVisible(true);
    }//GEN-LAST:event_productsMenuActionPerformed

    private void transactionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        transactions transactionPage = new transactions(); // Membuat instance dari kelas register
        transactionPage.setVisible(true);
    }//GEN-LAST:event_transactionMenuActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_productActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        
    }//GEN-LAST:event_customerActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed
     private void updateFields(int index) {
        if (index >= 0 && index < table.getRowCount()) {
            currentIndex = index;
            table.setRowSelectionInterval(index, index);
        }
    }
    private void navigasiSebelumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigasiSebelumActionPerformed
        // TODO add your handling code here:
        if (currentIndex > 0) {
            updateFields(currentIndex - 1);
        }
    }//GEN-LAST:event_navigasiSebelumActionPerformed
    private int currentIndex = -1;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        
    }//GEN-LAST:event_tableMouseClicked

    private void navigasiBerikutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigasiBerikutActionPerformed
        // TODO add your handling code here:
        if (currentIndex < table.getRowCount() - 1) {
            updateFields(currentIndex + 1);
        }
    }//GEN-LAST:event_navigasiBerikutActionPerformed
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            // Membuka koneksi ke database
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ritel_app","root","");

            // Mengambil harga produk dari tabel product
            String productId = product.getSelectedItem().toString();
            String priceQuery = "SELECT price FROM product WHERE id_product = ?";
            PreparedStatement pricePst = cn.prepareStatement(priceQuery);
            pricePst.setString(1, productId);
            ResultSet priceRs = pricePst.executeQuery();

            double price = 0;
            if (priceRs.next()) {
                price = priceRs.getDouble("price");
            }

            // Menutup hasil query harga
            priceRs.close();
            pricePst.close();

            // Menghitung total harga
            int amountValue = Integer.parseInt(amount.getText());
            double totalPrice = amountValue * price;

            // Query SQL untuk memasukkan data transaksi
            String sql = "INSERT INTO transaksi (id_customer, id_product, jumlah_product, date, total_harga) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = cn.prepareStatement(sql);

            // Mengisi parameter pada query
            pst.setString(1, customer.getSelectedItem().toString()); // ID Customer
            pst.setString(2, productId);                            // ID Product
            pst.setInt(3, amountValue);                             // Amount
            pst.setDate(4, new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(date.getText()).getTime())); // Date
            pst.setDouble(5, totalPrice);                           // Total

            // Menjalankan query
            pst.executeUpdate();

            // Menutup koneksi
            pst.close();
            cn.close();

            // Memberitahukan pengguna bahwa data telah berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data transaksi berhasil ditambahkan!");
            showTable();

            // Menyegarkan tabel atau melakukan tindakan lain yang diperlukan
            // showTable();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error dalam menyimpan data transaksi: " + ex.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Format tanggal salah: " + ex.getMessage());
        }
    }//GEN-LAST:event_addButtonActionPerformed
    // Method untuk mendapatkan ID dari nama

    /**
     * @param args the command line arguments
     */
    private void showTable() {
        int row = table.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ritel_app","root","");;
            ResultSet rs = cn.createStatement().executeQuery(
                    "SELECT t.id_transaksi,c.name AS customer_name,p.name AS product_name,t.date,t.jumlah_product,t.total_harga\n" +
                    "FROM transaksi t\n" +
                    "JOIN customer c ON t.id_customer = c.id_customer\n" +
                    "JOIN product p ON t.id_product = p.id_product;");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transactions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> customer;
    private javax.swing.JButton customersMenu;
    private javax.swing.JTextField date;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton navigasiBerikut;
    private javax.swing.JButton navigasiSebelum;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JButton productsMenu;
    private javax.swing.JTable table;
    private javax.swing.JButton transactionMenu;
    // End of variables declaration//GEN-END:variables
}