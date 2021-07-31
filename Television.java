package Practice;

public class Television {

    private boolean isOn;
    private String productName;
    private int volume;
    private int channel;

    public Television(boolean isOn, String productName, int volume, int channel){
        this.isOn = isOn;
        this.productName = productName;
        this.volume = volume;
        this.channel = channel;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setVolumeIncrease() {
        volume = volume + 1;
    }

    public void setVolumeDecrease() {
        volume = volume - 1;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setChannelIncrease() {
        channel = channel + 1;
    }

    public void setChannelDecrease() {
        channel = channel - 1;
    }
}
