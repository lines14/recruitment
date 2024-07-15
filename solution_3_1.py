defaultValue = 'success'
arr = [0.5, 2, 3.5, None, None]

new_arr = []
for elem in arr:
    if elem is None:
        new_arr.append(defaultValue)
    elif type(elem) == float:
        new_arr.append(int(elem * 2))

print(new_arr)