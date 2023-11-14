# Deklarasi sebu alist dengan ukuran dan isi berapapun.
# Buatlah sebuah program di mana inputan user adalah index yang akan dihapus pada sebuah list
# Setiap penghapusan berhasil, maka akan mencetak isi dari listnya
# Jika index yang dimasukkan tidak valid (kelebihan, atau yang lain), maka program berhenti

array = [1, 2, 3, 4, 5]
panjang_array = len(array)
while True:
    hapus_index = int(input("Masukkan index yang mau dihapus : "))
    if hapus_index >= panjang_array:
        break
    array.pop(hapus_index)
    print(array)
