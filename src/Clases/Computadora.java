/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author LENOVO LEGION
 */
public class Computadora implements Comparable<Computadora> {

    private String marca;
    private String procesador;
    private int ram;
    private int VRamVideo;

    public Computadora(String marca, String procesador, int ram, int VRamVideo) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.VRamVideo = VRamVideo;
    }

    public Computadora() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVRamVideo() {
        return VRamVideo;
    }

    public void setVRamVideo(int VRamVideo) {
        this.VRamVideo = VRamVideo;
    }

    @Override
    public int compareTo(Computadora o) {
        String a = new String(String.valueOf(this.getRam()) + this.getRam());
        String b = new String(String.valueOf(o.getRam()) + o.getRam());
        return a.compareTo(b);
    }

}
