package cz.malanius.udesee.exporter.trello.pojo.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Token {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("idMember")
    @Expose
    private String idMember;
    @SerializedName("dateCreated")
    @Expose
    private String dateCreated;
    @SerializedName("dateExpires")
    @Expose
    private String dateExpires;
    @SerializedName("permissions")
    @Expose
    private List<Permission> permissions = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateExpires() {
        return dateExpires;
    }

    public void setDateExpires(String dateExpires) {
        this.dateExpires = dateExpires;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id='" + id + '\'' +
                ", identifier='" + identifier + '\'' +
                ", idMember='" + idMember + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateExpires='" + dateExpires + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
