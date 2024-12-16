public class EjemploString {
    public static void main(String[] args) {
        
        String texto = "Hola mundo";

        // Length()
        int longitud = texto.length();
        System.out.println("Length :" + longitud);

        //charAt()

        char character = texto.charAt(2); // Obtiene el caracter en la posicion  2
        System.out.println("charAr(2) :" + character);

        //subString() Extrae desde la posicion 2 hasta la 5 ( no incluye la 6)

        String subcadena = texto.substring(2, 6);
        System.out.println("Substring(2,6) :" + subcadena);

        //toUpperCase() y toLowerCase()
        String mayusculas = texto.toUpperCase();
        String minusculas = texto.toLowerCase();

        System.out.println("toUpperCase : " + mayusculas);
        System.out.println("toLowerCase :" + minusculas);

        //trim() Elimina los espacios en blanco de los extremos
        String sinEspacios = texto.trim();

        System.out.println("trim: " + sinEspacios);

        //replace() Remplaza "Hola" con "Chau"

        String reemplazado = texto.replace("Hola", "Chau");

        System.out.println("replace ('hola', 'chau')" + reemplazado);

        // split() Divide la cadena por espacios
        String[] partes = texto.split("");
        System.out.println("split :" + java.util.Arrays.toString(partes));


        // contains()

        boolean contiene = texto.contains("a"); // Verifica si el texto contiene 'a'
        System.out.println("Cotiene 'a'?" + contiene);
    }
}
