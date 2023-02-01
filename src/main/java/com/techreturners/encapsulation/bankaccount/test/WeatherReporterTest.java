

package com.techreturners.encapsulation.bankaccount.test;


import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherReporterTest {

    @Test
    public void  checkDisplayWeatherMessageLondonCold(){
        WeatherReporter londonWeather = new WeatherReporter("London",8);
        assertEquals("I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 46.4.", londonWeather.displayWeather());
    }



}
