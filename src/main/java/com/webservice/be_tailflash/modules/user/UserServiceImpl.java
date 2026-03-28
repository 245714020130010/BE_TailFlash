package com.webservice.be_tailflash.modules.user;

import org.springframework.stereotype.Service;

import com.webservice.be_tailflash.common.exception.ResourceNotFoundException;
import com.webservice.be_tailflash.modules.user.dto.UserProfileResponse;
import com.webservice.be_tailflash.modules.user.entity.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserProfileResponse getByEmail(String email) {
        User user = userRepository.findByEmail(email)
            .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return new UserProfileResponse(user.getId(), user.getEmail(), user.getDisplayName(), user.getRole().getName());
    }
}
