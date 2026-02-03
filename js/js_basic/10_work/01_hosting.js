// hosting
// declaration : var , function simple 
// expression : let , let function 

console.log(x);

var x = 10 ; 

// -> undefind , because var -> already declared 

console.log(y);

let y = 5 ; 

// -> error , because let -> note declared 

console.log(hello());


function hello (){
    return 1 ;
}

// -> 1 , because it is declaratoin 


console.log(hello_2());

let hello_2 = function (){

    return 2 ; 
}

// -> error , let -> expression 