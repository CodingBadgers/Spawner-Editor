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
public class EntitySilverFish extends Entity {

    public EntitySilverFish() {
        super("SilverFish");
    }

    @Override
    public boolean hasArmourSlots() {
        return false;
    }

    @Override
    public int getHealth() {
        return 8;
    }
    
    @Override
    public String getSaveID() {
        return "Silverfish";
    }
    
}
