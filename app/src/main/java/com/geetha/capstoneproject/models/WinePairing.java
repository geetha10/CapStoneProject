package com.geetha.capstoneproject.models;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class WinePairing {

    @SerializedName("pairedWines")
    @Expose
    public List<String> pairedWines = null;
    @SerializedName("pairingText")
    @Expose
    public String pairingText;
    @SerializedName("productMatches")
    @Expose
    public List<ProductMatch> productMatches = null;

    public List<String> getPairedWines() {
        return pairedWines;
    }

    public void setPairedWines(List<String> pairedWines) {
        this.pairedWines = pairedWines;
    }

    public String getPairingText() {
        return pairingText;
    }

    public void setPairingText(String pairingText) {
        this.pairingText = pairingText;
    }

    public List<ProductMatch> getProductMatches() {
        return productMatches;
    }

    public void setProductMatches(List<ProductMatch> productMatches) {
        this.productMatches = productMatches;
    }

}