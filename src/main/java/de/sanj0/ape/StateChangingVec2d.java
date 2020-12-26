package de.sanj0.ape;

/**
 * A subclass of {@link ApeVec2d}
 * that changes its components
 * and returns itself in calculation
 * methods.
 * <p>This behaviour is useful for
 * simplifying the syntax in cases where
 * a vector is changed by the library's user:
 * <p><code>myObject.force().add(1, 1)</code>
 * <br>could be written instead of
 * <br><code>myObject.setForce(myObject.force().add(1, 1))</code>
 */
public class StateChangingVec2d extends ApeVec2d {
    public StateChangingVec2d(final double x, final double y) {
        super(x, y);
    }

    public StateChangingVec2d(final ApeVec2d vec) {
        super(vec);
    }

    @Override
    public ApeVec2d add(final ApeVec2d vec) {
        return applyAndReturnSelf(super.add(vec));
    }

    @Override
    public ApeVec2d subtract(final ApeVec2d vec) {
        return applyAndReturnSelf(super.subtract(vec));
    }

    @Override
    public ApeVec2d multiply(final ApeVec2d vec) {
        return applyAndReturnSelf(super.multiply(vec));
    }

    @Override
    public ApeVec2d divide(final ApeVec2d vec) {
        return applyAndReturnSelf(super.divide(vec));
    }

    @Override
    public ApeVec2d unit() {
        return applyAndReturnSelf(super.unit());
    }

    @Override
    public ApeVec2d withMag(final double mag) {
        return applyAndReturnSelf(super.withMag(mag));
    }

    private StateChangingVec2d applyAndReturnSelf(final ApeVec2d vec) {
        setX(vec.x);
        setY(vec.y);
        return this;
    }
}
