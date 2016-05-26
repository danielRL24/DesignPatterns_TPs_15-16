package factory;

import herbes.AbstractHerbes;
import huiles.AbstractHuiles;
import legumes.AbstractLegumes;

public interface AbstractFactory {

	/**
	 * Création des Légumes
	 * @return
     */
	public AbstractLegumes creerLegumes();

	/**
	 * Création des Herbes
	 * @return
     */
	public AbstractHerbes creerHerbes();

	/**
	 * Création des Huiles
	 * @return
     */
	public AbstractHuiles creerHuiles();
}
