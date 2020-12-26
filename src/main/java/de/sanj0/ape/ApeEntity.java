package de.sanj0.ape;

/**
 * An ApeEntity is an entity in the
 * simulated world. This interface
 * specifies basic functionality
 * every entity in said world has
 * to offer to properly interact
 * with the other entities and the
 * world itself.
 */
public interface ApeEntity {

    /**
     * Returns the position of
     * this entity which is always
     * the top left corner of its
     * bounding box.
     *
     * @return the position of this entity
     */
    ApeVec2d position();

    /**
     * Returns the bounding {@link Box box}
     * of this entity which is the
     * smallest possible box that fully
     * contains this entity.
     *
     * @return the bounding box of this entity
     */
    Box boundingBox();

    /**
     * Returns true if this
     * entity and the given {@link Box box}
     * intersect ("collide").
     *
     * @param b a box
     * @return true is this entity and the given box intersect
     */
    boolean intersectsBox(final Box b);

    /**
     * Return true if this entity
     * and the given one intersect
     * ("collide").
     *
     * @param e another entity
     * @return true if this entity and the given one intersect
     */
    boolean intersects(final ApeEntity e);

    /**
     * Moves this entity by the
     * given {@link ApeVec2d vector}.
     *
     * @param sv the vector by which to move this entity
     */
    void move(final ApeVec2d sv);

    /**
     * Moves this entity by the
     * given x and y distances using
     * {@link #move(ApeVec2d)}.
     *
     * @param sx the desired shift in the x direction
     * @param sy the desired shift in the y direction
     */
    default void move(final double sx, final double sy) {
        move(new ApeVec2d(sx, sy));
    }
}
