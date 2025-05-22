package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        return "FreshMerchandise{" +
                "localizacion = " + this.getLocation() +
                ", caducidad = " +  getFormattedDate(expirationDate)  +
                '}';
    }


    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date date) {
        return DATE_FORMAT.format(date);
    }
}
