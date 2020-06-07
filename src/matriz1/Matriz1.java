
/*
  En una matriz bidimensional de tamaño 6 se desea clacular la suma de los números
 del triángulo superior. y la suma de los números del triangulo inferior. Los números de la 
matriz deben ser suministrados por el teclado
 */
package matriz1;

import java.util.Scanner;
/**
 *
 * @author gpacheco
 */
public class Matriz1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Variables y Matris
        int[][] matriz = new int[6][6];// DEFINIR MATRIZ DE 6
        double tSuperior =0 ;
        double tInferior=0; 
        
        //Llenar la Matiz
        System.out.println("**Llenar la matiz***");
        for (int k = 0; k < matriz.length; k++){
            for (int l = 0; l <  matriz.length; l++){
                System.out.print("Ingrese el valor para la posición ("+ k+" "+ l +"): ");
                matriz[k][l] = leer.nextInt();// Leemos los datos 
            }
        }
        
        //Calcular tiango superior  e inferior 
        for (int i = 0; i <  matriz.length; i++ ){
            for (int j = 0; j < matriz.length; j++ ){
                if (i != j ){ // Si el elemto No está en la diagonal Principla 
                    if (j > i ){//Elemto está en triangulo superior
                        tSuperior += matriz[i][j];
                    }
                    if (i > j ){//Elemto está en triangulo Inferior  
                        tInferior += matriz[i][j]; 
                    }
                   
                }
            }
        }
        
         //imprimir triangulo superior 
         System.out.println("MATRIZ");
         for (int i = 0; i <  matriz.length; i++ ){
            for (int j = 0; j < matriz.length; j++ ){                  
                System.out.print( matriz[i][j]+ "  " );
                                                        
            }
             System.out.println("\n");                
        }
                
        //imprimir triangulo superior 
         System.out.println("La suma del triangulo superio es: " +  tSuperior);
         for (int i = 0; i <  matriz.length; i++ ){
            for (int j = 0; j < matriz.length; j++ ){
     
                    if (j > i ){//Elemto está en triangulo superior
                        System.out.print( matriz[i][j]+ "  " );
                    }else{
                         System.out.print(  "   ");
                    }                                 
            }
             System.out.println("\n");                
        }
         
         //imprimir triangulo inferior 
         System.out.println("La suma del triangulo Inferior es: " +  tInferior);
         
         for (int i = 0; i <  matriz.length; i++ ){
            for (int j = 0; j <  matriz.length; j++ ){
                      
                    if (i > j ){//Elemto está en triangulo Inferior  
                         System.out.print(matriz[i][j]+ "  ");
                        
                    }else{
                          System.out.print( "    ");
                    }               
            }
             System.out.println("\n");                
        }       
        //Imprimer resultado 
        System.out.println("La suma del triangulo superio es: " +  tSuperior);
        System.out.println("La suma del triangulo Inferior es: " +  tInferior);
    }  
   
}
