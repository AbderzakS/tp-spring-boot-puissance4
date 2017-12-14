package com.igs.ipi.tpspringbootSLIMANI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.igs.ipi.tpspringbootSLIMANI.model.GameModel;
import com.igs.ipi.tpspringbootSLIMANI.service.GameService;

@Controller
public class GameController {
	@Autowired
	private GameService gameService;
	@GetMapping("/game/new")
	public ModelAndView newGame() {
		GameModel game = gameService.newGame();
		ModelAndView mw = new ModelAndView();
		mw.setViewName("game");
		mw.addObject("jeu", game);
		return mw;
		
	}
}
