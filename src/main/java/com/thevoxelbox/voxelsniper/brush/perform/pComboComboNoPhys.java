/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thevoxelbox.voxelsniper.brush.perform;

import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;

import com.thevoxelbox.voxelsniper.Message;

/**
 * @author Voxel
 */
public class pComboComboNoPhys extends vPerformer
{

    private BlockData vd;
    private BlockData rd;

    public pComboComboNoPhys()
    {
        name = "Combo-Combo No-Physics";
    }

    @Override
    public void init(com.thevoxelbox.voxelsniper.SnipeData v)
    {
        w = v.getWorld();
        vd = v.getVoxelData();
        rd = v.getReplaceData();
    }

    @Override
    public void info(Message vm)
    {
        vm.performerName(name);
        vm.voxel();
        vm.replace();
    }

    @Override
    public void perform(Block b)
    {
        if (b.getBlockData().matches(rd))
        {
            h.put(b);
            b.setBlockData(vd, false);
        }
    }

    @Override
    public boolean isUsingReplaceMaterial()
    {
        return true;
    }
}