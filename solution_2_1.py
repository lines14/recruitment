arr = [2, 9, 15, 30, 'success']

new_arr = []
for elem in arr:
    if type(elem) != int:
        new_arr.append(elem)
    elif elem % 2 != 0:
        new_arr.append(int(elem / 3))

print(new_arr)