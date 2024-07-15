arr = [2, 9, 15, 30, 'success']

new_arr = list(filter(lambda elem: not (type(elem) == int and elem % 2 == 0), 
            map(lambda elem: int(elem / 3) if type(elem) == int and elem % 2 != 0 else elem, arr)))

print(new_arr)