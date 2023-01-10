public abstract class ProtoShape implements Cloneable{
    private String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public ProtoShape clone(){
        ProtoShape clone = null;

        try {
            clone = (ProtoShape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
