package ru.netology.radio;

public class Radio {
    private int numberOfStation;
    private int soundVolume;

    public int getNumberOfStation() {
        return numberOfStation;
    }
    public void setNumberOfStation(int newNumberOfStation) {
        if (newNumberOfStation < 0) {
            return;
        }
        if (newNumberOfStation > 9) {
            return;
        }
        numberOfStation = newNumberOfStation;
    }
    public void NextStationButton() {
        if (numberOfStation < 9) {
            numberOfStation = numberOfStation + 1;
        }
        if (numberOfStation >= 9) {
            numberOfStation = 0;
        }
    }

    public void PrevStationButton() {
        if (numberOfStation > 0) {
            numberOfStation = numberOfStation - 1;
        }
        if (numberOfStation <= 0) {
            numberOfStation = 9;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        soundVolume = volume;
    }

    public void plusButtonVolume() {
        if (soundVolume < 10) {
            soundVolume++;
        }
        if (soundVolume >= 10) {
            soundVolume = 10;
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
