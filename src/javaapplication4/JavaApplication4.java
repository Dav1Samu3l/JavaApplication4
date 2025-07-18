/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Usuário
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     *
     *
     *
     * 1 - Fibonacci
     *
     * -- Criar uma função em sua linguagem preferida. A função deve receber um
     * numero N >= 0 (deve validar o input para a função), e retornar o valor
     * correspondente desse número na sequência Fibonacci. EX. fib(0) =0; fib(1)
     * = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.
     *
     * --- Criar uma função recursiva que resolva Fibonacci
     *
     * --- Criar uma função linear que resolva Fibonacci
     *
     * 2 - Números primos
     *
     * -- Criar uma função em sua linguagem preferida. A função deve receber um
     * numero N > 1 (validar o input), e retornar todos os números primos até o
     * número N. EX. p(2) = [2]; p(3) = [2, 3]; p(10) = [2, 3, 5, 7];
     *
     * --- Criar uma função recursiva que resolva p
     *
     * --- Criar uma função linear que resolva p
     *
     *
     *
     */
    public static void main(String[] args) {

        Fibo fib = new Fibo();
        String resultado = fib.fibIterativo(10);
        System.out.println(resultado);

        Fibo fib1 = new Fibo();
        String resultado1 = fib1.fibRecursivo(10);
        System.out.println(resultado1);

         Primo primorec = new Primo();
        System.out.println(primorec.primosRecursivo(20));   
        
        Primo primolin = new Primo();
       System.out.print( primolin.primosLinear(2));
    

    }

}
