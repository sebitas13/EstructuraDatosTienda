/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Factura;
import Entidades.Producto;
import Entidades.Venta;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import sistema.Configuracion;

/**
 *
 * @author USUARIO
 */
public class FrameGestionVentas extends javax.swing.JFrame {

    /**
     * Creates new form FrameGestionVentas
     */
    public FrameGestionVentas() {
        initComponents();
         DefaultTableModel table = new DefaultTableModel(Configuracion.colaventas.getMatrizVenta(),
                                        Configuracion.colaventas.getTituloVentas());
        this.tablaVentas.setModel(table);
        this.tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        rbtExpress = new javax.swing.JRadioButton();
        rbtRegular = new javax.swing.JRadioButton();
        rbtTotal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEliminar.setText("DESPACHAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        jLabel1.setText("GESTION DE VENTAS");

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtExpress);
        rbtExpress.setText("Express");
        rbtExpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtExpressActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtRegular);
        rbtRegular.setText("Regular");
        rbtRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtRegularActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtTotal);
        rbtTotal.setText("Total");
        rbtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(rbtTotal)
                        .addGap(35, 35, 35)
                        .addComponent(rbtRegular)
                        .addGap(33, 33, 33)
                        .addComponent(rbtExpress))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtExpress)
                    .addComponent(rbtRegular)
                    .addComponent(rbtTotal)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnEliminar))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        try{

            int fila=0;
            int columna =0;
            int ID;
            //Jugador jugador;
            //Arbitro arbitro;
            Venta venta;

            fila=this.tablaVentas.getSelectedRow();

            ID = Integer.parseInt((String) this.tablaVentas.getValueAt(fila,columna));

            venta = Configuracion.colaventas.obtenerVetna(ID);

            if(venta != null){

                int confirmado = JOptionPane.showConfirmDialog(this,"¿seguro?");

                if(JOptionPane.OK_OPTION==confirmado){
                      venta.getCliente().decrecentarTotalCompras(venta.montoTotal());
                    Configuracion.colaventas.eliminarVentaPorID(ID);

                    JOptionPane.showMessageDialog(this, "Eliminado");

                }

            }else{
                JOptionPane.showMessageDialog(this,"Producto no encontrado");
            }

            this.cargarTabla();

        }catch(IndexOutOfBoundsException p){
            JOptionPane.showMessageDialog(this, "ElEMENTO NO SELECCIONADO: "+p);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseClicked
        // TODO add your handling code here:
         try {
            int columna=0;
            int fila=0;
            String id="";
             fila = this.tablaVentas.getSelectedRow();
             
             id = (String)this.tablaVentas.getValueAt(fila,columna);
             
             Venta v = Configuracion.colaventas.obtenerVetna(Integer.parseInt(id));
             
            
             
             //JOptionPane.showMessageDialog(this, e.mostrarResultado());
             JTextArea textArea = new JTextArea(v.getFactura().mostrarResultado());
            JScrollPane scrollPane = new JScrollPane(textArea);  
            textArea.setLineWrap(true);  
            textArea.setWrapStyleWord(true); 
            scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
            JOptionPane.showMessageDialog(null, scrollPane, "DETALLES DE LA VENTA",  
                                       JOptionPane.YES_NO_OPTION);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR:"+e);
        }
    }//GEN-LAST:event_tablaVentasMouseClicked

    private void rbtRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtRegularActionPerformed
        // TODO add your handling code here:
        this.cargarTabla();
    }//GEN-LAST:event_rbtRegularActionPerformed

    private void rbtExpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtExpressActionPerformed
        // TODO add your handling code here:
        this.cargarTabla();
    }//GEN-LAST:event_rbtExpressActionPerformed

    private void rbtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTotalActionPerformed
        // TODO add your handling code here:
        this.cargarTabla();
    }//GEN-LAST:event_rbtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(FrameGestionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGestionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGestionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGestionVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGestionVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtExpress;
    private javax.swing.JRadioButton rbtRegular;
    private javax.swing.JRadioButton rbtTotal;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla(){
    
   
       
    
      if(this.rbtExpress.isSelected()){
          DefaultTableModel table = new DefaultTableModel(Configuracion.colaventas.getMatrizVentaExpress(),
                                        Configuracion.colaventas.getTituloVentas());
        this.tablaVentas.setModel(table);
        this.tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(10);  
    
            
        }else if(this.rbtRegular.isSelected()){
           DefaultTableModel table = new DefaultTableModel(Configuracion.colaventas.getMatrizVentaRegular(),
                                        Configuracion.colaventas.getTituloVentas());
        this.tablaVentas.setModel(table);
        this.tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(10);
        
         
        
        }else if(this.rbtTotal.isSelected()){
           DefaultTableModel table = new DefaultTableModel(Configuracion.colaventas.getMatrizVenta(),
                                        Configuracion.colaventas.getTituloVentas());
        this.tablaVentas.setModel(table);
        this.tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(10);; 
         
         
        
        }  
    
    
}
   
   
    
}