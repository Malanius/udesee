package cz.malanius.udesee.exporter.trello.pojo.checklist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckItem {

    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("idChecklist")
    @Expose
    private String idChecklist;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nameData")
    @Expose
    private Object nameData;
    @SerializedName("pos")
    @Expose
    private int pos;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIdChecklist() {
        return idChecklist;
    }

    public void setIdChecklist(String idChecklist) {
        this.idChecklist = idChecklist;
    }

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

    public Object getNameData() {
        return nameData;
    }

    public void setNameData(Object nameData) {
        this.nameData = nameData;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "CheckItem{" +
                "state='" + state + '\'' +
                ", idChecklist='" + idChecklist + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nameData=" + nameData +
                ", pos=" + pos +
                '}';
    }
}
