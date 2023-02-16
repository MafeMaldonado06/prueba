import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner palabra = new Scanner(System.in);
        String palab;

        char [] palindromo;
        int izqui, derec;

        System.out.println("Ingrese la palabra: ");
        palab = palabra.nextLine();
        palab = palab.replace(" ","");
        palindromo = palab.toCharArray();

        izqui = 0;
        derec = palindromo.length - 1;

        while (izqui < derec){
            if(palindromo[izqui] == palindromo[derec]){
                derec--;
                izqui++;
            }
            else{
                System.out.println("La palabra no es un palindromo");
                break;
            }
        }

        if (izqui == derec){
            System.out.println("La palabra es un palindromo");
        }
    }
}
