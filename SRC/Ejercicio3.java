import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        char [] convertir;
        String numer;
        
        Scanner numero = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        int num = numero.nextInt();
        numer = String.valueOf(num);       
        convertir = numer.toCharArray();
                    
        int cant = numer.length();
        System.out.println("La cantidad de digitos que ingreso es de: " + cant);
        
        int sum = 0;
        int prod = 1;
        
        for(char i: convertir) {
            int numeroent = Integer.parseInt(String.valueOf(i));
            
            sum += numeroent;  
            prod *= numeroent; 
        }
        
        System.out.println("La suma de sus digitos es: " + sum);
        System.out.println("El producto de sus digitos es: " + prod);
        System.out.println("El digito de la izquierda es: " + convertir[0]);
        System.out.println("El digito de la derecha es:" + convertir[cant-1]);
        
        int mayor = 0;

        for(char x: convertir){
            int number = Integer.parseInt(String.valueOf(x));
            if(number > mayor){
                mayor = number;
            }
        }
        
        int menor = mayor;
        
        for(char z: convertir){
            int number = Integer.parseInt(String.valueOf(z));
            if(number < menor){
                menor = number;
            }
        }
        
        System.out.println("El digito mayor es: " + mayor);
        System.out.println("El digito menor es: " + menor );
        
        System.out.println("su numero invertido es: ");
        for(int i = convertir.length - 1; i >= 0; i--){    
            System.out.println(convertir[i]);
        }
    }
}