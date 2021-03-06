public class EjThrow {
    public static void main(String[] args) throws Exception {
        /***
         * Ejemplo de try/catch/throw checked y unchecked exceptions mediante operaciones matematicas.
         */
        //Se crea un simple arreglo de enteros.
        int[] nums = new int[] { 12, 5, 3, 0 };
        //Try: intenta hacer la division de los dos numeros llamados con un metodo intDivide()
        try {
            int result = intDivide( 18, nums[3] );
            System.out.println( "La respuesta es " + result );
            //Ejemplos de exception checked.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "Este indice esta afuera de rango." );
        } catch (java.lang.ArithmeticException e) {
            System.out.println( "No se puede dividir entre cero." );
            //Throw unchecked
            throw(e);
            // Ejemplo de Exception Unchecked.
        } catch (Exception e) {
            System.out.println(e);
            //Se agrega un Throw personalizado
            throw new Exception("Error muy muy malo");
        }
    }
    /***
     * Metodo de division de dos enteros.
     * @param n1 Dividendo tipo int
     * @param n2 Divisor tipo int
     * @return Division de dos int
     */
    static int intDivide( int n1, int n2 ) {
        return (n1 / n2);
    }
}

