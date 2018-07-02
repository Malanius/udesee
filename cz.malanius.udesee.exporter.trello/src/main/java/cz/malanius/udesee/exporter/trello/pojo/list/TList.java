package cz.malanius.udesee.exporter.trello.pojo.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TList {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("closed")
    @Expose
    private boolean closed;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("pos")
    @Expose
    private int pos;
    @SerializedName("subscribed")
    @Expose
    private boolean subscribed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    @Override
    public String toString() {
        return "TList{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", closed=" + closed +
                ", idBoard='" + idBoard + '\'' +
                ", pos=" + pos +
                ", subscribed=" + subscribed +
                '}';
    }
}
