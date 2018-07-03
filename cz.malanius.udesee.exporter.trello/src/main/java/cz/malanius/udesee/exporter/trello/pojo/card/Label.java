package cz.malanius.udesee.exporter.trello.pojo.card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Label {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("uses")
    @Expose
    private int uses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id='" + id + '\'' +
                ", idBoard='" + idBoard + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", uses=" + uses +
                '}';
    }
}
