/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaçãostring;

/**
 *
 * @author Eduardo Silveira
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        String n1 = "Eduardo";
        String n2 = "Eduardo";
        String n3 = new String("Eduardo");
        String res = n1.equals (n3) ? "igual":"diferente";
        System.out.println(res);
    }
    
}
