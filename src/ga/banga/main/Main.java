package ga.banga.main;

import ga.banga.controler.AbstractControler;
import ga.banga.controler.CalculetteControler;
import ga.banga.model.AbstractModel;
import ga.banga.model.Calculator;
import ga.banga.vue.Calculette;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciation de notre modèle
		// pass man ok
		AbstractModel calc = new Calculator();

		// Création du contrôleur

		AbstractControler controler = new CalculetteControler(calc);

		// Création de notre fenêtre avec le contrôleur en paramètre

		Calculette calculette = new Calculette(controler);

		// Ajout de la fenêtre comme observer de notre modèle

		calc.addObserver(calculette);
	}

}
