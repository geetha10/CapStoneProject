package com.geetha.capstoneproject.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Recipe {

    @SerializedName("vegetarian")
    @Expose
    public Boolean vegetarian;
    @SerializedName("vegan")
    @Expose
    public Boolean vegan;
    @SerializedName("glutenFree")
    @Expose
    public Boolean glutenFree;
    @SerializedName("dairyFree")
    @Expose
    public Boolean dairyFree;
    @SerializedName("veryHealthy")
    @Expose
    public Boolean veryHealthy;
    @SerializedName("cheap")
    @Expose
    public Boolean cheap;
    @SerializedName("veryPopular")
    @Expose
    public Boolean veryPopular;
    @SerializedName("sustainable")
    @Expose
    public Boolean sustainable;
    @SerializedName("weightWatcherSmartPoints")
    @Expose
    public Integer weightWatcherSmartPoints;
    @SerializedName("gaps")
    @Expose
    public String gaps;
    @SerializedName("lowFodmap")
    @Expose
    public Boolean lowFodmap;
    @SerializedName("preparationMinutes")
    @Expose
    public Integer preparationMinutes;
    @SerializedName("cookingMinutes")
    @Expose
    public Integer cookingMinutes;
    @SerializedName("aggregateLikes")
    @Expose
    public Integer aggregateLikes;
    @SerializedName("spoonacularScore")
    @Expose
    public Integer spoonacularScore;
    @SerializedName("healthScore")
    @Expose
    public Integer healthScore;
    @SerializedName("creditsText")
    @Expose
    public String creditsText;
    @SerializedName("sourceName")
    @Expose
    public String sourceName;
    @SerializedName("pricePerServing")
    @Expose
    public Double pricePerServing;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("readyInMinutes")
    @Expose
    public Integer readyInMinutes;
    @SerializedName("servings")
    @Expose
    public Integer servings;
    @SerializedName("sourceUrl")
    @Expose
    public String sourceUrl;
    @SerializedName("image")
    @Expose
    public String image;
    @SerializedName("imageType")
    @Expose
    public String imageType;
    @SerializedName("summary")
    @Expose
    public String summary;
    @SerializedName("cuisines")
    @Expose
    public List<String> cuisines = null;
    @SerializedName("dishTypes")
    @Expose
    public List<String> dishTypes = null;
    @SerializedName("diets")
    @Expose
    public List<String> diets = null;
    /*@SerializedName("occasions")
    @Expose
    private List<Object> occasions = null;*/
    @SerializedName("winePairing")
    @Expose
    public WinePairing winePairing;
    @SerializedName("analyzedInstructions")
    @Expose
    public List<AnalyzedInstruction> analyzedInstructions = null;

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public Boolean getDairyFree() {
        return dairyFree;
    }

    public void setDairyFree(Boolean dairyFree) {
        this.dairyFree = dairyFree;
    }

    public Boolean getVeryHealthy() {
        return veryHealthy;
    }

    public void setVeryHealthy(Boolean veryHealthy) {
        this.veryHealthy = veryHealthy;
    }

    public Boolean getCheap() {
        return cheap;
    }

    public void setCheap(Boolean cheap) {
        this.cheap = cheap;
    }

    public Boolean getVeryPopular() {
        return veryPopular;
    }

    public void setVeryPopular(Boolean veryPopular) {
        this.veryPopular = veryPopular;
    }

    public Boolean getSustainable() {
        return sustainable;
    }

    public void setSustainable(Boolean sustainable) {
        this.sustainable = sustainable;
    }

    public Integer getWeightWatcherSmartPoints() {
        return weightWatcherSmartPoints;
    }

    public void setWeightWatcherSmartPoints(Integer weightWatcherSmartPoints) {
        this.weightWatcherSmartPoints = weightWatcherSmartPoints;
    }

    public String getGaps() {
        return gaps;
    }

    public void setGaps(String gaps) {
        this.gaps = gaps;
    }

    public Boolean getLowFodmap() {
        return lowFodmap;
    }

    public void setLowFodmap(Boolean lowFodmap) {
        this.lowFodmap = lowFodmap;
    }

    public Integer getPreparationMinutes() {
        return preparationMinutes;
    }

    public void setPreparationMinutes(Integer preparationMinutes) {
        this.preparationMinutes = preparationMinutes;
    }

    public Integer getCookingMinutes() {
        return cookingMinutes;
    }

    public void setCookingMinutes(Integer cookingMinutes) {
        this.cookingMinutes = cookingMinutes;
    }

    public Integer getAggregateLikes() {
        return aggregateLikes;
    }

    public void setAggregateLikes(Integer aggregateLikes) {
        this.aggregateLikes = aggregateLikes;
    }

    public Integer getSpoonacularScore() {
        return spoonacularScore;
    }

    public void setSpoonacularScore(Integer spoonacularScore) {
        this.spoonacularScore = spoonacularScore;
    }

    public Integer getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(Integer healthScore) {
        this.healthScore = healthScore;
    }

    public String getCreditsText() {
        return creditsText;
    }

    public void setCreditsText(String creditsText) {
        this.creditsText = creditsText;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Double getPricePerServing() {
        return pricePerServing;
    }

    public void setPricePerServing(Double pricePerServing) {
        this.pricePerServing = pricePerServing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(Integer readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    public List<String> getDishTypes() {
        return dishTypes;
    }

    public void setDishTypes(List<String> dishTypes) {
        this.dishTypes = dishTypes;
    }

    public List<String> getDiets() {
        return diets;
    }

    public void setDiets(List<String> diets) {
        this.diets = diets;
    }

    /*public List<Object> getOccasions() {
        return occasions;
    }

    public void setOccasions(List<Object> occasions) {
        this.occasions = occasions;
    }*/

    public WinePairing getWinePairing() {
        return winePairing;
    }

    public void setWinePairing(WinePairing winePairing) {
        this.winePairing = winePairing;
    }

    public List<AnalyzedInstruction> getAnalyzedInstructions() {
        return analyzedInstructions;
    }

    public void setAnalyzedInstructions(List<AnalyzedInstruction> analyzedInstructions) {
        this.analyzedInstructions = analyzedInstructions;
    }

}