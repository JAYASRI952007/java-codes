interface Camera {
    void photo();
}
interface Music {
    void playMusic();
}
class Mobile implements Camera, Music {
    public void photo() {
        System.out.println("Photo Taken");
    }
    public void playMusic() {
        System.out.println("Music playing");
    }
}
public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.photo();
        m.playMusic();
    }
}
