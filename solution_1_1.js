const arr = [2, 9, 15, 30, 45];

const newArr = [];
for (const elem of arr) {
    if (elem % 2 === 0) {
        newArr.push(elem * 2);
    }
}

console.log(newArr);