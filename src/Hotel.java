import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private List<Chambre> chambres = new ArrayList<Chambre>();

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
    public void ajouterChambre(int id, int numero, String type, String prix)
    {
     Chambre chambre = new Chambre(id, numero, type, prix);
     chambres.add(chambre);
        System.out.println("Chambre N°: " + chambre.getNumero() + "est ajoutée avec succés.");
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
               chambre.afficherDetailsChambre();
               return chambre;
           }
       }
       System.out.println("Chambre non trouvée dans la recherche");
       return null;
   }

//methode d'affichage d'hotel
   public void afficherHotel()
   {
       System.out.println(this);
   }

}
