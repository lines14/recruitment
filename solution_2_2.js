const arr = [2, 9, 15, 30, 'success'];

const newArr = arr.map((elem) => typeof elem === 'number' && elem % 2 !== 0 ? elem / 3 : elem)
                    .filter((elem) => !(typeof elem === 'number' && elem % 2 === 0));

console.log(newArr);