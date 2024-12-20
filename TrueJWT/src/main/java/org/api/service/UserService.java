package org.api.service;

import lombok.extern.slf4j.Slf4j;
import org.api.dto.Language;
import org.api.dto.LanguageLevel;
import org.api.dto.Role;
import org.api.dto.Sex;
import org.api.entity.User;
import org.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    static int counter = 0;

    public User save(User user) {
        try {
            return repository.save(user);
        }
        catch (Exception e) {
            log.info(e.getLocalizedMessage());
            return null;
        }
    }

    public String create(User user) {
        if (repository.existsByUsername(user.getUsername())) {
            return "Пользователь с таким именем уже существует";
        }

        if (repository.existsByEmail(user.getEmail())) {
            return "Пользователь с таким email уже существует";
        }

        User saved = save(user);

        if (Objects.equals(saved, null)) return "Произошла ошибка при сохранении пользователя";

        return "Пользователь успешно зарегистрирован";
    }

    public User getByUsername(String username) {
        Optional<User> user = repository.findByUsername(username);
        return user.orElse(null);
    }

    public UserDetailsService userDetailsService() {
        return this::getByUsername;
    }

    public User getCurrentUser() {
        var username = SecurityContextHolder.getContext().getAuthentication().getName();
        return getByUsername(username);
    }

    public void getAdmin() {
        var user = getCurrentUser();
        user.setRole(Role.ROLE_ADMIN);
        save(user);
    }

    public void getTeacher() {
        var user = getCurrentUser();
        user.setRole(Role.ROLE_TEACHER);
        save(user);
    }


    public void updateUserData(String username, String sex, String dateOfBirth, String info, String language, String phoneNumber, String email) {
        var user = getCurrentUser();
        if (isStringValid(username)) user.setUsername(username);
        if (isStringValid(sex)) {
            switch (sex) {
                case "male":
                    user.setSex(Sex.MALE);
                    break;
                case "female":
                    user.setSex(Sex.FEMALE);
                    break;
            }
        }
        if (isStringValid(dateOfBirth)) user.setDateOfBirth(dateOfBirth);
        if (isStringValid(info)) user.setInfo(info);

//        добавить проверку языка
//        if (isStringValid(language)) user.setUsername(username);


        if (isStringValid(phoneNumber)) user.setPhoneNumber(phoneNumber);
        if (isStringValid(email)) user.setEmail(email);
        save(user);
    }

    public boolean isStringValid(String s) {
        if (!(s.isBlank() || s.isEmpty())) {
            return true;
        };
        return false;
    }

    public void setLanguage(String language) {
        var user = getCurrentUser();
        switch (language) {
            case "russian":
                user.setLanguage(Language.RUSSIAN);
                break;
            case "english":
                user.setLanguage(Language.ENGLISH);
                break;
            case "french":
                user.setLanguage(Language.FRENCH);
                break;
            case "italian":
                user.setLanguage(Language.ITALIAN);
                break;
        }
        save(user);
    }

    public void setLanguageLevel(int weight, int stage) {
        counter += weight;
        log.info("stage: " + stage + " | counter: " + counter);
        if (stage == 7) {
            resultLevel(counter);
            counter = 0;
        }
    }
    public void resultLevel(int counter) {
        var user = getCurrentUser();
        switch (counter) {
            case 1, 2:
                user.setLanguageLevel(LanguageLevel.A1);
                break;
            case 3:
                user.setLanguageLevel(LanguageLevel.A2);
                break;
            case 4:
                user.setLanguageLevel(LanguageLevel.B1);
                break;
            case 5, 6:
                user.setLanguageLevel(LanguageLevel.B2);
                break;
            case 7:
                user.setLanguageLevel(LanguageLevel.C1);
                break;
        }
        save(user);
    }
}
