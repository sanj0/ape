package de.sanj0.ape;

/**
 * An {@link ApeEntity} that is
 * a box.
 */
public class BoxEntity extends Box implements ApeEntity {

    public BoxEntity(final ApeVec2d min, final ApeVec2d max) {
        super(min, max);
    }

    public BoxEntity(final ApeVec2d pos, final double w, final double h) {
        super(pos, w, h);
    }

    @Override
    public ApeVec2d position() {
        return super.getMin();
    }

    @Override
    public Box boundingBox() {
        return new Box(new ApeVec2d(getMin()), new ApeVec2d(getMax()));
    }

    @Override
    public boolean intersectsBox(final Box b) {
        return super.intersects(b);
    }

    @Override
    public boolean intersects(final ApeEntity e) {
        return intersectsBox(e.boundingBox());
    }
}
