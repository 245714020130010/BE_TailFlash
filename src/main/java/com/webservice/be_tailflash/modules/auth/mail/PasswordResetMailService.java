package com.webservice.be_tailflash.modules.auth.mail;

import com.webservice.be_tailflash.modules.user.entity.User;

public interface PasswordResetMailService {

    void sendPasswordResetMail(User user, String rawResetToken);
}
