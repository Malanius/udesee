package cz.malanius.udesee.exporter.trello.pojo.checklist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Checklist {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("idCard")
    @Expose
    private String idCard;
    @SerializedName("pos")
    @Expose
    private int pos;
    @SerializedName("checkItems")
    @Expose
    private List<CheckItem> checkItems = null;

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

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public List<CheckItem> getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(List<CheckItem> checkItems) {
        this.checkItems = checkItems;
    }

    @Override
    public String toString() {
        return "Checklist{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", idBoard='" + idBoard + '\'' +
                ", idCard='" + idCard + '\'' +
                ", pos=" + pos +
                ", checkItems=" + checkItems +
                '}';
    }
}
