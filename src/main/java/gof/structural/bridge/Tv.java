package gof.structural.bridge;

public class Tv implements Device {
    private boolean status = false;
    private int volume = 25;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return status;
    }

    @Override
    public void enable() {
        this.status = true;
    }

    @Override
    public void disable() {
        this.status = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel > 100) {
            this.channel = 1;
        } else if(channel < 1) {
            this.channel = 100;
        } else {
            this.channel = channel;
        }
    }

    @Override
    public void printStatus() {
        System.out.println(
                String.format("Tv status is: %s, volume is: %d, channel is: %d", status, volume, channel)
        );
    }
}
