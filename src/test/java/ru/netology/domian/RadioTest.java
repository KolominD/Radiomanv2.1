package ru.netology.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextToMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void setInvalidStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextToOverToFirstStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextWithInvalidNumberOfStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void nextFromFirstToLastStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        for (int i = 0; i < 9; i++) {
            rad.next();
        }

        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextCircleFromZeroToZeroStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        for (int i = 0; i < 9; i++) {
            rad.next();
        }

        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevToFirstStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prev();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromFirstToLastStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromSecondToFirstStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.prev();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevCircleFromZeroToZeroStation() {
        Radio rad = new Radio();
        for (int i = 0; i < 10; i++) {
            rad.prev();
        }
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeForOne() {
        Radio rad = new Radio();
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToNine() {
        Radio rad = new Radio();
        for (int i = 0; i < 9; i++) {
            rad.increaseVolume();
        }
        int actual = rad.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToMax() {
        Radio rad = new Radio();
        for (int i = 0; i < 10; i++) {
            rad.increaseVolume();
        }
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverThanMax() {
        Radio rad = new Radio();
        for (int i = 0; i < 15; i++) {
            rad.increaseVolume();
        }
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeToOne() {
        Radio rad = new Radio();
        rad.increaseVolume();
        rad.increaseVolume();
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeEightTimesFromZero() {
        Radio rad = new Radio();
        for (int i = 0; i < 8; i++) {
            rad.reduceVolume();
        }
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeFromMaxToZero() {
        Radio rad = new Radio();
        for (int i = 0; i < 10; i++) {
            rad.increaseVolume();
        }
        for (int i = 0; i < 10; i++) {
            rad.reduceVolume();
        }
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}