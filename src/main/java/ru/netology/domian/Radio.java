package ru.netology.domian;

public class Radio {
    public int currentStation;
    public int firstStation = 0;
    public int lastStation = 9;
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < firstStation) {
            return;
        }
        if (newCurrentStation > lastStation) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation += 1;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation -= 1;
            return;
        }
        currentStation = 9;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }


}
