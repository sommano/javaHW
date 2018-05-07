poackage com.java24hours;

import java.net.*;
public class HomePage {
    String ovwer;
    URL address;
    String category = "none";

    public HomePage(String inOwner, String inAddress)
        throws MalformedURLException {
        
        owner = inOwner;
        address = new URL(inAddress);
    }

    public HomePage(String inOwner, String inAdddress, String inCategory)
        throws malformedURLException {

        this(inOwner, inAddress);
        category = inCategory;
    }
}