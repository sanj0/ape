package de.sanj0.ape;

import java.util.Objects;

/**
 * A two-dimensional vector.
 * All calculation methods are
 * implemented to not modify
 * the original vector but rather
 * return a new one as the result
 * of the calculation.
 */
//TODO(sanj0): WRITE TESTS
public class ApeVec2d {

    protected double x;
    protected double y;

    public ApeVec2d(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Sets the x and y components
     * of this vector to be equal
     * to the x and y components
     * of the given vector.
     *
     * @param vec the vector to copy x and y component from
     */
    public ApeVec2d(final ApeVec2d vec) {
        this(vec.x, vec.y);
    }

    public ApeVec2d add(final ApeVec2d vec) {
        return new ApeVec2d(x + vec.x, y + vec.y);
    }

    public ApeVec2d subtract(final ApeVec2d vec) {
        return new ApeVec2d(x - vec.x, y - vec.y);
    }

    public ApeVec2d multiply(final ApeVec2d vec) {
        return new ApeVec2d(x * vec.x, y * vec.y);
    }

    public ApeVec2d divide(final ApeVec2d vec) {
        return new ApeVec2d(x / vec.x, y / vec.y);
    }

    /**
     * Returns the unit vector
     * of this vector, which is
     * the vector with the exact
     * direction of this, but a
     * magnitude of 1.
     *
     * @return the unit vector of this vector
     */
    public ApeVec2d unit() {
        final double mag = mag();
        return new ApeVec2d(x / mag, y / mag);
    }

    /**
     * Returns a new vector with
     * the exact direction of this
     * one but the given magnitude.
     *
     * @param mag the magnitude of the returned vector
     * @return a new vector with the exact direction of this
     * vector but with the given magnitude
     */
    public ApeVec2d withMag(final double mag) {
        final double factor = mag / mag();
        return new ApeVec2d(x * factor, y * factor);
    }

    /**
     * Returns the square of the
     * magnitude of this vector.
     *
     * @return the square of this vector's magnitude
     * @see #mag()
     */
    public double magSquared() {
        return x * x + y * y;
    }

    /**
     * Returns the magnitude of this
     * vector. Whenever possible,
     * {@link #magSquared()} should be
     * used instead, as taking the square
     * root requires a lot of performance.
     *
     * @return this vector's magnitude
     */
    public double mag() {
        return Math.sqrt(magSquared());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ApeVec2d apeVec2d = (ApeVec2d) o;
        return Double.compare(apeVec2d.x, x) == 0 && Double.compare(apeVec2d.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "ApeVec2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * Gets {@link #x}.
     *
     * @return the value of {@link #x}
     */
    public double getX() {
        return x;
    }

    /**
     * Sets {@link #x}.
     *
     * @param x the new value of {@link #x}
     */
    public void setX(final double x) {
        this.x = x;
    }

    /**
     * Gets {@link #y}.
     *
     * @return the value of {@link #y}
     */
    public double getY() {
        return y;
    }

    /**
     * Sets {@link #y}.
     *
     * @param y the new value of {@link #y}
     */
    public void setY(final double y) {
        this.y = y;
    }
}
