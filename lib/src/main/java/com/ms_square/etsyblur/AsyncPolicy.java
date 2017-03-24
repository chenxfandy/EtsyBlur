package com.ms_square.etsyblur;

import android.support.annotation.AnyThread;

/**
 * AsyncPolicy.java
 *
 * @author Manabu-GT on 3/22/17.
 */
@AnyThread
public interface AsyncPolicy {

    /**
     * Decides if a blur operation should run asynchronously given the estimated
     * computation amount which will affect the how long the blur operation would take.
     * @param isRenderScript
     * @param cost
     * @return boolean - true if it blur operation should execute in a background thread
     */
    boolean shouldAsync(boolean isRenderScript, long cost);

    /**
     * Put a pair of estimated computation amount and actual time took to further improve
     * the decision making of running the blur operation in background thread or not.
     * @param isRenderScript
     * @param computation
     * @param timeInNanos
     */
    void putSampleData(boolean isRenderScript, long computation, long timeInNanos);
}
