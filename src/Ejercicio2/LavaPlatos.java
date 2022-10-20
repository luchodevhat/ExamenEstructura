package Ejercicio2;

import java.awt.Color;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;




class Interfaz {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Mi Ventana"); // crea una instancia de la clase frame
        frame.setBackground(new Color(0, 64, 128));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // se da indicaciones sobre la reacción al cerrar la ventana       
        frame.setSize(600, 600); //con este método se le dan las dimensiones a la ventana 
        JButton button = new JButton("Pulsa aquí"); //Se crea un botón con texto
        button.setFont(new Font("Arial", Font.PLAIN, 11));
        button.setBounds(20, 30, 30, 30); //se da ubicación al botón creado
        button.setForeground(Color.BLUE); //da color al texto del boton
        button.setBackground(Color.white); //cambia de color el fondo
        frame.getContentPane().add(button, BorderLayout.NORTH); //muestra el botón en la ventana
        frame.setVisible(true); //necesario para que la ventana sea visible
    }
}











//
//public class LavaPlatos {
//
//    public void menuPrincipal() {
//        int respuesta;
//        int platos;
//        int cubiertos;
//        Pila miPila = new Pila();
//
//        JOptionPane.showMessageDialog(null, "     ------------------------------------\n"
//                + "        >>>> Bienvenido <<<<\n "
//                + "      Cinta de platos usados   \n"
//                + "     ------------------------------------");
//
//        while (true) {
//            respuesta = Integer.parseInt(JOptionPane.
//                    showInputDialog("(1)- ¿DESEA RETIRAR LOS TRASTOS? \n"
//                            + "(2)-                SALIR DE SISTEMA"));
//            if (respuesta == 1) {
//                respuesta = Integer.parseInt(JOptionPane.
//                        showInputDialog("(1)- ¿INGRESAR PLATOS?\n"
//                                + "(2)- ATRAS"));
//
//                if (respuesta == 1) {
//                    platos = Integer.parseInt(JOptionPane.
//                            showInputDialog("Cuantos platos deseas ingresar:"));
//                    cubiertos = Integer.parseInt(JOptionPane.
//                            showInputDialog("Cuantos cubiertos deseas ingresar:"));
//
//                    Trastos platos1 = new Trastos(platos, cubiertos);
//                    System.out.println("");
//                    System.out.println("PLATOS ACOMODADOS");
//                    miPila.push(platos1);
//                    System.out.println("");
//                }
//                miPila.listar();
//
//            } else if (respuesta == 2) {
//                JOptionPane.showMessageDialog(null, "SALIENDO.....");
//                break;
//            }
//        }
//    }
//}
