/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Cliente;
import Entidades.Factura;
import Entidades.Operacion;
import Entidades.Producto;
import Entidades.Venta;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema.Configuracion;

/**
 *
 * @author USUARIO
 */
public class FrameIntVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form FraneIntVenta
     */
    
    Venta venta;
    String cat;
    Producto productoG;
    Cliente cliente = Configuracion.listaClientes.obtenerPersonaPorNombre(Configuracion.usuario.getNombre());
    
    
    int cantidad = 1;
    float montoTotal=0; //=Configuracion.MONTOTOTAL;
    ArrayList<Operacion> operaciones = Configuracion.operaciones;
    
    public FrameIntVenta() {
        initComponents();
    }
    
     public FrameIntVenta(String cat) {
        initComponents();
        this.btnAñadir.setEnabled(false);
        this.cat=cat;
        this.cargarTablas();
        this.cargarMontoTotal();
        this.cargarUsuario();
        this.cargarImagen(cat);
        this.btnVenta.setEnabled(false);
        if(this.spinCantidad.isFocusable()){
            this.btnAñadir.setEnabled(true);
        }
       
        //JOptionPane.showMessageDialog(null, cliente.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnRetirar = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMontoTotalAcumulado = new javax.swing.JTextField();
        txtMontoOperacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinCantidad = new javax.swing.JSpinner();
        txtCategoria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMontoTotalActual = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumCompras = new javax.swing.JTextField();
        checkExpress = new javax.swing.JCheckBox();
        btnVenta = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1360, 633));
        setPreferredSize(new java.awt.Dimension(1360, 633));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("MONTO OPERACION ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, 29));

        jLabel9.setText("DETALLES DEL PRODUCTO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, 25));

        btnAñadir.setText("AÑADIR");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 90, 40));

        jLabel10.setText("STOCK");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        btnRetirar.setText("RETIRAR");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 80, 40));

        txtStock.setEditable(false);
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 59, -1));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        tablaProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaProductosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 310, 205));

        jLabel6.setText("CARRITO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jLabel7.setText("MONTO TOTAL:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        txtMontoTotalAcumulado.setEditable(false);
        getContentPane().add(txtMontoTotalAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 140, 110, -1));

        txtMontoOperacion.setEditable(false);
        getContentPane().add(txtMontoOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 76, -1));

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaCarrito);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 590, 205));

        jLabel1.setText("PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 140, -1));

        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 62, -1));

        txtNombre.setEditable(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 210, -1));

        jLabel3.setText("PRECIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        txtPrecio.setEditable(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 105, -1));

        jLabel4.setText("CANTIDAD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel8.setText("CATEGORIA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        spinCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        spinCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinCantidadStateChanged(evt);
            }
        });
        spinCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spinCantidadFocusGained(evt);
            }
        });
        spinCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spinCantidadMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                spinCantidadMousePressed(evt);
            }
        });
        getContentPane().add(spinCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 76, -1));

        txtCategoria.setEditable(false);
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, -1));

        jLabel11.setText("USUARIO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, -1, -1));

        txtUsuario.setEditable(false);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 80, 110, 30));

        jLabel12.setText("Total compra");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 140, -1, -1));

        txtMontoTotalActual.setEditable(false);
        getContentPane().add(txtMontoTotalActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 77, -1));

        jLabel13.setText("N°compras");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 190, -1, -1));
        getContentPane().add(txtNumCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 190, 50, -1));

        checkExpress.setText("express");
        checkExpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkExpressActionPerformed(evt);
            }
        });
        getContentPane().add(checkExpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 80, 30));

        btnVenta.setText("APLICAR");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 360, 90, 40));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 500, 100, 30));

        lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/teclado.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        // TODO add your handling code here:

        this.txtMontoOperacion.setText("");

        String nombre;
        int columna =0;
        int fila;
        //Producto producto;

        try{

            fila=this.tablaProductos.getSelectedRow();
            nombre= (String)this.tablaProductos.getValueAt(fila,columna);

            // persona = Configuracion.personas.buscarJugadorPorNombre(posicion);
            productoG=Configuracion.listaProductos.obtenerProductoPorNombre(nombre);

            this.txtNombre.setText(productoG.getNombre());
            this.txtPrecio.setText(String.valueOf(productoG.getPrecio()));
            this.txtCategoria.setText(productoG.getCategoria());
            this.txtStock.setText(String.valueOf(productoG.getStock()));

            /*if( this.spinCantidad.isFocusable()){
                JOptionPane.showMessageDialog(null, "ENTRE");
                int cant = Integer.parseInt(this.spinCantidad.getValue().toString());
                float total = producto.getPrecio()*cant;
                this.txtMontoOperacion.setText(String.valueOf(total));

            }*/

        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "ELIGE ELEMENTO: ");

        }

    }//GEN-LAST:event_tablaProductosMouseClicked

    private void tablaProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaProductosKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            /*int fila=0;
            int columna=0;
            String posicion="";
            Venta venta;
            Equipo equipo;*/

            String nombre;
            int columna =0;
            int fila;
            Producto producto;

            try{

                fila=this.tablaProductos.getSelectedRow();
                nombre= (String)this.tablaProductos.getValueAt(fila,columna);

                // persona = Configuracion.personas.buscarJugadorPorNombre(posicion);
                producto=Configuracion.listaProductos.obtenerProductoPorNombre(nombre);

                this.txtNombre.setText(producto.getNombre());
                this.txtPrecio.setText(String.valueOf(producto.getPrecio()));
                this.txtCategoria.setText(producto.getCategoria());
                this.txtStock.setText(String.valueOf(producto.getStock()));

            }catch(IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(this, "ELIGE ELEMENTO: ");

            }

        }

    }//GEN-LAST:event_tablaProductosKeyPressed

    private void spinCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinCantidadStateChanged
        // TODO add your handling code here:
        try {
            
            cantidad = Integer.parseInt(this.spinCantidad.getValue().toString());
            float total = productoG.getPrecio()*cantidad;
            this.txtMontoOperacion.setText(String.valueOf(total));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN PRODUCTO");
        }
        
    }//GEN-LAST:event_spinCantidadStateChanged

    private void spinCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spinCantidadFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_spinCantidadFocusGained

    private void spinCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spinCantidadMouseClicked
        // TODO add your handling code here:


       /* if( this.spinCantidad.isFocusable()){

            int cant = Integer.parseInt(this.spinCantidad.getValue().toString());
            float total = productoG.getPrecio()*cant;
            this.txtMontoOperacion.setText(String.valueOf(total));
        }*/
    }//GEN-LAST:event_spinCantidadMouseClicked

    private void spinCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spinCantidadMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_spinCantidadMousePressed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
         this.btnVenta.setEnabled(true);
        try {
             
             Operacion o = new Operacion(productoG, cantidad);
         if(o.isProcede()){
             operaciones.add(o);
             JOptionPane.showMessageDialog(null, "PROCEDE");
         }else{
             JOptionPane.showMessageDialog(null, "NO PROCEDE");
         }
        
         this.cargarMontoTotal();
         
         cargarTablas();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
        
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        try{
            
            int fila=0;
            int columna =0;
            int posicion=0;
            //Jugador jugador;
            //Arbitro arbitro;
            Operacion operacion;
             
            fila=this.tablaCarrito.getSelectedRow();
            
            posicion = Integer.parseInt((String) this.tablaCarrito.getValueAt(fila,columna));
     
            operacion =  this.operaciones.get(posicion);
      
           if(operacion != null){
                
                int confirmado = JOptionPane.showConfirmDialog(this,"¿seguro?");
                
                if(JOptionPane.OK_OPTION==confirmado){
                    
           

                    
                    operacion.getProducto().setStock(operacion.getProducto().getStock()+operacion.getCantidad());
                    operaciones.remove(operacion);
                  
                    
                    JOptionPane.showMessageDialog(this, "RETIRADO");
                     
                }
                   
               
            }else{
                JOptionPane.showMessageDialog(this,"Cliente no encontrado");
            }
        this.cargarMontoTotal();
        this.cargarTablas();
            
        }catch(IndexOutOfBoundsException p){
            JOptionPane.showMessageDialog(this, "ElEMENTO NO SELECCIONADO: "+p);
        }
        
         
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
        String tipo="";
        if(this.checkExpress.isSelected()){
            
            tipo = "express";
        }else{
            tipo = "regular";
        }
        cliente.incrementarNumCompras(operaciones.size());
        cliente.incrementarTotalCompras(Float.valueOf(this.txtMontoTotalActual.getText()));
        Venta v = new Venta(Configuracion.ID, cliente,tipo, true);
        Configuracion.ID++;
        v.setOperaciones(operaciones);
        Factura factura = new Factura(v,cliente.getDNI());
        v.setFactura(factura);
        
        Configuracion.colaventas.agregar(v);
        
        
        
        //vaciamos el arreglo
        operaciones.removeAll(operaciones);
        JOptionPane.showMessageDialog(null, "GRABADO");
        
       
        
        
        
        
        
        
        
        this.dispose();
        
        FrameFactura frm = new FrameFactura(factura);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnVentaActionPerformed

    private void checkExpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkExpressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkExpressActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JCheckBox checkExpress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JSpinner spinCantidad;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtMontoOperacion;
    private javax.swing.JTextField txtMontoTotalActual;
    private javax.swing.JTextField txtMontoTotalAcumulado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCompras;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    
     private void cargarTablas(){
        
        
        DefaultTableModel tabla = new DefaultTableModel(Configuracion.listaProductos.getMatrizProductoPorCategoria(cat),
                Configuracion.listaProductos.getTituloProductoPorCategoria());
        this.tablaProductos.setModel(tabla);
         this.tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
         
          DefaultTableModel tabla2 = new DefaultTableModel(getMatrizProductoPorCategoria(),
                carritoCabeza());
        this.tablaCarrito.setModel(tabla2);
         this.tablaCarrito.getColumnModel().getColumn(0).setPreferredWidth(10);
    }
     
     
    public String[][] getMatrizProductoPorCategoria(){
        
       String[][] result = new String[this.operaciones.size()][5];
        int i = 0;
        for (Operacion e : operaciones) {
            if(operaciones.get(i)!=null){
                result[i][0]=  String.valueOf(operaciones.indexOf(e));
                
                result[i][1]=  operaciones.get(i).getProducto().getNombre();
                result[i][2]=  String.valueOf(operaciones.get(i).getCantidad());
                result[i][3]=  String.valueOf(operaciones.get(i).getProducto().getPrecio());
                result[i][4]=  String.valueOf(operaciones.get(i).subtotal());
                 i++;
            }
      

        }
   
       return result;
   } 
     
    public String[] carritoCabeza(){
        String[] retorno = null;
        
            String[] result = new String[5];
            result[0] = "POS"  ;
            result[1] = "NOMBRE";
            result[2] = "CANT";
            result[3] = "PRECIO";
            result[4] = "MONTO";

            retorno = result;


        return retorno;
        
    }
    
    public void cargarMontoTotal(){
        
         montoTotal=0;
        for(Operacion e:operaciones){
             montoTotal = montoTotal+ e.subtotal();
             
         }
         this.txtMontoTotalAcumulado.setText(String.valueOf(montoTotal+cliente.getTotalCompras())); 
         this.txtMontoTotalActual.setText(String.valueOf(montoTotal)); 
         this.txtNumCompras.setText(String.valueOf(cliente.getNumeroCompras()+operaciones.size()));
    }
    
    public void cargarUsuario(){
        this.txtUsuario.setText(cliente.getNombre());
        this.txtMontoTotalAcumulado.setText(String.valueOf(montoTotal+cliente.getTotalCompras()));
        this.txtNumCompras.setText(String.valueOf(cliente.getNumeroCompras()+operaciones.size()));
        
    }
    
    
    private void cargarImagen(String cat){
        if(cat.equalsIgnoreCase("teclado")){
            lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/teclado.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200));
        }else if(cat.equalsIgnoreCase("procesador")){
           lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/procesador.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200)); 
        }else if(cat.equalsIgnoreCase("mouse")){
            lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mouse.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200));
        }else if(cat.equalsIgnoreCase("tarjeta")){
            lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjeta.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200));
        }else if(cat.equalsIgnoreCase("disco")){
            lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200));
        }else if(cat.equalsIgnoreCase("ram")){
            lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/video.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200));
        }else{
            lblProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/placa.jpg"))); // NOI18N
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 240, 200));
        }
          
          
            
        
        
    }
}