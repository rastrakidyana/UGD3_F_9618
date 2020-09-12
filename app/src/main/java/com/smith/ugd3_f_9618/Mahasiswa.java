package com.smith.ugd3_f_9618;

import android.view.View;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Mahasiswa {
    public String npm;
    public String nama;
    public String fakultas;
    public String jurusan;
    public double ipk;
    public String hobi;
    public String imgURL;

    public Mahasiswa(String npm, String nama, String fakultas, String jurusan, double ipk, String hobi, String imgURL) {
        this.npm = npm;
        this.nama = nama;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.ipk = ipk;
        this.hobi = hobi;
        this.imgURL = imgURL;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @BindingAdapter("pImage")
    public static void loadImage(ImageView view, String imgURL) {
        Glide.with(view.getContext())
                .load(imgURL).apply(new RequestOptions().circleCrop())
                .into(view);
    }
}
