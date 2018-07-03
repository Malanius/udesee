package cz.malanius.udesee.exporter.trello.pojo.member;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Member {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("avatarHash")
    @Expose
    private String avatarHash;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("bioData")
    @Expose
    private Object bioData;
    @SerializedName("confirmed")
    @Expose
    private boolean confirmed;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("idPremOrgsAdmin")
    @Expose
    private List<Object> idPremOrgsAdmin = null;
    @SerializedName("initials")
    @Expose
    private String initials;
    @SerializedName("memberType")
    @Expose
    private String memberType;
    @SerializedName("products")
    @Expose
    private List<Object> products = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("avatarSource")
    @Expose
    private Object avatarSource;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("gravatarHash")
    @Expose
    private Object gravatarHash;
    @SerializedName("idBoards")
    @Expose
    private List<String> idBoards = null;
    @SerializedName("idEnterprise")
    @Expose
    private Object idEnterprise;
    @SerializedName("idOrganizations")
    @Expose
    private List<Object> idOrganizations = null;
    @SerializedName("idEnterprisesAdmin")
    @Expose
    private List<Object> idEnterprisesAdmin = null;
    @SerializedName("loginTypes")
    @Expose
    private Object loginTypes;
    @SerializedName("oneTimeMessagesDismissed")
    @Expose
    private Object oneTimeMessagesDismissed;
    @SerializedName("prefs")
    @Expose
    private Object prefs;
    @SerializedName("trophies")
    @Expose
    private List<Object> trophies = null;
    @SerializedName("uploadedAvatarHash")
    @Expose
    private Object uploadedAvatarHash;
    @SerializedName("premiumFeatures")
    @Expose
    private List<Object> premiumFeatures = null;
    @SerializedName("idBoardsPinned")
    @Expose
    private Object idBoardsPinned;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Object getBioData() {
        return bioData;
    }

    public void setBioData(Object bioData) {
        this.bioData = bioData;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Object> getIdPremOrgsAdmin() {
        return idPremOrgsAdmin;
    }

    public void setIdPremOrgsAdmin(List<Object> idPremOrgsAdmin) {
        this.idPremOrgsAdmin = idPremOrgsAdmin;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getAvatarSource() {
        return avatarSource;
    }

    public void setAvatarSource(Object avatarSource) {
        this.avatarSource = avatarSource;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getGravatarHash() {
        return gravatarHash;
    }

    public void setGravatarHash(Object gravatarHash) {
        this.gravatarHash = gravatarHash;
    }

    public List<String> getIdBoards() {
        return idBoards;
    }

    public void setIdBoards(List<String> idBoards) {
        this.idBoards = idBoards;
    }

    public Object getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public List<Object> getIdOrganizations() {
        return idOrganizations;
    }

    public void setIdOrganizations(List<Object> idOrganizations) {
        this.idOrganizations = idOrganizations;
    }

    public List<Object> getIdEnterprisesAdmin() {
        return idEnterprisesAdmin;
    }

    public void setIdEnterprisesAdmin(List<Object> idEnterprisesAdmin) {
        this.idEnterprisesAdmin = idEnterprisesAdmin;
    }

    public Object getLoginTypes() {
        return loginTypes;
    }

    public void setLoginTypes(Object loginTypes) {
        this.loginTypes = loginTypes;
    }

    public Object getOneTimeMessagesDismissed() {
        return oneTimeMessagesDismissed;
    }

    public void setOneTimeMessagesDismissed(Object oneTimeMessagesDismissed) {
        this.oneTimeMessagesDismissed = oneTimeMessagesDismissed;
    }

    public Object getPrefs() {
        return prefs;
    }

    public void setPrefs(Object prefs) {
        this.prefs = prefs;
    }

    public List<Object> getTrophies() {
        return trophies;
    }

    public void setTrophies(List<Object> trophies) {
        this.trophies = trophies;
    }

    public Object getUploadedAvatarHash() {
        return uploadedAvatarHash;
    }

    public void setUploadedAvatarHash(Object uploadedAvatarHash) {
        this.uploadedAvatarHash = uploadedAvatarHash;
    }

    public List<Object> getPremiumFeatures() {
        return premiumFeatures;
    }

    public void setPremiumFeatures(List<Object> premiumFeatures) {
        this.premiumFeatures = premiumFeatures;
    }

    public Object getIdBoardsPinned() {
        return idBoardsPinned;
    }

    public void setIdBoardsPinned(Object idBoardsPinned) {
        this.idBoardsPinned = idBoardsPinned;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", avatarHash='" + avatarHash + '\'' +
                ", bio='" + bio + '\'' +
                ", bioData=" + bioData +
                ", confirmed=" + confirmed +
                ", fullName='" + fullName + '\'' +
                ", idPremOrgsAdmin=" + idPremOrgsAdmin +
                ", initials='" + initials + '\'' +
                ", memberType='" + memberType + '\'' +
                ", products=" + products +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", avatarSource=" + avatarSource +
                ", email=" + email +
                ", gravatarHash=" + gravatarHash +
                ", idBoards=" + idBoards +
                ", idEnterprise=" + idEnterprise +
                ", idOrganizations=" + idOrganizations +
                ", idEnterprisesAdmin=" + idEnterprisesAdmin +
                ", loginTypes=" + loginTypes +
                ", oneTimeMessagesDismissed=" + oneTimeMessagesDismissed +
                ", prefs=" + prefs +
                ", trophies=" + trophies +
                ", uploadedAvatarHash=" + uploadedAvatarHash +
                ", premiumFeatures=" + premiumFeatures +
                ", idBoardsPinned=" + idBoardsPinned +
                '}';
    }
}
