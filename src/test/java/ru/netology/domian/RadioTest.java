package ru.netology.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextToMax() {
        Radio rad = new Radio(0, 0, 9, 10, 100, 0,0);
        rad.setCurrentStation(8);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void setInvalidStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(-1);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextToOverToFirstStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(9);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextWithInvalidNumberOfStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(-2);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextFromFirstToLastStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(8);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextFromNineToZeroStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(9);
        rad.next();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevToFirstStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(1);
        rad.prev();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromFirstToLastStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(0);
        rad.prev();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromSecondToFirstStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(-1);
        rad.prev();
        int actual = rad.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void prevFromOneToZeroStation() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentStation(1);
        rad.prev();
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeForOne() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToNine() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentVolume(8);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToMax() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentVolume(9);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverThanMax() {
        Radio rad = new Radio(0,0,9,10,100,0,100);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeToOne() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.setCurrentVolume(2);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeFromZero() {
        Radio rad = new Radio(0,0,9,10,100,0,0);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeToNinetyNine() {
        Radio rad = new Radio(0,0,9,10,100,0,100);
        rad.reduceVolume();
        int actual = rad.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }
    @Test
    public void SetInvalidVolumeOverThanLimit(){
        Radio rad = new Radio(0,0,9,10,100,0,10);
        rad.setCurrentVolume(1002);
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }
    @Test
    public void SetInvalidVolumeBeforeThanLimit(){
        Radio rad = new Radio(0,0,9,10,100,0,10);
        rad.setCurrentVolume(-1);
        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }
    @Test
    public void emptyConstructor(){
        Radio rad = new Radio();
        rad.setCurrentStation(100);
        int actual = rad.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


}