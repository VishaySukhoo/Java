
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishay
 */
public class PersonSubclass implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient int propertyguid;
    private String property1;
    private int property2;

    public String getProperty1() {
        return property1;
    }

    public int getProperty2() {
        return property2;
    }

    public int getPropertyguid() {
        return propertyguid;
    }

    public void setPropertyguid(int propertyguid) {
        this.propertyguid = propertyguid;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public void setProperty2(int property2) {
        this.property2 = property2;
    }
    
}
