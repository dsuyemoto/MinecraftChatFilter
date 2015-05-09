package com.devolutionstudio.chatfilter;

import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;

import java.util.List;

/**
 * Created by Doug on 5/9/2015.
 */
public class Chat extends GuiNewChat {


    private final List sentMessages = Lists.newArrayList();

    @Override
    public void addToSentMessages(String sentmessages)
    {
        if (this.sentMessages.isEmpty() || !((String)this.sentMessages.get(this.sentMessages.size() - 1)).equals(sentmessages))
        {
            this.sentMessages.add(sentmessages);
        }
    }

}
