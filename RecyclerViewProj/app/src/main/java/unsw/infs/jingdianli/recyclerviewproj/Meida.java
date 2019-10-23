package unsw.infs.jingdianli.recyclerviewproj;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Meida {
    public long id;
    public String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String get_abstract() {
        return _abstract;
    }

    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public List<qwer> getMedia() {
        return media;
    }

    public void setMedia(List<qwer> media) {
        this.media = media;
    }

    public String byline;
    @SerializedName("abstract")
    public String _abstract;
    public String url;
    public String publish_date;
    public List<qwer> media;
}
