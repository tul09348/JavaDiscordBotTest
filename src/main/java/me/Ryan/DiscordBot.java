package me.Ryan;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class DiscordBot {
    public static void main(String[] args) throws LoginException {
        JDA bot = JDABuilder.createDefault("MTAxOTQzNjg4NzMyMjE0ODkzNA.GZ-GOG.rZMI84Di85_OJzliRrqEg-zmkmNj3QjXK3IMpo")
                .setActivity(Activity.playing("Testing...."))
                .build();
    }
}
