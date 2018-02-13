package com.example.gupta.tic_tac_toe;

/**
 * Created by Gupta on 07-02-2018.
 */

public class game_data {
    private int g_no,w_no;
    private String p1_name,p2_name,w_name;
//constructors
    public game_data()
    {

    }
    public game_data(String p1_name) {
        this.p1_name = p1_name;
    }
//setters
    public void setG_no(int g_no) {
        this.g_no = g_no;
    }

    public void setW_no(int w_no) {
        this.w_no = w_no;
    }

    public void setP1_name(String p1_name) {
        this.p1_name = p1_name;
    }

    public void setP2_name(String p2_name) {
        this.p2_name = p2_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }
//getters
    public int getG_no() {
        return g_no;
    }

    public int getW_no() {
        return w_no;
    }

    public String getP1_name() {
        return p1_name;
    }

    public String getP2_name() {
        return p2_name;
    }

    public String getW_name() {
        return w_name;
    }

}
