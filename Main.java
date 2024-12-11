import java.util.Scanner;
import java.lang.Math;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        while (true) {
            System.out.println("\n ----Menu Principale---- \n"
                    + "\n (1).l'addition "
                    + "\n (2).la Multiplication"
                    + "\n (3).la Soustraction"
                    + "\n (4).la Divition"
                    + "\n (5).la Puissance"
                    + "\n (6).la Racine carrée"
                    + "\n (7).le Factorielle"
                    + "\n (8).Quitter \n");
            System.out.println("Vous pouvez choisir parmis les operations precedentes : \n");
            int s = sc.nextInt();

            switch (s) {
                case 1:
                    System.out.println("entrer les deux nombre :");
                    addition(saisir(),saisir());
                    break;
                case 2:
                    System.out.println("entrer les deux nombre :");
                    mult(saisir(), saisir());
                    break;
                case 3:
                    System.out.println("entrer les deux nombre :");
                    soustraction(saisir(), saisir());
                    break;
                case 4:
                    System.out.println("entrer les deux nombre :");
                    div(saisir(),saisir());
                    break;
                case 5:
                    System.out.println("entrer les deux nombre :");
                    puiss(saisir(),saisir());
                    break;
                case 6:
                    System.out.println("enter un nombre a : \n");
                    racine(saisir());
                    break;
                case 7:
                    System.out.println("le factorielle de a et b : \n");
                    break;
                case 8:
                    return;
                default:
                    System.out.println("entrer un choix valide");
                    break;
            }
        }
    }

    public static double saisir() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void addition(double a, double b) {
        System.out.println("l'addition de a et b : \n");
        System.out.println(+(a + b));
    }

    public static void mult(double a, double b) {
        System.out.println("la Multiplication de a et b : \n");
        System.out.println(+(a * b));
    }

    public static void soustraction(double a, double b) {
        System.out.println("la Soustraction de a et b : \n");
        System.out.println(+(a - b));
    }

    public static void div(double a, double b) {
        System.out.println("la Divition de a et b : \n");
        if (b != 0)
            System.out.println(+(a / b));
        else {
            System.out.println("entre un nombre sup à 0 ");
        }
    }
   public static void puiss(double a,double b){
       System.out.println("la puissance de a et b : \n");
       //a = base
        //b = puiss
        System.out.println(+(Math.pow(a,b)));
    }
   public static void racine(double a){
       System.out.println("la Racine carée de a : \n");
       System.out.println(+(Math.sqrt(a)));
    }
   public static void fact(double a) {
        System.out.println("le nombre factorisé est : \n");
        
   }
}

