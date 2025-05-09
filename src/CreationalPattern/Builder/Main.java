package CreationalPattern.Builder;

public class Main {
    public static void main(String[] args) {
        Apartment apartment = new BuilderClass()
                .setSqm(90)
                .setRooms(3)
                .setCity("Delhi")
                .setArea("Dwarka")
                .setKitchen(true)
                .build();

        apartment.display();
    }
}

