package be.cegeka.ventouris.dependencyinversion.backery.bread.extras;

import be.cegeka.ventouris.dependencyinversion.backery.bread.Bread;

public class WholeSaleBreadService {

    public Bread getBreadByName(String name) {
        return new NetworkConnectionToWholeSale().getBreadByName(name);
    }
}
