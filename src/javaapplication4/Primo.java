/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Usuário
 */
import java.util.ArrayList;
import java.util.List;

public class Primo {

    public List<Integer> primosRecursivo(int N) {
        if (N <= 1) {
            throw new IllegalArgumentException("N deve ser maior que 1");
        }
        return primosRecAux(2, N, new ArrayList<>());
    }

    private List<Integer> primosRecAux(int atual, int N, List<Integer> primos) {
        if (atual > N) {
            return primos;
        }
        if (ehPrimo(atual, 2)) {
            primos.add(atual);
        }
        return primosRecAux(atual + 1, N, primos);
    }

    // Função recursiva para verificar se um número é primo
    private boolean ehPrimo(int num, int divisor) {
        if (num < 2) return false;
        if (divisor * divisor > num) return true;  // nenhum divisor encontrado
        if (num % divisor == 0) return false;
        return ehPrimo(num, divisor + 1);
    }

   
    
    
 

    public List<Integer> primosLinear(int N) {
        if (N <= 1) {
            throw new IllegalArgumentException("N deve ser maior que 1");
        }
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (ehPrimoLinear(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    private boolean ehPrimoLinear(int num) {
        if (num < 2) return false;
        for (int divisor = 2; divisor * divisor <= num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

  


}

