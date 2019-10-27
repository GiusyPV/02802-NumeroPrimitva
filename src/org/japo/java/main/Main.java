/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        
        final int NUM_MIN = 1;
        final int NUM_MAX = 49;

        int numPrimi;

        try {
            

            System.out.print("Número Primitiva ..: ");
            numPrimi = SCN.nextInt();

            boolean testOK = numPrimi >= NUM_MIN && numPrimi <= NUM_MAX;
            
            System.out.println(testOK ? "Número SI correcto" :"Número NO correcto");
        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        }

    }

}

