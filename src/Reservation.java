import java.util.Date;

public class Reservation {
 private Client client;
 private Chambre chambre;
 private Date dateDebut;
 private Date dateFin;

   public Reservation(Client client, Chambre chambre, Date dateDebut, Date dateFin)
   {
       this.client = client;
       this.chambre = chambre;
       this.dateDebut = dateDebut;
       this.dateFin = dateFin;
       this.chambre.setDisponibility(false);
   }

    public String getClient() {return this.client.getNom();}
    public int getChambre() {return this.chambre.getNumero();}
    public Date getDateDebut() {return this.dateDebut;}
    public Date getDateFin() {return this.dateFin;}

    public void setDateDebut(Date dateDebut) {this.dateDebut = dateDebut;}
    public void setDateFin(Date dateFin) {this.dateFin = dateFin;}

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
