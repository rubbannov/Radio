package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //Выбор радиостанции путем прямого указания номера
    @Test
    public void shouldSetRadiostationNumber() {
        Radio radio = new Radio();

        radio.setNumberOfStation(5);

        int expected = 5;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции вперед
    @Test
    public void shouldSetNextRadiostationNumder() {
        Radio radio = new Radio();

        radio.setNumberOfStation(7);
        radio.nextStationButton();

        int expected = 8;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой вперед и сброс в начало списка
    @Test
    public void shouldSetMaxNextRadiostationNumder() {
        Radio radio = new Radio();

        radio.setNumberOfStation(9);
        radio.nextStationButton();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой назад
    @Test
    public void shouldSetPrevRadiostationNumber() {
        Radio radio = new Radio();

        radio.setNumberOfStation(5);
        radio.prevStationButton();

        int expected = 4;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой назад и сброс в конец списка
    @Test
    public void shouldSetMinRadiostationNumber() {
        Radio radio = new Radio();

        radio.setNumberOfStation(0);
        radio.prevStationButton();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    //Пограничное значение выбора радиостанции за пределом списка
    @Test
    public void testSetRadiostationNumberUnderLimit() {
        Radio radio = new Radio();

        radio.setNumberOfStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции за пределом списка
    @Test
    public void testSetRadiostationNumberOverLimit() {
        Radio radio = new Radio();

        radio.setNumberOfStation(11);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции предыдущее значение к граничному значению списка
    @Test
    public void testSetPrevMaxNextRadiostationNumder() {
        Radio radio = new Radio();

        radio.setNumberOfStation(8);
        radio.nextStationButton();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции предыдущее значение к граничному значению списка
    @Test
    public void testSetMinPrevRadiostationNumber() {
        Radio radio = new Radio();

        radio.setNumberOfStation(1);
        radio.prevStationButton();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    //Увеличение громкости
    @Test
    public void shouldSetPlusVolume() {
        Radio radio = new Radio();

        radio.plusButtonVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Увеличение громкости на максимальном значении
    @Test
    public void shouldSetPlusVolumeMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(10);
        radio.plusButtonVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Уменьшение громкости
    @Test
    public void shouldSetMinusVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(5);
        radio.minusButtonVolume();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Уменьшение громкости на минимальном значении
    @Test
    public void shouldSetMunusVolumeMin() {
        Radio radio = new Radio();

        radio.minusButtonVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Установление значения громкости за пределом диапазона
    @Test
    public void testSetPlusVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Установление значения громкости за пределом диапазона
    @Test
    public void testSetPlusVolumeOverLimit() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }




}
