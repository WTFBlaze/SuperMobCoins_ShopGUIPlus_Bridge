# SuperMobCoins ShopGUIPlus Bridge
A Spigot plugin designed to bridge SuperMobCoins with ShopGUI+

## Installation
- Install ShopGUI+ into your plugins folder
- Install SuperMobCoins into your plugins folder
- Install this plugin into your plugins folder
- Start your server
- Let the config files & folders get created
- Stop your server
- Inside of ShopGUI+'s Config change

```
economyTypes:
 - VAULT
```
to have `- Custom` added as well.
```
economyTypes:
 - VAULT
 - CUSTOM
```

- Add `economy: CUSTOM` to any of you shop.yml files to have them support MobCoins.
