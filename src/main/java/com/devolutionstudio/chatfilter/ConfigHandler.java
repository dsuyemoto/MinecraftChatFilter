package com.devolutionstudio.chatfilter;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Doug on 5/9/2015.
 */
public class ConfigHandler {

    public static void init (File file) {

        Configuration config = new Configuration (file);

        config.load();

        int test = config.get("test category", "test key", 5).getInt();
        String test2 = config.get("test category", "test key2", "test value").getString();

        config.save();

        System.out.println(test2 + ": " + test);
    }

}
