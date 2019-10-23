package unsw.infs.jingdianli.recyclerviewproj;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class qwer {
    public String type;
    public String subtype;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getApproved_for_syndication() {
        return approved_for_syndication;
    }

    public void setApproved_for_syndication(int approved_for_syndication) {
        this.approved_for_syndication = approved_for_syndication;
    }

    public List<MediaMetadata> getMedia_metadata() {
        return media_metadata;
    }

    public void setMedia_metadata(List<MediaMetadata> media_metadata) {
        this.media_metadata = media_metadata;
    }

    public String captain;
    public String copyright;
    public int approved_for_syndication;
    @SerializedName("media-metadata")
    public List<MediaMetadata> media_metadata;
}
