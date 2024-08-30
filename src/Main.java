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
      sc.close();
    }

    private static void afficherSousMenuInformations(Scanner sc, Client c1, Client c2, Client c3, Client c4, Chambre ch1, Chambre ch2, Chambre ch3, Chambre ch4)
    {
        boolean retourVersMenuPrincipale = false;

        while (!retourVersMenuPrincipale)
        {
            //affichage du sous menu d'informations:
            System.out.println("\nMenu d'Informations : ");
            System.out.println("1 - Afficher les Informations d'un seul Client :");
            System.out.println("2 - Lister les Clients :");
            System.out.println("3 - Vérifier une Chambre :");
            System.out.println("4 - Lister toutes les Chambres :");
            System.out.println("5 - Info sur une Réservation :");
            System.out.println("6 - Lister toutes les Réservations");
            System.out.println("7 - Retour vers le Menu Principal :");

            System.out.println("Veuillez choisir une option: ");
            int optionMenuInformation = sc.nextInt();

            switch (optionMenuInformation)
            {
                case 1:
                    //Afficher les Informations d'un seul Client

                    break;
                case 2:
                    //Lister les Clients

                    break;
                case 3:
                    //Vérifier une Chambre

                    break;
                case 4:
                    //Lister toutes les Chambres

                    break;
                case 5:
                    //Info sur une Réservation

                    break;
                case 6:
                    //Lister toutes les Réservations

                    break;
                case 7:
                    //Retour vers le Menu Principal
                     retourVersMenuPrincipale = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private static void afficherSousMenuReservations(Scanner sc, Client c1, Client c2, Client c3, Client c4, Chambre ch1, Chambre ch2, Chambre ch3, Chambre ch4)
    {
         boolean retourVersMenuPrincipale = false;

         while (!retourVersMenuPrincipale)
         {
             System.out.println("\nMenu d'Reservations : ");
             System.out.println("1 - Faire une Réservation:");
             System.out.println("2 - Modifier une Réservation:");
             System.out.println("3 - Annuler une Réservation: ");
             System.out.println("4 - Retour vers le Menu Principal :");

             System.out.println("Option invalide. Veuillez réessayer.");
             int optionMenuReservation = sc.nextInt();

             switch (optionMenuReservation)
             {
                 case 1:
                     //Faire une Réservation

                     break;
                 case 2:
                     //Modifier une Réservation

                     break;
                 case 3:
                     //Annuler une Réservation

                     break;
                 case 4:
                     //Retour vers le Menu Principal
                     retourVersMenuPrincipale = true;
                     break;
                 default:
                     System.out.println("Option Invalide. Veuillez réessayer.");
             }
         }
    }
}