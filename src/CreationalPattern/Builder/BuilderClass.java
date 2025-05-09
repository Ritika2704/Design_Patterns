package CreationalPattern.Builder;

public  class BuilderClass {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    public BuilderClass setSqm(int sqm) {
        this.sqm = sqm;
        return this;
    }

    public BuilderClass setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public BuilderClass setCity(String city) {
        this.city = city;
        return this;
    }

    public BuilderClass setArea(String area) {
        this.area = area;
        return this;
    }

    public BuilderClass setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
        return this;
    }

    public Apartment build() {
        Apartment ap = new Apartment(sqm, rooms, city, area,kitchen);
        return ap;
    }

}
