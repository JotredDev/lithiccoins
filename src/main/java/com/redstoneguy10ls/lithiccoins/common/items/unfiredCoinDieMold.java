package com.redstoneguy10ls.lithiccoins.common.items;

import com.redstoneguy10ls.lithiccoins.util.LCHelpers;
import com.redstoneguy10ls.lithiccoins.util.tooltips;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;

import java.util.Optional;

public class unfiredCoinDieMold extends Item {
    public unfiredCoinDieMold(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack stack)
    {
        if (ModList.get().isLoaded("jei")) {
            return Optional.of(new tooltips.CoinImageTooltip(1, 1, LCHelpers.getStamptype(stack.getItem())));
        }
        else {
            return Optional.empty();
        }
    }
}
