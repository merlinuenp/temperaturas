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
        System.out.println("entrou");
        conversor = new Conversor(); 
        celsius = 0.0;
        fahrenheit = 0.0; 
    }
    
    public void converter(){
        try{
        fahrenheit = conversor.converterParaFahrenheit(celsius);
        }
        catch(Exception e ){
            System.out.println("...................erro");
        }
    }

    public Conversor getConversor() {
        return conversor;
    }

    public void setConversor(Conversor conversor) {
        this.conversor = conversor;
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
