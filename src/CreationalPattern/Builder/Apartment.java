package CreationalPattern.Builder;

public class Apartment {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    public Apartment(int sqm, int rooms, String city, String area, boolean kitchen){
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;
    }

    public int getSqm(){
        return sqm;
    }
    //All other getters
    public int getRooms() { return rooms; }
    public String getCity() { return city; }
    public String getArea() { return area; }
    public boolean hasKitchen() { return kitchen; }

    public void display() {
        System.out.println("Apartment has: ");
        System.out.println("- " + sqm + " sqm");
        System.out.println("- " + rooms + " rooms");
        System.out.println("- Located in " + area + ", " + city);
        System.out.println("- Kitchen: " + (kitchen ? "Yes" : "No"));
    }


}
