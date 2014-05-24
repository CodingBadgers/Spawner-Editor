/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.samoatesgames.spawnereditor.entities.passive;

import uk.samoatesgames.spawnereditor.entities.Entity;

/**
 *
 * @author n3wton
 */
public class EntityIronGolem extends Entity {

    public EntityIronGolem() {
        super("IronGolem");
    }
    
    @Override
    public boolean hasArmourSlots() {
        return false;
    }
    
    @Override
    public int getHealth() {
        return 100;
    }
    
    @Override
    public String getSaveID() {
        return "VillagerGolem";
    }
    
}
