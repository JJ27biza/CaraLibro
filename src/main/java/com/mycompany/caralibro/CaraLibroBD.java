/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

import java.util.ArrayList;

/**
 *
 * @author a22davidil
 */
public final class CaraLibroBD {

    
    //Clase Perfil cambiar CaraLibroBD por perfil
    private static ArrayList<CaraLibroBD> Colletion = new ArrayList<CaraLibroBD>();

    public static CaraLibroBD obterPerfil(String nome, String contrasinal) {

        for (int a = 0; a < Colletion.size(); a++) {

            if (Colletion.contains(nome) && Colletion.contains(contrasinal)) {

                return Colletion.get(a);
            }

        }
        return null;
    }

    public CaraLibroBD buscarPerfil(String nome) {

        Colletion.contains(nome);
        return null;
    }

    public static void engadirPerfil(CaraLibroBD novoPerfil) {

        Colletion.add(novoPerfil);
         
    }

}
