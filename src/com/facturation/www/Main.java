package com.facturation.www;

public class Main {
    /*
    KALEND A KABEY ROSNY L2 SI
    KAKUDJI MPUKA DJO L2 SI
    SANGWA APENDEKI PEGGY L2 SI
    KAFINDO KABONWA SCHOLASTIQUE L2 MSI
    MUSHIYA TSHIANI BENEDICTE L2 MSI
    TSHILOMBO TSHIKA RUTH L2 MSI
    MBUYU FATUMA RUTH L2 MSI
    MBWEY MBENGEL CHRISTVIE L2 SI
    */
    public static void main(String[] args) {
        Detail.Ligne ligne= new Detail.Ligne();
        Produit<String>prod1=new Produit<>();
        prod1.setCode("123");
        prod1.setDesignation("Ordinateur");
        prod1.setPrix(100);
        Produit<String>prod2=new Produit<>();
        prod1.setCode("768");
        prod1.setDesignation("Telephone");
        prod1.setPrix(100);
        ligne.setQuantite(3);
        ligne.setNumero(1);
        ligne.setProduit(prod1);
        Client client1=new Client();
        client1.setNumero("1");
        client1.setNom("Kalend");
        client1.setPrenom("rosny");
    }
}
