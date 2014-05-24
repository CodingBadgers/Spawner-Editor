/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.samoatesgames.spawnereditor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author n3wton
 */
public class Equiptment {
    
    public class Enchantment
    {
        public int id;
        public int level;
        public String name;
    }
    
    public final int id;
    public final String name;
    public final List<Enchantment> enchantments;    
    
    public Equiptment(int id, String name)
    {
        System.out.println("Creating equiptment - " + id + ", name " + name + ".");
        this.id = id;
        this.name = name;
        this.enchantments = new ArrayList<>();
    }
    
    public void addEnchantment(int id, int level, String name)
    {
        System.out.println("Adding enchantment - " + id + ", level " + level + ". " + name);
        
        Enchantment enchant = new Enchantment();
        enchant.id = id;
        enchant.level = level;
        enchant.name = name;
        this.enchantments.add(enchant);
    }
    
}
