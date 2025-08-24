import java.util.Scanner;

public class Main {
    //-----------functions-----------//
    public static void uiHome() {
        for (int i = 0; i < 9; i++) {
            System.out.println("                                   :");
        }
        System.out.println("I-----------------------[ Welcome to EasyBudget ]---------------------I");
        for (int i = 0; i < 21; i++) {
            System.out.println("|                                                                     |");
        }
        System.out.println("I---------------------------------------------------------------------I");
        for (int i = 0; i < 10; i++) {
            System.out.println("                                   :");
        }
    }


    public static void main(String[] args) {
        uiHome();
    }
}