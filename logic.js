
//reverse the digits of a number so if input is "1234" returns "4321"
const reverseNumbers =(number)=>{
    if(number < 1 || number > 10000){
        return "incorrect input"
    }
    // const numberArray = number.toString().split("").reverse().join("")
    // parseInt(numberArray)
    // return numberArray
    let count = 0 
    result = 0
    while(number > 0){
        result = (result * 10) + (number % 10)
        number = Math.floor(number/10)
    }
    return result
}

//sum the digits of a number together, so input of "1234" returns 10. 
const sumNumbers =(number)=>{
    if(number < 1 || number > 10000){
        return "incorrect input"
    }
    
    let result = 0 
    while(number > 0){
        let singleDigit = (number % 10)
        result += singleDigit 
        number = Math.floor(number/10)
    }
    return result
}
