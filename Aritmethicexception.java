/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliahpebeo;

/**
 *
 * @author LENOVO
 */
public class Aritmethicexception {

    public static void main(String[] args) {
        try {
            int result = divideByZero();  // Ini akan menyebabkan ArithmeticException
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi ArithmeticException: " + e.getMessage());
        }
    }

    public static int divideByZero() {
        return 35 / 0;  // Ini akan menyebabkan ArithmeticException
    }
}

    

