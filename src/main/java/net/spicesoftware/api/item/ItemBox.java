package net.spicesoftware.api.item;

import net.spicesoftware.api.Box;
import net.spicesoftware.api.color.Color;
import net.spicesoftware.api.color.palette.Palette;
import net.spicesoftware.api.layer.Layer;
import net.spicesoftware.api.layer.Layerable;
import net.spicesoftware.api.layer.StaticLayer;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

/**
 * @since 2014/10/04
 */
public interface ItemBox extends Item, Box {

    @Override
    ItemBox copyDeeply();
}
