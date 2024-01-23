/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliahpebeo;

/**
 *
 * @author LENOVO
 */
public class Nullpointerexception {

    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();  // Ini akan menyebabkan NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
        }
    }
}

    

