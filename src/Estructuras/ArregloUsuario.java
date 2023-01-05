/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ArregloUsuario {
    
    ArrayList<Usuario> usuarios;
    
    public ArregloUsuario(){
        
        usuarios = new ArrayList<>();
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
    public Usuario validar( String user , String pass){
        Usuario result = null;
        for(Usuario p : this.usuarios){
            if(p.validar(user, pass)){
                result = p;
                break;
            }
        }
        return result;
    }
    
    public  boolean add( Usuario u) {
        return this.usuarios.add(u);
    } 
    
    public boolean eliminar(String nom){
        boolean result =false;
        for(Usuario e : usuarios){
            if(e.getNombre().equalsIgnoreCase(nom)){
                this.usuarios.remove(e);
                result=true;
            }
             
        }
       return result;
    }
    
     public boolean findUsuario(String nom){
        boolean result =false;
        for(Usuario e : usuarios){
            if(e.getUsuario().equalsIgnoreCase(nom)){
                
                result=true;
            }
             
        }
       return result;
    }

    public int cantidadDeUsuarios(){
        
        return this.usuarios.size();
    }
    
    public String[][] getMatrizUsuario() {
        String[][] result = new String[this.cantidadDeUsuarios()][3];
        int i = 0;
        for (Usuario u : this.usuarios) {
            
            result[i][0]=  u.getNombre();
            result[i][1] = u.getUsuario();
            result[i][2] = u.getContraseña();
               
            i++;

        }
        return result;
    }
     public String[] getTitulos(){
        String result[] = new String[3];
        result[0] = "Nombre";
        result[1] = "Usuario";
        result[2] = "Contraseña";
        
        
        return result;
    }  
    
    
}
