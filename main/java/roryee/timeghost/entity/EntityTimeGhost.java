package roryee.timeghost.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * @author roryee https://github.com/roryee
 */
public class EntityTimeGhost extends EntityTG {
    public EntityTimeGhost(World world) {
        super(world);
        setSize(1.5f, 0.6f);
    }

    @Override
    public boolean interactFirst(EntityPlayer player) {
        if (!worldObj.isRemote && riddenByEntity == null) {
            player.mountEntity(this);
            return true;
        }
        return false;
    }

    @Override
    public double getMountedYOffset() {
        return -0.15;
    }

    @Override
    public void onUpdate(){
        super.onUpdate();

        if(!worldObj.isRemote){
            if(riddenByEntity != null){
                motionY = 0.2;
            }else if(worldObj.isAirBlock((int)posX, (int)posY - 1, (int)posZ)){
                motionY = -0.2;
            }else {
                motionY = 0;
            }
        }

        setPosition(posX + motionX, posY + motionY, posZ + motionZ);
    }

    private void sendMessage(){
        boolean state = Minecraft.getMinecraft().gameSettings.keyBindForward.getIsKeyPressed();

    }
}
