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
public class EntityWitherSkeleton extends Entity {

    public EntityWitherSkeleton() {
        super("WitherSkeleton");
    }

    @Override
    public boolean hasArmourSlots() {
        return true;
    }

    @Override
    public int getHealth() {
        return 20;
    }
    
    @Override
    public String getSaveID() {
        return "Skeleton";
    }
    
}
