package cz.malanius.udesee.exporter.trello.pojo.board;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Prefs {

    @SerializedName("permissionLevel")
    @Expose
    private String permissionLevel;
    @SerializedName("voting")
    @Expose
    private String voting;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("invitations")
    @Expose
    private String invitations;
    @SerializedName("selfJoin")
    @Expose
    private boolean selfJoin;
    @SerializedName("cardCovers")
    @Expose
    private boolean cardCovers;
    @SerializedName("cardAging")
    @Expose
    private String cardAging;
    @SerializedName("calendarFeedEnabled")
    @Expose
    private boolean calendarFeedEnabled;
    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("backgroundImage")
    @Expose
    private String backgroundImage;
    @SerializedName("backgroundImageScaled")
    @Expose
    private List<BackgroundImageScaled> backgroundImageScaled = null;
    @SerializedName("backgroundTile")
    @Expose
    private boolean backgroundTile;
    @SerializedName("backgroundBrightness")
    @Expose
    private String backgroundBrightness;
    @SerializedName("canBePublic")
    @Expose
    private boolean canBePublic;
    @SerializedName("canBeOrg")
    @Expose
    private boolean canBeOrg;
    @SerializedName("canBePrivate")
    @Expose
    private boolean canBePrivate;
    @SerializedName("canInvite")
    @Expose
    private boolean canInvite;

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public String getVoting() {
        return voting;
    }

    public void setVoting(String voting) {
        this.voting = voting;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getInvitations() {
        return invitations;
    }

    public void setInvitations(String invitations) {
        this.invitations = invitations;
    }

    public boolean isSelfJoin() {
        return selfJoin;
    }

    public void setSelfJoin(boolean selfJoin) {
        this.selfJoin = selfJoin;
    }

    public boolean isCardCovers() {
        return cardCovers;
    }

    public void setCardCovers(boolean cardCovers) {
        this.cardCovers = cardCovers;
    }

    public String getCardAging() {
        return cardAging;
    }

    public void setCardAging(String cardAging) {
        this.cardAging = cardAging;
    }

    public boolean isCalendarFeedEnabled() {
        return calendarFeedEnabled;
    }

    public void setCalendarFeedEnabled(boolean calendarFeedEnabled) {
        this.calendarFeedEnabled = calendarFeedEnabled;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public List<BackgroundImageScaled> getBackgroundImageScaled() {
        return backgroundImageScaled;
    }

    public void setBackgroundImageScaled(List<BackgroundImageScaled> backgroundImageScaled) {
        this.backgroundImageScaled = backgroundImageScaled;
    }

    public boolean isBackgroundTile() {
        return backgroundTile;
    }

    public void setBackgroundTile(boolean backgroundTile) {
        this.backgroundTile = backgroundTile;
    }

    public String getBackgroundBrightness() {
        return backgroundBrightness;
    }

    public void setBackgroundBrightness(String backgroundBrightness) {
        this.backgroundBrightness = backgroundBrightness;
    }

    public boolean isCanBePublic() {
        return canBePublic;
    }

    public void setCanBePublic(boolean canBePublic) {
        this.canBePublic = canBePublic;
    }

    public boolean isCanBeOrg() {
        return canBeOrg;
    }

    public void setCanBeOrg(boolean canBeOrg) {
        this.canBeOrg = canBeOrg;
    }

    public boolean isCanBePrivate() {
        return canBePrivate;
    }

    public void setCanBePrivate(boolean canBePrivate) {
        this.canBePrivate = canBePrivate;
    }

    public boolean isCanInvite() {
        return canInvite;
    }

    public void setCanInvite(boolean canInvite) {
        this.canInvite = canInvite;
    }

    @Override
    public String toString() {
        return "Prefs{" +
                "permissionLevel='" + permissionLevel + '\'' +
                ", voting='" + voting + '\'' +
                ", comments='" + comments + '\'' +
                ", invitations='" + invitations + '\'' +
                ", selfJoin=" + selfJoin +
                ", cardCovers=" + cardCovers +
                ", cardAging='" + cardAging + '\'' +
                ", calendarFeedEnabled=" + calendarFeedEnabled +
                ", background='" + background + '\'' +
                ", backgroundImage='" + backgroundImage + '\'' +
                ", backgroundImageScaled=" + backgroundImageScaled +
                ", backgroundTile=" + backgroundTile +
                ", backgroundBrightness='" + backgroundBrightness + '\'' +
                ", canBePublic=" + canBePublic +
                ", canBeOrg=" + canBeOrg +
                ", canBePrivate=" + canBePrivate +
                ", canInvite=" + canInvite +
                '}';
    }
}
