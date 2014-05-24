/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.samoatesgames.spawnereditor.entities;

/**
 *
 * @author n3wton
 */
public abstract class Entity {
    
    /**
     * 
     */
    protected final String m_name;
        
    /**
     * 
     * @param name 
     */
    public Entity(String name) {
        m_name = name;
    }
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return m_name;
    }
    
    /**
     * 
     * @return 
     */
    public abstract int getHealth();
    
    /**
     * 
     * @return 
     */
    public abstract boolean hasArmourSlots();
    
    /**
     * 
     * @return 
     */
    public abstract String getSaveID();
    
}
