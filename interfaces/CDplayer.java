package interfaces;

public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("Media Started");
    }

    @Override
    public void stop() {
        System.out.println("Media Stopped");
    }
    
}
