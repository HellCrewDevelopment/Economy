package net.kejax.economyplugin;

import org.bukkit.entity.Player;

public interface Database {

    public void connect();

    public boolean createAccount(Player player);

    public int depositMoney(Player player);

    public int depositMoney(String playername);

}
