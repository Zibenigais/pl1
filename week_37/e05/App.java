public class App {
    public static void main(final String[] args) {
        int number = 10;
        System.out.println("number > 0 : " + (number > 0));
        System.out.println("number < 10 : " + (number < 10));
        System.out.println("number > 0 && number < 10 : " + (number > 0 && number < 10));
        System.out.println("!(number > 0 && number < 10) : " + !(number > 0 && number < 10));
        System.out.println("number > 0 || number < 10 : " + (number > 0 || number < 10));
    }
}

/* Boolean logic answers
 * | -1 |false|true|false|true|true|
 * | 0  |false|true|false|true|true|
 * | 1  |true|true|true|false|true|
 * | 9  |true|true|true|false|true|
 * | 10 |true|false|false|true|true|
 */