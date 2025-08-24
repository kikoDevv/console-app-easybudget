import java.util.Scanner;
public class Main {
    //-----------functions-----------//
    public static void uiHome( String userName) {
        for (int i = 0; i < 9; i++) {
            System.out.println("                                   :");
        }
        System.out.println("I-------------------[ Welcome to EasyBudget " + userName + " ]---------------------I");
        System.out.println("I                                                                     I");
        System.out.println("I    Add                                      I");
        System.out.println("I-------------------[ 3. Edit Budget ]--------------------------------I");
        System.out.println("I-------------------[ 4. Delete Budget ]------------------------------I");
        System.out.println("I-------------------[ 5. Exit ]---------------------------------------I");
        System.out.println("I---------------------------------------------------------------------I");
    }
    public static void nextPage( int pageNumber) {
        for (int i = 0; i <pageNumber; i++) {
            System.out.println("                                   :");
        }
    }

    public static void marginBottom (int mb ) {
        for (int i = 0; i < mb; i++) {
            System.out.println(" ");
        }
    }


    //-----------Root-----------//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //---User input name---//
        nextPage(10);
        System.out.println("I-----------------------[ Welcome to EasyBudget ]---------------------I");
        System.out.print("Please enter your name here-->");
        String userName = scanner.nextLine();
        nextPage(100);
        System.out.println("I-----------------------[ Welcome to EasyBudget " + userName + " ]---------------------I");
        System.out.print("Please enter your earning");
        marginBottom(20);
        int income = scanner.nextInt();






        scanner.close();
    }
}