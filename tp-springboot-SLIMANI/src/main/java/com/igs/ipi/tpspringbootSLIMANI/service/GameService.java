package com.igs.ipi.tpspringbootSLIMANI.service;

import org.springframework.stereotype.Service;

import com.igs.ipi.tpspringbootSLIMANI.model.GameModel;

@Service
public class GameService {
	public  GameModel newGame() {
		GameModel model = new GameModel();
		model.setNom1("Zak");
		model.setNom2("Mika");
		return model;
	}
	
}
