package net.spicesoftware.api.gui;

import net.spicesoftware.api.util.ReflectionToString;
import net.spicesoftware.api.util.ToString;

import static net.spicesoftware.api.util.Validate.nullNot;

/**
 * @since 2015/11/07
 */
public interface WindowTitleElementProgressFormat {

    String format(WindowTitleElementProgress titleElementProgress);

    static WindowTitleElementProgressFormat simpleFormat(RoundingType roundingType) {
        return new Simple(roundingType);
    }

    class Simple implements WindowTitleElementProgressFormat {

        @ToString
        private RoundingType roundingType;

        public Simple(RoundingType roundingType) {
            nullNot(roundingType);
            this.roundingType = roundingType;
        }

        @Override
        public String format(WindowTitleElementProgress titleElementProgress) {
            nullNot(titleElementProgress);
            return roundingType.apply(titleElementProgress.getNumerator() / titleElementProgress.getDenominator() * 100) + "%";
        }

        @Override
        public String toString() {
            return ReflectionToString.rts(this);
        }
    }

    enum RoundingType {
        CEIL, ROUND, FLOOR;

        public int apply(double percent) {
            switch (this) {
                case CEIL:
                    return (int) Math.round(percent);
                case ROUND:
                    return (int) Math.round(percent);
                case FLOOR:
                    return (int) Math.floor(percent);
            }
            throw new ArithmeticException();
        }
    }
}
