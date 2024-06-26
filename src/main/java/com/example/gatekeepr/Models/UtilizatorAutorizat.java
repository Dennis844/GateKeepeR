package com.example.gatekeepr.Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UtilizatorAutorizat {
    private final StringProperty adresaUtilizator;
    private final StringProperty parola;

    public UtilizatorAutorizat(StringProperty adresaUtilizator, StringProperty parola) {
        this.adresaUtilizator = adresaUtilizator;
        this.parola = parola;
    }

    public StringProperty adresaUtilizatorProperty() {
        return adresaUtilizator;
    }

    public StringProperty parolaPRoperty() {
        return parola;
    }
}
