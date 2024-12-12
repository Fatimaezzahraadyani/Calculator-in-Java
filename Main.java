import java.util.InputMismatchException;
import java.util.*;
import java.lang.Math;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, b;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        String choix ;


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        while (s != 8) {
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
            choix = sc.next();
              try {
                 s =Integer.parseInt(choix);
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
                          div(saisir(), saisir());
                          break;
                      case 5:
                          System.out.println("entrer les deux nombre :");
                          puiss(saisir(), saisir());
                          break;
                      case 6:
                          System.out.println("entrer un nombre a : \n");
                          racine(saisir());
                          break;
                      case 7:
                          System.out.println("entrer un nombra a : \n");
                          fact(saisir());
                          break;
                      case 8:
                          return;
                      default:
                          System.out.println("entrer un choix valide");
                          break;
                  }
              }
              catch (Exception e){
                  System.out.println(e.getMessage());
                          //"entrer un nombre ");

              }
        }
    }

    public static double saisir() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void addition(double a, double b) {
        System.out.println("l'addition de a et b : " +(a + b)+ "\n");
    }

    public static void mult(double a, double b) {
        System.out.println("la Multiplication de a et b : " +(a * b)+ "\n");
    }

    public static void soustraction(double a, double b) {
        System.out.println("la Soustraction de a et b : " +(a - b)+ "\n");
    }

    public static void div(double a, double b) {
        while (b==0||a==0){
         System.out.println("Enter un nombre valide !!");
          a =saisir();
          b =saisir();
        }
        System.out.println("la Divition de a et b : " +(a/b)+ "\n");
        }
    public static void puiss(double a, double b) {
        System.out.println("la puissance de a et b : " +(Math.pow(a, b))+ "\n");
        //a = base
        //b = puiss
    }

    public static void racine(double a) {
        while (a<=0){
            System.out.println("entrer un nombre positive");
            a=saisir();
        }
        System.out.println("la Racine carée de a : " +(Math.sqrt(a))+ "\n");
    }
        public static void fact ( double a){
            while (a<=0){
                System.out.println("entrer un nombre positive");
                a=saisir();
            }
            for(double i =a-1;i>=1;i--){
                a = a * i;
            }
            System.out.println("le nombre factorisé est : "+ a);
        }
}
