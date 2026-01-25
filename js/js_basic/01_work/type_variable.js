// type of variables 
//1. var (old , function scop);

var x = 5 ;
var x = 10 ;
x = 30 ;

console.log(x);

//2. let (new , block scope )

let y = 2 ;
// let y = 3 ; -> error 
if (true ){
    let a = 10 ; 
}
//console.log(a);// -> error car a is note deffined 

//3. const ( constant can't change it )

const othman = 'hello brother ' ;
//othman = ' h'; // -> error 




