package be.cegeka.ventouris.dependencyinversion.backery.bread;

public class BreadMapper {
    public BreadTO map(Bread bread) {
        return new BreadTO(bread.getName(), bread.getColor(), bread.getPrice());
    }
}
