public class Main {
    public static void main(String[] args) {
        MusicStyles[] music = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for(MusicStyles f : music){
            f.playMusic();
        }



    }
}