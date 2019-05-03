/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Random;

/**
 *
 * @juan aguilera
 */
public class Datos {
    private int caraDado;
    public Datos(){
        
    }
    public Datos(int caraDado) {
        this.caraDado = caraDado;
    }

    public int getCaraDado() {
        return caraDado;
    }

    public void setCaraDado(int caraDado) {
        this.caraDado = caraDado;
    }
    public int generarDado(){
        Random ruleta=new Random();
        caraDado=ruleta.nextInt(6)+1;
        return caraDado;
    }
}

