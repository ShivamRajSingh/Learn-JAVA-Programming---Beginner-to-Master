class Phone{
    public void call(){
        System.out.println("Make a call");
    }
    public void sms(){
        System.out.println("Send SMS");
    }
}
interface ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void pause();
}
class Smartphone extends Phone implements ICamera, IMusicPlayer{
    @Override
    public void click(){
        System.out.println("Click a picture");
    }
    @Override
    public void record(){
        System.out.println("Record Video");
    }
    @Override
    public void play() {
        System.out.println("Play music");
    }
    @Override
    public void pause() {
        System.out.println("Pause music");
    }
    public void videoCall(){
        System.out.println("Make a video call");
    }

}
public class SmartphoneMain {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.call();
        s.click();
        Phone p = new Smartphone();
        p.sms();
        ICamera c = new Smartphone();
        c.click();
    }
}
