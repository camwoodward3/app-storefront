package edu.byui.apj.storefront.web.service;

import edu.byui.apj.storefront.web.model.UserProfileDto;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class InMemoryUserProfileService {
    private final Map<String, UserProfileDto> profilesByUsername = Map.of(
            "shopper", new UserProfileDto("Jane Shopper", "83701"),
            "manager", new UserProfileDto("Alex Manager", "83702")
    );

    public Optional<UserProfileDto> findByUserName(String username) {
        return Optional.ofNullable(profilesByUsername.get(username));
    }
}
