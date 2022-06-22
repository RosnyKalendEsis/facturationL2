package com.facturation.www;

public abstract class  Personne {
    private String nom;
    private String prenom;
    private Adresse adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    static class Adresse {
        private String avenue;
        private String numero;
        private String cellule;
        private String quartier;
        private String commune;
        private String ville;
        private String pays;

        public String getAvenue() {
            return avenue;
        }

        public void setAvenue(String avenue) {
            this.avenue = avenue;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getCellule() {
            return cellule;
        }

        public void setCellule(String cellule) {
            this.cellule = cellule;
        }

        public String getQuartier() {
            return quartier;
        }

        public void setQuartier(String quartier) {
            this.quartier = quartier;
        }

        public String getCommune() {
            return commune;
        }

        public void setCommune(String commune) {
            this.commune = commune;
        }

        public String getVille() {
            return ville;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public String getPays() {
            return pays;
        }

        public void setPays(String pays) {
            this.pays = pays;
        }
    }
}
