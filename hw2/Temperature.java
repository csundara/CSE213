//package com.qjones.hw2.two;
package com.csundaram.hw2;

public class Temperature {
    private double kelvin;
    private double fahrenheit;
    private double celsius;
    private enum temp {
	FAHRENHEIT, CELSIUS, KELVIN
    }
    
    public static Temperature valueOf(double value){
        return new Temperature(value, temp.KELVIN);
    }
    
    private Temperature(double value, temp tempeture) {
        switch(tempeture){
        case FAHRENHEIT:
            kelvinInstance(value);
            break;
        
        case CELSIUS:
            fahrenheitInstance(value);
            break;
        
        case KELVIN:
            celsiusInstance(value);
            break;
        }
        
    }
    
    private void kelvinInstance(double value) {
        kelvin = value;
        fahrenheit = (value * (9/5)) - 459.67;
        celsius = value - 273.15;
    }
    
    private void fahrenheitInstance(double value) {
        fahrenheit = value;
        kelvin = (value + 459.67) * (5/9);
        celsius = (5/9) * (value - 32);
    }
    
    private void celsiusInstance(double value) {
        celsius = value;
        fahrenheit = (value / (5/9)) + 32;
        kelvin = value + 273.15;
    }
    
    public double getKelvin() {
    	return kelvin;
    }
    
    public double getFahrenheit() {
    	return fahrenheit;
    }
    
    public double getCelsius() {
    	return celsius;
    }
}
    