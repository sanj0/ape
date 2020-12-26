package de.sanj0.ape;

/**
 * An {@link ApeEntity} that is
 * a box.
 */
//TODO(sanj0): additional constructors for mass etc.
public class BoxEntity extends Box implements ApeEntity {

    private final StateChangingVec2d force = new StateChangingVec2d(0, 0);
    private final StateChangingVec2d velocity = new StateChangingVec2d(0, 0);

    private double mass = 1;

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
    public StateChangingVec2d force() {
        return force;
    }

    @Override
    public StateChangingVec2d velocity() {
        return velocity;
    }

    @Override
    public double mass() {
        return mass;
    }

    @Override
    public void setMass(final double mass) {
        this.mass = mass;
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
