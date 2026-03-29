public class TryCatch {
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);

        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("could not divide by zero");
            System.out.println(e);
        }

    }
}
