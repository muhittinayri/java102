package fixtureBuilder;

public class Main {
    public static void main(String[] args) {
        TeamsController teamsController = new TeamsController();
        teamsController.list.add("Galatasaray");
        teamsController.list.add("Ümraniyespor");
        teamsController.list.add("Ankaragücü");
        teamsController.list.add("Kayserispor");
        teamsController.list.add("Adana Demirspor");
        teamsController.list.add("Sivasspor");
        teamsController.list.add("Konyaspor");
        teamsController.ligFixture();
    }
}
