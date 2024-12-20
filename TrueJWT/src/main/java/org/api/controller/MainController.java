package org.api.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.api.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("http://localhost:5173")
public class MainController {
    private final UserService service;

    @GetMapping("/test")
    public String mainendp() {
        return "Success";
    }

    @PostMapping("/user/update")
    @CrossOrigin("http://localhost:5173")
    public void updateInfo(@RequestParam("username") String username, @RequestParam("sex") String sex,
                          @RequestParam("dateOfBirth") String dateOfBirth, @RequestParam("info") String info,
                          @RequestParam("language") String language, @RequestParam("phoneNumber") String phoneNumber,
                          @RequestParam("email") String email) {
        service.updateUserData(username, sex, dateOfBirth, info, language, phoneNumber, email);
    }

    @PostMapping("/user/setLang")
    @CrossOrigin("http://localhost:5173")
    public void updateLang(@RequestParam("language") String language) {
        service.setLanguage(language);
    }

    @PostMapping("/user/setLangLevel")
    @CrossOrigin("http://localhost:5173")
    public void updateLangLevel(@RequestParam("weight") int weight, @RequestParam("stage") int stage) {
        service.setLanguageLevel(weight, stage);
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String exampleAdmin() {
        return "Hello, admin!";
    }

    @GetMapping("/get-teacher")
    public void getTeacher() {
        service.getTeacher();
    }

    @GetMapping("/get-admin")
    public void getAdmin() {
        service.getAdmin();
    }
}
