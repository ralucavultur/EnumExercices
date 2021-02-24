package Exercice1;

import Exercice1.CardSymbol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (CardSymbol symbol : CardSymbol.values()) {
            System.out.println(symbol + ": " + symbol.ordinal());
        }

        System.out.println();

        System.out.println("Please, enter card symbol: ");
        try (Scanner sc = new Scanner(System.in)) {
            CardSymbol symbol = CardSymbol.valueOf(CardSymbol.class, sc.next().toUpperCase());
            System.out.println(symbol);
            switch (symbol) {
                case DIAMOND -> System.out.println("♦");
                case CLUB -> System.out.println("♣");
                case HEART -> System.out.println("♥");
                case SPADE -> System.out.println("♠");
            }
        } catch (Exception exc) {
            System.out.println("There is an error.");
        }


    }
}

