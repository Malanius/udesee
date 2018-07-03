package cz.malanius.udesee.exporter.trello.pojo.card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Badges {

    @SerializedName("votes")
    @Expose
    private int votes;
    @SerializedName("viewingMemberVoted")
    @Expose
    private boolean viewingMemberVoted;
    @SerializedName("subscribed")
    @Expose
    private boolean subscribed;
    @SerializedName("fogbugz")
    @Expose
    private String fogbugz;
    @SerializedName("checkItems")
    @Expose
    private int checkItems;
    @SerializedName("checkItemsChecked")
    @Expose
    private int checkItemsChecked;
    @SerializedName("comments")
    @Expose
    private int comments;
    @SerializedName("attachments")
    @Expose
    private int attachments;
    @SerializedName("description")
    @Expose
    private boolean description;
    @SerializedName("due")
    @Expose
    private Object due;
    @SerializedName("dueComplete")
    @Expose
    private boolean dueComplete;

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean isViewingMemberVoted() {
        return viewingMemberVoted;
    }

    public void setViewingMemberVoted(boolean viewingMemberVoted) {
        this.viewingMemberVoted = viewingMemberVoted;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getFogbugz() {
        return fogbugz;
    }

    public void setFogbugz(String fogbugz) {
        this.fogbugz = fogbugz;
    }

    public int getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(int checkItems) {
        this.checkItems = checkItems;
    }

    public int getCheckItemsChecked() {
        return checkItemsChecked;
    }

    public void setCheckItemsChecked(int checkItemsChecked) {
        this.checkItemsChecked = checkItemsChecked;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getAttachments() {
        return attachments;
    }

    public void setAttachments(int attachments) {
        this.attachments = attachments;
    }

    public boolean isDescription() {
        return description;
    }

    public void setDescription(boolean description) {
        this.description = description;
    }

    public Object getDue() {
        return due;
    }

    public void setDue(Object due) {
        this.due = due;
    }

    public boolean isDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    @Override
    public String toString() {
        return "Badges{" +
                "votes=" + votes +
                ", viewingMemberVoted=" + viewingMemberVoted +
                ", subscribed=" + subscribed +
                ", fogbugz='" + fogbugz + '\'' +
                ", checkItems=" + checkItems +
                ", checkItemsChecked=" + checkItemsChecked +
                ", comments=" + comments +
                ", attachments=" + attachments +
                ", description=" + description +
                ", due=" + due +
                ", dueComplete=" + dueComplete +
                '}';
    }
}
