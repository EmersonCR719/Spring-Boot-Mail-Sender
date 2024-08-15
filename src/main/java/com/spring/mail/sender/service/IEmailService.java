package com.spring.mail.sender.service;

import java.io.File;

public interface IEmailService {

    void sendEmail(String[] toUser, String subject, String body);

    void sendEmailWithFile(String[] toUser, String subject, String body, File file);
}
