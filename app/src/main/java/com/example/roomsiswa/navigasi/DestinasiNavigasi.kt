package com.example.roomsiswa.navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composable
     */
    val route: String

    /**
     * String resource id yang berisi judul untuk composable
     */
    val titleRes: Int
}