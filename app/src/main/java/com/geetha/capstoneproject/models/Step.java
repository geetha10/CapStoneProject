package com.geetha.capstoneproject.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Step {

    @SerializedName("number")
    @Expose
    public Integer number;
    @SerializedName("step")
    @Expose
    public String step;
    @SerializedName("ingredients")
    @Expose
    public List<Ingredient> ingredients = null;
    @SerializedName("equipment")
    @Expose
    public List<Equipment> equipment = null;
    @SerializedName("length")
    @Expose
    public Length length;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = length;
    }

}
