import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString()+" i am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" i am getMessage()";
    }
}
public class HandlingException {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
