package ordenadordenumeros;
import java.util.Scanner;


public class OrdenadorDeNumeros {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
         System.out.println("ingrese cuantos numeros desea testear");
         int numeros= num.nextInt();
         int [] base= new int [numeros] ;
         int mayor = 0;
         int igual = 0;
         int menor = 0;
         for(int i=1; i<=numeros;i++){
             System.out.println("ingesa tus numeros: ");
             int res = num.nextInt();
             if(res==0){
            igual++;
            }else if (res<0){
            menor++;
            }else if (res>0){
            mayor++;
            }
         }
         System.out.println("el numero total de positivos es de: "+mayor);
         System.out.println("el numero total de negativos es de: "+menor);
         System.out.println("el numero total de coros es de: "+igual);
         }
          
    }
