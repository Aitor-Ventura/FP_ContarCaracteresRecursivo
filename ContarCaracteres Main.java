import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.dates
     * @param input - ristra de búsqueda
     * @param expected - resultado esperado
     */
    static void test(String input, char pattern, int expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: mes(\"" + input + "\" + '" + pattern + "')");
    	
        // Llamada al método a probar
        int result = StringUtils.count(input, pattern);
        
        // Comprobación de los resultados
        if (result != expected) {
            System.out.print(">> Resultado erróneo, deberia ser: " + expected + "");
            System.out.println(" y es: " + result + "");
        } else {
            System.out.println(">> Resultado correcto: " + result + "");
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.dates
     * @param args
     */
    public static void main(String[] args) {
        test("esto es una prueba", 'e', 3);
    }

}
