package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){return mDefaultTranslation;}

    public String getMiwokTranslation(){return mMiwokTranslation;}

    public int getImageResourceID(){return  mImage;}
}
