import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Client {
    private static int compteurId = 1;
    private int id;
    private String nom;
    private String tel;
    private List<Reservation> reservations = new ArrayList<Reservation>();
    private Hotel hotel;

    public Client(String nom, String tel) {
        this.id = compteurId++;
        this.nom = nom;
        this.tel = tel;
    }
//getters & setters:
    public int getId() {return id;}
    public String getNom(){return this.nom;}
    public String getTel(){return this.tel;}
    public List<Reservation> getReservations(){return this.reservations;}
    public Hotel getHotel(){return this.hotel;}

    public void setNom(String nom) {this.nom = nom;}
    public void setTel(String tel) {this.tel = tel;}


//methode pour afficher les infos du client:
    public void afficherInfoClient() {
        System.out.println("Infos du Client: \nId : " +  getId() + "\n" + "Nom: " + getNom() + "\n" + "Tél: " + getTel());
        if (reservations.isEmpty()){
            System.out.println("Aucune réservation pour ce Client: " + getNom());
        }else {
            for (Reservation r : reservations)
            {
                if (r.getClient().equals(this.getNom()))
                {
                    r.afficherDetailsReservation();
                }
            }
        }
    }

//methode d'Ajout de Réservation
    public Reservation ajouterReservation( Chambre chambre, LocalDate dateDebut, LocalDate dateFin)
    {
        Reservation nouvelleReservation = new Reservation( this, chambre, dateDebut, dateFin);
        reservations.add(nouvelleReservation);
        return nouvelleReservation;
    }

//methode de modification d'une réservation
   public void modifierReservation(int reservationId, Chambre newChambre, LocalDate newDateDebut, LocalDate newDateFin)
   {
     for (Reservation r : reservations)
     {
         if (r.getId() == reservationId)
         {
             r.setDateDebut(newDateDebut);
             r.setDateFin(newDateFin);
             return;
         }
     }
       System.out.println("Réseravation non trouvée pour modiffication!");
   }

//methode de suppression de réservation
  public void supprimerReservation(int reservationId)
  {
    for (Reservation r : reservations)
    {
        if (r.getId() == reservationId)
        {
            reservations.remove(r);
            System.out.println("Réservation Annulée avec succés.");
            return;
        }
    }
      System.out.println("Réservation non trouvée pour Annulation");
  }

//rechercher une reservation
  public Reservation rechercherReservation(int reservationId)
  {
    for (Reservation r : reservations)
    {
        if (r.getId() == reservationId)
        {
            r.afficherDetailsReservation();
            return r;
        }
    }
      System.out.println("Aucune Réservation trouvée!");
     return null;
  }


}
