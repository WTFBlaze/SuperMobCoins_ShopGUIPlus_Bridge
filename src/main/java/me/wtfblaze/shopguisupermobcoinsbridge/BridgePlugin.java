package me.wtfblaze.shopguisupermobcoinsbridge;

import net.brcdev.shopgui.ShopGuiPlusApi;
import net.brcdev.shopgui.event.ShopGUIPlusPostEnableEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BridgePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable()
    {
        // Check for if both required plugins are loaded
        if (getServer().getPluginManager().getPlugin("ShopGUIPlus") == null)
        {
            getLogger().severe("Cannot find ShopGUIPlus! Disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
        }

        if (getServer().getPluginManager().getPlugin("SuperMobCoins") == null)
        {
            getLogger().severe("Cannot find SuperMobCoins! Disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
        }

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void OnShopGuiPostEnabled(ShopGUIPlusPostEnableEvent e)
    {
        ShopGuiPlusApi.registerEconomyProvider(new CoinsProvider());
        getLogger().info("Registered MobCoins Economy Provider into ShopGUI+!");
    }
}
