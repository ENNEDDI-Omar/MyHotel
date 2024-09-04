import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private List<Chambre> chambres = new ArrayList<Chambre>();
    private Set<Client> clients = new HashSet<Client>();
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public Hotel(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

//getters & setters
    public int getId() {return id;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public List<Chambre> getChambres() {return chambres;}
    public Set<Client> getClients() {return clients;}
    public List<Reservation> getReservations() {return reservations;}

    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}


//methode pour afficher l'hotel

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + this.getName() + '\'' +
                ", address='" + address + '\'' +
                ", chambres=" + chambres +
                '}';
    }

//methode pour ajouter une chambre:
    public Chambre ajouterChambre(int id, int numero, String type, String prix)
    {
     Chambre chambre = new Chambre(id, numero, type, prix);
     chambres.add(chambre);
        System.out.println("Chambre N°: " + chambre.getNumero() + "est ajoutée avec succés.");
        return chambre;
    }

//méthode pour Ajouter Client à l'hotel
   public Client ajouterClient(String nom, String tel)
   {
        Client newClient = new Client(nom, tel);
        clients.add(newClient);
        return newClient;
   }

//methode pour modifier une chambre
   public void modifierChambre(int chambreId, String nouveauType, String nouveauPrix)
   {
      for (Chambre chambre : chambres)
      {
          if (chambre.getId() == chambreId)
          {
              chambre.setType(nouveauType);
              chambre.setPrix(nouveauPrix);
              System.out.println("Chambre N°: " + chambre.getNumero() + "est Modifiée avec succés.");
              return;
          }
      }
       System.out.println("chambre non trouvée pour la modification!");
   }

//methode pour supprimer une chambre
   public void supprimerChambre(int chambreNumero)
   {
       for (Chambre chambre : chambres)
       {
           if (chambre.getNumero() == chambreNumero)
           {
               chambres.remove(chambre);
               System.out.println("Chambre Supprimer : " + chambreNumero);
               break;
           }
       }
       System.out.println("chambre non trouvée pour la suppression!");
   }

//methode pour chercher une chambres par numero
   public Chambre chercherChambreParNumero(int numero)
   {
       for (Chambre chambre : chambres)
       {
           if (chambre.getNumero() == numero)
           {
               return chambre;
           }
       }
       System.out.println("Chambre non trouvée dans la recherche");
       return null;
   }

//rechercher un client
   public Client chercherClientParId(int clientId)
   {
       for (Client client : clients)
       {
           if (client.getId() == clientId)
           {
               client.afficherInfoClient();
               return client;
           }
       }
       System.out.println("Client inéxistant!");
       return null;
   }



//methode d'affichage d'hotel
   public void afficherHotel()
   {
       System.out.println(this);
   }

}
