package com.addhen.serializer;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * All unit test cases have to inherit from this. This is to make it easier to
 * annotate every class with RunWith annotation
 *
 * @author Henry Addo
 */
@RunWith(JUnit4.class)
@SuppressWarnings("PMD.AbstractClassWithoutAbstractMethod")
public abstract class BaseTestCase {

    protected BaseTestCase() {
        // No-op
    }

    /**
     * Sets a dummy data for {@link Cinema} for testing purposes
     *
     * @return The initialized cinema object
     */
    protected static Cinema getCinema() {
        Cinema cinema = new Cinema();
        cinema.name = "Silverbird";
        cinema.locationName = "Accra Mall";
        cinema.location = new Cinema.LatLng(0.0, 0.0);
        return cinema;
    }

    protected void assertCinema(Cinema cinema) {
        assertNotNull(cinema);
        assertEquals("Silverbird", cinema.name);
        assertNotNull(cinema.location);
        assertEquals(0.00, cinema.location.latitude);
        assertEquals(0.00, cinema.location.longitude);
        assertEquals("Accra Mall", cinema.locationName);
    }
}