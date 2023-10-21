package lab2p2_mario_ocampo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2P2_mario_ocampo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<jugadores> jd = new ArrayList();
        ArrayList<Carro> cr = new ArrayList();

        int opcion = 0;

        while (opcion != 2) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("---Laboratorio 2---\n"
                    + "1.Entrar al menu\n"
                    + "2.Salir  "));

            if (opcion == 1) {
                Scanner sc = new Scanner(System.in);
                int op = 0;

                while (op != 6) {
                    op = Integer.parseInt(JOptionPane.showInputDialog("1.Crear jugador\n"
                            + "2.Modificar jugador\n"
                            + "3.Listar jugadores\n"
                            + "4.Eliminar jugadores\n"
                            + "5.Carros\n"
                            + "6.salir "));

                    if (op == 1) {
                        int dinero = 10000;
                        int PuntosReputacion = 0;
                        String nombre = (JOptionPane.showInputDialog("Ingrese el nombre del jugador: "));
                        jugadores obj = new jugadores(nombre, PuntosReputacion, dinero);
                        jd.add(obj);
                    }

                    if (op == 2) {
                        String busq = JOptionPane.showInputDialog("Ingrese el nombre del jugador que desea modificar");
                        for (jugadores ju : jd) {
                            if (ju.getNombre().equals(busq)) {
                                int mod = Integer.parseInt(JOptionPane.showInputDialog("Que elemento desea modificar?\n"
                                        + "1. Nombre\n"
                                        + "2. Puntos de reputacion\n"
                                        + "3. dinero"));
                                if (mod == 1) {
                                    String Nuevonombre = JOptionPane.showInputDialog("Ingrese nuevo nombre");
                                    ju.setNombre(Nuevonombre);
                                    System.out.println("--------Nuevo nombre-------");
                                    System.out.println(jd);
                                }

                                if (mod == 2) {
                                    

                                }

                                if (mod == 3) {
                                    
                                }
                            }

                        }
                    }

                    if (op == 3) {
                        System.out.println(jd);

                    }

                    if (op == 4) {
                        String us = JOptionPane.showInputDialog("Ingrese el nombre del usuario que desea eliminar");
                        for (jugadores r : jd) {
                            if (r.getNombre().equals(us)) {
                                jd.remove(r);
                            }
                            System.out.println(jd);
                        }
                    }
                    
                    if (op == 5) {
                        int desicion = 0;

                        while (desicion != 5) {

                            desicion = Integer.parseInt(JOptionPane.showInputDialog("1.Crear carro\n"
                                    + "2.Modificar carro\n"
                                    + "3.Listar carros\n"
                                    + "4.Eliminar carros\n"
                                    + "5.salir "));

                            if (desicion == 1) {
                                String marca = JOptionPane.showInputDialog("Ingrese la marca del carro");
                                String modelo = JOptionPane.showInputDialog("Ingrese el modelo del carro");
                                String color = JOptionPane.showInputDialog("Ingrese el color del carro");
                                int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del carro"));

                                Carro obj = new Carro(marca, modelo, color, precio);
                                cr.add(obj);
                            }

                            if (desicion == 2) {
                                String llamarUsu = JOptionPane.showInputDialog("Ingrese nombre del usuario");
                                for (jugadores encontrar : jd) {
                                    if (encontrar.getNombre().equals(llamarUsu)) {
                                        String bus = JOptionPane.showInputDialog("Ingrese el nombre del carro de desea modificar");
                                        for (Carro car : cr) {
                                            if (car.getMarca().equals(bus)) {
                                                int desi = Integer.parseInt(JOptionPane.showInputDialog("Que elemento desea modificar\n"
                                                        + "1. Spoiler - 3500\n"
                                                        + "2. Side Skirts - 1800\n"
                                                        + "3. Front Bumper - 2000\n"
                                                        + "4. Back Bumper - 1500\n"
                                                        + "5. super Borlds - 8800"));

                                                if (desi == 1) {
                                                    
                                                }
                                            }
                                        }

                                    }else{
                                        System.out.println("Este usuario no existe");
                                    }
                                }
                            }

                            if (desicion == 3) {
                                System.out.println(cr);
                            }

                            if (desicion == 4) {
                                String accion = JOptionPane.showInputDialog("Ingrese la marca del carro que desea eliminar");
                                for (Carro c : cr) {
                                    if (c.getMarca().equals(accion)) {
                                        cr.remove(c);
                                    }
                                    System.out.println(cr);
                                }
                            }
                        }
                        
                    }

                }
            }
        }
    }
}

