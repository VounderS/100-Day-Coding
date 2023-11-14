# Kalian diminta membuat array berisi bilangan bulat inputan user,
# kemudian tampilkan hasil penjumlahan seluruh angka ganjil dan genap dalam array tersebut

array = []
ganjil = 0
genap = 0
panjang_array = int(input("Masukkan panjang array: "))
for i in range(panjang_array):
    input_array = int(input(f"input isi array {i+1} : "))
    array.append(input_array)
print(array)
for i in array:
    if i % 2 == 0:
        genap += i
    else:
        ganjil += i
print(f"Genap: {genap}\nGanjil: {ganjil}")
