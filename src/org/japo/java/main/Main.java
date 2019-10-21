/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
//Constantes        
        final int A_MAX = 500;
        final int A_MIN = 0;
//Variables
        int dia1 = RND.nextInt(A_MAX - A_MIN + 1) + A_MIN;
        int dia2 = RND.nextInt(A_MAX - A_MIN + 1) + A_MIN;
        int dia3 = RND.nextInt(A_MAX - A_MIN + 1) + A_MIN;
        int dia4 = RND.nextInt(A_MAX - A_MIN + 1) + A_MIN;
        int dia5 = RND.nextInt(A_MAX - A_MIN + 1) + A_MIN;
        int dia6 = RND.nextInt(A_MAX - A_MIN + 1) + A_MIN;
        int dia7 = RND.nextInt(A_MAX - A_MIN + 1) + A_MIN;

        int atotal;
        int amedia;

        System.out.println("CINES DEL CENTRO COMERCIAL");
        System.out.printf("=============================%n%n");

        System.out.println("CONTROL DE AFORO SEMANAL");
        System.out.printf("------------------------------%n%n");
        //aforo semana
        System.out.printf("Aforo día 1 ...: %d personas %n", dia1);
        System.out.printf("Aforo día 2 ...: %d personas %n", dia2);
        System.out.printf("Aforo día 3 ...: %d personas %n", dia3);
        System.out.printf("Aforo día 4 ...: %d personas %n", dia4);
        System.out.printf("Aforo día 5 ...: %d personas %n", dia5);
        System.out.printf("Aforo día 6 ...: %d personas %n", dia6);
        System.out.printf("Aforo día 7 ...: %d personas %n", dia7);
        //Aforo total
        atotal = dia1 + dia2 + dia3 + dia4 + dia5 + dia6 + dia7;
        System.out.printf("%nAforo total ...: %d%n", atotal);
        //Aforo de media
        amedia = atotal / 7;
        System.out.printf("%nAforo medio ...:  %d%n", amedia);

    }

}
