import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    private static int compteurId = 1;
 private int id;
 private Client client;
 private Chambre chambre;
 private LocalDate dateDebut;
 private LocalDate dateFin;

   public Reservation(Client client, Chambre chambre, LocalDate dateDebut, LocalDate dateFin)
   {
       this.id = compteurId++;
       this.client = client;
       this.chambre = chambre;
       this.dateDebut = dateDebut;
       this.dateFin = dateFin;
       this.chambre.setDisponibility(false);
   }
    public int getId() {return id;}
    public String getClient() {return this.client.getNom();}
    public int getChambre() {return this.chambre.getNumero();}
    public LocalDate getDateDebut() {return this.dateDebut;}
    public LocalDate getDateFin() {return this.dateFin;}

    public void setDateDebut(LocalDate dateDebut) {this.dateDebut = dateDebut;}
    public void setDateFin(LocalDate dateFin) {this.dateFin = dateFin;}

    public void afficherDetailsReservation()
    {
        System.out.println("Nom: " + this.client.getNom()+ "\nNumero: " + this.chambre.getNumero()+ "\nDate du debut: " + this.dateDebut+ "\nDate fin: " + this.dateFin);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "client=" + getClient() +
                ", \n chambre=" + getChambre() +
                ", \n ateDebut=" + getDateDebut() +
                ", \n dateFin=" + getDateFin() +
                '}';
    }
}
