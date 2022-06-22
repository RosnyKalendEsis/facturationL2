package com.facturation.www;

public  abstract class DocumentCommercial {
    private long numero;
    private Client client;
    private Detail detail;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public double getTotal(){
        double somme=0;
        detail.ligne.size();
        for(int i=0; i<detail.ligne.size();i++){
            somme=detail.ligne.get(i).getPrixTotal();
        }
        return somme;
    }
    public double getTVA(){
        return getTotal()*16/100;
    }
}
