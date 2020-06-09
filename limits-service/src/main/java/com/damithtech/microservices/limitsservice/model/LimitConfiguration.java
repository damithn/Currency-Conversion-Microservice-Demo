package com.damithtech.microservices.limitsservice.model;

/**
 * @author DAMITH SAMARAKOON on 6/10/2020
 */
public class LimitConfiguration {
    int maximum;
    int minimum;

    public LimitConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }


}
