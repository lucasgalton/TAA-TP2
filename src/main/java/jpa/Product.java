package jpa;

import java.util.Collection;
import java.util.HashMap;

public class Product {
    private String defaultName;
    private String defaultDesc;
    private Collection<Categ> categ;
    private HashMap<Lang, Translation> translations;

}
