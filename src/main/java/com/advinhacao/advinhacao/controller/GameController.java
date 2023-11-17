package com.advinhacao.advinhacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Random;

@Controller
public class GameController {

    private final int secretNumber;
    private boolean gameOver;

    public GameController() {
        this.secretNumber = new Random().nextInt(10) + 1;
        this.gameOver = false;
    }

    @PostMapping("/guess")
    public String makeGuess(@RequestParam("guess") int guess, Model model) {
        if (gameOver) {
            model.addAttribute("message", "O jogo acabou. Por favor, reinicie.");
            return "redirect:/guess-result.html?message=O+jogo+acabou.+Por+favor,+reinicie.";
        }

        if (guess == secretNumber) {
            model.addAttribute("message", "Parabens! Voce acertou o numero!");
            gameOver = true;
        } else if (guess < secretNumber) {
            model.addAttribute("message", "Tente um numero maior.");
        } else {
            model.addAttribute("message", "Tente um numero menor.");
        }

        return "redirect:/guess-result.html?message=" + model.getAttribute("message").toString();
    }
}