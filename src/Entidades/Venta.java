/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import Entidades.Operacion;

/**
 *
 * @author USUARIO
 */
public class Venta {
    
    private int numeroVenta;
    private Cliente cliente;
    //private DetalleVenta registroV[];
    private String tipo_entrega;
    private float monto_total;
    private int prioridad;
    private boolean estado; // atendido o pendiente
    private Venta sig;
    private Factura factura;

    private ArrayList<Operacion> operaciones;
  

    public Venta() {
    }

    public Venta(int numeroVenta, Cliente cliente, String tipo_entrega, boolean estado) {
        this.numeroVenta = numeroVenta;
        this.cliente = cliente;
        //this.registroV = registroV;
        this.tipo_entrega = tipo_entrega;
        //this.monto_total = monto_total;
        //this.prioridad=prioridad;
        this.estado = estado;
        operaciones = new  ArrayList<>();
        factura =null;
        
        if(tipo_entrega.equals("express")){
            this.prioridad=1;
        }else{
            this.prioridad=2;
        }
    }
    
    public void crearFactura(Venta v,String id){
        
        this.factura = new Factura(v,id);
    }
    
    public void setFactura(Factura f){
        this.factura = f;
    }
 
    public Factura getFactura(){
       
        return this.factura;
    }
    
   /* public boolean agregarOperacion(Operacion p){
        //Operacion op = new Operacion(p.getProducto(), p.getCantidad());
       return operaciones.add(p);
      
    }*/
    
    public void getMatrizOperaciones(){
        int i =1;
        System.out.println("cliente: "+this.cliente.getNombre());
        for(Operacion e : this.operaciones){
            if(e !=null){
                
                System.out.println("op"+i+"-> "+e.getProducto().getNombre());
               
            }
            i++;
        }
        
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }


    public String getTipo_entrega() {
        return tipo_entrega;
    }

    public void setTipo_entrega(String tipo_entrega) {
        this.tipo_entrega = tipo_entrega;
    }

   /* public float getMonto_total() {
        return monto_total;
    }*/

    /*public void setMonto_total(float monto_total) {
        this.monto_total = monto_total;
    }
*/
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Venta getSig() {
        return sig;
    }

    public void setSig(Venta sig) {
        this.sig = sig;
    }

    public float montoTotal(){
        float result=0;
        for(Operacion e : operaciones){
            if(e!=null){
                result = result + e.subtotal();
            }
            
        }
        
        return result;
    }

    
    /*public boolean realizarOperacion(Producto p,int cantidad){
        boolean result = false;
        
        Operacion o= new Operacion(p, cantidad);
        
        if(o.isProcede()){
             operaciones.add(o);
             result=true;
             System.out.println("PROCEDE");
        }else{
            System.out.println("NO HAY STOCK");
        }
        
       
        
        return result;
    }
    
    
    public boolean cancelarOperacion(Producto p,int cantidad){
        boolean result=false;
        
        if(operaciones.contains(p)){
            
            p.setStock(p.getStock()+cantidad);
            operaciones.remove(p);
            result = true;
            System.out.println("Cancelada operacion");
        }else{
            System.out.println("La operacion no existe");
        }
        
            return result;
        }*/

    
    public void setOperaciones(ArrayList<Operacion> operaciones) {
       
        
        for(Operacion e : operaciones){
            if(e!=null){
                
                this.operaciones.add(e);
            }
        }
    }
    
    public int cantOperaciones(){
        return this.operaciones.size();
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
    
}
