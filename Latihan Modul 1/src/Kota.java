/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PETIRSON
 */
public class Kota <E> {
    private E element;
    
    public Kota(E kota){
        element = kota;
    }
    
    public E getElement(){
        return element;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kota<Integer> jumlahKota = new Kota<Integer>(9);
       Kota<String> namaKota = new Kota<String>("Malang");
       System.out.println("Jumlah Kota di Jawa Timur : "+ jumlahKota.getElement()+ " kota");
       System.out.println("salah satu kota di jawa timur : kota "+ namaKota.getElement());
    }
    
}
