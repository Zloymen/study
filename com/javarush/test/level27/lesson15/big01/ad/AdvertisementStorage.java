package com.javarush.test.level27.lesson15.big01.ad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zloymen on 25.07.2015.
 */
class AdvertisementStorage
{
    private static AdvertisementStorage ourInstance = new AdvertisementStorage();

    private  List<Advertisement> videos = new ArrayList<>();

    List<Advertisement>  list()
    {
        return  videos;
    }

    void add(Advertisement advertisement)
    {
        videos.add(advertisement);
    }

    private AdvertisementStorage(){
        Object someContent = new Object();
        add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min
        add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60)); //15 min
        add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60));   //10 min
    };

    static AdvertisementStorage getInstance() {
        return ourInstance;
    }

}
