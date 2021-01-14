/// dame el numero de vocales que empiezan una palabra que hay en un array


package com.ironhack.main.classes;

import java.util.Scanner;

class Vocales {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String entrada = scanner.nextLine();

            String[] array = entrada.split(" ");

            int count = 0;

            for (int i = 0; i < array.length; i++) {

                String minusculas = array[i].toLowerCase();
                char primeraletra = minusculas.charAt(0);

                if (primeraletra == 'a') {

                    count++;

                }
                if (primeraletra == 'e') {

                    count++;

                }
                if (primeraletra == 'i') {

                    count++;

                }
                if (primeraletra == 'o') {

                    count++;

                }
                if (primeraletra == 'u') {

                    count++;

                }
            }

            System.out.println(count);
        }
}
