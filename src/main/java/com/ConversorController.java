package com;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ConversorController implements Serializable {
    private Conversor conversor;
    private Double celsius;
    private Double fahrenheit;
    
    public ConversorController(){
        conversor = new Conversor(); 
        celsius = 0.0;
        fahrenheit = 0.0; 
    }
    
    public void converter(){
        fahrenheit = conversor.converterParaFahrenheit(celsius);
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    
    
}
