import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String[] leaders = {
                "Captain Cutter",
                "Arbiter",
                "Atriox",
                "Anders",
                "Isabel",
                "Serina",
                "ShipMaster",
                "Colony",
                "Forge",
                "Jerome",
                "YapYap",
                "Voridus",
                "Pavium",
        };

        Random random = new Random();

        int randomIndex = random.nextInt(leaders.length);

        String selectedLeader = leaders[randomIndex];

        System.out.println("Randomly selected Halo Wars leader: " + selectedLeader);
    }
}
