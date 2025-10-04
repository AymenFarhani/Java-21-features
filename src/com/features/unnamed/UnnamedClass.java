import java.time.LocalDate;

void main() {
    System.out.println("Main method in unnamed class");
    displayTheDay();
}

private void displayTheDay() {
    System.out.println(STR."Today: \{LocalDate.now()}");
}

// The previous program is equivalent to this
/*
import java.time.LocalDate;
public class Unnamed {
    public void main() {
        System.out.println("Main method in unnamed class");
        displayTheDay();
    }

   private void displayTheDay() {
       System.out.println("Today: " + LocalDate.now());
   }
    public static void main(String[] args) {
        new Unnamed().main();
    }
}
 */

