
package ordenadordenumeros;
import java.util.Scanner;


public class Tabla {

    public static void main(String[] args) {
         Scanner num = new Scanner (System.in);
         System.out.println("ingrese el numero base");
         int base= num.nextInt();
         System.out.println("ingrese hasta cual numero se multiplicara");
         int mul=num.nextInt();
         for (int i=0;i<=mul;i++){
         int res = base * i;
         System.out.println(base+"*"+i+"="+res);
         
         }
    }
}
