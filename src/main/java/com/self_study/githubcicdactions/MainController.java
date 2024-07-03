package com.self_study.githubcicdactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Java";
    }

//    echo "# github-actions-example" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/SanduniKanishka/github-actions-example.git
//    git push -u origin main
}
