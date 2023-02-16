
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner participantes = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de participantes: ");
        int parti = participantes.nextInt();
        int arreglo[] = new int[parti];
        
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Tiempo del participante " + (i+1) + ":");
            arreglo[i] = participantes.nextInt();
        }
        int menor;
        int mayor;
        
        mayor = arreglo [0];
        menor = arreglo [0];
        
            for(int i = 0; i < arreglo.length; i++){
                if (arreglo [i] > mayor){
                    mayor = arreglo[i];
                }
                if (arreglo[i] < menor){
                    menor = arreglo[i];
                }
        }
        System.out.println("El numero de participantes que participaron en la carrera es: " + parti);
        System.out.println("El tiempo que le tomo a el competidor para quedar en primer lugar es:" + menor);
        System.out.println("El tiempo que le tomo a el competidor para quedar en ultimo lugar es:" + mayor);
    }
    
}
