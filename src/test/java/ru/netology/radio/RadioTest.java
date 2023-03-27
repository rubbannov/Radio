package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();
    //Выбор радиостанции путем прямого указания номера
    @Test
    public void shouldSetRadiostationNumber() {

        radio.setNumberOfStation(5);

        int expected = 5;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции вперед
    @Test
    public void shouldSetNextRadiostationNumder() {

        radio.setNumberOfStation(7);
        radio.nextStationButton();

        int expected = 8;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой вперед и сброс в начало списка
    @Test
    public void shouldSetMaxNextRadiostationNumder() {

        radio.setNumberOfStation(9);
        radio.nextStationButton();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой назад
    @Test
    public void shouldSetPrevRadiostationNumber() {

        radio.setNumberOfStation(5);
        radio.prevStationButton();

        int expected = 4;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой назад и сброс в конец списка
    @Test
    public void shouldSetMinRadiostationNumber() {

        radio.setNumberOfStation(0);
        radio.prevStationButton();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    //Пограничное значение выбора радиостанции за пределом списка
    @Test
    public void testSetRadiostationNumberUnderLimit() {

        radio.setNumberOfStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции за пределом списка
    @Test
    public void testSetRadiostationNumberOverLimit() {

        radio.setNumberOfStation(11);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции предыдущее значение к граничному значению списка
    @Test
    public void testSetPrevMaxNextRadiostationNumder() {

        radio.setNumberOfStation(8);
        radio.nextStationButton();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции предыдущее значение к граничному значению списка
    @Test
    public void testSetMinPrevRadiostationNumber() {

        radio.setNumberOfStation(1);
        radio.prevStationButton();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    //Увеличение громкости
    @Test
    public void shouldSetPlusVolume() {

        radio.plusButtonVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Увеличение громкости на максимальном значении
    @Test
    public void shouldSetPlusVolumeMax() {

        radio.setSoundVolume(100);
        radio.plusButtonVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Уменьшение громкости
    @Test
    public void shouldSetMinusVolume() {

        radio.setSoundVolume(5);
        radio.minusButtonVolume();

        int expected = 4;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Уменьшение громкости на минимальном значении
    @Test
    public void shouldSetMunusVolumeMin() {

        radio.minusButtonVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Установление значения громкости за пределом диапазона
    @Test
    public void testSetPlusVolumeUnderLimit() {

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    //Установление значения громкости за пределом диапазона
    @Test
    public void testSetPlusVolumeOverLimit() {

        radio.setSoundVolume(110);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }



    //Выбор радиостанции путем прямого указания номера
    @Test
    public void shouldSetRadiostationNumberWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(15);

        int expected = 15;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции вперед
    @Test
    public void shouldSetNextRadiostationNumderWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(17);
        radio.nextStationButton();

        int expected = 18;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой вперед и сброс в начало списка
    @Test
    public void shouldSetMaxNextRadiostationNumderWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(19);
        radio.nextStationButton();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой назад
    @Test
    public void shouldSetPrevRadiostationNumberWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(10);
        radio.prevStationButton();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Переключение радиостанции кнопкой назад и сброс в конец списка
    @Test
    public void shouldSetMinRadiostationNumberWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(0);
        radio.prevStationButton();

        int expected = 19;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    //Пограничное значение выбора радиостанции за пределом списка
    @Test
    public void testSetRadiostationNumberUnderLimitWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции за пределом списка
    @Test
    public void testSetRadiostationNumberOverLimitWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(20);

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции предыдущее значение к граничному значению списка
    @Test
    public void testSetPrevMaxNextRadiostationNumderWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(18);
        radio.nextStationButton();

        int expected = 19;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    //Пограничное значение выбора радиостанции предыдущее значение к граничному значению списка
    @Test
    public void testSetMinPrevRadiostationNumberWithParameter() {
        Radio radio = new Radio(20);

        radio.setNumberOfStation(1);
        radio.prevStationButton();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }


}
