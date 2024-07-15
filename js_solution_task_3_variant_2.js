const defaultValue = 'success';
const arr = [0.5, 2, 3.5, null, undefined];

const newArr = arr.map((elem) => elem ?? defaultValue)
                    .filter((elem) => elem % 1 !== 0)
                    .map((elem) => typeof elem === 'number' ? elem * 2 : elem);

console.log(newArr);