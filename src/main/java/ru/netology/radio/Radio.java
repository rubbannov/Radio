package ru.netology.radio;

public class Radio {
    private int numberOfStation;
    private int maxAmountStations;
    private int soundVolume;
    private int maxVolSound = 100;

    public Radio(int howManyStations) {
        maxAmountStations = howManyStations - 1;
    }

    public Radio() {
        maxAmountStations = 9;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }
    public void setNumberOfStation(int newNumberOfStation) {
        if (newNumberOfStation < 0) {
            return;
        }
        if (newNumberOfStation > maxAmountStations) {
            return;
        }
        numberOfStation = newNumberOfStation;
    }
    public void nextStationButton() {
        if (numberOfStation < maxAmountStations) {
            numberOfStation = numberOfStation + 1;
        } else {
            numberOfStation = 0;
        }
    }

    public void prevStationButton() {
        if (numberOfStation > 0) {
            numberOfStation = numberOfStation - 1;
        } else  {
            numberOfStation = maxAmountStations;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > maxVolSound) {
            return;
        }
        soundVolume = volume;
    }

    public void plusButtonVolume() {
        if (soundVolume < maxVolSound) {
            soundVolume++;
        }
        if (soundVolume >= maxVolSound) {
            soundVolume = maxVolSound;
        }
    }

    public void minusButtonVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
        if (soundVolume == 0) {
            return;
        }
    }

}
