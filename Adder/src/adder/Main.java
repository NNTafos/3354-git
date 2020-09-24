package adder;

class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide atleast two argument");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        for(int i=0;i<args.length;i++)
            sum += Integer.valueOf(args[i]);
        return sum;
    }
}
