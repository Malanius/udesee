package cz.malanius.udesee.exporter.trello.pojo.card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Card {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("badges")
    @Expose
    private Badges badges;
    @SerializedName("checkItemStates")
    @Expose
    private List<Object> checkItemStates = null;
    @SerializedName("closed")
    @Expose
    private boolean closed;
    @SerializedName("dueComplete")
    @Expose
    private boolean dueComplete;
    @SerializedName("dateLastActivity")
    @Expose
    private String dateLastActivity;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("descData")
    @Expose
    private Object descData;
    @SerializedName("due")
    @Expose
    private Object due;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("idChecklists")
    @Expose
    private List<Object> idChecklists = null;
    @SerializedName("idList")
    @Expose
    private String idList;
    @SerializedName("idMembers")
    @Expose
    private List<String> idMembers = null;
    @SerializedName("idMembersVoted")
    @Expose
    private List<Object> idMembersVoted = null;
    @SerializedName("idShort")
    @Expose
    private int idShort;
    @SerializedName("idAttachmentCover")
    @Expose
    private String idAttachmentCover;
    @SerializedName("manualCoverAttachment")
    @Expose
    private boolean manualCoverAttachment;
    @SerializedName("labels")
    @Expose
    private List<Label> labels = null;
    @SerializedName("idLabels")
    @Expose
    private List<String> idLabels = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pos")
    @Expose
    private double pos;
    @SerializedName("shortLink")
    @Expose
    private String shortLink;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("subscribed")
    @Expose
    private boolean subscribed;
    @SerializedName("url")
    @Expose
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Badges getBadges() {
        return badges;
    }

    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    public List<Object> getCheckItemStates() {
        return checkItemStates;
    }

    public void setCheckItemStates(List<Object> checkItemStates) {
        this.checkItemStates = checkItemStates;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public String getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getDescData() {
        return descData;
    }

    public void setDescData(Object descData) {
        this.descData = descData;
    }

    public Object getDue() {
        return due;
    }

    public void setDue(Object due) {
        this.due = due;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public List<Object> getIdChecklists() {
        return idChecklists;
    }

    public void setIdChecklists(List<Object> idChecklists) {
        this.idChecklists = idChecklists;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public List<String> getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(List<String> idMembers) {
        this.idMembers = idMembers;
    }

    public List<Object> getIdMembersVoted() {
        return idMembersVoted;
    }

    public void setIdMembersVoted(List<Object> idMembersVoted) {
        this.idMembersVoted = idMembersVoted;
    }

    public int getIdShort() {
        return idShort;
    }

    public void setIdShort(int idShort) {
        this.idShort = idShort;
    }

    public String getIdAttachmentCover() {
        return idAttachmentCover;
    }

    public void setIdAttachmentCover(String idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    public boolean isManualCoverAttachment() {
        return manualCoverAttachment;
    }

    public void setManualCoverAttachment(boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<String> getIdLabels() {
        return idLabels;
    }

    public void setIdLabels(List<String> idLabels) {
        this.idLabels = idLabels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", badges=" + badges +
                ", checkItemStates=" + checkItemStates +
                ", closed=" + closed +
                ", dueComplete=" + dueComplete +
                ", dateLastActivity='" + dateLastActivity + '\'' +
                ", desc='" + desc + '\'' +
                ", descData=" + descData +
                ", due=" + due +
                ", email=" + email +
                ", idBoard='" + idBoard + '\'' +
                ", idChecklists=" + idChecklists +
                ", idList='" + idList + '\'' +
                ", idMembers=" + idMembers +
                ", idMembersVoted=" + idMembersVoted +
                ", idShort=" + idShort +
                ", idAttachmentCover='" + idAttachmentCover + '\'' +
                ", manualCoverAttachment=" + manualCoverAttachment +
                ", labels=" + labels +
                ", idLabels=" + idLabels +
                ", name='" + name + '\'' +
                ", pos=" + pos +
                ", shortLink='" + shortLink + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", subscribed=" + subscribed +
                ", url='" + url + '\'' +
                '}';
    }
}
