package com.example.intenttaskk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import java.security.PrivateKey;

public class Anime implements Parcelable {

    private String detil;
    private String img;
    private String name;
    private String genree;
    private String score;
    private String synopsisText;
    private String synopsis;
    private static final String DEFAULT_DETIL = "DETAIL";
    private static final String DEFAULT_SINOPSIS = "sinopsis :";

    public Anime() {
        this.detil = DEFAULT_DETIL;
        this.synopsisText = DEFAULT_SINOPSIS;
    }

    public String getDetil() {
        return detil;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenree() {
        return genree;
    }

    public void setGenree(String genree) {
        this.genree = genree;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSynopsisText() {
        return synopsisText;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    protected Anime(Parcel in) {
        detil = in.readString();
        img = in.readString();
        name = in.readString();
        genree = in.readString();
        score = in.readString();
        synopsisText = in.readString();
        synopsis = in.readString();
    }

    public static final Creator<Anime> CREATOR = new Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel in) {
            return new Anime(in);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(detil);
        dest.writeString(img);
        dest.writeString(name);
        dest.writeString(genree);
        dest.writeString(score);
        dest.writeString(synopsisText);
        dest.writeString(synopsis);
    }
}