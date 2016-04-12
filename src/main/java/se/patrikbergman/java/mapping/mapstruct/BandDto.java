/**
 *  Copyright 2012-2013 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package se.patrikbergman.java.mapping.mapstruct;

public class BandDto {

    private String name;
    private String biography;
    private Long rockFactor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Long getRockFactor() {
        return rockFactor;
    }

    public void setRockFactor(Long rockFactor) {
        this.rockFactor = rockFactor;
    }

    @Override
    public String toString() {
        return "BandDto{" +
                "name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                ", rockFactor=" + rockFactor +
                '}';
    }
}