
interface Playable {
    void play();
}

class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Veena");
    }
}

class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }
}

public class Test {
    public static void main(String[] args) {

        
        Veena v = new Veena();
        v.play();

        
        Saxophone s = new Saxophone();
        s.play();

        
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}