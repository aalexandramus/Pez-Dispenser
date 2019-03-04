public class Main {

    public static void main(String[] args) {
        System.out.printf("We are making a new Pez Dispenser%n");
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        String before = dispenser.swapHead("Darth Vader");
        System.out.printf("it was %s but Ali switched it to %s%n", before, dispenser.getCharacterName());
        PezDispenser diissp = new PezDispenser("Miley Cyrus");
        System.out.println(diissp.isEmpty());
        diissp.fill();
        System.out.println(diissp.isEmpty());
        dispenser.fill();
        while (dispenser.dispense()) {
            System.out.println("chomp!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Ate all the pez!");
        }


    }
}
