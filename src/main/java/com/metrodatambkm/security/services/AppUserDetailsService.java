package com.metrodatambkm.security.services;

import com.metrodatambkm.security.entities.AppUserDetails;
import com.metrodatambkm.security.entities.credentials.User;
import com.metrodatambkm.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public AppUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userIdentity) throws UsernameNotFoundException {
        User user = userRepository.findByUsernameOrEmail(userIdentity, userIdentity);

        return new AppUserDetails(user);
    }

}
