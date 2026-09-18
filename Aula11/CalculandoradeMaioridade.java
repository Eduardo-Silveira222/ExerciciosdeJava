/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculandorademaioridade;

import java.util.Scanner;



/**
 *
 * @author Eduardo Silveira
 */
public class CalculandoradeMaioridade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu ano de nascimento:");
        int ano = teclado.nextInt();
        int idade = 2026 - ano;
        
        if(idade>17){
            System.out.println("Voce e maior de idade!");
        } else{
            System.out.println("Voce e menor de idade!");
        }
        System.out.println(idade + " anos");
    }
    
}
