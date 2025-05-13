package com.example.tsdmhp2e2fggv;

import android.os.Parcel;
import android.os.Parcelable;



import androidx.annotation.NonNull;

public class UsrDatos implements Parcelable {
    String nombre, correo;
    int edad;

    public UsrDatos() {
    }

    public UsrDatos(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    protected UsrDatos(Parcel in) {
        nombre = in.readString();
        correo = in.readString();
        edad = in.readInt();
    }

    public static final Creator<UsrDatos> CREATOR = new Creator<UsrDatos>() {
        @Override
        public UsrDatos createFromParcel(Parcel in) {
            return new UsrDatos(in);
        }

        @Override
        public UsrDatos[] newArray(int size) {
            return new UsrDatos[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(correo);
        dest.writeInt(edad);
    }
}
