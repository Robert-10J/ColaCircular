package com.Cola;
import javax.swing.*;
import java.util.Stack;
public class Cola {
    Stack colaList = new Stack();
    String cola [] = new String[5];
    
    int i = 0;
    public void insertar(){
        if(colaList.size() == cola.length){
            JOptionPane.showMessageDialog(null,
                    "No puede ingresar mas datos", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            while (i < cola.length){
                String elem = JOptionPane.showInputDialog(null,
                        "Ingrese elemento: ");
                cola[i] = elem;
                colaList.push(cola[i]);
                i++;
                break;
            }
        }
    }

    public void eliminar(){
        if(colaList == null || colaList.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Ingrese datos a la cola", "No hay datos", JOptionPane.ERROR_MESSAGE);
        } else {
            Object element = colaList.remove(0);
            JOptionPane.showMessageDialog(null,
                    "Se elimino el elemento " + element);
            i--;
        }
    }

    public void primerElemento(){
        if(colaList == null || colaList.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Ingrese datos a la cola", "No hay datos", JOptionPane.ERROR_MESSAGE);
        } else {
            Object primer = colaList.get(0);
            JOptionPane.showMessageDialog(null,
                    "El frente es " + primer);
        }
    }

    public void mostrar(){
        String datos = "";
        if(colaList == null || colaList.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Ingrese datos a la cola", "No hay datos", JOptionPane.ERROR_MESSAGE);
        } else {
            for(int i = 0; i < colaList.size(); i++){
                datos += colaList.get(i) + " "  ;
            }
            JOptionPane.showMessageDialog(null,
                    "Los elementos son: \n" + datos);
        }
    }

    public void estado(){
        if(colaList == null || colaList.isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Por favor elija la opcion 1", "No hay datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"La cola tiene " + colaList.size() + " elementos");
        }
    }
}