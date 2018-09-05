/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author WINDOWS 10
 */
public class mapel extends sekolah{
    public String pengajar;
    public int alokasi;
    
    public void setAlokasi(int alokasi){
        this.alokasi=alokasi;
    }
    public void setPengajar(String pengajar){
        this.pengajar=pengajar;
    }
    public void setNamaSekolah(String namaSekolah){
        super.namaSekolah=namaSekolah;
    }
    public void setAlamat(String alamat){
        super.alamat=alamat;
    }
    public void setNo(String no){
        super.no=no;
    }
    public void setAkreditasi(String akreditasi){
        super.akreditasi=akreditasi;
    }
}
