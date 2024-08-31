import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Client {
    private int id;
    private String nom;
    private String tel;
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public Client(int id, String nom, String tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }
//getters & setters:
    public int getId() {return id;}
    public String getNom(){return this.nom;}
    public String getTel(){return this.tel;}
    public List<Reservation> getReservations(){return this.reservations;}

    public void setNom(String nom) {this.nom = nom;}
    public void setTel(String tel) {this.tel = tel;}
    public void setReservations(List<Reservation> reservations) {this.reservations = reservations;}

//methode pour afficher les infos du client:
    public void afficherInfoClient() {
        System.out.println("Mes Infos: " + getNom() + " " + "Tél: " + getTel());
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
    
    public Reservation ajouterReservation(Client client, Chambre chambre, LocalDate dateDebut, LocalDate dateFin)
    {
        Reservation nouvelleReservation = new Reservation(client, chambre, dateDebut, dateFin);
        reservations.add(nouvelleReservation);
        System.out.println("Réservation ajoutée avec succès!");
        return nouvelleReservation;
    }


}
