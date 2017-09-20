public class MethodsClass {
    public static boolean containsOne (int n) throws BadInputException {
        if (n < 0) {
            throw new BadInputException();
        }

        String numString = "" + n; //Convert the number to a string
        return numString.contains("1"); //Check to see if it contains 1
    }
}