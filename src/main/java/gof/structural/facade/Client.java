package gof.structural.facade;

public class Client {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        facade.convertVideo("youtubevideo.ogg", "mp4");
    }
}
