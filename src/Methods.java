import java.util.Scanner;

public class Methods {
    
    public static void main(String[] args) {
        m();
    }

    static void m(){
        System.out.println("a or b");
        Scanner scan = new Scanner(System.in);
        String h = scan.nextLine();
        switch (h) {
            case "a": a();
            // System.out.println();
                break;
            case "b": b();
                break;
            default: System.out.println("error");
                break;
        }
    }

    static void a(){
        System.out.println("toy (Type t) or fruit (Type f)");
        Scanner scan = new Scanner(System.in);
        String h = scan.nextLine();
        switch (h) {
            case "t":System.out.println("Airplane");
                break;
            case "f":System.out.println("Apple");
                break;    
            default:System.out.println("somthing went wrong");
                break;
        }
        
    }

    static void b(){
        System.out.println("toy (Type t) or fruit (Type f)");
        Scanner scan = new Scanner(System.in);
        String h = scan.nextLine();
        switch (h) {
            case "t":System.out.println("Ball");
                break;
            case "f":System.out.println("Banana");
                break;    
            default:System.out.println("somthing went wrong");
                break;
        }
       
    }
}