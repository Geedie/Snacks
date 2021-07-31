package Practice;

public class MP3 {
    private boolean isOn;
    private String productName;
    private int volume;
    private boolean isPaused;
    private int shuffle;

    public MP3(boolean isOn, String productName, int volume, boolean isPaused, int shuffle){
        this.isOn = isOn;
        this.productName = productName;
        this.volume = volume;
        this.isPaused = isPaused;
        this.shuffle = shuffle;
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
        if(volume < 100) {
            volume = volume + 1;
        }
    }

    public void setVolumeDecrease() {
        if(volume > 1){
            volume = volume - 1;
        }
    }

    public boolean getIsPaused() {
        return isPaused;
    }

    public void setIsPaused(boolean isPaused) {
        this.isPaused = isPaused;
    }

    public int getShuffle() {
        return shuffle;
    }

    public void setShuffle(int shuffle) {
        this.shuffle = shuffle;
    }

    public void setShuffleNext() {
        if(shuffle >= 1){
            shuffle = shuffle + 1;
        }
    }

    public void setShuffleBack() {
        if(shuffle <= 20){
            shuffle = shuffle - 1;
        }
    }
}
