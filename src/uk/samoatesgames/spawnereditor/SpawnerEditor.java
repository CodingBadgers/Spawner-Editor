/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.samoatesgames.spawnereditor;

import com.evilco.mc.nbt.stream.NbtOutputStream;
import com.evilco.mc.nbt.tag.ITag;
import com.evilco.mc.nbt.tag.TagByte;
import com.evilco.mc.nbt.tag.TagByteArray;
import com.evilco.mc.nbt.tag.TagCompound;
import com.evilco.mc.nbt.tag.TagDouble;
import com.evilco.mc.nbt.tag.TagFloat;
import com.evilco.mc.nbt.tag.TagInteger;
import com.evilco.mc.nbt.tag.TagList;
import com.evilco.mc.nbt.tag.TagLong;
import com.evilco.mc.nbt.tag.TagShort;
import com.evilco.mc.nbt.tag.TagString;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;
import javax.swing.JFileChooser;
import uk.samoatesgames.spawnereditor.entities.Entity;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityBlaze;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityCaveSpider;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityCreeper;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityEnderDragon;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityEnderman;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityGhast;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityGiant;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityMagmaCube;
import uk.samoatesgames.spawnereditor.entities.hostile.EntitySilverFish;
import uk.samoatesgames.spawnereditor.entities.hostile.EntitySkeleton;
import uk.samoatesgames.spawnereditor.entities.hostile.EntitySlime;
import uk.samoatesgames.spawnereditor.entities.hostile.EntitySpider;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityWitch;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityWither;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityWitherSkeleton;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityZombie;
import uk.samoatesgames.spawnereditor.entities.hostile.EntityZombiePigman;
import uk.samoatesgames.spawnereditor.entities.passive.EntityBat;
import uk.samoatesgames.spawnereditor.entities.passive.EntityChicken;
import uk.samoatesgames.spawnereditor.entities.passive.EntityCow;
import uk.samoatesgames.spawnereditor.entities.passive.EntityHorse;
import uk.samoatesgames.spawnereditor.entities.passive.EntityIronGolem;
import uk.samoatesgames.spawnereditor.entities.passive.EntityMooshroom;
import uk.samoatesgames.spawnereditor.entities.passive.EntityOcelot;
import uk.samoatesgames.spawnereditor.entities.passive.EntityPig;
import uk.samoatesgames.spawnereditor.entities.passive.EntitySheep;
import uk.samoatesgames.spawnereditor.entities.passive.EntitySnowGolem;
import uk.samoatesgames.spawnereditor.entities.passive.EntitySquid;
import uk.samoatesgames.spawnereditor.entities.passive.EntityVillager;
import uk.samoatesgames.spawnereditor.entities.passive.EntityWolf;

/**
 *
 * @author n3wton
 */
public class SpawnerEditor extends javax.swing.JFrame {

    private static SpawnerEditor Editor = null;
    
    private Map<String, Entity> m_entities = null;
    
    private final Map<String, Equiptment> m_equiptment = new HashMap<>();
    
    /**
     * Creates new form MainEditor
     */
    public SpawnerEditor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        m_spinnerHealth = new javax.swing.JSpinner();
        m_textName = new javax.swing.JTextField();
        m_comboEntityType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m_canPickupLoot = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        m_invulnerable = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        m_buttonChestplate = new javax.swing.JButton();
        m_buttonWeapon = new javax.swing.JButton();
        m_buttonHelmet = new javax.swing.JButton();
        m_buttonLeggings = new javax.swing.JButton();
        m_buttonBoots = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SpawnerEditor - 0.0.1");
        setResizable(false);

        jButton1.setText("Create Spawner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCreateSpawnerClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "General"));

        jLabel3.setText("Health");

        m_spinnerHealth.setValue(20);

        m_comboEntityType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_comboEntityTypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Spawn Type");

        jLabel2.setText("Name");

        jLabel4.setText("Can Pick Up Loot");
        jLabel4.setEnabled(false);

        m_canPickupLoot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "True", "False" }));
        m_canPickupLoot.setEnabled(false);

        jLabel5.setText("Invulnerable");

        m_invulnerable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "True", "False" }));
        m_invulnerable.setSelectedIndex(1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_textName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(m_comboEntityType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m_spinnerHealth)
                            .addComponent(m_canPickupLoot, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addComponent(m_invulnerable, 0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_comboEntityType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(m_textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(m_spinnerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_canPickupLoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_invulnerable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Equiptment"));

        m_buttonChestplate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/samoatesgames/spawnereditor/resources/chestplate.fw.png"))); // NOI18N
        m_buttonChestplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onChestClicked(evt);
            }
        });

        m_buttonWeapon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/samoatesgames/spawnereditor/resources/sword.fw.png"))); // NOI18N
        m_buttonWeapon.setAlignmentY(0.0F);
        m_buttonWeapon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        m_buttonWeapon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onWeaponClicked(evt);
            }
        });

        m_buttonHelmet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/samoatesgames/spawnereditor/resources/helmet.fw.png"))); // NOI18N
        m_buttonHelmet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onHelmetClicked(evt);
            }
        });

        m_buttonLeggings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/samoatesgames/spawnereditor/resources/leggings.fw.png"))); // NOI18N
        m_buttonLeggings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLeggingsClick(evt);
            }
        });

        m_buttonBoots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uk/samoatesgames/spawnereditor/resources/boots.fw.png"))); // NOI18N
        m_buttonBoots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBootsClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_buttonWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_buttonHelmet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_buttonChestplate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_buttonLeggings, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_buttonBoots, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_buttonWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_buttonChestplate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_buttonHelmet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_buttonLeggings, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_buttonBoots, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_comboEntityTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_comboEntityTypeActionPerformed
        
        String type = (String) Editor.m_comboEntityType.getSelectedItem();
        Entity entity = Editor.m_entities.get(type);
        
        // Update name text
        Editor.m_textName.setText(type);
        
        // Set health
        Editor.m_spinnerHealth.setValue(entity.getHealth());
        
        // Enable weapon button
        Editor.m_buttonWeapon.setEnabled(entity.hasArmourSlots());
        
        // Enable armour buttons
        Editor.m_buttonHelmet.setEnabled(entity.hasArmourSlots());
        Editor.m_buttonChestplate.setEnabled(entity.hasArmourSlots());
        Editor.m_buttonLeggings.setEnabled(entity.hasArmourSlots());
        Editor.m_buttonBoots.setEnabled(entity.hasArmourSlots());
        
        // Enable can pickup
        Editor.jLabel4.setEnabled(entity.hasArmourSlots());
        Editor.m_canPickupLoot.setEnabled(entity.hasArmourSlots());
        
    }//GEN-LAST:event_m_comboEntityTypeActionPerformed

    private void onWeaponClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onWeaponClicked
        openEquiptmentEditor("Weapon", 276);        
    }//GEN-LAST:event_onWeaponClicked

    private void onHelmetClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onHelmetClicked
        openEquiptmentEditor("Helmet", 310);    
    }//GEN-LAST:event_onHelmetClicked

    private void onChestClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onChestClicked
        openEquiptmentEditor("Chestplate", 311);    
    }//GEN-LAST:event_onChestClicked

    private void onLeggingsClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLeggingsClick
        openEquiptmentEditor("Leggings", 312);    
    }//GEN-LAST:event_onLeggingsClick

    private void onBootsClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBootsClick
        openEquiptmentEditor("Boots", 313);    
    }//GEN-LAST:event_onBootsClick

    private void onCreateSpawnerClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCreateSpawnerClicked
        
        // Ask where to save
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new SchematicFileFilter());
                
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getAbsolutePath().endsWith(".schematic"))
            {
                file = new File(file.getAbsolutePath() + ".schematic");
            }            
            saveSpawner(file);
        }

    }//GEN-LAST:event_onCreateSpawnerClicked

    private Entity getEntity()
    {
        String type = (String) Editor.m_comboEntityType.getSelectedItem();
        return Editor.m_entities.get(type);
    }
    
    private String getEntityType()
    {

        return getEntity().getSaveID();
    }
    
    private int getHealth()
    {
        return (Integer)m_spinnerHealth.getValue();
    }
    
    private String getCustomName()
    {
        return m_textName.getText();
    }
    
    private byte canPickupLoot()
    {
        if (!getEntity().hasArmourSlots())
        {
            return (byte)0;
        }
        
        return ((String)Editor.m_canPickupLoot.getSelectedItem()).equalsIgnoreCase("True") ? (byte)1 : (byte)0;
    }
    
    private byte isInvunerable()
    {
        return ((String)Editor.m_invulnerable.getSelectedItem()).equalsIgnoreCase("True") ? (byte)1 : (byte)0;
    }
    
    private List<ITag> getAttributes()
    {
        List<ITag> attributes = new ArrayList<>();
        
        TagCompound maxHealth = new TagCompound("");
        maxHealth.setTag(new TagDouble("Base", (double)getHealth()));
        maxHealth.setTag(new TagString("Name", "generic.maxHealth"));        
        attributes.add(maxHealth);
        
        return attributes;
    }
    
    private void saveSpawner(File saveLocation)
    {
        
        System.out.println("Saving to: " + saveLocation.getAbsolutePath());
        
        try {
            if (saveLocation.exists())
            {
                saveLocation.delete();
            }
            
            saveLocation.createNewFile();
                        
            // create output stream
            FileOutputStream outputStream = new FileOutputStream (saveLocation);
            GZIPOutputStream zipStream = new GZIPOutputStream(outputStream);
            NbtOutputStream nbtOutputStream = new NbtOutputStream (zipStream);

            // write data
            TagCompound schematic = new TagCompound ("Schematic");
            
            schematic.setTag(new TagShort("Width", (short)1));
            schematic.setTag(new TagShort("Height", (short)1));
            schematic.setTag(new TagShort("Length", (short)1));
            
            schematic.setTag(new TagString("Materials", "Alpha"));
            
            schematic.setTag(new TagByteArray("Blocks", new byte[] { 52 }));
            schematic.setTag(new TagByteArray("Data", new byte[] { 0 }));
            
            schematic.setTag(new TagList("Entities", new ArrayList<ITag>()));
            
            // Main data
            TagCompound spawnerTileEntity = new TagCompound("");
                        
            spawnerTileEntity.setTag(new TagInteger("x", 0));
            spawnerTileEntity.setTag(new TagInteger("y", 0));
            spawnerTileEntity.setTag(new TagInteger("z", 0));
            spawnerTileEntity.setTag(new TagString("id", "MobSpawner"));
            spawnerTileEntity.setTag(new TagList("Items", new ArrayList<ITag>()));
            
            spawnerTileEntity.setTag(new TagString("EntityId", getEntityType())); // Type
            spawnerTileEntity.setTag(new TagShort("Delay", (short)120)); // delay
            
            TagCompound spawnData = new TagCompound("SpawnData");
            spawnerTileEntity.setTag(spawnData);
            
            spawnData.setTag(new TagByte("CanPickUpLoot", canPickupLoot()));
            spawnData.setTag(new TagByte("Invulnerable", isInvunerable()));
            spawnData.setTag(new TagByte("Leashed", (byte)0));
            spawnData.setTag(new TagByte("OnGround", (byte)1));
            spawnData.setTag(new TagByte("PersistenceRequired", (byte)0));
            
            spawnData.setTag(new TagShort("AttackTime", (short)0));
            spawnData.setTag(new TagShort("DeathTime", (short)0));
            spawnData.setTag(new TagShort("HurtTime", (short)0));
            spawnData.setTag(new TagByte("CustomNameVisible", (byte)1));
            
            spawnData.setTag(new TagShort("Air", (short)300));
            spawnData.setTag(new TagShort("Fire", (short)0));
            spawnData.setTag(new TagShort("Health", (short)getHealth()));            
            
            spawnData.setTag(new TagInteger("Dimension", 0));
            spawnData.setTag(new TagInteger("PortalCooldown", 0));
            
            spawnData.setTag(new TagLong("UUIDLeast", 0L)); //todo:so
            spawnData.setTag(new TagLong("UUIDMost", 0L)); //todo:so
            
            spawnData.setTag(new TagFloat("AbsorptionAmount", 0.0f));
            spawnData.setTag(new TagFloat("FallDistance", 0.0f));
            spawnData.setTag(new TagFloat("HealF", (float)getHealth()));
            
            spawnData.setTag(new TagString("CustomName", getCustomName()));
            spawnData.setTag(new TagString("EntityId", getEntityType()));
            
            // Effects
            spawnData.setTag(new TagList("ActiveEffects", new ArrayList<ITag>()));
            
            // Attributes
            spawnData.setTag(new TagList("Attributes", getAttributes()));
            
            // Drop Chances
            spawnData.setTag(new TagList("DropChances", new ArrayList<ITag>()));
            
            // Equipment
            spawnData.setTag(new TagList("Equipment", new ArrayList<ITag>()));
            
            // Motion
            spawnData.setTag(new TagList("Motion", new ArrayList<ITag>()));
            
            // Rotation
            spawnData.setTag(new TagList("Rotation", new ArrayList<ITag>()));
            
            // Add the till entities data
            List<ITag> tileEntities = new ArrayList<>();
            tileEntities.add(spawnerTileEntity);
            schematic.setTag(new TagList("TileEntities", tileEntities));
                        
            // Write it out
            nbtOutputStream.write (schematic);
            
            nbtOutputStream.close();
            outputStream.close();
            
        } catch (IOException ex) {
            Logger.getLogger(SpawnerEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void openEquiptmentEditor(final String equiptmentSlot, final int defaultID) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
        
                Equiptment currentEquiptment = null;
                if (m_equiptment.containsKey(equiptmentSlot))
                {
                    currentEquiptment = m_equiptment.get(equiptmentSlot);
                }
                
                final EquiptmentEditor editor = new EquiptmentEditor(currentEquiptment, defaultID);
                
                editor.setLocationRelativeTo(Editor);
                
                editor.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                        
                        // Save equiptment
                        Equiptment equiptment = editor.getEquiptment();
                        m_equiptment.put (equiptmentSlot, equiptment);
                    }
                });
                
                editor.setVisible(true);
                
            }
        });
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpawnerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpawnerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpawnerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpawnerEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Editor = new SpawnerEditor();
        Editor.m_entities = new HashMap<>();
        
        // Peaceful
        Editor.m_entities.put("Bat", new EntityBat());        
        Editor.m_entities.put("Pig", new EntityPig());
        Editor.m_entities.put("Sheep", new EntitySheep()); 
        Editor.m_entities.put("Cow", new EntityCow()); 
        Editor.m_entities.put("Chicken", new EntityChicken()); 
        Editor.m_entities.put("Squid", new EntitySquid()); 
        Editor.m_entities.put("Wolf", new EntityWolf()); 
        Editor.m_entities.put("Mooshroom", new EntityMooshroom()); 
        Editor.m_entities.put("Snow Golem", new EntitySnowGolem()); 
        Editor.m_entities.put("Ocelot", new EntityOcelot()); 
        Editor.m_entities.put("Iron Golem", new EntityIronGolem()); 
        Editor.m_entities.put("Horse", new EntityHorse()); 
        Editor.m_entities.put("Villager", new EntityVillager());
        
        // Hostile
        Editor.m_entities.put("Creeper", new EntityCreeper());
        Editor.m_entities.put("Skeleton", new EntitySkeleton());
        Editor.m_entities.put("Wither Skeleton", new EntityWitherSkeleton());
        Editor.m_entities.put("Spider", new EntitySpider());
        Editor.m_entities.put("Zombie Giant", new EntityGiant());
        Editor.m_entities.put("Zombie", new EntityZombie());
        Editor.m_entities.put("Slime", new EntitySlime());
        Editor.m_entities.put("Ghast", new EntityGhast());
        Editor.m_entities.put("Zombie Pigman", new EntityZombiePigman());
        Editor.m_entities.put("Enderman", new EntityEnderman());
        Editor.m_entities.put("Cave Spider", new EntityCaveSpider());
        Editor.m_entities.put("Silverfish", new EntitySilverFish());
        Editor.m_entities.put("Blaze", new EntityBlaze());
        Editor.m_entities.put("Magma Cube", new EntityMagmaCube());
        Editor.m_entities.put("Ender Dragon", new EntityEnderDragon());
        Editor.m_entities.put("Wither", new EntityWither());
        Editor.m_entities.put("Witch", new EntityWitch());
        //Editor.m_entities.put("Endermite", new EntityEndermite());
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                                
                List<String> entityNames = new ArrayList<>(Editor.m_entities.keySet());
                Collections.sort(entityNames);
                
                for (String entity : entityNames) {
                    Editor.m_comboEntityType.addItem(entity);
                }
                
                Editor.setLocationRelativeTo(null);
                Editor.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton m_buttonBoots;
    private javax.swing.JButton m_buttonChestplate;
    private javax.swing.JButton m_buttonHelmet;
    private javax.swing.JButton m_buttonLeggings;
    private javax.swing.JButton m_buttonWeapon;
    private javax.swing.JComboBox m_canPickupLoot;
    private javax.swing.JComboBox m_comboEntityType;
    private javax.swing.JComboBox m_invulnerable;
    private javax.swing.JSpinner m_spinnerHealth;
    private javax.swing.JTextField m_textName;
    // End of variables declaration//GEN-END:variables
}
