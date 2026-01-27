// to lowercase

let a = "othman";
let b = "OTHMAN";

console.log(a == b); // false
console.log(a == b.toLocaleLowerCase()); //true

// to uppercase

console.log(a.toUpperCase() == b); //true

//.trim().lengh -> ignore space

b = " OTHMAN";
console.log(a.toLocaleLowerCase() == b.toLocaleLowerCase()); // false
console.log(a.toLocaleLowerCase().trim() == b.toLocaleLowerCase().trim()); // true

// == value

a = 1;
b = "1";

console.log(a == 1); //true

// === value and datatype

console.log(a === b); //false

// != -> value

console.log(a != b); // fase

// !== -> value and datatype

console.log(a !== b); //true
