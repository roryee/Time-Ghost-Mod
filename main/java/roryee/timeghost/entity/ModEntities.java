package roryee.timeghost.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import roryee.timeghost.TimeGhostMod;
import roryee.timeghost.reference.IDs;
import roryee.timeghost.reference.Names;

/**
 * @author roryee https://github.com/roryee
 */
public class ModEntities {

    public static void init(){
        EntityRegistry.registerModEntity(EntityTimeGhost.class, Names.Entities.TIME_GHOST_NAME, IDs.Entities.ENTITY_ID, TimeGhostMod.instance, 80, 3, true);
    }
}
