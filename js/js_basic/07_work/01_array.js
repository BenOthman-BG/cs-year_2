let array = [10, true, "othman", [10, true, 9]];

console.log(array);
console.log(array[2]);
console.log(array[3][2]);
console.log(array.slice(1));

let array_2 = [12, 2, 3, 4, 66, 7, 8, 7, 90];

// lenth

console.log(array_2.length);

//push
console.log(array_2.push(5000));
console.log(array_2);

//unshift
array_2.unshift(1000);
console.log(array_2);
//shift

array_2.shift();
console.log(array_2);
//pop

array_2.pop();
console.log(array_2);

//splice(start , count , add)

array_2.splice(1, 3, "othman"); //delete or replace
console.log(array_2);

//slice()

console.log(array_2.slice(2, 5));

//indexof

console.log(array_2.indexOf(7));

//lastindexof

console.log(array_2.lastIndexOf(7));

//includes

console.log(array_2.includes(1000)); //boulean

//reverse

array_2.reverse();
console.log(array_2);

//sort

array_2.sort();
console.log(array_2);

//arr1 = arr2 + arr 3

arr3 = [0, 0, 0];

arr = array_2 + arr3;
console.log(arr);

//arr1 += arr2

array_2 += arr3;
console.log(array_2);

//concat

console.log(array_2.concat(arr, "othman"));

//join('-')

// console.log(array_2.join('-'));
