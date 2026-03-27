package com.webservice.be_tailflash.modules.user;

import com.webservice.be_tailflash.modules.user.dto.UserProfileResponse;

public interface UserService {

    UserProfileResponse getByEmail(String email);
}
