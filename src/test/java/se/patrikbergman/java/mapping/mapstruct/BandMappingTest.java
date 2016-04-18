package se.patrikbergman.java.mapping.mapstruct;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BandMappingTest {

    Band source;
    BandMapper mapper;

    @Before
    public void setup() {
        source = new Band();
        mapper = BandMapper.INSTANCE;
    }

    @Test
    public void shouldApplyConversions() {
        source.setName("Judas Priest");
        source.setDescription("Judas Priest are a British heavy metal band formed in Birmingham, England, in 1969.");
        source.setRockFactor(42);

        BandDto target = mapper.bandToBandDto(source);

        assertNotNull(target);
        assertEquals(source.getName(), target.getName());
        assertEquals(source.getDescription(), target.getBiography());
        assertEquals(42L, target.getRockFactor().longValue());

        System.out.println(target);
    }

    @Test
    public void shouldHandleNulls() {
        BandDto target = mapper.bandToBandDto(source);

        assertNotNull(target);
        assertEquals(0L, target.getRockFactor().longValue());

        System.out.println(target);
    }

    @Test
    public void shouldApplyConversionsForReverseMapping() {
        BandDto target = new BandDto();
        target.setName("Judas Priest");
        target.setBiography("Judas Priest are a British heavy metal band formed in Birmingham, England, in 1969.");
        target.setRockFactor(42L);

        Band source = mapper.targetToSource(target);

        assertNotNull(source);
        assertEquals(target.getName(), source.getName());
        assertEquals(target.getBiography(), source.getDescription());
        assertEquals(target.getRockFactor().intValue(), source.getRockFactor());
    }

}
