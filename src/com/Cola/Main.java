package com.Cola;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Cola obj = new Cola();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                        + "1. Insertar\n"
                        + "2. Eliminar\n"
                        + "3. Mostrar todos los elementos\n"
                        + "4. Consultar el frente\n"
                        + "5. Estado de la cola\n"
                        + "6. Salir"));

                switch (opcion){
                    case 1:
                        obj.insertar();
                        break;
                    case 2:
                        obj.eliminar();
                        break;
                    case 3:
                        obj.mostrar();
                        break;
                    case 4:
                        obj.primerElemento();
                        break;
                    case 5:
                        obj.estado();
                        break;
                    case 6:
                        opcion = 6;
                        break;
                    default: JOptionPane.showMessageDialog(null,
                            "Intente con una opcion correcta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "Ingrese una opcion correcta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(opcion != 6);
    }
}
