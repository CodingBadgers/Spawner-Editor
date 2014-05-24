/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.samoatesgames.spawnereditor.entities.hostile;

import uk.samoatesgames.spawnereditor.entities.Entity;

/**
 *
 * @author n3wton
 */
public class EntityWither extends Entity {

    public EntityWither() {
        super("Wither");
    }

    @Override
    public boolean hasArmourSlots() {
        return false;
    }

    @Override
    public int getHealth() {
        return 300;
    }
    
    @Override
    public String getSaveID() {
        return "WitherBoss";
    }
    
}
