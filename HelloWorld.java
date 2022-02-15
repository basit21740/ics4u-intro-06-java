/**
 * The HelloWorld program implements an application that
 * simply displays "Hello World!" to the standard output.
 *
 * @author  Abdul Basit Butt
 * @version 1.0
 * @since   2022-02-15
 */
final class HelloWorld {
    private HelloWorld() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
  * This method prints out "Hello, World!".
  *
  * @param args none will be used
  */

    public static void main(final String[] args) {
        System.out.println("Hello, World!");
        System.out.println("\nDone.");
    }
}
