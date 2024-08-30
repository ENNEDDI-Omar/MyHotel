import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //créer des chambres :
             Chambre ch1 = new Chambre(1, 404, "simple", "300.DH");
             Chambre ch2 = new Chambre(2, 200, "suite", "1000.DH");
             Chambre ch3 = new Chambre(3, 101, "double", "500.DH");
             Chambre ch4 = new Chambre(4, 111, "vip", "800.DH");

         //création des clients:
             Client c1 = new Client(1, "omar", "06456789");
             Client c2 = new Client(2, "kamal", "064898989");
             Client c3 = new Client(3, "test", "064898989");
             Client c4 = new Client(4, "allo", "064898989");

        //création des réservation

        //création du Menu:
        Scanner sc = new Scanner(System.in);
        boolean quitter = false;

        while (!quitter)
        {
          //mise en place des Options:
            System.out.println("\nMenu : ");
            System.out.println("1 - Informations :");
            System.out.println("2 - Réservations :");
            System.out.println("3 - Quitter!");

            System.out.println("Veuillez choisir une option:");
            int optionsMenuPrincipale = sc.nextInt();

            //application des options:
            switch (optionsMenuPrincipale)
            {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    quitter = true;
                    break;
                default:
                    System.out.println("Choix d'option Invalide, Veuillez réessayer.");



            }
        }

    }
}