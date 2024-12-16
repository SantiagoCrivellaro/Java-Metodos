import java.util.Arrays;

public class EjemploSystemYArrays {
    
    public static void main(String[] args) {
        
        System.out.println("Este es un mensaje desde System.out.PrintLn");

        long tiempoActual = System.currentTimeMillis();
        System.out.println("tiempo actual" + tiempoActual);



        System.out.println("Solicitando Garbage Collector ");
        System.gc();
        System.out.println("Garbage Collector Solicitado");

        // Arrays.sort(int[] array)

        int[] numero = {5,3,8,1,2};

        System.out.println("Array Original" + Arrays.toString(numero));
        Arrays.sort(numero); // Ordena el array de menor a mayor
        System.out.println("Array Ordenado :" + Arrays.toString(numero));

        // Arrays.toString(int [] array) 
        System.out.println("Representacion en texto del array" + Arrays.toString(numero));


        // Arrays.copyOf (array, newLength)

        int[] copiaArray = Arrays.copyOf(numero, 7); //  Crea una copia con longitud 7 (rellena con ceros)
        System.out.println("Copia del array con longitud 7 :" + copiaArray);

    }
}
