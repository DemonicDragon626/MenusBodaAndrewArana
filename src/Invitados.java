public class Invitados {
    private String Name;
    private String LastName;
    private Menu pR;

    public String getName() {
        return Name;
    }
    public Invitados(String Name, String LastName, Menu pR) {
        this.Name = Name;
        this.LastName = LastName;
        this.pR = pR;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setpR(Menu pR) {
        this.pR = pR;
    }

    public Menu getpR() {
        return pR;
    }
    public String toString() {
        return Name + " " + LastName + " - Plato recomendado: " + pR.getComida();
    }
}
