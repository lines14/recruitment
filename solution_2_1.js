const arr = [2, 9, 15, 30, 'success'];

const newArr = [];
for (const elem of arr) {
    if (typeof elem !== 'number') {
        newArr.push(elem);
    } else if (elem % 2 !== 0) {
        newArr.push(elem / 3);
    }
}

console.log(newArr);