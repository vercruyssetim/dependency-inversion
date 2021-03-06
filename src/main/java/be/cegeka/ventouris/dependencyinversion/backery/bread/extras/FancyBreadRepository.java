package be.cegeka.ventouris.dependencyinversion.backery.bread.extras;

import be.cegeka.ventouris.dependencyinversion.backery.bread.Bread;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class FancyBreadRepository {

    Map<String, Bread> breadRepo = ImmutableMap.<String, Bread>builder()
            .put("rozijnenbrood", new Bread("rozijnenbrood", "wit", 3))
            .put("discobrood", new Bread("discobrood", "rood, groen en geel", 4))
            .put("steppebrood", new Bread("steppebrood", "steppebruin", 8))
            .build();

    public Bread getBreadByName(String name) {
        return breadRepo.get(name);
    }
}
