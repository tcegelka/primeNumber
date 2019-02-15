public class Main {
    public static void main(String[] args) {
        Prime prime = new Prime();

        try {
            System.out.println(prime.generate(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {
            System.out.println("Please provide two integers");
        }
    }
}
