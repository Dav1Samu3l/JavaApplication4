/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Davi
 */
public class Fibo {

    public String fibIterativo(int n) {
        int a = 0, b = 1, c = 0;
        if (n < 0) {
            return "O número deve ser maior ou igual a 0";
        }
        if (n == 0) {
            return Integer.toString(a);
        } else if (n == 1) {
            return Integer.toString(b);
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return Integer.toString(b);
    }

    public String fibRecursivo(int n) {
        if (n < 0) {
            return "O número deve ser maior ou igual a 0";
        }
        if (n == 0) {
            return Integer.toString(n);
        }
        if (n == 1) {
            return Integer.toString(n);
        }
        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
    }

}
