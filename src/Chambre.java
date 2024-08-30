public class Chambre {
    private int id;
    private int numero;
    private String type;
    private String prix;
    private boolean disponibility;


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

    public void setNumero(int numero){this.numero = numero;}
    public void setType(String type){this.type = type;}
    public void setPrix(String prix){this.prix = prix;}
    public void setDisponibility(boolean disp){this.disponibility = disp;}

    public void afficherDetailsChambre()
    {
        System.out.println("Les Détails de la Chambre N°: "+getNumero()+" "+"type: "+getType()+" "+"prix: "+getPrix()+" "+"disponibility: "+(getDisponibility() ? "OUI" : "NON"));
    }

}
