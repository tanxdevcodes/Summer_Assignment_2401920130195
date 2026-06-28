import java.util.Random;

// Abstract class
abstract class Compartment {
    abstract String notice();
}

// Child classes
class FirstClass extends Compartment {
    String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    String notice() {
        return "Luggage Compartment";
    }
}

public class Oop {
    public static void main(String[] args) {
        Compartment[] arr = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(4) + 1; // 1 to 4

            if (num == 1)
                arr[i] = new FirstClass();
            else if (num == 2)
                arr[i] = new Ladies();
            else if (num == 3)
                arr[i] = new General();
            else
                arr[i] = new Luggage();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i].notice());
        }
    }
}