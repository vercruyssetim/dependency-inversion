package be.cegeka.ventouris.dependencyinversion.backery.bread;

public class SelfMadeBreadService {
    public Bread getBreadByName(String name) {
        return new NormalBreadRepository().getBreadByName(name);
    }
}
