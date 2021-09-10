package com.metrodatambkm.security.repositories;

import com.metrodatambkm.security.entities.Profile;
import com.metrodatambkm.security.entities.credentials.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    Profile findByUser(User user);
}