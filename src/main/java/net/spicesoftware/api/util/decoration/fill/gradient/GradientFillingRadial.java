package net.spicesoftware.api.util.decoration.fill.gradient;

import net.spicesoftware.api.decoration.fill.Color;
import net.spicesoftware.api.util.vector.Vector2i;

import java.util.Map;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * 円形グラデーションです。
 *
 * @since 2015/02/01
 */
public abstract class GradientFillingRadial<T extends Color> extends ColorStopGradientFilling<T> {

    private final int centerXPos;
    private final int centerYPos;

    public GradientFillingRadial(Map<Integer, T> colorStopMap, boolean repeating, int centerXPos, int centerYPos) {
        super(colorStopMap, repeating);
        this.centerXPos = centerXPos;
        this.centerYPos = centerYPos;
    }

    public GradientFillingRadial(GradientFillingRadial<T> copyFrom) {
        super(copyFrom);
        this.centerXPos = copyFrom.centerXPos;
        this.centerYPos = copyFrom.centerYPos;
    }

    @Override
    public abstract GradientFillingRadial<T> copyDeeply();

    protected static abstract class GradientFillingRadialBasicBuilder<T extends Color> extends ColorStopGradientFillingBasicBuilder<T> {

        protected int centerXPos;
        protected int centerYPos;

        public void radialCenter(int centerXPos, int centerYPos) {
            this.centerXPos = centerXPos;
            this.centerYPos = centerYPos;
        }

        public void radialCenter(Vector2i centerPos) {
            nullNot(centerPos);
            radialCenter(centerPos.x, centerPos.y);
        }

        @Override
        public abstract GradientFillingRadial<T> build();
    }
}
