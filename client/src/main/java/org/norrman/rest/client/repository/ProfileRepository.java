package org.norrman.rest.client.repository;

import java.util.HashMap;
import java.util.Map;

import org.norrman.rest.client.model.Profile;

public class ProfileRepository {

    private static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
