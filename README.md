# PAPB-C-Bab2-245150200111023
Repository GitHub untuk penyelesaian penugasan praktikum mata kuliah PAPB kelas C 2026/27.

Penjelasan Kode:
Class MainActivity berisi konten dari aplikasi. Layout Column digunakan untuk menambahkan item secara vertikal. Diberi horizontalAlignment agar semua komponen centered dan ditengah layar, dan modifier padding agar tidak menyentuh ujung layar, background berwarna cyan, dan fillMaxWidth() agar mengisi seluruh komponen.

Lalu, ditambah gambar dummy identicon yang diberi modifier ukuran 120 dp, clip CircleShape agar dipotong menjadi lingkaran, dan background putih. Dibawahnya, ada tambahan text nama, yang berukuran 20 sp dan boldened, NIM, dan deskripsi "Mahasiswa Teknik Informatika." Komponen ini diberi spacer berukuran 8 dp ke komponen setelahnya, yaitu FollowButton().

Tombol follow menggunakan (remember { mutableStateOf() }) dengan state pertama false yang menunjukkan teks "Follow" untuk meng-follow mahasiswa, dan berubah ke "Unfollow" setelah tombol follow dipencet.
