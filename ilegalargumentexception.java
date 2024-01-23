/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliahpebeo;

/**
 *
 * @author LENOVO
 */
public class ilegalargumentexception {

    public static void main(String[] args) {
        try {
            validateAge(125);  // Ini akan menyebabkan IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Usia harus dalam rentang 0-120");
        }
        // Logika lainnya jika usia valid
        System.out.println("Usia valid: " + age);
    }
}


