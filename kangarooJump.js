//need a function that takes in 4 paramaters 

// kangaroo1 = x1 + v1
//kangaroo2 = x2 + v2 

//are they equal? if not then increment 

function canMeet(x1, v1, x2, v2){

    let kangaroo1 = x1 + v1
    let kangaroo2 = x2 + v2 

    while(kangaroo1 <= kangaroo2 && v1 > v2){
        if(kangaroo1 == kangaroo2){
            return "YES" 
        }
        else{
            kangaroo1 += v1 
            //console.log(`kangaroo1 is ${kangaroo1}`)
            kangaroo2 += v2 
            //console.log(`kangaroo2 is ${kangaroo2}`)
        }
    }

    return "NO"
}

//console.log(canMeet(0, 2, 5, 3))