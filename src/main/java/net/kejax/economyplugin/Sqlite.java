package net.kejax.economyplugin;

import org.bukkit.entity.Player;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlite implements Database{

    private Connection conn;

    @Override
    public void connect() {

        File directory = EconomyPlugin.plugin.getDataFolder();

        if (!directory.exists()) { directory.mkdir(); }

        String path = directory.getAbsolutePath() + "/economy.db";

        try {

            conn = DriverManager.getConnection("jdbc:sqlite:" + path);

            Statement stmt = conn.createStatement();

            stmt.execute(
                    "CREATE TABLE IF NOT EXISTS accounts (" +
                            "uuid TEXT," +
                            "privateAccount" +
                            ")"
            );

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            EconomyPlugin.pluginManager.disablePlugin(EconomyPlugin.plugin);
        }

    }

    @Override
    public boolean createAccount(Player player) {
        return false;
    }

    @Override
    public int depositMoney(Player player) {
        return 0;
    }

    @Override
    public int depositMoney(String playername) {
        return 0;
    }
}
