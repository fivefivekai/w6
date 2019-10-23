package unsw.infs.jingdianli.recyclerviewproj;

import java.util.List;

public class Gson {

    com.google.gson.Gson gson = new com.google.gson.Gson();
    String jsonString = FakeAPI.getMostViewedStoriesJsonString();
    response response = gson.fromJson(jsonString, response.class);
    List<Meida> dataSource = response.getMedia();
}
