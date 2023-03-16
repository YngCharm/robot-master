import java.util.*;


public class Robot {

    Time time = new Time();


    ArrayList<String> rooms = new ArrayList<>();

    public void rooms() {
        rooms.add("1-Кухня");
        rooms.add("2-Гостинная");
        rooms.add("3-Спальня");
        rooms.add("4-Детская комната");
        rooms.add("5-Ванная");
        rooms.add("6-Прихожая");
    }

    public void chooseRoom() throws InterruptedException {
        while (rooms.size() > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите комнату " + "\n" + rooms);
            String input = scanner.nextLine();

            //time.goSixteenSecond();
            time.goFirst();

            if (input.equals("1")) {
                rooms.remove(0);
            }
            if (input.equals("2")) {
                rooms.remove(1);
            }
            if (input.equals("3")) {
                rooms.remove(2);
            }
            if (input.equals("4")) {
                rooms.remove(3);
            }
            if (input.equals("5")) {
                rooms.remove(4);
            }
            if (input.equals("6")) {
                rooms.remove(5);
            }
            if (input.equals("рандом")) {
                Random rand = new Random();
                String randomElement = rooms.get(rand.nextInt(rooms.size()));
                rooms.remove(randomElement);
            }
            Thread.sleep(5000);
        }
    }

        public void endClean() throws InterruptedException {
            rooms();
            chooseRoom();

    }
}
