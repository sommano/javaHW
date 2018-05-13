package com.java24hours;

import java.net.*;

public class Catalog {
    class HomePage {
        String owner;
        URL address;
        String category = "none"
        public HomePage(String inOwner, String inAddress)
        throws MalformedURLException {
            owner = inOwner;
            address = new URL(inAddress);
            
        }
        public HomePage(String inOwner, String inAddress, String inCategory)
        throws MalformedURLException {
        this(inOwner, inAddress);
        category = inCategory;

        }
    }
    public Catalog() {
        Catalog.HomePage[] catalog = new Catalog.HomePage[5];
        try {
            catalog[0] = new HomePage("Mike Glyer",
                "http://www.file770.com", "science fiction");
            catalog[1] = new HomePage("Shelley Powers",
                "http://www.burningbird.net", "environment");                
            catalog[2] = new HomePage("Rogers Cadenhead",
                "http://www.workbench.cadenhead.org", "programming");
            catalog[3] = new HomePage("Taegan Goddard",
                "http://www.politicalwire.com", "politics");                
            catalog[4] = new HomePage("Manton Reese",
                "http://www.manton.org");
            for (int i = 0; i < catalog.length; i++) {
                System.out.println(catalog[i].owner + ": " + 
                    catalog[i].address + " -- " + 
                    catalog[i].category);
            }
        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessages());

        }
    }
    public static void main(String[] arguments) {
        new Catalog();
    }
}