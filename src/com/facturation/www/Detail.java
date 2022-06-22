package com.facturation.www;

import java.util.List;

public class Detail {
    public List<Ligne> ligne;
    static class Ligne{
        private int numero;
        private int quantite;
        private Produit produit;

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        public Produit getProduit() {
            return produit;
        }

        public void setProduit(Produit produit) {
            this.produit = produit;
        }

        public double getPrixTotal(){
            return quantite*produit.getPrix();
        }
    }
}
