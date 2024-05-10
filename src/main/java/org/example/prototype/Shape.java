package org.example.prototype;

/**
 * @author sleet
 * @version 2024/5/10
 */
public abstract class Shape
        implements Cloneable {

    private String id;

    protected String type;

    abstract void shape();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object object = null;

        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return object;
    }
}
