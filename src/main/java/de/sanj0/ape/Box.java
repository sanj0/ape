package de.sanj0.ape;

/**
 * A box is a rectangle
 * of given position and size
 * in the two-dimensional world
 * specified by the min and max points.
 * The position of the box is defined
 * to be the top-left corner of it.
 */
public class Box {

    /**
     * The min point of the box,
     * which is its top left corner
     * and therefore its position.
     */
    private ApeVec2d min;

    /**
     * The max point of the box,
     * which is its bottom right corner.
     */
    private ApeVec2d max;

    /**
     * default constructor.
     *
     * @param min the {@link #min} point of the box
     * @param max the {@link #max} point of the box
     */
    public Box(final ApeVec2d min, final ApeVec2d max) {
        this.min = min;
        this.max = max;
    }

    /**
     * creates a new box with the given
     * min point ("position") and the given
     * width and height.
     *
     * @param pos the {@link #min} point of the box
     * @param w the desired width of the box
     * @param h the desired height of the box
     */
    public Box(final ApeVec2d pos, final double w, final double h) {
        this(pos, pos.subtract(new ApeVec2d(w, -h)));
    }

    /**
     * Moves the box by the given vector,
     * by adding it to both {@link #min}
     * and {@link #max}.
     *
     * @param svec the vector by which to move the box
     */
    public void move(final ApeVec2d svec) {
        min = min.add(svec);
        max = max.add(svec);
    }

    /**
     * Moves the box by the given
     * x and y values by calling {@link #move(ApeVec2d)}
     * with a new {@link ApeVec2d} with
     * the given <code>sx</code> and <code>sy</code>
     * as the x and y components.
     *
     * @param sx the x shift of the box
     * @param sy the y shift of the box
     */
    public void move(final double sx, final double sy) {
        move(new ApeVec2d(sx, sy));
    }

    /**
     * Calculates and returns the width
     * of this box.
     * <p>
     * <code>w = min.x - max.x</code>
     *
     * @return the computed width of this box
     */
    public double width() {
        return min.getX() - max.getX();
    }

    /**
     * Calculates and returns the height
     * of this box.
     * <p>
     * <code>h = max.y - min.y</code>
     *
     * @return the computed height of this box
     */
    public double height() {
        return max.getY() - min.getY();
    }

    /**
     * Calculates the area of this box
     * by multiplying its {@link #width() width}
     * and {@link #height() height}.<br>
     * Considering the implementations
     * of said methods, the applied formula
     * is as follows:
     * <p>
     * <code>a = (min.x - max.x) * (max.y - min.y)</code>
     *
     * @return the computed area of this box
     */
    public double area() {
        return width() * height();
    }

    /**
     * Returns the x position
     * of this box which is the
     * x position of its {@link #min min point}
     *
     * @return the x position of this box
     */
    public double getX() {
        return min.getX();
    }

    /**
     * Returns the y position
     * of this box which is the
     * y position of its {@link #min min point}
     *
     * @return the y position of this box
     */
    public double getY() {
        return min.getY();
    }

    /**
     * Sets the x position of
     * this box using {@link #move(double, double)}
     *
     * @param x the new x position of this box
     */
    public void setX(final double x) {
        move(x - getX(), 0);
    }

    /**
     * Sets the y position of
     * this box using {@link #move(double, double)}
     *
     * @param y the new y position of this box
     */
    public void setY(final double y) {
        move(0, y - getY());
    }

    /**
     * Gets {@link #min}.
     *
     * @return the value of {@link #min}
     */
    public ApeVec2d getMin() {
        return min;
    }

    /**
     * Sets {@link #min}.
     *
     * @param min the new value of {@link #min}
     */
    public void setMin(final ApeVec2d min) {
        this.min = min;
    }

    /**
     * Gets {@link #max}.
     *
     * @return the value of {@link #max}
     */
    public ApeVec2d getMax() {
        return max;
    }

    /**
     * Sets {@link #max}.
     *
     * @param max the new value of {@link #max}
     */
    public void setMax(final ApeVec2d max) {
        this.max = max;
    }
}
