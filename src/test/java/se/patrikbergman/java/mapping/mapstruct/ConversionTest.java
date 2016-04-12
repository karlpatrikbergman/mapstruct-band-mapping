/**
 * Copyright 2012-2013 Gunnar Morling (http://www.gunnarmorling.de/)
 * and/or other contributors as indicated by the @authors tag. See the
 * copyright.txt file in the distribution for a full listing of all
 * contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.patrikbergman.java.mapping.mapstruct;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConversionTest {

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
