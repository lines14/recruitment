const arr = [2, 9, 15, 30, 45];

const newArr = arr.filter((elem) => elem % 2 === 0)
                    .map((elem) => elem * 2);

console.log(newArr);