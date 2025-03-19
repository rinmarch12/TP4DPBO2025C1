Janji
---
Saya Ririn Marchelina dengan NIM 2303662 mengerjakan Tugas Praktikum 4 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

---
Dokumentasi
---
![image](https://github.com/user-attachments/assets/1d420077-5fc0-46bd-aaf2-6a2b21485bd5)

---
Alur Program
---
1. Tampilan Awal
---
Saat aplikasi dijalankan, pengguna akan melihat tampilan utama yang berisi:
- Form input untuk mengisi NIM, Nama, Jenis Kelamin, dan Fakultas.
- Tabel daftar mahasiswa yang menampilkan data mahasiswa yang sudah ada.
---
Tombol-tombol interaksi:
- Add (atau Update jika memilih data).
- Delete (tersembunyi hingga data dipilih).
- Cancel untuk mengosongkan form.

2. Menambah Data (Add Data)
- Pengguna mengisi NIM, Nama, Jenis Kelamin, dan Fakultas di form input.
- Menekan tombol "Add".
- Data akan ditambahkan ke daftar mahasiswa dan muncul di tabel.
- Form input dikosongkan kembali setelah data ditambahkan.
- Muncul notifikasi "Data berhasil ditambahkan!".

3. Mengubah Data (Update Data)
- Pengguna mengklik salah satu baris di tabel.
- Data dari baris yang dipilih akan otomatis muncul di form input.
- Tombol "Add" berubah menjadi "Update", dan tombol Delete muncul.
- Pengguna bisa mengedit data di form input.
- Menekan tombol "Update" untuk menyimpan perubahan.
- Data di tabel diperbarui sesuai dengan perubahan.
- Form input dikosongkan kembali setelah update selesai.
- Muncul notifikasi "Data berhasil diubah!".

4. Menghapus Data (Delete Data)
- Pengguna mengklik salah satu baris di tabel untuk memilih data yang akan dihapus.
- Tombol Delete akan muncul.
- Saat tombol "Delete" ditekan, muncul konfirmasi penghapusan.
- Jika pengguna memilih "Yes", data akan dihapus dari tabel.
- Form input dikosongkan kembali setelah data dihapus.
- Muncul notifikasi "Data berhasil dihapus!".

5. Mengosongkan Form (Cancel Button)
- Jika pengguna ingin membatalkan atau mengosongkan form, tombol Cancel bisa ditekan.
- Semua input akan dikosongkan, tombol Update kembali menjadi Add, dan tombol Delete disembunyikan.

---
Penambahan Atribut Baru (Fakultas)
---
1. Atribut Fakultas ditambahkan sebagai kolom ke-5 dalam tabel mahasiswa, struktur tabel sekarang menjadi:
- No
- NIM
- Nama
- Jenis Kelamin
- Fakultas (Kolom baru yang ditambahkan).
2. Komponen Input untuk Fakultas
- Input untuk atribut Fakultas menggunakan ComboBox (JComboBox).
- Pilihan Fakultas yang tersedia di ComboBox: "FMIPA", "FPTK", "FPIPS", "FPBS", "FPSD", "FPEB", "FPOK"

---
Penambahan Konfirmasi Sebelum Menghapus Data (Delete)
---
1. Saat pengguna menekan tombol "Delete", akan muncul kotak dialog konfirmasi dengan pesan: "Apakah Anda yakin ingin menghapus data mahasiswa dengan NIM: [NIM]?"
2. Pengguna diberi dua pilihan:
- "Yes" → Data akan dihapus dari daftar dan tabel diperbarui.
- "No" → Penghapusan dibatalkan, data tetap ada di tabel.
3. Jika pengguna memilih "Yes", data akan dihapus dari listMahasiswa dan tabel akan diperbarui.
4. Setelah penghapusan, form input dikosongkan dan muncul notifikasi: "Data berhasil dihapus!"

