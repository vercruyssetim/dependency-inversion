package be.cegeka.ventouris.dependencyinversion.backery.bread.extras;

import be.cegeka.ventouris.dependencyinversion.backery.bread.Bread;

public class NetworkConnectionToWholeSale {

    public Bread getBreadByName(String name) {

        return new Bread(name, name, 1);
    }
}
