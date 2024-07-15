defaultValue = 'success'
arr = [0.5, 2, 3.5, None, None]

new_arr = [int(el) if type(el) == float else el for el in 
           list(filter(lambda element: not (type(element) == int and element % 1 == 0), 
            map(lambda elem: elem * 2 if elem is not None else defaultValue, arr)))]

print(new_arr)