import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //création d'Hotel avec les chambres et les Clients :
        Hotel myHotel = new Hotel(1, "MyHotel", "Mohammedia");

        myHotel.ajouterChambre(1, 404, "simple", "300.DH");
        myHotel.ajouterChambre(2, 200, "suite", "1000.DH");
        myHotel.ajouterChambre(3, 101, "double", "500.DH");
        myHotel.ajouterChambre(4, 111, "vip", "800.DH");

        myHotel.ajouterClient(1, "omar", "06456789");
        myHotel.ajouterClient(2, "kamal", "064898989");
        myHotel.ajouterClient(3, "test", "064898989");
        myHotel.ajouterClient(4, "allo", "064898989");

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
                        afficherSousMenuInformations(sc, myHotel);
                    break;
                case 2:
                    //Réservations
                        afficherSousMenuReservations(sc, myHotel);
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
    private static void afficherSousMenuInformations(Scanner sc, Hotel myHotel)
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
                    afficherInfoClient(sc, myHotel);
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
    private static void afficherSousMenuReservations(Scanner sc, Hotel myHotel)
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
    private static void afficherInfoClient(Scanner sc, Hotel hotel)
    {
        System.out.println("\nEntrez l'ID du Client: ");
        int clientId = sc.nextInt();
        Client client = hotel.chercherClientParId(clientId);
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
     private static void verifierChambre(Scanner sc, Hotel hotel)
     {
         System.out.println("Entrez l'ID de la Chambre: ");
         int chambreId = sc.nextInt();

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