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
    String tipoPersonaDestino="docente";
    String estadoRegistro="porConfirmar";
    
    public String ObtenerAccion(String a, boolean b){
        if(a.equals(esObligatorio) && esDocente==true){
            return "Actualizar";
        }
        else if((!a.equals(esObligatorio)) && esDocente==true){
            return "Matricular";
        }


        return "vacio";
    }
}
