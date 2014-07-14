/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usd.edu.btl.cli;

import java.util.Scanner;

/**
 *
 * @author Tyler_000
 */
public class InteractiveMode {

    public static void userPrompts() {
        System.out.println("Starting Interactive Mode");
        Scanner promptSc = new Scanner(System.in);
        System.out.println("What format are you converting from?");
        System.out.println("1 - iPlant");
        System.out.println("2 - BETS");
        System.out.println("3 - Galaxy");
        System.out.println("4 - Bio Link Directory");
        System.out.println("5 - Seq");
        System.out.println("6 - Bio Extract Server");
        String inputSelect = promptSc.next();
        System.out.println(inputSelect);
        switch (inputSelect) {
            case "1":
                System.out.println("You HAVE an Iplant File.");
                break;
            case "2":
                System.out.println("You HAVE a BETS file.");
                break;
            case "3":
                
            default:
                System.out.println("INVALID INPUT FORMAT");
        }
    }
}
