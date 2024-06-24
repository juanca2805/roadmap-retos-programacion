public class juanca2805 {

/* Cadenas de caracteres */
/*
 * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación...
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos
 * - Anagramas
 * - Isogramas
 */
    public static void main(String[] args) {
    Concatenacion();
    equals();
    equalsIgnoreCase();
}

 public static void Concatenacion(){
    String Cadena1="Hola";
    String Cadena2="JAVA";
    //Concatenacion
        System.out.println(Cadena1+ " , "+ Cadena2);
    //Indexación 
       System.out.println(Cadena1.charAt(0));
    //Longitud
    System.out.println(Cadena1.length());
    //Slicing
    System.out.println(Cadena1.;

 }
 public static void equals(){

    //Equals sirve para verificar si la cadena de texto es igual 
    String cadena1="juan";
    String cadena2="Juan";
        if (cadena1.equals(cadena2))
        {
        System.out.println("son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
}
public static void equalsIgnoreCase(){

    //EqualsIGNORE sirve para verificar si la cadena de texto es igual sin importar 
    //que los caracteres esten en mayusculas
    String cadena1="juan";
    String cadena2="Juan";
        if (cadena1.equalsIgnoreCase(cadena2))
        {
        System.out.println("son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
}
 }

