import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private final List<Chambre> chambres = new ArrayList<Chambre>();

    public Hotel(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public List<Chambre> getChambres() {return chambres;}

    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setChambres(List<Chambre> chambres) {this.chambres = chambres;}



}
