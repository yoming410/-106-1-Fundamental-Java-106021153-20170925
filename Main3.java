import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        String  a = scn.nextLine();
        char x = scn.next().charAt(0);
        char v = scn.next().charAt(0);
        System.out.println(a.replace(x , v));
    }
}