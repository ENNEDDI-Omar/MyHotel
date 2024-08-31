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
             //liste des chambres:


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
                    //Informations
                        afficherSousMenuInformations(sc,c1, c2, c3, c4, ch1, ch2, ch3, ch4);
                    break;
                case 2:
                    //Réservations
                        afficherSousMenuReservations(sc, c1, c2, c3, c4, ch1, ch2, ch3, ch4);
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

    //methode pour gestionner le menu des informations
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

    //methode pour gestionner le menu des réservations
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

    //------------------------------------méthodes pour les Ops du Menu Infos-----------------------------------------

    //Afficher les Informations d'un seul Client
    private static void afficherInfoClient(Scanner sc, Client c1, Client c2, Client c3, Client c4)
    {
        System.out.println("\nEntrez l'ID du Client: ");
        int clientId = sc.nextInt();
        Client client = trouverClientParId(clientId, c1, c2, c3, c4);
        if (client != null)
        {
            client.afficherInfoClient();
        }else {
            System.out.println("Client n'existe pas!");
        }
    }

    //Methode pour Lister les Clients:
    private static void listerClients(Client... clients)
    {
        for (Client client : clients)
        {
            client.afficherInfoClient();
        }
    }

    //Vérifier une Chambre
     private static void verifierChambre(Scanner sc, Chambre ch1, Chambre ch2, Chambre ch3, Chambre ch4)
     {
         System.out.println("Entrez l'ID de la Chambre: ");
         int chambreId = sc.nextInt();
         Chambre chambre = trouverChambreParId(chambreId, ch1, ch2, ch3, ch4);

         if (chambre != null)
         {
             chambre.afficherDetailsChambre();
         }else {
             System.out.println("Chambre n'existe pas!");
         }
     }

    //Lister toutes les Chambres
    private static void listerLesChambres(Chambre... chambres)
    {
        for (Chambre chambre : chambres)
        {
            chambre.afficherDetailsChambre();
        }
    }

    //Info sur une Réservation
    private static void infoReservation(Scanner sc,Reservation... reservations)
    {
        System.out.println("Veuillez Entrez l'ID de la Reservation: ");
        int reservationId = sc.nextInt();
        Reservation reservation = trouverReservationId(reservationId, reservations);

        if (reservation != null)
        {
            reservation.afficherDetailsReservation();
        }
    }

    //Lister toutes les Réservations
    private static void listerReservations(Reservation... reservations)
    {
        for (Reservation reservation : reservations)
        {
            reservation.afficherDetailsReservation();
        }
    }


}