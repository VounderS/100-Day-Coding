# Buatlah program mencari bilangan prima

array = []

awal = int(input("Masukkan mulai mencari angka : "))
akhir = int(input("Masukkan akhir mencari angka : "))

for i in range(awal, akhir):
    flag = True
    for j in range(2, i):
        if i % j == 0:
            flag = False
    if flag == True:
        array.append(i)
array.pop(0)
print(array)
