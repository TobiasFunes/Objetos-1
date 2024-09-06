package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	/**
	 * Complete con su implementación
	 */
	String texto;
	int cantLikes;
	boolean destacado;
	
	public WallPostImpl () {
		texto = "undefined post";
		cantLikes = 0;
		destacado = false;
	}
	
	public String getText() {
		return texto;
	}
	
	public void setText(String descriptionText){
		texto = descriptionText;
	}
	
	public int getLikes() {
		return cantLikes;
	}
	
	public void like() {
		cantLikes += 1;
	}
	
	public void dislike() {
		if (cantLikes != 0) {
			cantLikes -= 1;	
		}		
	}
	
	public boolean isFeatured() {
		boolean ok = false;
		if (destacado == true) {
			ok = true;
		}
		return ok;
	}

	public void toggleFeatured() {
		destacado = !destacado;
	}
	
	
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
