package stevekung.mods.moreplanets.module.planets.diona.entity;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import stevekung.mods.moreplanets.init.MPPotions;

public class EntityInfectedCrystallizeBomb extends EntityThrowable
{
    public EntityInfectedCrystallizeBomb(World world)
    {
        super(world);
    }

    public EntityInfectedCrystallizeBomb(World world, EntityLivingBase thrower)
    {
        super(world, thrower);
    }

    public EntityInfectedCrystallizeBomb(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }

    @Override
    protected void onImpact(MovingObjectPosition moving)
    {
        if (moving.entityHit != null)
        {
            moving.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 5.0F);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
            List<EntityLivingBase> list = this.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().expand(2.5D, 2.5D, 2.5D));
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 1.0F + this.rand.nextFloat(), true);
            this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "moreplanets:block.egg.destroy", 1.5F, 1.0F);

            for (EntityLivingBase living : list)
            {
                living.addPotionEffect(new PotionEffect(MPPotions.INFECTED_CRYSTALLIZE.id, 128, 1));
            }
        }
    }
}