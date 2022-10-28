/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial_practica;

/**
 *
 * @author nayenys
 */
public class Funcion {
    String esObligatorio="si";
    boolean esDocente=true;
    boolean esExterno=true;
    String tipoPersonaDestino="esterno";
    String estadoRegistro="porConfirmar";
    
    public String ObtenerAccion(String a, boolean b){
        if(a.equals(esObligatorio) && esDocente==true){
            return "Actualizar";
        }
        if((a.equals("no")) && esDocente==true){
            return "Matricular";
        }
        if(a.equals(estadoRegistro) && esExterno==true){
            return "actualizar";
        }
        if(a.equals(tipoPersonaDestino) && esExterno==true){
            return "registrar";
        }
        if(a.equals("vigente") && esExterno==true){
            return "matricular";
        }


        return "vacio";
    }
}
