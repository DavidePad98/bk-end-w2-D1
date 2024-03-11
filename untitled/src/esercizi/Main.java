package esercizi;

import exceptions.InvlidNumCalculateLitro;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random rndm = new Random();

//        int newPosition;
//
//        System.out.println("Ecco l'array di numeri casuali:");
//        int[] arrayNum = new int[5];
//
//        for (int i = 0; i < arrayNum.length; i++) {
//            arrayNum[i] = rndm.nextInt(1, 10);
//        }
//        System.out.println(Arrays.toString(arrayNum));
//        do {
//            System.out.println("in che posizione deve essere inserito?");
//             newPosition = scn.nextInt();
//
//            if (newPosition < 1 || newPosition >5){
//                System.out.println("posizione non valida");
//                continue;
//            }
//            System.out.println("che numero desideri inserire?");
//            int newNum = scn.nextInt();
//            arrayNum[newPosition - 1 ] = newNum;
//            System.out.println("nuova sequenza:");
//            System.out.println(Arrays.toString(arrayNum));
//            scn.nextLine();
//        } while (newPosition != 0); {
//            System.out.println("arrivedrci");
//        };
//----------------------------------------------------------------------------------------------------
        int km;
        int litro;

        System.out.println("km percorsi:");
        km = scn.nextInt();
        System.out.println("l consumati:");
       try {
           litro = scn.nextInt();
       } catch(ArithmeticException e ) {
           System.err.println("errore");
       }  catch (InputMismatchException e) {
               System.err.println("Non hai inserito un numero!");
               throw new InputMismatchException(e);

        } finally {
           scn.close();
       }

        System.out.println("km/litro: " + km/litro);
    }
}