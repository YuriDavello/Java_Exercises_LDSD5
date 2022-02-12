package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    //1
    public static void printHelloAndName() {

        String original = "Hello World Java";

        original += "\nYuri Davello";

        System.out.println( original + "\n" );
    }

    //2
    public static String anosDias( int minutos ){

        int minutosDia = 24*60;

        int dias = (int)minutos/minutosDia;

        if( dias > 365 && ( dias%365 ) != 0 )  {

            int anos = (int)dias/365;

            float resto = dias%365;

            dias = (int)resto;

            String data = String.valueOf( anos ) +" ano(s)" + " e " + String.valueOf(dias) + "dia(s)";

            return data;

        } else if( dias%365 == 0){

            int anos = dias/365;

            String data = String.valueOf( anos ) + " anos";

            return data;
        }
            String data = String.valueOf( dias ) + " dia(s)";

            return "menos de um dia";
        }



    //3
    public static void printNumbers( int num ) {

        if( num / 10 > 0 ) {

            printNumbers( num / 10 );

        }

        System.out.printf( "%d ", num % 10 );

    }

    //4
    public static void printIntToString( int number ){

        String Snumber = String.valueOf( number );

        System.out.println( Snumber + "\n");

    }

    //5
    public static void printCommonElements( int[] arr1, int[] arr2 ) {

        int i = 0;

        for ( int j = 0; j < arr2.length; j++ ) {

            if ( arr1[i] == (arr2[j]) ) {

                System.out.println( "Common element : " + ( arr1[i] ) );

            }

            i++;

        }
    }

    //6
    public static Boolean isPasswordValid( String password ) {

        int digitCounter = 0;

        if (password.length() < 10) return false;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))) digitCounter++;

            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) return false;

        }

        if (digitCounter < 2) return false;

        return true;

    }

    //7
    public static void printDate(){

        Date date = new Date();

        System.out.println( "\n" + date + "\n" );
    }

    //8
    public static void sortArray( int[] array ) {

        array = new int[]{ 351, 333, 343, 478, 121, 8554, 981, 3, 21, 11 };

        for ( int i : array ) {

            System.out.print( i + " " );

        }

        Arrays.sort( array );

        System.out.println( "\nOrdenado: " );

        for ( int i : array ) {

            System.out.print( i + " " );

        }

        System.out.println( "\n" );

    }

    //9
    public static void printArrayList( ArrayList<String> agenda ) {

        int n = agenda.size();

        for ( int i = 0; i < n; i++ ) {

            System.out.printf( "Posição %d- %s\n", i, agenda.get(i) );

        }

    }

    public static void main( String[] args ) {
        //1
        printHelloAndName();

        //2
        String data = anosDias(2 * 535650);
        System.out.println(data + "\n");

        //3
        Scanner s_number = new Scanner(System.in);
        System.out.println("Type an Integer:");
        int number = s_number.nextInt();
        printNumbers( number );

        //4
        Scanner s_number2 = new Scanner(System.in);
        System.out.println("\n\nType another Integer:");
        int number2 = s_number2.nextInt();
        printIntToString(number2);

        //5
        int[] array1 = { 5, 9, 12, 3, 4, 121, 432, 211, 232 };
        int[] array2 = { 6, 7, 9, 12, 15, 120, 54, 32, 144 };
        printCommonElements( array1, array2 );

        //6
        Scanner s_senha = new Scanner(System.in);
        System.out.println("Type a password:");
        String senha =  s_senha.nextLine();
        if(isPasswordValid(senha)){
            System.out.println("Senha Válida");
        } else {
            System.out.println("Senha Inválida");
        }

        //7
        printDate();

        //8
        int[] intArray = new int[]{ 351,333,343,478,121,8554,981,3,21,11 };
        sortArray( intArray );

        //9
        ArrayList<String> agenda = new ArrayList();

        agenda.add("Yuri Davello; 11 1111-1111");
        agenda.add("Neymar Jr; 22 2222-2222");
        agenda.add("Justin Bieber; 33 3333-3333");
        agenda.add("Cristiano Ronaldo; 44 4444-4444");

        printArrayList( agenda );

        }
    }










