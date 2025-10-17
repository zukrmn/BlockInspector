package com.blockycraft.inspector;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockInspector extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("[BlockInspector] Ativado. Clique com o botao direito em um bloco, segurando um graveto, para inspeciona-lo.");
    }

    @Override
    public void onDisable() {
        System.out.println("[BlockInspector] Desativado.");
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        
        // Verifica se a ação foi um clique direito em um bloco e se o jogador está segurando um graveto
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK && player.getItemInHand().getType() == Material.STICK) {
            Block clickedBlock = event.getClickedBlock();
            Material blockType = clickedBlock.getType();
            byte blockData = clickedBlock.getData();

            System.out.println("==============================================");
            System.out.println("[BlockInspector] Bloco inspecionado por " + player.getName() + ":");
            System.out.println("  -> Nome do Material: " + blockType.name());
            System.out.println("  -> ID do Material: " + blockType.getId());
            System.out.println("  -> Data do Bloco: " + blockData);
            System.out.println("==============================================");

            player.sendMessage("§a[Inspector] Informacao do bloco enviada para o console do servidor.");
            event.setCancelled(true); // Impede que o graveto faça outra ação (como colocar fogo, se for o caso)
        }
    }
}