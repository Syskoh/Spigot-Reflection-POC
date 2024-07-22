package de.syskoh.reflectionsTest;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public final class ReflectionsTest extends JavaPlugin {

    @Override
    public void onEnable() {
        Reflections reflections = new Reflections("de.syskoh.reflectionsTest");
        Set<Class<? extends Listener>> classes = reflections.getSubTypesOf(Listener.class);

        for (Class<? extends Listener> cls : classes) {
            try {
                getServer().getPluginManager().registerEvents(cls.getDeclaredConstructor().newInstance(), this);
                System.out.println("Registered " + cls.getSimpleName());

            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}