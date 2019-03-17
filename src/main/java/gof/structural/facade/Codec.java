package gof.structural.facade;

public abstract class Codec {
    private String type;

    public Codec(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
