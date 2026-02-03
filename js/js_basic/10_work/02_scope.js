// scope
// var -> out of scop()
// let -> block scop

function othman() {
  var a = 10;
}
console.log(a); // print a -> var



// function test() {
//   let x = 19;
// }
// console.log(x); // errror -> let



for (var y = 0; y < 10; y++) {
  console.log(y);
}

console.log(y); // y = 10 -> var

for (let m = 0; m < 10; m++) {
  console.log(m);
}

console.log(y); // y = 10 -> var
