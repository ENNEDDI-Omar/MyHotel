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
            System.out.println("1 - Afficher les Informations du client:");
            System.out.println("2 - Afficher les Informations du chambre:");
            System.out.println("3 - Réserver une Chambre:");
            System.out.println("4 - Afficher les Informations de la réservation");
            System.out.println("5 - Quitter!");

            System.out.println("Veuillez choisir une option:");
            int options = sc.nextInt();

            //application des options:
            switch (options)
            {
                case 1:


            }
        }

    }
}