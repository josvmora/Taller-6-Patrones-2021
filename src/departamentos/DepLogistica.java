/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departamentos;

import java.util.ArrayList;
import java.util.List;
import strategy.*;
import usuarios.Empleado;

/**
 *
 * @author JOSE VIVANCO
 */
public class DepLogistica {
    private List<Empleado> miembros;
    
    public DepLogistica(){
        this.miembros = new ArrayList<Empleado>();
        
    }
    
    public void addMember(Empleado e){
        this.miembros.add(e);
    }
    
    private static void organizarDistribucion(){
        AutomotiveStrategy str = new AutomotiveStrategy();
        Distribucion distribucion = new Distribucion();
        
        distribucion.setStrategy(str);
        distribucion.executeStrategy();
    }    
}
