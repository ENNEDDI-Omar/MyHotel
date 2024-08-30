import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    private int id;
    private String nom;
    private String tel;
    private final List<Reservation> reservations = new ArrayList<Reservation>();

    public Client(int id, String nom, String tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }

    public int getId() {return id;}
    public String getNom(){return this.nom;}
    public String getTel(){return this.tel;}
    public List<Reservation> getReservations(){return this.reservations;}

    public void afficherInfoClient() {
        System.out.println("Mes Infos: " + getNom() + " " + "Tél: " + getTel());
        if (reservations.isEmpty()){
            System.out.println("Aucune réservation pour ce Client: " + getNom());
        }else {
            for (Reservation r : reservations)
            {
                if (r.getClient().equals(getNom()))
                {
                    r.afficherDetailsReservation();
                }
            }
        }
    }
    
    public Reservation ajouterReservation(Client client, Chambre chambre, Date dateDebut, Date dateFin)
    {
        Reservation nouvelleReservation = new Reservation(client, chambre, dateDebut, dateFin);
        reservations.add(nouvelleReservation);
        System.out.println("Réservation ajoutée avec succès !");
        return nouvelleReservation;
    }


}
