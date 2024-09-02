public class Chambre {
    private int id;
    private int numero;
    private String type;
    private String prix;
    private boolean disponibility;
    private Hotel hotel;


    public Chambre(int id, int numero, String type, String prix)
    {
        this.id = id;
        this.numero = numero;
        this.type = type;
        this.prix = prix;
        this.disponibility = true;
    }

    public int getId() {return this.id;}
    public int getNumero(){return this.numero;}
    public String getType(){return this.type;}
    public String getPrix(){return this.prix;}
    public boolean getDisponibility(){return this.disponibility;}
    public Hotel getHotel(){return this.hotel;}

    public void setNumero(int numero){this.numero = numero;}
    public void setType(String type){this.type = type;}
    public void setPrix(String prix){this.prix = prix;}
    public void setDisponibility(boolean disp){this.disponibility = disp;}

    public void afficherDetailsChambre()
    {
        System.out.println("Les Détails de la Chambre N°: "+getNumero()+"\n"+"type: "+getType()+"\n"+"prix: "+getPrix()+"\n"+"disponibility: "+(getDisponibility() ? "OUI" : "NON"));
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + id +
                ", numero=" + numero +
                ", type='" + type + '\'' +
                ", prix='" + prix + '\'' +
                ", disponibility=" + disponibility +
                '}';
    }
}
