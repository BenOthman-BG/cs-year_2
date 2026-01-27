// functions

function inpt (){

    let a = prompt(" 5 * 8 / 2 + 4 - 5 * 10 / 5 = ? ");
    a = Number(a);
    
    return a ; 
}

function test ( ){
    
    do {

        a = inpt();
    }while(a != 5 * 8 / 2 + 4 - 5 * 10 / 5 )

    alert(" great you get it ");

}



test ();