arr = [2, 9, 15, 30, 45]

new_arr = [elem * 2 for elem in arr if elem % 2 == 0]

print(new_arr)