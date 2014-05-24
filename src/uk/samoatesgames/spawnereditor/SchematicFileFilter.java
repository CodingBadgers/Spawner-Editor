/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.samoatesgames.spawnereditor;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author n3wton
 */
public class SchematicFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        
        String filePath = f.getAbsolutePath();
        String extension = filePath.substring(filePath.lastIndexOf('.') + 1).toLowerCase();
        if (extension != null) {
            if (extension.equals("schematic")) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public String getDescription() {
        return "Schematic (.schematic)";
    }
    
}
