arr = [2, 9, 15, 30, 45]

new_arr = []
for elem in arr:
    if elem % 2 == 0:
        new_arr.append(elem * 2)

print(new_arr)