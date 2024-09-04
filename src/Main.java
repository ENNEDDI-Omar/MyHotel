import java.time.LocalDate;
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

        myHotel.ajouterClient("omar", "06456789");
        myHotel.ajouterClient( "kamal", "064898989");
        myHotel.ajouterClient( "test", "064898989");
        myHotel.ajouterClient( "allo", "064898989");

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
                      listerClients(myHotel);
                    break;
                case 3:
                    //Vérifier une Chambre
                    verifierChambre(sc, myHotel);
                    break;
                case 4:
                    //Lister toutes les Chambres
                    listerLesChambres(myHotel);
                    break;
                case 5:
                    //Info sur une Réservation
                      infoReservation(sc, myHotel);
                    break;
                case 6:
                    //Lister toutes les Réservations
                    listerReservations(myHotel);
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
             System.out.println("1 - Inscription à MyHotel");
             System.out.println("2 - Faire une Réservation:");
             System.out.println("3 - Modifier une Réservation:");
             System.out.println("4 - Annuler une Réservation: ");
             System.out.println("5 - Retour vers le Menu Principal :");

             System.out.println("Option invalide. Veuillez réessayer.");
             int optionMenuReservation = sc.nextInt();

             switch (optionMenuReservation)
             {
                 case 1:
                     //inscription Client
                     inscrireClient(sc, myHotel);
                     break;
                 case 2:
                     //Faire une Réservation
                     reserverUneChambre(sc, myHotel);
                     break;
                 case 3:
                     //Modifier une Réservation

                     break;
                 case 4:
                     //Annuler une Réservation

                     break;
                 case 5:
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
    private static void listerClients(Hotel hotel)
    {
        for (Client client : hotel.getClients())
        {
            client.afficherInfoClient();
        }
    }

    //Vérifier une Chambre
     private static void verifierChambre(Scanner sc, Hotel hotel)
     {
         System.out.println("Entrez le numero de la Chambre: ");
         int numeroChambre = sc.nextInt();
         Chambre chambre= hotel.chercherChambreParNumero(numeroChambre);

         if (chambre != null)
         {
             chambre.afficherDetailsChambre();
         }else {
             System.out.println("Chambre n'existe pas!");
         }

     }

    //Lister toutes les Chambres
    private static void listerLesChambres(Hotel hotel)
    {
        for (Chambre chambre : hotel.getChambres())
        {
            chambre.afficherDetailsChambre();
        }
    }

    //Info sur une Réservation
    private static void infoReservation(Scanner sc, Hotel hotel)
    {
        System.out.println("Veuillez Entrez l'ID de la Reservation: ");
        int reservationId = sc.nextInt();
        for (Reservation reservation : hotel.getReservations())
        {
            if (reservationId == reservation.getId())
            {
                reservation.afficherDetailsReservation();
                break;
            }
        }

    }

    //Lister toutes les Réservations
    private static void listerReservations(Hotel hotel)
    {
        for (Reservation reservation : hotel.getReservations())
        {
            reservation.afficherDetailsReservation();
        }
    }

//------------------------------methodes pour les Ops du Menu Réservation: --------------------------------------
    //Inscrirer comme client
    private static void inscrireClient(Scanner sc, Hotel hotel)
    {
        try {
            System.out.println("---------------------INSCRIPTION---------------------\n");
            System.out.println("Veuillez Entrez votre Nom: ");
            String nom = sc.next();

            System.out.println("Veuillez Entrez votre Tél: ");
            String tel = sc.next();

            Client client = hotel.ajouterClient(nom, tel);

            if (client != null)
            {
                System.out.println("Inscription validée, Bienvenu cher Client: " + client.getNom() + " chez MyHotel.");
            }

        } catch (Exception e) {
            System.out.println("Erreur lors de l'inscription du client, Veuillez réssayer plus tard! " + e.getMessage());
        }
    }

    //Faire une Réservation
    private static void reserverUneChambre(Scanner sc, Hotel hotel) {

    System.out.println("Veuillez Entrez votre Nom: ");
    String nomClient = sc.next();
    Client client = null;

    // Recherche du client par nom
    for (Client c : hotel.getClients()) {
        if (c.getNom().equalsIgnoreCase(nomClient)) {
            client = c;
            break;
        }
    }

    if (client == null) {
        System.out.println("Client n'existe pas! Veuillez vous enregistrer d'abord.");
    }


    System.out.println("Entrez le numéro de la chambre: ");
    int numeroChambre = sc.nextInt();
    Chambre chambre = hotel.chercherChambreParNumero(numeroChambre);

    if (chambre == null) {
        System.out.println("Chambre non trouvée. Veuillez entrer un numéro de chambre valide.");
    }

    if (!chambre.getDisponibility()) {
        System.out.println("Chambre non disponible pour la réservation.");
    }

    // Saisie des dates de réservation
    LocalDate dateDebut;
    LocalDate dateFin;
    try {
        System.out.println("Entrez la date de début de la réservation (YYYY-MM-DD): ");
        String dateDebutStr = sc.next();
        dateDebut = LocalDate.parse(dateDebutStr);

        System.out.println("Entrez la date de fin de la réservation (YYYY-MM-DD): ");
        String dateFinStr = sc.next();
        dateFin = LocalDate.parse(dateFinStr);

        if (dateDebut.isAfter(dateFin)) {
            System.out.println("Erreur : La date de début doit être antérieure à la date de fin.");
        }

        Reservation nouvelleReservation = client.ajouterReservation(chambre, dateDebut, dateFin);

        System.out.println("Réservation ajoutée avec succès!");

    } catch (Exception e) {
        System.out.println("Format de date invalide. Veuillez entrer la date au format YYYY-MM-DD.");
    }


}


   //Modifier une Réservation
    private static void modifierReservation(Scanner sc, Hotel hotel) {
        try {
            System.out.println("Entrez l'ID du Client pour modifier une réservation: ");
            int clientId = sc.nextInt();
            Client client = hotel.chercherClientParId(clientId);

            if (client != null) {
                System.out.println("Entrez l'ID de la réservation à modifier: ");
                int reservationId = sc.nextInt();

                System.out.println("Entrez le nouveau numéro de la chambre: ");
                int numeroChambre = sc.nextInt();
                Chambre nouvelleChambre = hotel.chercherChambreParNumero(numeroChambre);

                if (nouvelleChambre != null) {
                    System.out.println("Entrez la nouvelle date de début (YYYY-MM-DD): ");
                    LocalDate nouvelleDateDebut = LocalDate.parse(sc.next());

                    System.out.println("Entrez la nouvelle date de fin (YYYY-MM-DD): ");
                    LocalDate nouvelleDateFin = LocalDate.parse(sc.next());

                    client.modifierReservation(reservationId, nouvelleChambre, nouvelleDateDebut, nouvelleDateFin);
                    System.out.println("Réservation modifiée avec succès!");
                } else {
                    System.out.println("Chambre non trouvée.");
                }
            } else {
                System.out.println("Client non trouvé.");
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la modification de la réservation : " + e.getMessage());
        }
    }


    //Annuler une Réservation
    private static void annulerReservation(Scanner sc, Hotel hotel) {
        try {
            System.out.println("Entrez l'ID du Client pour annuler une réservation: ");
            int clientId = sc.nextInt();
            Client client = hotel.chercherClientParId(clientId);

            if (client != null) {
                System.out.println("Entrez l'ID de la réservation à annuler: ");
                int reservationId = sc.nextInt();

                client.supprimerReservation(reservationId);
            } else {
                System.out.println("Client non trouvé.");
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'annulation de la réservation : " + e.getMessage());
        }
    }




}