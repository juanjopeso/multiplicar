
package ordenadordenumeros;
import java.util.Scanner;


public class Registraduria {

    public static void main(String[] args) {
      var entrada = new Scanner(System.in);
      int num=0;
      
      do{
     System.out.println("Digite el año: ");
     int año = entrada.nextInt();
     int edad = 2024 - año;
     if(edad<0){
     System.out.println("digitaste mal tu fecha de nacimiento");
     }else if(edad<18){            
        System.out.println("Tu edad es: " + edad + " años por ende no puedes votar");
        }else{            
        System.out.println("Tu edad es: " + edad + " años por ende puedes votar");
        }
          System.out.println("desea continuar?");
          System.out.println("1.si");
          System.out.println("2.no");
          byte code= entrada.nextByte();
          if(code==1){
              System.out.println("-------------");
          }else{
              break;
          }
          
      }while (num==0); {            
            
        }
     }
    
}
