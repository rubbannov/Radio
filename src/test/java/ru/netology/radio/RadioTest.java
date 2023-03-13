package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadiostationNumber() {
        Radio radio = new Radio();

        radio.setNumberOfStation(5);

        int expected = 5;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadiostationNumder() {
        Radio radio = new Radio();

        radio.NextStationButton();

        int expected = 1;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNextRadiostationNumder() {
        Radio radio = new Radio();

        radio.setNumberOfStation(9);
        radio.NextStationButton();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadiostationNumber() {
        Radio radio = new Radio();

        radio.setNumberOfStation(5);
        radio.PrevStationButton();

        int expected = 4;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadiostationNumber() {
        Radio radio = new Radio();

        radio.PrevStationButton();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusVolume() {
        Radio radio = new Radio();

        radio.plusButtonVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusVolumeMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(10);
        radio.plusButtonVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(5);
        radio.minusButtonVolume();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMunusVolumeMin() {
        Radio radio = new Radio();

        radio.minusButtonVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetRadiostationNumberUnderLimit() {
        Radio radio = new Radio();

        radio.setNumberOfStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetRadiostationNumberOverLimit() {
        Radio radio = new Radio();

        radio.setNumberOfStation(10);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPlusVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPlusVolumeOverLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
