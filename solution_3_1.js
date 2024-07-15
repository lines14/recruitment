const defaultValue = 'success';
const arr = [0.5, 2, 3.5, null, undefined];

const newArr = [];
for (const elem of arr) {
    if (elem === null || elem === undefined) {
        newArr.push(defaultValue);
    } else if (elem % 1 !== 0) {
        newArr.push(elem * 2);
    }
}

console.log(newArr);