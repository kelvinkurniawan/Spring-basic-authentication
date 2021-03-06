package com.metrodatambkm.security.repositories;

import com.metrodatambkm.security.entities.Employee;
import com.metrodatambkm.security.entities.credentials.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Employee, Integer> {
    Employee findByUser(User user);
}
